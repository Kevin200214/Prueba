FROM eclipse-temurin:17-jdk-alpine
COPY ./target/crudmongo-1.jar app.jar
EXPOSE 8203
ENTRYPOINT ["java","-jar","/app.jar"],"-jar","/app.jar"]OINT [ "java", "-jar", "app.jar"]