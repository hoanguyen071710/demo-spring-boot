FROM maven:3.9.6-eclipse-temurin-21-alpine

COPY . /root/app

RUN apk update && apk add postgresql

CMD tail -f /dev/null