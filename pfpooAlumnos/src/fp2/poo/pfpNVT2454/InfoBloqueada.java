package fp2.poo.pfpNVT2454;

import fp2.poo.utilidades.*;
import java.net.URL;

/**
 * Descripción: Esta es una clase que contiene los metodos get/set 
 * correspondientes a la informacion bloqueada 
 * @version version 1.1 Mayo 2023
 * @author Mario Rodríguez Ventura
 */
public class InfoBloqueada implements InfoBloqueadaInterfaz{
  
  private int numAccesos;
  private URL urlBloqueada;
  
  /**
   * Método que fija un valor para numAccesos 
   * @param numAccesos El número de accesos 
   * @return void
   */
  public void setNumAccesos(int numAccesos){
    this.numAccesos=numAccesos;
  }  
  
  /**
   * Metodo que devuelve el numero de accesos
   * @return int
   */
  public int getNumAccesos(){
    return this.numAccesos;
  }
  
  /**
   * Método que fija una urlBloqueada 
   * @param urlBloqueada Objeto de Url 
   * @return void
   */
  public void setUrlBloqueada(URL urlBloqueada){
    this.urlBloqueada=urlBloqueada;   
  }
}
