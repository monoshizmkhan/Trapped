package mainmenuproject;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import sun.audio.*;

public class Music extends Thread
{
    String audioFile, operation="run";
    AudioStream theStream;
    Music(String audioFile)
    {
        this.audioFile=audioFile;
    }
    Music(String audioFile, String operation)
    {
        this.audioFile=audioFile;
        this.operation=operation;
    }
    @Override
    public void run()
    {
        if(operation.equals("run"))
        {
            openSong();
            playSong();
        }
        else if(operation.equals("stop"))closeSong();
    }
    void openSong()
    {
        try
        {
            theStream = new AudioStream(new FileInputStream(audioFile));
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    void playSong()
    {
        AudioPlayer.player.start(theStream);
        System.out.println("Music is playing");
    }
    void closeSong()
    {
        AudioPlayer.player.stop(theStream);
        
        System.out.println("Please stop");
        this.interrupt();
    }
}
