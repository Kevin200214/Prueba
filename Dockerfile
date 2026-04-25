FROM eclipse-temurin:17-jdk-alpine
COPY **/crudmongo-1.jar app.jar
# Esto le dice a Spring que use el puerto de Render o el 8203 si no hay otro
ENTRYPOINT ["java","-Dserver.port=${PORT:-8203}","-jar","/app.jar"]