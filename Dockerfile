FROM openjdk:17
COPY "./target/crudmongo-1.jar" "app.jar"
EXPOSE "8203"
ENTRYPOINT [ "java", "-jar", "app.jar"]