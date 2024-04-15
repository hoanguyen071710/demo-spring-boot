FROM maven:3.9.6-eclipse-temurin-21-alpine

WORKDIR /app

COPY . .

CMD ["mvn", "spring-boot:run"]