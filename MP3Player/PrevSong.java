/**
 * Class that implements Command to play prevoius song on MP3Player
 * @author Isabella Sturm
 */
public class PrevSong implements Command{
   // attributes
   private MusicPlayer mp3;
   
   /**
    * Constructor
    * @param MusicPlayer (usually takes in the general device)
    */
   public PrevSong(MusicPlayer mp3){
    this.mp3 = mp3;
   }
   
   /*
    * Method to execute prev method
    */
   public void execute(){
      mp3.prev();
   }
}