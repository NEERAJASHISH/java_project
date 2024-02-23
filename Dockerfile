FROM openjdk:11

# Set the working directory in the container
WORKDIR /app

# Copy all source files into the container
COPY Main.java .
COPY Playlist.java .
COPY Songs.java .

# Compile all Java source files
RUN javac Songs.java Playlist.java Main.java

# Remove the Java source files
RUN rm *.java

# Command to run the Java application
CMD ["java", "Main"]
