package fp2.poo.pfpNVT2454;

import java.net.*;
import fp2.poo.utilidades.URLBloqueadaInterfaz;

/**
 * Descripcion: Esta clase contiene los metodos asociados con una URL 
 * bloqueada por el proxy
 * @author Mario Rodríguez Ventura
 * @version versión 6.9 Mayo 2023
 */
@SuppressWarnings("deprecation")
public class URLBloqueada extends InfoBloqueada implements URLBloqueadaInterfaz{
  
  //URL(String protocol, String host, int port, String file)
  private URL URLBloqueada ;

  /**
   * Constructor de la clase URLBloqueada que da un valor por defecto
   * @param url URL a bloqueada
   */
  public URLBloqueada(String url){
    try {
      this.setURLBloqueada(url);
    } catch (Exception e) {
      System.err.println(e);
    }
  }

  /**
   * Metodo que define una URL bloqueada
   * @param url La URL a bloquear
   */
  public void setURLBloqueada( String url ) throws MalformedURLException{
    this.URLBloqueada = new URL(url);
  }
  
  /**
   * Metodo que devuelve la url bloqueada como cadena
   * @return String
   */
  public String getURLBloqueada(){
    return this.URLBloqueada.toString();
  }
  
  /**
   * Metodo que devuelve la URL bloqueada como objeto
   * @return URL
   */
  public URL getURLBloqueadaAsObject(){
    return this.URLBloqueada;
  }
} 
