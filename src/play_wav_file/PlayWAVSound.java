package play_wav_file;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
public class PlayWAVSound {
//
//    public static void main(String[] args) throws Throwable {
//        String filePath=System.getProperty("user.dir")+"/src/music.wav";
//        playMusic(filePath);
//        JOptionPane.showMessageDialog(null,"Press OK to stop Playing");
//    }
//
//    private static void playMusic(String filePathLocation) throws Throwable {
//        try{
//            File musicPath=new File(filePathLocation);
//
//            if(musicPath.exists())
//            {
//                AudioInputStream audioInput=AudioSystem.getAudioInputStream(musicPath);
//                Clip clip=AudioSystem.getClip();
//                clip.open(audioInput);
//                clip.start();
//            }
//            else{
//                System.out.println("Can't find file");
//            }
//        }catch (Exception e){
//            throw e.fillInStackTrace();
//        }
//    }
}
