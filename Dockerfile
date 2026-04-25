FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/crudmongo-1.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8203
ENTRYPOINT ["java","-jar","/app.jar"]OINT [ "java", "-jar", "app.jar"]