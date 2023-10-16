FROM openjdk:11 AS build

WORKDIR /app

COPY . /app

RUN javac Calculator.java


FROM gcr.io/distroless/java11-debian11

COPY --from=build /app /app

CMD ["java", "Calculator"]
