/*
 *  @(#)URLBloqueadaInterfaz.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.utilidades;

import fp2.poo.utilidades.InfoRecursoLocalInterfaz;
import java.net.URL;
import java.net.MalformedURLException;

/**
 * Descripcion: Esta es una interfaz que contiene los metodos asociados
 *              con un recurso local del Proxy.
 *              La interfaz hereda de InfoRecursoLocalInterfaz que proporciona
 *              los metodos relacionados con la informacion del objeto, y agrega
 *              los metodos para la manipulacion de la URL.
 * @version version 1.0 Marzo 2023
 * @author  Fundamentos de Programacion II
 */
public interface RecursoLocalInterfaz extends InfoRecursoLocalInterfaz{

	/*
	 * Este metodo configura con un objeto de tipo String un recurso.
	 * Al construirse el objeto URL puede lanzarse la excepcion
	 * MalformedURLException.
	 */	
    public void   setURL( String url ) throws MalformedURLException;
    
	/*
	 * Este metodo devuelve como cadena (String) la URL del recurso
	 * de un recurso.
	 */
    public String getURL();
	
	/*
	 * Este metodo devuelve como objeto del tipo URL un recurso.
	 */	
    public URL    getURLAsObject();	
    
}
