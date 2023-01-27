package play_mp3_file;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PlayMP3 {

    public static void main(String[] args) throws IOException {

        String filePath=System.getProperty("user.dir")+"/src/audio1275012601.m4a";
        playMP3(filePath);
    }

    private static void playMP3(String filePath) throws IOException {
        Desktop.getDesktop().open(new File(filePath));
//        try {
//            File mp3File = new File("C:\\Users\\G525585\\Videos\\Voice-Player\\src\\mp3audio.mp3");
//            AudioInputStream audioIn = AudioSystem.getAudioInputStream(mp3File);
//            Clip clip = AudioSystem.getClip();
//            clip.open(audioIn);
//            clip.start();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
