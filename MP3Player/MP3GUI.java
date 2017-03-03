import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;
import java.util.*;

public class MP3GUI extends JFrame implements ActionListener
{
   // attributes
   private JMenuItem jmiHelp;
   private JButton jbPlay, jbPause, jbReplay, jbNext, jbPrev;
   private JTextField jtfSong;
   private MusicPlayer mp3 = new MusicPlayer();
   
   // main class
   public static void main(String [] args)
   {
     /*
      * We need at least one file to play.
      */
     new MP3GUI();
     if( args.length > 0 ) {
         System.out.println("Usage: MP3Player mp3file ...") ;
         return ;
     }
      
     /* 
      * Convert args[] into Iterator
      */
      Iterator<String> iteratorArgs = Arrays.asList(args).iterator();
      
     /*
      * Make the play list.
      */
      PlayList pl = new PlayList(iteratorArgs) ;
      
      new MP3GUI();
      
   }
   
   // constructor
   public MP3GUI()
   {
      // JFrame
      setTitle("MP3 Player");
      setSize(450, 150);
      
         // Menubar
         JMenuBar jmbMenu = new JMenuBar();
            // Help
            JMenu jmHelp = new JMenu("Help");
               jmiHelp = new JMenuItem("Help");
            jmHelp.add(jmiHelp);
         jmbMenu.add(jmHelp);
      setJMenuBar(jmbMenu); 
      
         // JPanel Song Controls
         JPanel jpControls = new JPanel();
            // Buttons
            jbPlay = new JButton("Play");
            jbPlay.addActionListener(this);
         jpControls.add(jbPlay);
            jbPause = new JButton("Pause");
            jbPause.addActionListener(this);
         jpControls.add(jbPause);
            jbReplay = new JButton("Replay");
            jbReplay.addActionListener(this);
         jpControls.add(jbReplay);
      add(jpControls, BorderLayout.CENTER);
      
         //JPanel Song Info/Control
         JPanel jpSong = new JPanel();
            // prev - song - next
            jbPrev = new JButton("<");
            jbPrev.addActionListener(this);
         jpSong.add(jbPrev);
            jtfSong = new JTextField(20);
            jtfSong.setEditable(false);
         jpSong.add(jtfSong);
            jbNext = new JButton(">");
            jbNext.addActionListener(this);
         jpSong.add(jbNext);
      add(jpSong, BorderLayout.NORTH);
         
      
      // JFrame - display
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   
   public void actionPerformed(ActionEvent ae){
      Object choice = ae.getSource();
      
      if(choice == jbPlay){
         PlaySong play = new PlaySong(mp3);
		   DeviceButton button = new DeviceButton(play);
		   button.press();
      }
      else if(choice == jbPause){
         PauseSong pause = new PauseSong(mp3);
		   DeviceButton button = new DeviceButton(pause);
		   button.press();
      }
      else if(choice == jbReplay){
         ReplaySong replay = new ReplaySong(mp3);
		   DeviceButton button = new DeviceButton(replay);
		   button.press();
      }
      else if(choice == jbNext){
         NextSong next = new NextSong(mp3);
		   DeviceButton button = new DeviceButton(next);
		   button.press();
      }
      else if(choice ==jbPrev){
         PrevSong prev = new PrevSong(mp3);
		   DeviceButton button = new DeviceButton(prev);
		   button.press();
      }
   }
}
