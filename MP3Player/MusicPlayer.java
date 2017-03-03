/**
 * Usually, this class would extend an interface (Electronic Device)
 * but we are only dealing with an MP3Player
 *
 * This class defines the actions of the different buttons
 * these methods will then be called to execute in the respective command classes
 * @author Isabella Sturm
 */
public class MusicPlayer{
   // attrubutes
   private PlayList pl = null; // if this doesn't work, try making PlayList methods static
   
   /*
    * Method to play song
    */
   public void play(){
      // add play fuctionality
      System.out.println("Play");
   }
    
   /*
    * Method to pause song
    */
   public void pause(){
      //pl.pause() ;
      System.out.println("Pause");
   }
    
    /*
     * Method to replay song
     */
    public void replay(){
      //pl.play(pl.getSourceIndex()) ;
      System.out.println("Replay");
    }
    
    /*
     * Method to play next song
     */
    public void next(){
      // int nextIndex = pl.getSourceIndex() + 1 ;
//        /*
//         * Don't move beyond the last play list element.
//         */
//        if( nextIndex < pl.size() ) {
//            pl.play(nextIndex) ;
//        }
       System.out.println("Next");
    }
     
    /*
     * Method to play previous song
     */
    public void prev(){
       // int prevIndex = pl.getSourceIndex() - 1 ;
//        /*
//         * Don't move before the first play list element.
//         */
//        if( prevIndex >= 0 ) {
//            pl.play(prevIndex) ;
//        }
       System.out.println("Previous");
    }
     
    /*
     * There was mention in class about needing options to play songs:
     * Normal - normal ordering
     * Repeat - loop track
     * Shuffle - randoming ordering of songs
     * May need to add a normal/repeat method
     * and a shuffle method
     */
}