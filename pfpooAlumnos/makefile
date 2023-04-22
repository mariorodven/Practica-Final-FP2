###########################################################################################
#
#       makefile para la compilacion de la PFPOO de Fundamentos de Programacion II
#
#
# Este fichero makefile se proporciona para realizar la compilacion y ejecucion de la PFPOO.
# El makefile lo debe usar como referencia, y puede realizar los cambios necesarios
# para realizar la compilacion y prueba del codigo.
#
# El makefile se ha hecho con el UVUS fp2. 
# Cada alumno debe sustituir fp2 por el UVUS del alumno en este makefile.
#
###########################################################################################

OPCIONES = -Xlint -encoding ISO-8859-1 -classpath ./bin  -cp ./bin -d ./bin 
	
./bin/fp2/poo/principal/Principal.class:\
                           ./bin/fp2/poo/utilidades/Excepciones/ErrorEnLosArgumentosDeEntradaExcepcion.class\
                           ./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class \
                           ./bin/fp2/poo/pfpoofp2/Proxy.class\
                           ./src/fp2/poo/principal/Principal.java
	javac $(OPCIONES)      ./src/fp2/poo/principal/Principal.java

./bin/fp2/poo/pfpoofp2/Proxy.class: \
                           ./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class \
                           ./bin/fp2/poo/utilidades/ProxyAbstracta.class \
                           ./bin/fp2/poo/utilidades/LecturaConfiguracion.class\
                           ./bin/fp2/poo/utilidades/LecturaSolicitudesDeEntrada.class\
                           ./bin/fp2/poo/utilidades/RecursoLocalInterfaz.class \
                           ./bin/fp2/poo/utilidades/SolicitudInterfaz.class \
                           ./bin/fp2/poo/utilidades/URLBloqueadaInterfaz.class \
                           ./bin/fp2/poo/utilidades/InfoRecursoLocalInterfaz.class \
                           ./bin/fp2/poo/pfpoofp2/RecursoLocal.class\
                            ./bin/fp2/poo/pfpoofp2/OrdenacionRecursoPorAccesos.class\
                                                       ./src/fp2/poo/pfpoofp2/Proxy.java
	javac $(OPCIONES)      ./src/fp2/poo/pfpoofp2/Proxy.java

./bin/fp2/poo/utilidades/ProxyAbstracta.class: \
                          ./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class \
                          ./bin/fp2/poo/utilidades/SolicitudInterfaz.class\
                          ./src/fp2/poo/utilidades/ProxyAbstracta.java
	javac $(OPCIONES)     ./src/fp2/poo/utilidades/ProxyAbstracta.java

./bin/fp2/poo/utilidades/LecturaConfiguracion.class: \
                         ./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class \
                         ./bin/fp2/poo/pfpoofp2/URLBloqueada.class\
                         ./bin/fp2/poo/utilidades/URLBloqueadaInterfaz.class \
                         ./bin/fp2/poo/pfpoofp2/InfoBloqueada.class \
                         ./src/fp2/poo/utilidades/LecturaConfiguracion.java
	javac $(OPCIONES)    ./src/fp2/poo/utilidades/LecturaConfiguracion.java

./bin/fp2/poo/utilidades/LecturaSolicitudesDeEntrada.class: \
                         ./bin/fp2/poo/pfpoofp2/Solicitud.class \
                         ./bin/fp2/poo/utilidades/SolicitudInterfaz.class \
                         ./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class\
                         ./src/fp2/poo/utilidades/LecturaSolicitudesDeEntrada.java
	javac $(OPCIONES)    ./src/fp2/poo/utilidades/LecturaSolicitudesDeEntrada.java

./bin/fp2/poo/pfpoofp2/RecursoLocal.class: ./bin/fp2/poo/pfpoofp2/InfoRecursoLocal.class \
                          ./src/fp2/poo/pfpoofp2/RecursoLocal.java
	javac $(OPCIONES)     ./src/fp2/poo/pfpoofp2/RecursoLocal.java

./bin/fp2/poo/utilidades/RecursoLocalInterfaz.class: \
                          ./bin/fp2/poo/utilidades/InfoRecursoLocalInterfaz.class \
                          ./src/fp2/poo/utilidades/RecursoLocalInterfaz.java
	javac $(OPCIONES)     ./src/fp2/poo/utilidades/RecursoLocalInterfaz.java

