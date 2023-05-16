package fp2.poo.pfpNVT2454;

import fp2.poo.utilidades.RecursoLocalInterfaz;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

/**
 * Descripcion: Esta es la clase que contiene los métodos
 *              asociados a una recurso local.
 *
 * @version Versión 1.1 Mayo 2023
 * @author  Mario Rodríguez Ventura
 */
public class RecursoLocal implements RecursoLocalInterfaz{
  
  private int numAccesos;
  private int numBytes;
  private URL urlLocal;
  /**
   * Constructor de la clase RecursoLocal que da un valor inicial a los 
   * atributos de la clase.
   * @param numAccesos Parametro que cuenta el numero de accesos.
   * @param numBytes Parámetro que cuenta el numero de Bytes de un recurso.
   */
  public RecursoLocal(int numAccesos, int numBytes, URL urlSolicitud){
    this.numAccesos = numAccesos;
    this.numBytes = numBytes;
    this.urlLocal = urlSolicitud;
  }

  /**
   * Método que establece el numero de accesos.
   * @param numAccesos Número de accesos.
   * @return void
   */
  public void setNumAccesos(int numAccesos){
    this.numAccesos=numAccesos;
  }

  /**
   * Método que devuelve el número de accesos
   * @return int
   */
  public int getNumAccesos(){
    return this.numAccesos;
  }

  /**
   * Método que devuelve el número de Bytes del recurso
   * @return int
   */
  public int getNumBytes(){
    return this.numBytes;
  }

  /**
   * Método que establece el número de bytes
   * @param numBytes El numero de bytes que va a ser establecido
   * @return void
   */
  public void setNumBytes(int numBytes){
    this.numBytes=numBytes;
  }

  public void   setURL( String url ) throws MalformedURLException{
    try {
      this.urlLocal = new URL(url);
    } catch (Exception e) {
      throw new MalformedURLException("Malformed URL");
    }
  }

  public String getURL(){
    return this.urlLocal.toString();
  }

  public URL  getURLAsObject(){
    return this.urlLocal;
  }
}
