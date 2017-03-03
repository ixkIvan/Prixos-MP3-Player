/**
 * Class that implements Command to replay song on MP3Player
 * @autor Isabella Sturm
 */
public class ReplaySong implements Command{
   // attributes
   private MusicPlayer mp3;
   
   /**
    * Constructor
    * @param MusicPlayer (usually takes in the general device)
    */
   public ReplaySong(MusicPlayer mp3){
    this.mp3 = mp3;
   }
   
   /*
    * Method to execute replay method
    */
   public void execute(){
      mp3.replay();
   }
}