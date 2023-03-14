FROM amazoncorretto:11-alpine-jdk
MAINTAINER NicoAngeletti
COPY target\proyect-0.0.1-SNAPSHOT.jar proyect-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/proyect-0.0.1-SNAPSHOT.jar"]
