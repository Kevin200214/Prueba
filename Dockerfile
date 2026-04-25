FROM eclipse-temurin:17-jdk-alpine
COPY target/Crudmongo-1.jar app.jar
EXPOSE 8203
ENTRYPOINT ["java","-jar","/app.jar"]