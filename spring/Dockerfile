# Dockerfile
FROM amazoncorretto:17-alpine

COPY ./spring/build/libs/*.jar server.jar

ENTRYPOINT ["java", "-jar", "server.jar"]