/*
 *  @(#)ProxyAbstracta .java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.utilidades;

import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import fp2.poo.utilidades.SolicitudInterfaz;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import java.io.File;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

/**
 * Esta es una clase que representa un Proxy.
 * Recibe solicitudes de recursos y las procesa.
 *
 * @version version 1.0 Abril 2023
 * @author  Fundamentos de Programacion II
 */
public abstract class ProxyAbstracta {

    /**
     * Directorio en el que se encuentran los ficheros de la copia local.
     */
    public static final String   COPIA_LOCAL     = "./copiaLocal/";
    
    /**
     * Este método realiza el procesamiento de las solicitudes de recursos
     * que recibe el Proxy. 
     * 
     * Para cada solicitud al Proxy, se comprueba si la solicitud corresponde
     * a una URL bloqueada, si es así, se incrementará un contador con el numero
     * de accesos realizados a esa URL bloqueada. En este caso, se muestra por
     * pantalla la cadena BLOCK seguida de la URL del recurso solicitado.
     * 
     * Si el recurso solicitado no está bloqueado, se comprueba si está ya
     * almacenado en el Proxy. Si el recurso está almacenado en el Proxy,
     * se muestra por pantalla la cadena PROXY seguida de la URL del recurso solicitado.
     *
     * Si el recurso solicitado al Proxy no estuviera bloqueado ni almacenado
     * en el Proxy se busca en la web, y si existe entonces se obtiene y se 
     * almacena en el directorio del Proxy copiaLocal. En este caso, se muestra
     * por pantalla la cadena _OK__ seguida de la URL del recurso solicitado.
     * 
     * Si el recurso solicitado al Proxy no estuviera bloqueado, tampoco estuviera
     * almacenado en la copia local, y no existe en la web, entonces se muestra
     * por pantalla la cadena NO_OK seguido de la URL del recurso solicitado.
     */
	public abstract void procesaSolicitudesDelCliente()  throws OperacionNoPermitidaExcepcion;
	
	/*
	 * Este metodo muestra todas las solicitudes leidas del fichero de solicitudes.
	 * La salida proporciona una linea por cada solicitud, y cada solicitud 
	 * debe mostrar el mismo formato y orden que el proporcionado en el fichero
	 * de solicitudes que se proporciona al Proxy.
	 */
	public abstract void muestraSolicitudes();
	
	/*
	 * Este metodo muestra todas las URL bloqueadas por el Proxy, leidas 
	 * del fichero de configuracion. Se genera una línea en la salida estándar
	 * por cada URL bloqueada por el Proxy, indicando el numero de veces que 
	 * ha sido solicitada seguido de toda la información relacionada con 
	 * la URL correspondiente.
	 */
    public abstract void muestraURLBloqueadas();
    
    /*
     * Este metodo muestra todos los recursos almacenados localmente por el Proxy.
     * Genera una linea en la salida por cada recurso almacenado localmente,
     * indicando en primer lugar el número de veces que ha sido solicitada la URL
     * seguido por el tamaño en bytes del fichero y la URL correspondiente.
     */
    public abstract void muestraRecursos();
    
    /*
     * Este metodo ordena los recursos almacenados en la copia local del Proxy
     * segun el numero de solicitudes recibidas de menor a mayor.
     * Para realizar esta ordenacion se debe usar la clase
     * OrdenacionRecursosPorAccesos de tal forma que implemente la interfaz
     * Comparator de Java.
     */
    public abstract void ordenarRecursosPorAccesos(); 
    
	/*
	 * Este metodo obtiene un recurso de la web dada como parametro la URL 
	 * del recuso y lo guarda en un fichero local al proxy.
	 *
	 * Devuelve: el numero de bytes del fichero si existe, y -1 en caso de error.
	 */  
    protected  int guardarRecursoEnLocal(URL url){
        int contadorDeBytes = 0;		
        try{             
	    String file = url.getFile();
	    int    pos  = file.lastIndexOf("/");
            String camino   = file.substring(pos + 1, file.length());
            
            URLConnection yc = url.openConnection();
            BufferedInputStream in = new BufferedInputStream(yc.getInputStream());
            int valor;  
            OutputStream os = null;         
            os = new FileOutputStream( ProxyAbstracta.COPIA_LOCAL + camino );            
            while ((valor = in.read()) != -1) {
                contadorDeBytes++; 
                os.write(valor);
            }
            in.close();
            os.close();
        }catch(MalformedURLException e){
            return -1;             
        }catch(IOException e){ 
            return -1;      
        }                      
        return contadorDeBytes;         
    }     
    
}

