FROM eclipse-temurin:17-jdk-alpine
COPY target/*.jar app.jar
EXPOSE 8203
ENTRYPOINT java -Dserver.port=${PORT:-8203} -jar /app.jar