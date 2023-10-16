FROM openjdk:11 AS build

WORKDIR /app

COPY . /app



FROM gcr.io/distroless/java11-debian11

COPY --from=build /app /app

CMD ["java", "Calculator"]
