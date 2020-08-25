FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
WORKDIR usr/src
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
COPY run.sh .
ENTRYPOINT ["./run.sh"]