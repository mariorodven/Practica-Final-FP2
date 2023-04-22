/*
 *  @(#)InfoInterfaz.java
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
 *              asociados a la informacion relacionada con un recurso local.
 *              La interfaz InfoRecursoLocalInterfaz hereda de InfoInterfaz.
 *              La interfaz agrega a InfoInterfaz los metodos (get/set)
 *              relacionados con el numero de bytes de un recurso.
 *
 * @version version 1.0 Marzo 2023
 * @author  Fundamentos de Programacion II
 */
public interface InfoRecursoLocalInterfaz extends InfoInterfaz {

	/*
	 * Este metodo devuelve como entero (int) el numero de bytes
	 * de un recurso.
	 */
    public int  getNumBytes();

	/*
	 * Este metodo configura con un entero el numero de bytes
	 * de un recurso.
	 */
	public void setNumBytes(int numBytes);
	
}
