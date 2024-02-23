import java.util.*;

class Main {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean condition1 = true;
		System.out.println("Welcome to the songify ");
		System.out.println("Enter the playlist name that you want to create ");
	    String play_list_name = scanner.nextLine();
	    Playlist playlist = new Playlist(play_list_name);
		
		while(condition1) {	
		System.out.println( "Please select one of the below choices\n" +
                "1. To add the songs to the playlist\n"+ 
                "2. To remove the songs from the playlist\n" + 
                "3. To print the songs from the playlist\n" + 
		        "4. To quit from the inteface");
		
		int choice1 = scanner.nextInt();
		switch(choice1) {
		
		case 1 : 
			
		    boolean condition2 = true;
		    while(condition2) {
		    
            System.out.println( "select the songs that you want to add to the " + play_list_name + "\n" +
		                    "1.Song 1 , artist1\n"+ 
                            "2.Song 2 , artist2\n" + 
		                    "3.Song 3 , artist3\n" +
                            "4. to quit from adding songs");
       
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
		    case 1:
		    	playlist.add_songs("Song1","artist1");
		    	break;
		    case 2 :
		    	playlist.add_songs("Song2","artist2");
		    	break;
		    case 3 :
		    	playlist.add_songs("Song3","artist3");
		    	break;
		    case 4 : 
		    	condition2 = false;
		    	break;
		} 		    
		    }
		    break;
		    
	 case 2 :	
		 playlist.getSongs();
		 System.out.println("please select the song that you want to remove from the playlist");
		 
		 String name1 = scanner.next();
		//scanner.nextLine();
		 String name2 = scanner.next();
		 playlist.remove_song(name1, name2);		 
         break;
       
	 case 3 : 
		 playlist.getSongs();
		 break;
     
	 case 4 : 
		 condition1= false;
		 break;
		 
		}	 
		
}
		
}
	
}
//playlist class
class Playlist {
	
	private ArrayList<Songs> songs = new ArrayList<Songs>();
	private String playlist_name;
	
	public Playlist(String name) {
		this.playlist_name = name;	
	}
	
	public void add_songs(String song_name,String artist_name) {
		Songs s = new Songs(song_name,artist_name);
		songs.add(s);
	}
	
	public void remove_song(String song_name,String artist_name) {
		Iterator<Songs> iterator = songs.iterator();
		while (iterator.hasNext()) {
		    Songs s = iterator.next();
		    if (s.getSong_name().equals(song_name) && s.getArtist().equals(artist_name)) {
		        iterator.remove();
		        System.out.println("The song " + song_name + " has been removed with artist_name " + artist_name );
		    }
		}	
	}
	
	
	public void getSongs()
	{
		for(int i=0;i<songs.size();i++) { 
			Songs s = songs.get(i);
			System.out.println(s.getSong_name() + " song is sung by " + s.getArtist());
		}
	}
	

}


//song class


class Songs {
	
	private String  song_name ;
	private double  duration = 5.00;
	private String  artist;
	
	
	public Songs(String song_name, String artist) {
		this.song_name = song_name;
		this.artist = artist;
	}
	
	
	public String getSong_name() {
		return song_name;
	}
	public void setSong_name(String song_name) {
		this.song_name = song_name;
	}

	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	} 
}