./bin/fp2/poo/pfpoofp2/InfoRecursoLocal.class:\
                          ./bin/fp2/poo/utilidades/InfoRecursoLocalInterfaz.class\
                          ./bin/fp2/poo/pfpoofp2/Info.class \
                          ./src/fp2/poo/pfpoofp2/InfoRecursoLocal.java
	javac $(OPCIONES)     ./src/fp2/poo/pfpoofp2/InfoRecursoLocal.java

./bin/fp2/poo/utilidades/InfoRecursoLocalInterfaz.class: \
                         ./bin/fp2/poo/utilidades/InfoInterfaz.class\
                         ./src/fp2/poo/utilidades/InfoRecursoLocalInterfaz.java
	javac $(OPCIONES)    ./src/fp2/poo/utilidades/InfoRecursoLocalInterfaz.java

./bin/fp2/poo/pfpoofp2/URLBloqueada.class:  \
                         ./bin/fp2/poo/utilidades/URLBloqueadaInterfaz.class \
                         ./bin/fp2/poo/pfpoofp2/InfoBloqueada.class \
                         ./src/fp2/poo/pfpoofp2/URLBloqueada.java
	javac $(OPCIONES)    ./src/fp2/poo/pfpoofp2/URLBloqueada.java

./bin/fp2/poo/utilidades/URLBloqueadaInterfaz.class: \
                         ./bin/fp2/poo/utilidades/InfoBloqueadaInterfaz.class\
                         ./src/fp2/poo/utilidades/URLBloqueadaInterfaz.java
	javac $(OPCIONES)    ./src/fp2/poo/utilidades/URLBloqueadaInterfaz.java


./bin/fp2/poo/pfpoofp2/Solicitud.class: \
                         ./bin/fp2/poo/utilidades/SolicitudInterfaz.class \
                         ./src/fp2/poo/pfpoofp2/Solicitud.java
	javac $(OPCIONES)    ./src/fp2/poo/pfpoofp2/Solicitud.java

./bin/fp2/poo/utilidades/SolicitudInterfaz.class: ./src/fp2/poo/utilidades/SolicitudInterfaz.java
	javac $(OPCIONES)   ./src/fp2/poo/utilidades/SolicitudInterfaz.java

./bin/fp2/poo/pfpoofp2/InfoBloqueada.class: \
                       ./bin/fp2/poo/utilidades/InfoBloqueadaInterfaz.class \
                       ./bin/fp2/poo/pfpoofp2/Info.class \
                       ./src/fp2/poo/pfpoofp2/InfoBloqueada.java
	javac $(OPCIONES)  ./src/fp2/poo/pfpoofp2/InfoBloqueada.java

./bin/fp2/poo/utilidades/InfoBloqueadaInterfaz.class: \
                       ./bin/fp2/poo/utilidades/InfoInterfaz.class \
                       ./src/fp2/poo/utilidades/InfoBloqueadaInterfaz.java
	javac $(OPCIONES)  ./src/fp2/poo/utilidades/InfoBloqueadaInterfaz.java



./bin/fp2/poo/pfpoofp2/Info.class: ./bin/fp2/poo/utilidades/InfoInterfaz.class \
                                   ./src/fp2/poo/pfpoofp2/Info.java
	javac $(OPCIONES)   ./src/fp2/poo/pfpoofp2/Info.java

./bin/fp2/poo/utilidades/InfoInterfaz.class: \
                       ./src/fp2/poo/utilidades/InfoInterfaz.java
	javac $(OPCIONES)  ./src/fp2/poo/utilidades/InfoInterfaz.java


 ./bin/fp2/poo/pfpoofp2/OrdenacionRecursoPorAccesos.class:  \
                           ./bin/fp2/poo/utilidades/RecursoLocalInterfaz.class \
                           ./src/fp2/poo/pfpoofp2/OrdenacionRecursoPorAccesos.java 
	javac $(OPCIONES)      ./src/fp2/poo/pfpoofp2/OrdenacionRecursoPorAccesos.java


##################################################
#              EXCEPCIONES
##################################################
./bin/fp2/poo/utilidades/Excepciones/ErrorEnLosArgumentosDeEntradaExcepcion.class: \
                      ./src/fp2/poo/utilidades/Excepciones/ErrorEnLosArgumentosDeEntradaExcepcion.java
	javac $(OPCIONES) ./src/fp2/poo/utilidades/Excepciones/ErrorEnLosArgumentosDeEntradaExcepcion.java


./bin/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.class: \
                      ./src/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.java
	javac $(OPCIONES) ./src/fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion.java
	
		
##################################################
#              ejecucion
##################################################

ejecucion:
	java   -classpath ./bin  -cp ./bin  fp2.poo.principal.Principal configuracion00.txt solicitudes00.txt 

	
