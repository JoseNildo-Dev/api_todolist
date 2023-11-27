FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/desafio-todolist-0.0.1-SNAPSHOT.jar /app/spring-app.jar

EXPOSE 8080

CMD ["java", "-jar", "spring-app.jar"]
