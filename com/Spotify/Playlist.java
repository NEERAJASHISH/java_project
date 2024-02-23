package com.Spotify;
import java.util.*;

public class Playlist {
	
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
