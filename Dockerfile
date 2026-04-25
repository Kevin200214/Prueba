FROM eclipse-temurin:17-jdk-alpine
COPY target/*.jar app.jar
# Usamos CMD que es más flexible para Render
CMD ["java", "-jar", "app.jar", "--server.port=${PORT:-8203}"]