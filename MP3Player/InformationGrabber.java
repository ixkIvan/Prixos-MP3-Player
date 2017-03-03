import java.util.ArrayList;

public class InformationGrabber implements Subject{

	
	private ArrayList<Observer> observers;
	private int duration;
	private String fileName;
	private String title;
	private String artist;
	private String album;
	private String genre;
	
	
	
	
	public InformationGrabber(){
		
		observers = new ArrayList<Observer>();
	}
	
	
	public void register(Observer newObserver) {
		
		observers.add(newObserver);
		
	}

	public void unregister(Observer deleteObserver) {
		
		int  observerIndex = observers.lastIndexOf(deleteObserver);
		
		System.out.println("Observer " + (observerIndex +1) + "has been removed!");
		
		observers.remove(observerIndex);
		
	}

	public void notifyObserver() {
		
		for(Observer observer : observers){
			observer.update(duration, fileName, title, artist, album, genre);
		}
		
		
	}
	
	//SETTERS
	
	public void setDuration(int newDuration){
		this.duration = newDuration;
		notifyObserver();
	}
	
	public void setFileName(String newFileName){
		this.fileName = newFileName;
		notifyObserver();
	}
	
	public void setTitle(String newTitle){
		this.title = newTitle;
		notifyObserver();
	}
	
	public void setArtist(String newArtist){
		this.artist = newArtist;
		notifyObserver();
	}
	
	public void setAlbum(String newAlbum){
		this.album = newAlbum;
		notifyObserver();
	}
	
	public void setGenre(String newGenre){
		this.genre = newGenre;
		notifyObserver();
	}
	
	
	
	

}
