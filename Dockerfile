# Examples:
# https://spring.io/guides/gs/spring-boot-docker/
# https://gist.github.com/kekru/e7414a9a689038b1153c48d9b2e30edf

FROM openjdk:8-jdk-alpine
MAINTAINER Leandro Coutinho <lbcoutinho.blm@gmail.com>

ARG WORK_DIR
ARG JAR_FILE

RUN mkdir $WORK_DIR
WORKDIR $WORK_DIR
ADD target/$JAR_FILE $WORK_DIR/app.jar
VOLUME $WORK_DIR/logs

ENV SPRING_PROFILE=""
ENV JAVA_OPTS=""

ENTRYPOINT java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active="$SPRING_PROFILE" -jar app.jar

EXPOSE 8080