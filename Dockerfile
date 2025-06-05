# Базовый образ с Java 24
FROM eclipse-temurin:24-jdk-alpine

# создаем рабочую директорию
WORKDIR /app

# копируем собранный JAR-файл
COPY build/libs/springBootRest-0.0.1-SNAPSHOT.jar app.jar

# открываем порт, на котором работает приложение
EXPOSE 8080

# команда запуска приложения
ENTRYPOINT ["java", "-jar", "app.jar"]
