package fp2.poo.pfpNVT2454;

import fp2.poo.utilidades.ProxyAbstracta;

import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import fp2.poo.utilidades.SolicitudInterfaz;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import java.io.File;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

import java.util.Collections;
import java.util.Comparator;

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

  }
  }

  public void ordenarRecursorPorAccesos(){
    SolicitudComparator solicitudComparator = new SolicitudComparator();
    Collections.sort(solicitudes, solicitudComparator);
  }
}
