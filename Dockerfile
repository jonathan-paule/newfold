FROM openjdk:11 AS build

WORKDIR /app

COPY . /app


CMD ["java", "Calculator"]
