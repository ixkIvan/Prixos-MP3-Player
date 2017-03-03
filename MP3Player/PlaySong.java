/**
 * Class that implements Command to play song on MP3Player
 * @autor Isabella Sturm
 */
public class PlaySong implements Command{
   // attributes
   private MusicPlayer mp3;
   
   /**
    * Constructor
    * @param MusicPlayer (usually takes in the general device)
    */
   public PlaySong(MusicPlayer mp3){
    this.mp3 = mp3;
   }
   
   /*
    * Method to execute play method
    */
   public void execute(){
      mp3.play();
   }
}