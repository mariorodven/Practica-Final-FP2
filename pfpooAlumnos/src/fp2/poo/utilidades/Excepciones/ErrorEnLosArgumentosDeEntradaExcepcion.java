/*
 *  @(#)ErrorEnLosArgumentosDeEntradaExcepcion.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.utilidades.Excepciones;


/**
 * Esta excepcion se lanza cuando se intenta
 * realizar una operacion incorrecta.
 * 
 * Si no se proporcionan dos nombres de fichero en los argumentos de la 
 * linea de comandos.
 *                             
 * @version version 1.0 Abril 2023
 * @author  Fundamentos de Programacion II
 */
public class ErrorEnLosArgumentosDeEntradaExcepcion extends Exception {

    private static final long serialVersionUID = -2L;
    private String s;

    /*
     * Constructor sin argumentos.
     */
    public ErrorEnLosArgumentosDeEntradaExcepcion( ){
    }

    /*
     * Constructor con un argumento de tipo String.
     */
    public ErrorEnLosArgumentosDeEntradaExcepcion(String s ){
        this.s = s;
    }

    /*
     * Este metodo proporciona una representacion en forma de cadena 
     * de la excepcion.
     */
    public String toString(){  
        return this.s;
    }
}
