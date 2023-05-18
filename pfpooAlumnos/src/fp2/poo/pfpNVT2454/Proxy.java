package fp2.poo.pfpNVT2454;

import fp2.poo.utilidades.LecturaConfiguracion;
import fp2.poo.utilidades.LecturaSolicitudesDeEntrada;
import fp2.poo.utilidades.ProxyAbstracta;
import fp2.poo.utilidades.RecursoLocalInterfaz;
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import fp2.poo.utilidades.SolicitudInterfaz;
import fp2.poo.utilidades.URLBloqueadaInterfaz;

import java.net.URL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Descripción: La clase mas importante, esta crea tres listas, una de URLs
 * bloqueadas, otra
 * con los recursos locales pertinentes y otra con las solicitudes, en torno a
 * estas listas
 * el resto de clases toma sentido
 * 
 * @author Mario Rodríguez Ventura
 * @version 404 Mayo 2023
 */

public class Proxy extends ProxyAbstracta {

  private List<URLBloqueadaInterfaz> urlbloqueadas = new ArrayList<URLBloqueadaInterfaz>();
  private List<SolicitudInterfaz> solicitudes = new ArrayList<SolicitudInterfaz>();
  private List<RecursoLocalInterfaz> copiaLocal = new ArrayList<RecursoLocalInterfaz>();

  /**
   * Constructor de la clase Proxy, establece los archivos de entrada
   * 
   * @param nombreFicheroConf
   * @param nombreFicheroSolicitudes
   */

  public Proxy(String nombreFicheroConf, String nombreFicheroSolicitudes) throws OperacionNoPermitidaExcepcion {

    LecturaConfiguracion lecturaConf = new LecturaConfiguracion(nombreFicheroConf);

    while (lecturaConf.hasNext()) {
      URLBloqueadaInterfaz urlBloqueda = lecturaConf.next();
      urlbloqueadas.add(urlBloqueda);
    }

    LecturaSolicitudesDeEntrada lectura = new LecturaSolicitudesDeEntrada(nombreFicheroSolicitudes);
    while (lectura.hasNext()) {
      SolicitudInterfaz solicitud = lectura.next();
      solicitudes.add(solicitud);
    }
  }

  /**
   * Método que procesa las solicitudes del Proxy y muestra por pantalla Block si
   * esta bloqueada,
   * Proxy si no esta bloqueada y esta en el proxy, _OK__ si no esta bloqueada ni
   * en el proxy pero
   * si está en internet y NO_OK si no esta en el proxy y tempoco esta en la web
   * 
   * @return void
   */
  public void procesaSolicitudesDelCliente() {
    List<URL> yaBloqueadas = new ArrayList<URL>();
    List<URL> yaAlmacenadas = new ArrayList<>();

    System.out.println(" ");

    for(SolicitudInterfaz solicitud:this.solicitudes){
      for(URLBloqueadaInterfaz bloqueadas:this.urlbloqueadas){
        if(solicitud.getURL().equals(bloqueadas.getURLBloqueadaAsObject())){
          int nuevoAccesos = bloqueadas.getNumAccesos()+1;
          bloqueadas.setNumAccesos(nuevoAccesos);
          if(!yaBloqueadas.contains(solicitud.getURL()))
            System.out.println("BLOCK " + bloqueadas.getURLBloqueadaAsObject());  
          yaBloqueadas.add(bloqueadas.getURLBloqueadaAsObject());
        }
      }      
      for(RecursoLocalInterfaz recurso : this.copiaLocal){
        if(solicitud.getURL().equals(recurso.getURLAsObject())){
          recurso.setNumAccesos(recurso.getNumAccesos()+1); 
          if(!yaAlmacenadas.contains(solicitud.getURL()))
            System.out.println("PROXY " + solicitud.getURL());
          yaAlmacenadas.add(solicitud.getURL());
        }
      }
      if(guardarRecursoEnLocal(solicitud.getURL())!=-1 && !yaAlmacenadas.contains(solicitud.getURL()) && !yaBloqueadas.contains(solicitud.getURL())){
        System.out.println("_OK__ " + solicitud.getURL());
        copiaLocal.add(new RecursoLocal(1, guardarRecursoEnLocal(solicitud.getURL()), solicitud.getURL()));
      } else if(guardarRecursoEnLocal(solicitud.getURL())==-1 && !yaAlmacenadas.contains(solicitud.getURL()) && !yaBloqueadas.contains(solicitud.getURL())){
        System.out.println("NO_OK " + solicitud.getURL());
      }
    }
  }

  /**
   * Método que muestra por pantalla las URL bloqueadas por el proxy
   * 
   * @return void
   */
  public void muestraURLBloqueadas() {
    System.out.println("\nURL bloqueadas: ");
    for (URLBloqueadaInterfaz cont : this.urlbloqueadas)
      System.out.println(cont.getNumAccesos() + " " + cont.getURLBloqueadaAsObject().toString());
  }

  /**
   * Método que muestra por pantalla las solicitudes
   * 
   * @return void
   */
  public void muestraSolicitudes() {
    System.out.println("\nSolicitudes: ");
    for (SolicitudInterfaz cont : this.solicitudes)
      System.out.println(cont.getNumEntrada() + " " + cont.getProtocolo() + " " + cont.getURL().getHost() + " " + cont.getPuerto() + " " + cont.getObjeto());
  }

  /**
   * Método que muestra por pantalla los recursos del Proxy
   * 
   * @return void
   */
  public void muestraRecursos() {
    for (RecursoLocalInterfaz recursito : this.copiaLocal)
      System.out.println(recursito.getNumAccesos() + " " + recursito.getNumBytes() +  " " +recursito.getURLAsObject().toString());
  }

  /**
   * Método que ordena los recursos en funcion del numero de accesos de menor a
   * mayor
   * 
   * @return void
   */
  public void ordenarRecursosPorAccesos() {
    Collections.sort(copiaLocal, new OrdenacionRecursoPorAccesos());
  }
}
