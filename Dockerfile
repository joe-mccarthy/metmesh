FROM eclipse-temurin:17-jre-alpine 
WORKDIR /app

COPY target/metmesh.jar /app/metmesh.jar

ENTRYPOINT java -jar metmesh.jar