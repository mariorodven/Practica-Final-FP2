/*
 *  @(#)LecturaSolicitudesDeEntrada.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.utilidades;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import fp2.poo.utilidades.SolicitudInterfaz;

/*
 * La clase URLBloqueada debe importarla de fp2.poo.pfpooXXX, siendo XXX el uvus del alumno.
 */
import fp2.poo.pfpNVT2454.Solicitud;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class LecturaSolicitudesDeEntrada implements Iterator<SolicitudInterfaz> {
 
    public static String   RUTA     = "./datos/";
 
    private BufferedReader  in       = null;
    private SolicitudInterfaz solicitud  = null;
    
    public LecturaSolicitudesDeEntrada(String nombreDelFichero) throws OperacionNoPermitidaExcepcion {
        
        try{
            in = new BufferedReader (new InputStreamReader(
                                     new FileInputStream(RUTA + nombreDelFichero)));
        } catch (FileNotFoundException e) {
            throw new OperacionNoPermitidaExcepcion("Error en apertura de fichero");
        }
		
    }    

    public SolicitudInterfaz next( ) throws NoSuchElementException {
        if ( solicitud == null )
            throw new NoSuchElementException();
        SolicitudInterfaz local  = solicitud;
        solicitud = null;
        return local;
    }

    public boolean hasNext() throws NoSuchElementException {
        String            linea           = null;
        boolean           lecturaInvalida = false;
        boolean           finLectura      = false;
		
        if (in == null)
            throw new NoSuchElementException();
        
        solicitud = null;
        while((finLectura  == false) && (solicitud == null)) {
            lecturaInvalida = false;
	        int    numEntrada; // Por ejemplo, 1 
            String protocolo;  // Por ejemplo, https
            String maquina;    // Por ejemplo, www.us.es
            int    puerto;     // Por ejemplo, 443
            String objeto;     // Por ejemplo, /sites/default/files/2019-05/marca-US-principal.jpg       
		 
            try{
                linea = in.readLine().trim();                         
                lecturaInvalida = true;
                StringTokenizer tokenizer = new StringTokenizer(linea);
	  
                numEntrada  = (tokenizer.hasMoreElements()) ? Integer.parseInt(tokenizer.nextToken()): -1 ;  
                protocolo   = (tokenizer.hasMoreElements()) ? (tokenizer.nextToken()) : null;                
                maquina     = (tokenizer.hasMoreElements()) ? (tokenizer.nextToken()) : null;
                puerto      = (tokenizer.hasMoreElements()) ? Integer.parseInt(tokenizer.nextToken()): -1 ;
                objeto      = (tokenizer.hasMoreElements()) ? (tokenizer.nextToken()) : null;
                
                if(numEntrada != -1 && protocolo   != null && maquina  != null && puerto != -1 
                                    && objeto  != null      ) {    
                    solicitud      =  new Solicitud ( numEntrada, protocolo,  maquina, 
					                              puerto,     objeto);                          
                } else {                                             
                   this.solicitud      = null;
                }
           } catch ( IOException e ) {
                finLectura  = true;
                solicitud = null;
           } catch (Exception e) {
                finLectura  = true;
                solicitud = null;
           }
       }
       return ( (solicitud == null) ? false : true );
    }
}


