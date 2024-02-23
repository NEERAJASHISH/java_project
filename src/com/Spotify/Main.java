package com.Spotify;

import java.util.Scanner;

public class Main {
	
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







 