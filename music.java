import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import javax.sound.sampled.*;

public class music {
    public music (String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randMusic = rand.nextInt(4)+1;
        File file = new File("MazeOfLife.wav");
        switch (randMusic){
            case 1:
            file = new File("MazeOfLife.wav");
            break;
            case 2:
            file = new File("Period.wav");
            break;
            case 3:
            file = new File("Tanaka.wav");
            break;
            case 4:
            file = new File("Hymn.wav");
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
        System.out.println("");
        response = scanner.next();
        clip.stop();
        clip.close();
        scanner.close();
        
    }
}
