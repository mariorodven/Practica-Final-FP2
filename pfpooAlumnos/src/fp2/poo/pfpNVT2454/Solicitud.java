package fp2.poo.pfpNVT2454;
import java.net.URL;
public class Solicitud {
  
  private int numEntrada;
  private int puerto; //Usualmente 443 o 80
  
  private String protocolo;
  private String maquina; //Por ejemplo www.us.es
  private String recurso;
  private String objeto;

  /*
   *URL(String protocol, String host, int port, String file)
   *Creates a URL object from the specified protocol, host,
   *port number, and file.
   */
  
  private URL urlSoicitud = new URL("us.es");
  
  public Solicitud(int numEntrada, int puerto, String protocolo, String maquina, String recurso, String objeto){
    //Asignacion por defecto
    this.numEntrada=numEntrada;
    this.puerto=puerto;
    this.protocolo=protocolo;
    this.maquina=maquina;
    this.recurso = recurso;
    this.objeto = objeto
  
  }

  public URL getURL(){
    return this.urlSoicitud;
  }

  public void setNumEntrada(int numEntrada){
   this.numEntrada = numEntrada; 
  }

  public int getNumEntrada(){
    return this.numEntrada;
  }

  public void setProtocolo(String protocolo){
    this.protocolo=protocolo; 
  }

  public String getProtocolo(){
    return this.protocolo;
  }

  public void setRecurso(String recurso){
    this.recurso = recurso;
  }
  
  public String getRecurso(){
    return this.recurso;
  }

  public void setPuerto(int puerto){
    this.puerto = puerto;
  }

  public int getPuerto(){
    return this.puerto;
  }
  
  public void setDirectorio(String directorio){
    this.directorio = directorio;
  }

  public String getDirectorio(){
    return this.directorio;
  }

  public void setObjeto(String objeto){
    this.objeto = objeto;
  }

  public String getObjeto(){
    return this.objeto;
  }

}
