OPCIONES = -Xlint -encoding ISO-8859-1 -classpath ./bin  -cp ./bin -d ./bin 
JAVADOC=javadoc
UTILIDADES = fp2/poo/utilidades
EXCEPCION1 = fp2/poo/utilidades/Excepciones/OperacionNoPermitidaExcepcion
EXCEPCION2 = fp2/poo/utilidades/Excepciones/ErrorEnLosArgumentosDeEntradaExcepcion
PFPOO = fp2/poo/pfpNVT2454
PRINCIPAL_DIR = fp2/poo/principal
PRINCPAL_CLASS = Principal
FICHEROS = configuracion00.txt solicitudes00.txt
MAINPACKAGE = fp2.poo.principal.Principal

jar: 						./bin/$(PRINCIPAL_DIR)/$(PRINCPAL_CLASS).class \
								./bin/$(UTILIDADES)/InfoInterfaz.class \
								./bin/$(UTILIDADES)/ProxyAbstracta.class \
								./bin/$(UTILIDADES)/SolicitudInterfaz.class \
								./bin/$(UTILIDADES)/LecturaConfiguracion.class \
								./bin/$(UTILIDADES)/URLBloqueadaInterfaz.class \
								./bin/$(UTILIDADES)/RecursoLocalInterfaz.class \
								./bin/$(UTILIDADES)/InfoBloqueadaInterfaz.class \
								./bin/$(UTILIDADES)/InfoRecursoLocalInterfaz.class \
								./bin/$(UTILIDADES)/LecturaSolicitudesDeEntrada.class \
								./bin/$(EXCEPCION1).class \
								./bin/$(EXCEPCION2).class \
								./bin/$(PFPOO)/Info.class \
								./bin/$(PFPOO)/InfoBloqueada.class \
								./bin/$(PFPOO)/InfoRecursoLocal.class \
								./bin/$(PFPOO)/Solicitud.class \
								./bin/$(PFPOO)/Proxy.class \
								./bin/$(PFPOO)/RecursoLocal.class \
								./bin/$(PFPOO)/URLBloqueada.class \
								./bin/$(PFPOO)/OrdenacionRecursoPorAccesos.class 
	jar cvfe ./jar/Main.jar $(MAINPACKAGE) \
								./bin/$(PRINCIPAL_DIR)/$(PRINCPAL_CLASS).class \
								-C ./bin/$(UTILIDADES)/ . \
							 	-C ./bin/fp2/poo/utilidades/Excepciones/ .\
								-C ./bin/$(PFPOO)/ . \
	

./bin/$(PRINCIPAL_DIR)/$(PRINCPAL_CLASS).class: ./bin/$(EXCEPCION1).class 									\
																					./bin/$(EXCEPCION2).class										\
																					./bin/$(PFPOO)/Proxy.class 									\
																					./src/$(PRINCIPAL_DIR)/$(PRINCPAL_CLASS).java 
		javac $(OPCIONES) ./src/$(PRINCIPAL_DIR)/$(PRINCPAL_CLASS).java


./bin/$(PFPOO)/Proxy.class: ./bin/$(EXCEPCION1).class 												\
																		 ./bin/$(UTILIDADES)/ProxyAbstracta.class 				\
																		 ./bin/$(UTILIDADES)/LecturaConfiguracion.class 	\
																		 ./bin/$(UTILIDADES)/RecursoLocalInterfaz.class 	\
																		 ./bin/$(UTILIDADES)/SolicitudInterfaz.class 			\
																		 ./bin/$(UTILIDADES)/URLBloqueadaInterfaz.class 	\
																		 ./bin/$(UTILIDADES)/InfoRecursoLocalInterfaz.class \
																		 ./bin/$(PFPOO)/RecursoLocal.class								\
																		 ./bin/$(PFPOO)/OrdenacionRecursoPorAccesos.class \
																		 ./bin/$(UTILIDADES)/LecturaSolicitudesDeEntrada.class \
																		 ./src/$(PFPOO)/Proxy.java 												
		javac $(OPCIONES) ./src/$(PFPOO)/Proxy.java
	

./bin/$(UTILIDADES)/ProxyAbstracta.class: ./src/$(UTILIDADES)/ProxyAbstracta.java 	\
																					./bin/$(EXCEPCION1).class 								\
																					./bin/$(UTILIDADES)/SolicitudInterfaz.class 
		javac $(OPCIONES) ./src/$(UTILIDADES)/ProxyAbstracta.java


./bin/$(UTILIDADES)/LecturaConfiguracion.class: ./src/$(UTILIDADES)/LecturaConfiguracion.java \
																								./bin/$(PFPOO)/URLBloqueada.class 						\
																								./bin/$(UTILIDADES)/URLBloqueadaInterfaz.class \
																								./bin/$(PFPOO)/InfoBloqueada.class 						\
																								./bin/$(EXCEPCION1).class 										
		javac $(OPCIONES) ./src/$(UTILIDADES)/LecturaConfiguracion.java


./bin/$(UTILIDADES)/LecturaSolicitudesDeEntrada.class: ./bin/$(PFPOO)/Solicitud.class	\
																										 ./bin/$(EXCEPCION1).class 			\
																										 ./bin/$(UTILIDADES)/SolicitudInterfaz.class		\
																										 ./src/$(UTILIDADES)/LecturaSolicitudesDeEntrada.java
	javac $(OPCIONES) ./src/$(UTILIDADES)/LecturaSolicitudesDeEntrada.java
	

