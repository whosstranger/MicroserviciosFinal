FROM openjdk:17
WORKDIR /app
COPY ./target/MicroservicioEureka-1.0.0.jar eureka.jar
EXPOSE 9999
ENTRYPOINT [ "java","-jar","eureka.jar" ]