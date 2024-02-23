FROM openjdk:11

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY Main.java .
COPY Playlist.java .
COPY Songs.java .



# Command to run the Java application
RUN javac Main.java
RUN javac Playlist.java
RUN javac Songs.java


CMD ["java","Main"]

EXPOSE 8089
