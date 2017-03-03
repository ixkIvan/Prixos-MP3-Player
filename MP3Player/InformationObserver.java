
public class InformationObserver implements Observer{

	private int duration;
	private String fileName;
	private String title;
	private String artist;
	private String album;
	private String genre;
	
	private static int observerIDTracker = 0;
	
	private int observerID;
	
	private Subject informationGrabber;
	
	public InformationObserver(Subject informationGrabber){
		this.informationGrabber = informationGrabber;
		this.observerID = ++observerIDTracker;
		
		System.out.println("New Observer " + this.observerID);
		informationGrabber.register(this);
	}
	
	@Override
	public void update(int duration, String fileName, String title, String artist, String album, String genre) {
		
		this.duration = duration;
		this.fileName = fileName;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.genre = genre;
		
		printThePrices();
	}
	
	
	public void printThePrices(){
		System.out.println(observerID + "\nDuration: " + duration + 
				"\nFilename: " + fileName +
				"\nTitle: " + title +
				"\nArtist: " + artist + 
				"\nAlbum: " + album +
				"\nGenre: " + genre);
	}

}
