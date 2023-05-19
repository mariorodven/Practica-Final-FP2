package fp2.poo.pfpNVT2454;
import fp2.poo.utilidades.SolicitudInterfaz;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Descripcion: Esta es la clase que contiene los métodos
 *              asociados a una solicitud al Proxy.
 *
 * @version version 1.1 Mayo 2023
 * @author  Mario Rodríguez Ventura
 */
@SuppressWarnings("deprecation")
public class Solicitud implements SolicitudInterfaz {
  
  private int numEntrada;
  private int puerto; //Usualmente 443 o 80
  
  private String protocolo;
  private String maquina; //Por ejemplo www.us.es
  private String objeto;

  private String directorio;
  private String recurso;
  //URL(String protocol, String host, int port, String file)
  private URL urlSolicitud ;
  
  /**
   * Constructor de la clase Solicitud
   * @param numEntrada Es un numero secuencial que identifica la solicitud
   * @param puerto El puerto de entrada de la Solicitud
   * @param protocolo Protocolo de la solicitud(http, https)
   * @param maquina El host, puede ser por ejemplo www.us.es
   * @param objeto objeto de la URL
   */
  public Solicitud(int numEntrada, String protocolo, String maquina, int puerto, String objeto){
    //Asignacion por defecto
    this.numEntrada=numEntrada;
    this.protocolo=protocolo;
    this.maquina=maquina;
    this.puerto=puerto;
    this.objeto=objeto;
    try {
      this.urlSolicitud=new URL(protocolo, maquina, puerto, objeto);
    } catch (MalformedURLException e) {
      System.out.println(e);
    }
  }
  
  /**
   * Metodo que devuelve la URL
   * @return URL 
   */
  public URL getURL(){
    return this.urlSolicitud;
  }

  /**
   * Metodo que establece un numero de entrada 
   * @param numEntrada El numero de entrada en cuestión 
   */
  public void setNumEntrada(int numEntrada){
    this.numEntrada = numEntrada; 
  }

  /**
   * Metodo que devuelve el actual numero de entradas
   * @return int
   */
  public int getNumEntrada(){
    return this.numEntrada;
  }

  /**
   * Metodo que establece un protocolo para la solicitud
   * @param protocolo El protocolo en cuestión (http o https)
   */
  public void setProtocolo(String protocolo){
    this.protocolo=protocolo; 
  }

  /**
   * Metodo que devuelve el protocolo del Proxy 
   * @return String
   */
  public String getProtocolo(){
    return this.protocolo;
  }

  /**
   * Metodo que establece un recurso para el Proxy
   * @param recurso EL recurso en cuestión para el Proxy
   */
  public void setRecurso(String recurso){
    this.recurso = recurso;
  }
  
  /**
   * Metodo que devuelve el recurso del Proxy
   * @return String
   */
  public String getRecurso(){
    return this.recurso;
  }

  /**
   * Metodo que establece un puerto para la solicitud
   * @param puerto Puerto de entrada de la solicitud, o bien 80 o bien 443
   */
  public void setPuerto(int puerto){
    this.puerto = puerto;
  }

  /**
   * Metodo que devuelve el puerto de la solicitud
   * @return int
   */
  public int getPuerto(){
    return this.puerto;
  }
  
  /**
   * Metodo que establece un directorio
   * @param directorio Directorio 
   */
  public void setDirectorio(String directorio){
    this.directorio = directorio;
  }

  /**
   * Metodo que devuelve el directorio de la solicitud
   * @return String
   */
  public String getDirectorio(){
    return this.directorio;
  }

  /**
   * Metodo que establece el objeto de la solicitud
   * @param objeto El objeto en cuestión de la solicitud al Proxy
   */
  public void setObjeto(String objeto){
    this.objeto = objeto;
  }

  /**
   * Metodo que devuelve el objeto de la solicitud 
   * @return String
   */
  public String getObjeto(){
    return this.objeto;
  }

  /**
   * Metodo que devuelve la maquina
   * @return String
   */
  public String getMaquina(){
    return this.maquina;
  }

  /**
   * Metodo que establece una maquina
   * @param maquina
   */
  public void setMaquina(String maquina){
    this.maquina = maquina;
  }
}
