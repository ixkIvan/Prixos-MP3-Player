/**
 * Class that implements Command to pause song on MP3Player
 * @autor Isabella Sturm
 */
public class PauseSong implements Command{
   // attributes
   private MusicPlayer mp3;
   
   /**
    * Constructor
    * @param MusicPlayer (usually takes in the general device)
    */
   public PauseSong(MusicPlayer mp3){
    this.mp3 = mp3;
   }
   
   /*
    * Method to execute pause method
    */
   public void execute(){
      mp3.pause();
   }
}