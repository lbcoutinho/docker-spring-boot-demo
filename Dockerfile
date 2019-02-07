FROM openjdk:8-jdk-alpine
MAINTAINER Leandro Coutinho <lbcoutinho.blm@gmail.com>
COPY ./target/docker-demo-api.jar docker-demo-api.jar
ENTRYPOINT ["java", "-jar", "docker-demo-api.jar"]
EXPOSE 8080