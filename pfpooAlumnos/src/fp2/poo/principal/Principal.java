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

public class Principal {
    public static void main(String args[]){
        
        try{
            if( args.length != 2 )
                throw new ErrorEnLosArgumentosDeEntradaExcepcion(); 
            ProxyAbstracta   proxy = new Proxy ( args[0], args[1] );
			proxy.procesaSolicitudesDelCliente();  
			proxy.muestraURLBloqueadas();
			proxy.muestraSolicitudes();
            System.out.println("\nRecursos locales");
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



