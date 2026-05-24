FROM eclipse-temurin:17-jdk-jammy AS build
WORKDIR /app
COPY . .
RUN ./gradlew bootJar --no-daemon || gradle bootJar --no-daemon

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar

# Render ke liye port explicit set kar rahe hain
ENV PORT=8080
EXPOSE 8080

ENTRYPOINT ["java", "-Dserver.port=${PORT}", "-jar", "app.jar"]
