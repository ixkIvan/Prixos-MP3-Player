/**
 * Class that implements Command to play next song on MP3Player
 * @autor Isabella Sturm
 */
public class NextSong implements Command{
   // attributes
   private MusicPlayer mp3;
   
   /**
    * Constructor
    * @param MusicPlayer (usually takes in the general device)
    */
   public NextSong(MusicPlayer mp3){
    this.mp3 = mp3;
   }
   
   /*
    * Method to execute next method
    */
   public void execute(){
      mp3.next();
   }
}