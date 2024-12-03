package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	//attributes
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	//construtor
	public CompactDisc(int id, String title, String category, float cost, 
						String director, int length, String artist ) {
		super(id, title, category, cost, director, length);
		this.artist = artist;
	}
	
	//getter and setter for artist
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	//Add tracks method
	public void addTrack(Track track) {
		int check = tracks.indexOf(track); //check if track is already in tracks
		if (check >= 0) {
			tracks.add(track);
			System.out.println("BaoPhuc-Add new track successfully!");
		} else {
			System.out.println("BaoPhuc-This track is already in list!");
		}
	}
	
	//Remove tracks method
	public void removeTrack(Track track) {
		int check = tracks.indexOf(track); //check if track is already in tracks
		if (check >= 0) {
			tracks.remove(track);
			System.out.println("BaoPhuc-Remove track successfully!");
		} else {
			System.out.println("BaoPhuc-This track is not in list!");
		}
	}
	
	//Get length method
	@Override
	public int getLength() {
		int length = 0;
		for (Track track : tracks) {
			length += track.getLength();
		}
		setLength(length);
		return length;
	}

	//method to print CD and its tracks
	public void print() {
		System.out.println("BaoPhuc-Playing CD: " + this.getTitle());
		System.out.println("BaoPhuc-CD artist: " + getArtist());
		System.out.println("BaoPhuc-CD length: " + this.getLength());
		for( Track track : tracks) {
			track.play();
		}
	}	
}
