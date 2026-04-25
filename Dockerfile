FROM eclipse-temurin:17-jdk-alpine
# Copia cualquier jar que encuentre en la raiz de la app
COPY target/*.jar app.jar
EXPOSE 8203
# Forzamos a que ignore errores de perfiles y use el puerto correcto
ENTRYPOINT ["java","-Dserver.port=${PORT:-8203}","-jar","/app.jar"],"-Dserver.port=${PORT:-8203}","-jar","/app.jar"]