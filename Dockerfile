FROM openjdk:11

# Set the working directory in the container
WORKDIR /app

# Copy all source files into the container
COPY . .

# Compile all Java source files
RUN javac Songs.java Playlist.java Main.java

# Command to run the Java application with the correct classpath
CMD ["java", "-classpath", "/app", "com.Spotify.Main"]
