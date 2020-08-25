FROM openjdk:8-jdk-alpine
#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring
WORKDIR usr/src
ARG JAR_FILE=build/libs/*.jar
#COPY ${JAR_FILE} app
#ADD build/libs/user-0.0.1.jar /usr/src/app-user.jar
ADD ${JAR_FILE} /usr/src/app-user.jar
ENTRYPOINT ["java", "-jar", "app.jar"]