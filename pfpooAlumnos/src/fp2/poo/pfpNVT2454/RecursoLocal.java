package fp2.poo.pfpNVT2454;

import fp2.poo.utilidades.InfoRecursoLocalInterfaz;


/**
 * Descripcion: Esta es la clase que contiene los métodos
 *              asociados a una recurso local.
 *
 * @version Versión 1.1 Mayo 2023
 * @author  Mario Rodríguez Ventura
 */
public class RecursoLocal implements InfoRecursoLocalInterfaz, Comparable<RecursoLocal>{
  
  private int numAccesos;
  private int numBytes;

  /**
   * Constructor de la clase RecursoLocal que da un valor inicial a los 
   * atributos de la clase.
   * @param numAccesos Parametro que cuenta el numero de accesos.
   * @param numBytes Parámetro que cuenta el numero de Bytes de un recurso.
   */
  public RecursoLocal(int numAccesos, int numBytes){
    this.numAccesos = numAccesos;
    this.numBytes = numBytes;
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
}
