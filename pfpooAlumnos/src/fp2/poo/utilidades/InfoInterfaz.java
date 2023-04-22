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
 * Descripcion: Esta es una interfaz que contiene los metodos get/set
 *              asociados a la informacion del numero de accesos.
 *
 * @version version 1.0 Marzo 2023
 * @author  Fundamentos de Programacion II
 */
public interface InfoInterfaz {

    /*
     *  Metodo de configuracion del atributo relacionado con el numero de accesos.          
     */	
    public void setNumAccesos(int numAccesos);
    
    /*
     *  Metodo de para obtener el numero de accesos.
     */	
    public int getNumAccesos();


}
