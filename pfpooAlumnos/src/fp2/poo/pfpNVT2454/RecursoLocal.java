package fp2.poo.pfpNVT2454;

import fp2.poo.utilidades.InfoInterfaz;
import java.net.URL;

public class RecursoLocal implements InfoInterfaz{
  private int numAccesos;
  private int numBytes;
 
  public RecursoLocal(){

  }

  public void setNumAccesos(int numAccesos){
    this.numAccesos=numAccesos;
  }
  
  public int getNumAccesos(){
    return this.numAccesos;
  }

  public int getNumBytes(){
    return this.numBytes;
  }

  public void setNumBytes(int numBytes){
    this.numBytes=numBytes;
  }
}
