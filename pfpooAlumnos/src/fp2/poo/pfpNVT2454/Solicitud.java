package fp2.poo.pfpNVT2454;
import java.net.URL;

/**
 * Descripcion: Esta es la clase que contiene los métodos
 *              asociados a una solicitud al Proxy.
 *
 * @version version 1.1 Mayo 2023
 * @author  Mario Rodríguez Ventura
 */
public class Solicitud {
  
  private int numEntrada=0;
  private int puerto; //Usualmente 443 o 80
  
  private String protocolo;
  private String maquina; //Por ejemplo www.us.es
  private String recurso;
  private String objeto;

  //URL(String protocol, String host, int port, String file)
  private URL urlSoicitud = new URL(protocolo, maquina, puerto, recurso);
  
  /**
   * Constructor de la clase Solicitud
   * @param puerto El puerto de entrada de la Solicitud
   * @param protocolo Protocolo de la solicitud(http, https)
   * @param maquina El host, puede ser por ejemplo www.us.es
   * @param recurso El recurso de solicitud del Proxy
   * @param onjeto Fichero de solicitud del Proxy
   */
  public Solicitud(int numEntrada, int puerto, String protocolo, String maquina, String recurso, String objeto){
    //Asignacion por defecto
    this.puerto=puerto;
    this.protocolo=protocolo;
    this.maquina=maquina;
    this.recurso = recurso;
    this.objeto = objeto  
  }
  
  /**
   * Método que devuelve la URL
   * @return URL 
   */
  public URL getURL(){
    return this.urlSoicitud;
  }

  /**
   * Método que establece un numero de entrada 
   * @param numEntrada El numero de entrada en cuestión 
   * @return void
   */
  public void setNumEntrada(int numEntrada){
   this.numEntrada = numEntrada; 
  }

  /**
   * Método que devuelve el actual numero de entradas
   * @return int
   */
  public int getNumEntrada(){
    return this.numEntrada;
  }

  /**
   * Método que establece un protocolo para la solicitud
   * @param protocolo El protocolo en cuestión (http o https)
   * @return void
   */
  public void setProtocolo(String protocolo){
    this.protocolo=protocolo; 
  }

  /**
   * Método que devuelve el protocolo del Proxy 
   * @return String
   */
  public String getProtocolo(){
    return this.protocolo;
  }

  /**
   * Método que establece un recurso para el Proxy
   * @param recurso EL recurso en cuestión para el Proxy
   * @return void
   */
  public void setRecurso(String recurso){
    this.recurso = recurso;
  }
  
  /**
   * Método que devuelve el recurso del Proxy
   * @return void
   */
  public String getRecurso(){
    return this.recurso;
  }

  /**
   * Método que establece un puerto para la solicitud
   * @param puerto Puerto de entrada de la solicitud, o bien 80 o bien 443
   * @return void
   */
  public void setPuerto(int puerto){
    this.puerto = puerto;
  }

  /**
   * Método que devuelve el puerto de la solicitud
   * @return int
   */
  public int getPuerto(){
    return this.puerto;
  }
  
  /**
   * Método que establece un directorio
   * @return String
   */
  public void setDirectorio(String directorio){
    this.directorio = directorio;
  }

  /**
   * Método que devuelve el directorio de la solicitud
   * @return String
   */
  public String getDirectorio(){
    return this.directorio;
  }

  /**
   * Método que establece el objeto de la solicitud
   * @param objeto El objeto en cuestión de la solicitud al Proxy
   * @return void
   */
  public void setObjeto(String objeto){
    this.objeto = objeto;
  }

  /**
   * Método que devuelve el objeto de la solicitud 
   * @return String
   */
  public String getObjeto(){
    return this.objeto;
  }

}
