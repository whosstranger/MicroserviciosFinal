FROM openjdk:17
WORKDIR /app
COPY ./target/MicroserviceWorker-1.0.0.jar worker.jar
EXPOSE 8084
ENTRYPOINT [ "java","-jar","worker.jar" ]