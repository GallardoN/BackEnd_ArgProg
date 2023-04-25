FROM amazoncorretto:17-alpine-jdk 
MAINTAINER GNA 
COPY target/gna-0.0.1-SNAPSHOT.jar  gna-app.jar               
ENTRYPOINT ["java","-jar","/gna-app.jar"]    
EXPOSE 8080             