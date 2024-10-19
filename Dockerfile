# Use the official OpenJDK image as the base image
FROM openjdk:23-bookworm

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file into the container
COPY target/weightlifter-api-0.1.0-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot application runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
