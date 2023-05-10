/*
 *  @(#)URLBloqueadaInterfaz.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.utilidades;

import java.net.URL;
import java.net.MalformedURLException;

import fp2.poo.utilidades.InfoBloqueadaInterfaz ;

/**
 * Descripcion: Esta es una interfaz que contiene los metodos asociados
 *              con una URL bloqueada por el Proxy.
 *              La interfaz hereda de InfoRecursoLocalInterfaz que proporciona
 *              los metodos relacionados con la informacion del objeto, y agrega
 *              los metodos para la manipulacion de la URL.
 * @version version 1.0 Marzo 2023
 * @author  Fundamentos de Programacion II
 */
public interface URLBloqueadaInterfaz extends InfoBloqueadaInterfaz {


	/*
	 * Este metodo configura con un objeto de tipo String un recurso.
	 * Al construirse el objeto URL puede lanzarse la excepcion
	 * MalformedURLException.
	 */	
    public void   setURLBloqueada( String url ) throws MalformedURLException;
    
	/*
	 * Este metodo devuelve como cadena (String) la URL del recurso
	 * de un recurso bloqueado.
	 */
    public String getURLBloqueada();

	/*
	 * Este metodo devuelve como objeto del tipo URL un recurso.
	 */		
    public URL    getURLBloqueadaAsObject();	
}
