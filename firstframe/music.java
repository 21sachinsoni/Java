package firstframe;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.*;



public class music {
	//public static void main(String args []){
	//	music();
	
	//}
	
	
   public static void music() {
	   try{
	   AudioPlayer audioplayer=AudioPlayer.player;
	   AudioStream backgroundmusic=new AudioStream(new FileInputStream("music.wav"));
	   AudioData audiodata=backgroundmusic.getData();
	   ContinuousAudioDataStream loop= null;
	   loop=new  ContinuousAudioDataStream(audiodata);
   
   audioplayer.start(loop);
 }
	   catch(IOException ab){}
   }
}
