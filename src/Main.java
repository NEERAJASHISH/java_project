import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean condition1 = true;
        System.out.println("Welcome to the songify ");
        System.out.println("Enter the playlist name that you want to create ");
        String playListName = scanner.nextLine();
        Playlist playlist = new Playlist(playListName);

        while (condition1) {
            System.out.println("Please select one of the below choices\n" +
                    "1. To add a song to the playlist\n" +
                    "2. To remove a song from the playlist\n" +
                    "3. To print the songs in the playlist\n" +
                    "4. To quit");

            int choice1 = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice1) {
                case 1:
                    boolean condition2 = true;
                    while (condition2) {
                        System.out.println("Select the song that you want to add to the " + playListName + "\n" +
                                "1. Song 1 , artist1\n" +
                                "2. Song 2 , artist2\n" +
                                "3. Song 3 , artist3\n" +
                                "4. To quit from adding songs");

                        int choice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character

                        switch (choice) {
                            case 1:
                                playlist.addSong("Song1", "artist1");
                                break;
                            case 2:
                                playlist.addSong("Song2", "artist2");
                                break;
                            case 3:
                                playlist.addSong("Song3", "artist3");
                                break;
                            case 4:
                                condition2 = false;
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                    break;
                case 2:
                    playlist.printSongs();
                    System.out.println("Please enter the song name that you want to remove from the playlist:");
                    String songNameToRemove = scanner.nextLine();
                    System.out.println("Please enter the artist name for the song:");
                    String artistNameToRemove = scanner.nextLine();
                    playlist.removeSong(songNameToRemove, artistNameToRemove);
                    break;
                case 3:
                    playlist.printSongs();
                    break;
                case 4:
                    condition1 = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
//playlist class
class Playlist {
    private ArrayList<Songs> songs = new ArrayList<>();
    private String playlistName;

    public Playlist(String name) {
        this.playlistName = name;
    }

    public void addSong(String songName, String artistName) {
        Songs song = new Songs(songName, artistName);
        songs.add(song);
    }

    public void removeSong(String songName, String artistName) {
        Iterator<Songs> iterator = songs.iterator();
        while (iterator.hasNext()) {
            Songs song = iterator.next();
            if (song.getSongName().equals(songName) && song.getArtist().equals(artistName)) {
                iterator.remove();
                System.out.println("The song " + songName + " by " + artistName + " has been removed from the playlist.");
            }
        }
    }

    public void printSongs() {
        if (songs.isEmpty()) {
            System.out.println("The playlist is empty.");
        } else {
            System.out.println("Songs in the playlist:");
            for (Songs song : songs) {
                System.out.println(song.getSongName() + " by " + song.getArtist());
            }
        }
    }
}
//song class
class Songs {
    private String songName;
    private double duration = 5.00;
    private String artist;

    public Songs(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    public String getSongName() {
        return songName;
    }

    public double getDuration() {
        return duration;
    }

    public String getArtist() {
        return artist;
    }
}
