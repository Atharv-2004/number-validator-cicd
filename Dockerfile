# Use Java 17 as base image
FROM openjdk:17-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy the built jar file into container
COPY target/number-validator-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 (where our API runs)
EXPOSE 8080

# Command to run when container starts
CMD ["java", "-jar", "app.jar"]