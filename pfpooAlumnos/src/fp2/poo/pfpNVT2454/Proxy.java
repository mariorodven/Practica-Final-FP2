package fp2.poo.pfpNVT2454;

import fp2.poo.utilidades.LecturaConfiguracion;
import fp2.poo.utilidades.ProxyAbstracta;
import fp2.poo.utilidades.RecursoLocalInterfaz;
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import fp2.poo.utilidades.SolicitudInterfaz;
import fp2.poo.utilidades.URLBloqueadaInterfaz;
import fp2.poo.pfpNVT2454.RecursoLocal;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import java.io.File;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Proxy extends ProxyAbstracta{
  
  private List<URLBloqueadaInterfaz> urlbloqueadas = new ArrayList<URLBloqueadaInterfaz>();
  private List<SolicitudInterfaz> solicitudes = new ArrayList<SolicitudInterfaz> ();
  private List<RecursoLocalInterfaz> copiaLocal = new ArrayList<RecursoLocalInterfaz> ();
  
  public Proxy(String nombreFicheroConf, String nombreFicheroSolicitudes)throws OperacionNoPermitidaExcepcion{
    
    LecturaConfiguracion lecturaConf = new LecturaConfiguracion(nombreFicheroConf);
    
    while (lecturaConf.hasNext()){
      URLBloqueadaInterfaz urlBloqueda = lecturaConf.next( );
      urlbloqueadas.add(urlBloqueda);
    }
  }

	public void procesaSolicitudesDelCliente() throws OperacionNoPermitidaExcepcion{
    
  }

  public void muestraURLBloqueadas(){
    for(URLBloqueadaInterfaz cont : urlbloqueadas){
      System.out.println("URL bloqueada: " + cont.getURLBloqueada() + " con " + cont.getNumAccesos() + " accesos");
    }
  }
  public void muestraSolicitudes(){
    for(SolicitudInterfaz cont : solicitudes)
      System.out.println(cont.getProtocolo() + " " + cont.getURL().getHost() + cont.getPuerto() + cont.getDirectorio() + cont.getObjeto());
  }

  public void muestraRecursos(){

  }

  public void ordenarRecursosPorAccesos(){
    Collections.sort(copiaLocal, new OrdenacionRecursosPorAccesos());
  }


}
