package fp2.poo.pfpNVT2454;

import fp2.poo.utilidades.InfoInterfaz;
import java.net.URL;

public class Info implements InfoInterfaz{
  
  private int numAccesos;

  public Info(int numAccesos){
    this.numAccesos=numAccesos;
  }

  public void setNumAccesos(int numAccesos){
    this.numAccesos= numAccesos;
  }

  public int getNumAccesos(){
    return numAccesos;
  }

}
