package fp2.poo.principal;

import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion ;
import fp2.poo.utilidades.Excepciones.ErrorEnLosArgumentosDeEntradaExcepcion;
import fp2.poo.utilidades.ProxyAbstracta;

/*
 * debe cambiar import fp2.poo.pfpoofp2.Proxy;
 * por  import fp2.poo.pfpooXXX.Proxy;
 * siendo XXX el uvus del alumno
 */
import fp2.poo.pfpNVT2454.Proxy;


import java.net.URL;
import java.net.URLConnection;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.MalformedURLException;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.File;

import java.util.Map;
import java.util.HashMap;

public class Principal {
    public static void main(String args[]){
        
        try{
            if( args.length != 2 )
                throw new ErrorEnLosArgumentosDeEntradaExcepcion(); 
            ProxyAbstracta   proxy = new Proxy ( args[0], args[1] );
			proxy.procesaSolicitudesDelCliente();  
			proxy.muestraURLBloqueadas();
			proxy.muestraSolicitudes();
			proxy.muestraRecursos();	
			proxy.ordenarRecursosPorAccesos();
			System.out.println("Recursos locales despues de ordenacion.");
			proxy.muestraRecursos();								    
        } catch (OperacionNoPermitidaExcepcion  e) {
            System.err.println("Fichero inexistente");
        } catch(ErrorEnLosArgumentosDeEntradaExcepcion e){
            System.err.println("Numero de argumentos incorrecto");        
        }
    }
}



