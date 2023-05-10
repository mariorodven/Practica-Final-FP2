/*
 *  @(#)LecturaConfiguracion.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.utilidades;

import java.util.Iterator;
import java.util.NoSuchElementException;

import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import fp2.poo.utilidades.URLBloqueadaInterfaz;

/*
 * La clase URLBloqueada debe importarla de fp2.poo.pfpooXXX, siendo XXX el uvus del alumno.
 */
import fp2.poo.pfpNVT2454.URLBloqueada;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class LecturaConfiguracion implements Iterator<URLBloqueadaInterfaz> {
 
    public static String         RUTA = "./datos/";
    private BufferedReader       in   = null;
    private URLBloqueadaInterfaz url  = null;
    
    public LecturaConfiguracion(String nombreDelFichero) throws OperacionNoPermitidaExcepcion { 
        try{
            in = new BufferedReader (new InputStreamReader(
                                     new FileInputStream(RUTA + nombreDelFichero)));
        } catch (FileNotFoundException e) {
            throw new OperacionNoPermitidaExcepcion("Error en apertura de fichero LecturaConfiguracion ");
        }
    }    

    public URLBloqueadaInterfaz next( ) throws NoSuchElementException {
        if ( url == null )
            throw new NoSuchElementException();
        URLBloqueadaInterfaz local  = url;
        url = null;
        return local;
    }

    public boolean hasNext() throws NoSuchElementException {
        String            linea           = null;
        boolean           lecturaInvalida = false;
        boolean           finLectura      = false;
		
        if (in == null)
            throw new NoSuchElementException();
        
        url = null;
        while((finLectura  == false) && (url == null)) {
            lecturaInvalida = false;
         
            try{
			    linea = in.readLine().trim();                          
                if( lecturaInvalida == false && linea.length() != 0 ) {    
                    url      =  new URLBloqueada (linea);     
                } else {
                   this.url      = null;
                }   
           } catch ( IOException e ) {
                finLectura  = true; 
                url = null;
                lecturaInvalida = true;
           } catch (Exception e) {
                finLectura  = true; 
                url = null;
                lecturaInvalida = true;
           }
       }
       return ( (url == null) ? false : true );
    }
}


