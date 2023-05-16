package fp2.poo.pfpNVT2454;

import fp2.poo.utilidades.LecturaConfiguracion;
import fp2.poo.utilidades.LecturaSolicitudesDeEntrada;
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


/**
 * Descripción: La clase mas importante, esta crea tres listas, una de URLs bloqueadas, otra 
 * con los recursos locales pertinentes y otra con las solicitudes, en torno a estas listas 
 * el resto de clases toma sentido
 * @author Mario Rodríguez Ventura
 * @version 404 Mayo 2023
 */

  public class Proxy extends ProxyAbstracta{
  
  private List<URLBloqueadaInterfaz> urlbloqueadas = new ArrayList<URLBloqueadaInterfaz>();
  private List<SolicitudInterfaz> solicitudes = new ArrayList<SolicitudInterfaz> ();
  private List<RecursoLocalInterfaz> copiaLocal = new ArrayList<RecursoLocalInterfaz> ();
  
  /**
   * Constructor de la clase Proxy, establece los archivos de entrada
   * @param nombreFicheroConf
   * @param nombreFicheroSolicitudes
   */
  
  public Proxy(String nombreFicheroConf, String nombreFicheroSolicitudes)throws OperacionNoPermitidaExcepcion{
    
    LecturaConfiguracion lecturaConf = new LecturaConfiguracion(nombreFicheroConf);
    
    while (lecturaConf.hasNext()){
      URLBloqueadaInterfaz urlBloqueda = lecturaConf.next( );
      urlbloqueadas.add(urlBloqueda);
    }

    LecturaSolicitudesDeEntrada lectura = new LecturaSolicitudesDeEntrada( nombreFicheroSolicitudes );
    while (lectura.hasNext()){
      SolicitudInterfaz solicitud = lectura.next();
      solicitudes.add ( solicitud );
    }
  }

  /**
   * Método que procesa las solicitudes del Proxy y muestra por pantalla Block si esta bloqueada,
   * Proxy si no esta bloqueada y esta en el proxy, _OK__ si no esta bloqueada ni en el proxy pero
   * si está en internet y NO_OK si no esta en el proxy y tempoco esta en la web
   * @return void
   */
	public void procesaSolicitudesDelCliente() throws OperacionNoPermitidaExcepcion{
    
    for(SolicitudInterfaz lasSolicitudes : this.solicitudes){
      for(URLBloqueadaInterfaz lasURLBloqueadas : this.urlbloqueadas){
        if(lasSolicitudes.getURL().toString().equals(lasURLBloqueadas.getURLBloqueadaAsObject().toString())){
          System.out.println("BLOCK" + lasSolicitudes.getURL().toString());
          lasURLBloqueadas.setNumAccesos(lasURLBloqueadas.getNumAccesos()+1);
        }
      }
    }
    
    for(SolicitudInterfaz lasSolicitudes : this.solicitudes){
      for(RecursoLocalInterfaz recursos : this.copiaLocal){
        if(lasSolicitudes.getURL().toString().equals(recursos.getURLAsObject().toString())){
          System.out.println("PROXY " + lasSolicitudes.getURL().toString());
          recursos.setNumAccesos(recursos.getNumAccesos()+1);
          }
        }
      }
    for(SolicitudInterfaz lasSolicitudes : this.solicitudes){
      //System.out.println(guardarRecursoEnLocal(lasSolicitudes.getURL()));
      if(guardarRecursoEnLocal(lasSolicitudes.getURL())!=-1){
        System.out.println("_OK__ " + lasSolicitudes.getURL().toString());
        RecursoLocalInterfaz nuevoRecurso = new RecursoLocal(1, guardarRecursoEnLocal(lasSolicitudes.getURL()), lasSolicitudes.getURL());
        copiaLocal.add(1, nuevoRecurso);
      } else {
        System.out.println("NO_OK " + lasSolicitudes.getURL().toString());
      }
    }
  }        
  

  /**
  * Método que muestra por pantalla las URL bloqueadas por el proxy
  * @return void
  */
  public void muestraURLBloqueadas(){
    System.out.println("\nURL bloqueadas: ");
    for(URLBloqueadaInterfaz cont : this.urlbloqueadas)
      System.out.println(cont.getURLBloqueada() + " con " + cont.getNumAccesos() + " accesos");
  }

  /**
   * Método que muestra por pantalla las solicitudes
   * @return void
   */
  public void muestraSolicitudes(){
    System.out.println("\nSolicitudes: ");
    for(SolicitudInterfaz cont : this.solicitudes)
      System.out.println(cont.getURL().toString());
  }

  /**
   * Método que muestra por pantalla los recursos del Proxy
   * @return void
   */
  public void muestraRecursos(){
    System.out.println("Recursos locales: ");
    for(RecursoLocalInterfaz recursito : this.copiaLocal)
      System.out.println(recursito.getURL() + "con " + recursito.getNumAccesos() + " y " + recursito.getNumBytes());
  }

  /**
   * Método que ordena los recursos en funcion del numero de accesos de menor a mayor
   * @return void
   */
  public void ordenarRecursosPorAccesos(){
    Collections.sort(copiaLocal, new OrdenacionRecursoPorAccesos());
  }


}
