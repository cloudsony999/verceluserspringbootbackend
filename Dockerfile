# Fetching latest version of Java
FROM openjdk:18
 
# Setting up work directory
WORKDIR /app

# Copy the jar file into our app
COPY vercelexplore-0.0.1-SNAPSHOT.jar /app

# Exposing port 9999
EXPOSE 9999

# Starting the application
CMD ["java", "-jar", "vercelexplore-0.0.1-SNAPSHOT.jar"]