./bin/$(PFPOO)/RecursoLocal.class: ./src/$(PFPOO)/RecursoLocal.java \
																	 ./bin/$(UTILIDADES)/InfoRecursoLocalInterfaz.class \
																	 ./bin/$(UTILIDADES)/RecursoLocalInterfaz.class
	javac $(OPCIONES) ./src/$(PFPOO)/RecursoLocal.java

./bin/$(UTILIDADES)/RecursoLocalInterfaz.class: ./src/$(UTILIDADES)/RecursoLocalInterfaz.java \
																								./bin/$(UTILIDADES)/InfoRecursoLocalInterfaz.class 
	javac $(OPCIONES) ./src/$(UTILIDADES)/RecursoLocalInterfaz.java

./bin/$(PFPOO)/InfoRecursoLocal.class: ./src/$(PFPOO)/InfoRecursoLocal.java 	\
																			 ./bin/$(UTILIDADES)/InfoRecursoLocalInterfaz.class \
																			 ./bin/$(PFPOO)/Info.class							
	javac $(OPCIONES) ./src/$(PFPOO)/InfoRecursoLocal.java

./bin/$(UTILIDADES)/InfoRecursoLocalInterfaz.class: ./src/$(UTILIDADES)/InfoRecursoLocalInterfaz.java \
																										./bin/$(UTILIDADES)/InfoInterfaz.class
	javac $(OPCIONES) ./src/$(UTILIDADES)/InfoRecursoLocalInterfaz.java

./bin/$(PFPOO)/URLBloqueada.class: ./src/$(PFPOO)/URLBloqueada.java	\
																	 ./bin/$(UTILIDADES)/URLBloqueadaInterfaz.class \
																	 ./bin/$(PFPOO)/InfoBloqueada.class 
	javac $(OPCIONES) ./src/$(PFPOO)/URLBloqueada.java

./bin/$(UTILIDADES)/URLBloqueadaInterfaz.class: ./src/$(UTILIDADES)/URLBloqueadaInterfaz.java \
																							  ./bin/$(UTILIDADES)/InfoBloqueadaInterfaz.class
	javac $(OPCIONES) ./src/$(UTILIDADES)/URLBloqueadaInterfaz.java

./bin/$(PFPOO)/Solicitud.class: ./src/$(PFPOO)/Solicitud.java \
																./bin/$(UTILIDADES)/SolicitudInterfaz.class
	javac $(OPCIONES) ./src/$(PFPOO)/Solicitud.java

./bin/$(UTILIDADES)/SolicitudInterfaz.class: ./src/$(UTILIDADES)/SolicitudInterfaz.java 
	javac $(OPCIONES) ./src/$(UTILIDADES)/SolicitudInterfaz.java


./bin/$(PFPOO)/InfoBloqueada.class: ./src/$(PFPOO)/InfoBloqueada.java \
																		./bin/$(UTILIDADES)/InfoBloqueadaInterfaz.class \
																		./bin/$(PFPOO)/Info.class
	javac $(OPCIONES) ./src/$(PFPOO)/InfoBloqueada.java


./bin/$(UTILIDADES)/InfoBloqueadaInterfaz.class: ./src/$(UTILIDADES)/InfoBloqueadaInterfaz.java \
																								 ./bin/$(UTILIDADES)/InfoInterfaz.class 
	javac $(OPCIONES) ./src/$(UTILIDADES)/InfoBloqueadaInterfaz.java

./bin/$(PFPOO)/Info.class: ./src/$(PFPOO)/Info.java \
													 ./bin/$(UTILIDADES)/InfoInterfaz.class
	javac $(OPCIONES) ./src/$(PFPOO)/Info.java

./bin/$(UTILIDADES)/InfoInterfaz.class: ./src/$(UTILIDADES)/InfoInterfaz.java
	javac $(OPCIONES) ./src/$(UTILIDADES)/InfoInterfaz.java

./bin/$(PFPOO)/OrdenacionRecursoPorAccesos.class: ./src/$(PFPOO)/OrdenacionRecursoPorAccesos.java	\
																									./bin/$(UTILIDADES)/RecursoLocalInterfaz.class
	javac $(OPCIONES) ./src/$(PFPOO)/OrdenacionRecursoPorAccesos.java

#Excepciones

./bin/$(EXCEPCION1).class: ./src/$(EXCEPCION1).java
	javac $(OPCIONES) ./src/$(EXCEPCION1).java


./bin/$(EXCEPCION2).class: ./src/$(EXCEPCION2).java
	javac $(OPCIONES) ./src/$(EXCEPCION2).java

ejecucion:
	java -classpath ./bin -cp ./bin $(MAINPACKAGE) $(FICHEROS)
	

limpia: 
	rm -rf ./jar/* ./copiaLocal/* /src/$(UTILIDADES)/*.class ./src/$(UTILIDADES)/Excepciones/*.class /src/$(PRINCIPAL_DIR)/*.class ./src/$(PFPOO)/*.class ./bin/* ./doc/*


#								doc

doc: 
	$(JAVADOC)  -encoding ISO-8859-1 -charset "UTF-8" -sourcepath ./src -d ./doc -classpath ./bin   \
                 ./src/fp2/poo/utilidades/*.java \
                 ./src/fp2/poo/pfpNVT2454/*.java \
                 ./src/fp2/poo/principal/Principal.java\



