package fp2.poo.pfpNVT2454;

import fp2.poo.utilidades.InfoInterfaz;
import java.net.URL;

/**
 * Descripción: Esta clase contiene los get/set 
 * asociados a los numeros de accesos
 * @version version 1.1 Mayo 2023
 * @author Mario Rodríguez Ventura
 */

public class Info implements InfoInterfaz{
  
  private int numAccesos;

  /**
   * Constructor de la clase Info, que le da un valos inicial al 
   * único atributo, el cual es numAccesos
   * @param numAccesos Valor inicial para el numero de accesos del proxy
   */
  public Info(int numAccesos){
    this.numAccesos=numAccesos;
  }

  /**
   * Método que da un valor a numAccesos
   * @return void
   * @param numAccesos El numero de numAccesos
   */
  public void setNumAccesos(int numAccesos){
    this.numAccesos= numAccesos;
  }
  
  /**
   * Método para ver el numero de accesos 
   * @return int 
   */
  public int getNumAccesos(){
    return numAccesos;
  }

}
