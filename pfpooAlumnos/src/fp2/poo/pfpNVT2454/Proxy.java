package fp2.poo.pfpNVT2454;

import fp2.poo.utilidades.ProxyAbstracta;

public class Proxy extends ProxyAbstracta{
  
  private List<URLBloqueadaInterfaz> urlbloqueadas = new ArrayList<URLBloqueadaInterfaz>();
  
  private List<SolicitudInterfaz> solicitudes = new ArrayList<SolicitudInterfaz> ();
  
  private List<RecursoLocalInterfaz> copiaLocal = new ArrayList<RecursoLocalInterfaz> ();

  public Proxy(String nombreFicheroConf, String nombreFicheroSolicitudes)throws OperacionNoPermitidaExcepcion{
    
    LecturaConfiguracion lecturaConf = new LecturaConfiguracion(nombreFicheroConf);
    
    while (lecturaConf.hasNext()){
      URLBloqueadaInterfaz urlBloqueda = lecturaConf.next( );
      urlbloqueadas.add(urlBloqueda);
    }
}
