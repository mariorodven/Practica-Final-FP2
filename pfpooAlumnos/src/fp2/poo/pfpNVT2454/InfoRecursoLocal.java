package fp2.poo.pfpNVT2454;
import fp2.poo.utilidades.InfoRecursoLocalInterfaz;

/**
 * Desctipcion: Una clase que sirve para almacenar la informacion del RecursoLocal
 * @version 6.9
 * @author Mario Rodríguez Ventura
 */
public class InfoRecursoLocal extends Info implements InfoRecursoLocalInterfaz{
  private int numBytes;

  public InfoRecursoLocal(int numBytes){
    this.numBytes=numBytes;
  }

  /**
   * Metodo que establece un numero de bytes 
   * @param numBytes Número de bytes
   * 
   */
  public void setNumBytes(int numBytes){
    this.numBytes=numBytes;
  }

  /**
   * Metodo que devuelve el numero de bytes
   * @return int
   */
  public int getNumBytes(){
    return this.numBytes;
  }

}
