package fp2.poo.pfpNVT2454;

import fp2.poo.utilidades.InfoBloqueadaInterfaz;
import java.net.URL;
public class InfoBloqueada implements InfoBloqueadaInterfaz{
  private int numAccesos;
  private URL urlBloqueada;

  public void setNumAccesos(int numAccesos){
    this.numAccesos=numAccesos;
  }  
  public int getNumAccesos(){
    return this.numAccesos;
  }
  public void setUrlBloqueada(URL urlBloqueada){
    this.urlBloqueada=urlBloqueada;   
  }
}
