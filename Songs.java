package com.Spotify;


public class Songs {
	
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
