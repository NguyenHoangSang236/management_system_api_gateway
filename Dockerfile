FROM ubuntu:latest
FROM openjdk:19-jdk-alpine

COPY keystore.p12 keystore.p12
COPY target/api_gateway-0.0.1-SNAPSHOT.jar api_gateway-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/api_gateway-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
