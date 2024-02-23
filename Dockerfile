FROM openjdk:11

# Set the working directory in the container
WORKDIR /app

# Copy all source files into the container
COPY . .

# Compile all Java source files
RUN javac com/Spotify/Songs.java com/Spotify/Playlist.java com/Spotify/Main.java

# Command to run the Java application
CMD ["java", "-classpath", "/app", "com.Spotify.Main"]
