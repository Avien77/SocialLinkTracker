import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import javax.sound.sampled.*;

public class music {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randMusic = rand.nextInt(4)+1;
        File file = new File("1.01 MAZE OF LIFE.wav");
        switch (randMusic){
            case 1:
            file = new File("1.01 MAZE OF LIFE.wav");
            break;
            case 2:
            file = new File("1.21 Period ('P4D' ver.).wav");
            break;
            case 3:
            file = new File("1.22 Tanaka's Amazing Commodities ~Urban・Breeze・Elegant・Style~.wav");
            break;
            case 4:
            file = new File("1.24 Dance Hymn of the Soul (Disco In Velvet Room).wav");
            break;
            default:
            break;
        }
        System.out.println("Would you like music?");
        
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        String response = "";
        response = scanner.next();
        response = response.toUpperCase();
        if (response.equals("Y")){
            clip.start();
        }
        response = scanner.next();
        clip.stop();
        clip.close();
        scanner.close();
        
    }
}