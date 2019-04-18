# Docker Spring Boot Demo

Spring Boot application containerized with Docker. The application has only a Customer entity that is initialized with 5 customers.
The CustomerController provides the routes to retrieves all customers (`GET /customer`) and get a customer by id (`GET /customer/{id}`).

Run command:
```
mvnw spring-boot:run
```

Docker commands:
```
Build: docker build --build-arg WORK_DIR=/app --build-arg JAR_FILE=docker-spring-boot-demo.jar -t lbcoutinho/docker-spring-boot-demo . 
Run: docker run -d -p 8080:8080 --name docker-demo -v /var/docker-demo/logs:/app/logs -e SPRING_PROFILE=dev lbcoutinho/docker-spring-boot-demo
```

## What I Learned
* Spring Boot logging configuration
  * Config using application.yaml
  * Config using logback-spring.xml: log file, file rolling, archiving, log pattern
* Docker
  * Dockerfile setup
  * Basic commands
  * Usage of ARG, ENV and VOLUME
  * Container running and basic debug
  * dockerfile-maven-plugin configuration