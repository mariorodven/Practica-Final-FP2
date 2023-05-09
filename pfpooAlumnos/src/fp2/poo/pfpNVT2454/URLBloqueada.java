package fp2.poo.pfpNVT2454;

import java.net.URL;
import java.net.MalformedURLException;

import fp2.poo.utilidades.InfoBloqueadaInterfaz;
import fp2.poo.utilidades.URLBloqueadaInterfaz;

/**
 * Descripcion: Esta clase contiene los metodos asociados con una URL 
 * bloqueada por el proxy
 * @author Mario Rodríguez Ventura
 * @version versión 6.9 Mayo 2023
 */
public class URLBloqueada implements URLBloqueadaInterfaz{
  
  //URL(String protocol, String host, int port, String file)
  protected final String sampleFile = "http://trajano.us.es:80/graficos/esi.gif";
  private URL URLBloqueada ;

  public URLBloqueada(String protocolo, String maquina, int puerto, String archivo){
    
  }
  /**
   * Metodo que define una URL bloqueada a partir de un objeto
   * de tipo URL 
   * @param urlBloqueada La URL a bloquear
   * @return void
   */
  public void setURLBloqueada(URL urlBloqueada){
    this.urlBloqueada = urlBloqueada;
  }
  /**
   * Método que define una URL bloqueada
   * @param urlBloqueada La URL a bloquear
   * @return void
   */
  public void setURLBloqueada( String url ) throws MalformedURLException(){
    try {
      this.urlBloqueada = new URL(url);
    } catch (Exception e) {
      throw new MalformedURLException("La URL no tenía la el formato correcto");
    }
  }
  /**
   * Método que devuelve la url bloqueada como cadena
   * @return String
   */
  public String getURLBloqueada(){
    return this.URLBloqueada.getHost();
  }
  /**
   * Método que devuelve la URL bloqueada como objeto
   * @return URL
   */
  public URL getURLBloqueadaAsObject(){
    return this.URLBloqueada;
  }
} 
