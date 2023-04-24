FROM amazoncorretto:17-alpine-jdk //De que imagen parte
MAINTAINER GNA //quien es el dueño (Gallardo Nahuel Anibal(yo))
COPY target/gna-0.0.1-SNAPSHOT.jar    gna-app.jar                //Va a copiar el empaquetado github
ENTRYPOINT ["java","-jar","/gna-app.jar"]                        //La primera instrucción que se va a ejecutar