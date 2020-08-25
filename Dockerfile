FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
WORKDIR usr/src
ARG JAR_FILE=build/libs/*.jar
ADD ${JAR_FILE} /usr/src/app-user.jar
ENTRYPOINT ["java", "-jar", "app.jar"]