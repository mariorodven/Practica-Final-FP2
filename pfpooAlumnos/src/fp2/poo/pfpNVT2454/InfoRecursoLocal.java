package fp2.poo.pfpNVT2454;
import fp2.poo.utilidades.InfoRecursoLocalInterfaz;


public class InfoRecursoLocal extends Info implements InfoRecursoLocalInterfaz{
  private int numBytes;

  public InfoRecursoLocal(int numBytes){
    this.numBytes=numBytes;
  }

  /**
   * Método que establece un numero de bytes 
   * @param numBytes Número de bytes
   * @return void
   */
  public void setNumBytes(int numBytes){
    this.numBytes=numBytes;
  }

  /**
   * Método que devuelve el numero de bytes
   * @return int
   */
  public int getNumBytes(){
    return this.numBytes;
  }

}
