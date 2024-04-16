FROM maven:3.9.6-eclipse-temurin-21-alpine

COPY . /root/app

CMD tail -f /dev/null