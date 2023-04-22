/*
 *  @(#)SolicitudInterfaz.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.utilidades;

import java.net.URL;

/**
 * Descripcion: Esta es una interfaz que contiene los metodos
 *              asociados a una solicitud.
 *
 * @version version 1.0 Marzo 2023
 * @author  Fundamentos de Programacion II
 */
public interface SolicitudInterfaz {


    /*
     * Metodo que devuelve la URL de una solicitud.          
     */	
    public URL     getURL();

    /*
     * Configura el numero de entrada de una solicitud en el Proxy.   
     */	
	public void    setNumEntrada(int numEntrada);
	
    /*
     * Devuelve el numero de entrada de una solicitud en el Proxy.   
     */	
	public int     getNumEntrada();

    /*
     * Configura el protocolo que utiliza una solicitud del Proxy.
     */	
	public void    setProtocolo(String protocolo);

    /*
     * Devuelve el protocolo que utiliza una solicitud del Proxy.
     */		
	public String  getProtocolo();

    /*
     * Configura el recurso de una solicitud del Proxy.
     */	
	public void    setRecurso(String recurso);
	
    /*
     * Devuelve el recurso de una solicitud del Proxy.
     */		
	public String  getRecurso();

    /*
     * Configura el puerto de una solicitud del Proxy.
     */	
	public void    setPuerto(int puerto);
	
    /*
     * Devuelve el puerto de una solicitud del Proxy.
     */			
	public int     getPuerto();
		
    /*
     * Configura el directorio de una solicitud del Proxy.
     */			
	public void    setDirectorio(String directorio);
	
    /*
     * Devuelve el directorio de una solicitud del Proxy.
     */				
	public String  getDirectorio();
    
    /*
     * Configura el fichero de una solicitud del Proxy.
     */	    
	public void    setObjeto(String objeto);

    /*
     * Devuelve el fichero de una solicitud del Proxy.
     */	    	
	public String  getObjeto();
}
