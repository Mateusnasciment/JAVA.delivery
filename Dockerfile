# Define a base image with Java 17
FROM openjdk:17-jdk-alpine

# Define o diretório de trabalho dentro do contêiner
WORKDIR /api

# Copia o arquivo JAR para o diretório /app no contêiner
COPY target/api-0.0.1-SNAPSHOT.jar app-1.0.0.jar

# Define o comando de entrada para executar o JAR
ENTRYPOINT ["java", "-jar", "app-1.0.0.jar"]
