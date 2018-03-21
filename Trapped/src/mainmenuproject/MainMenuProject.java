package mainmenuproject;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import java.util.concurrent.TimeUnit;

class background extends JPanel
{
    JFrame f;
    JButton whole;
    ImageIcon bckimg = new ImageIcon("images\\island 7.png");
    background(JFrame f)
    {
        this.f=f;
        whole = new JButton();
        whole.setIcon(bckimg);
        whole.setContentAreaFilled(false);
        whole.setBorderPainted(false);
        whole.setOpaque(false);
    }
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        whole.setBounds(0, 0, 1280, 720);
        whole.setVisible(true);
    }
    
}

public class MainMenuProject
{            
    static void startGame(JFrame f)
    {
        NewJPanel opening = new NewJPanel(f);       
        f.add(opening);
        f.setSize(1280, 720);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        JFrame f=new JFrame("Trapped");
        background bg = new background(f);
        bg.add(bg.whole);
        f.setSize(1280, 720);
        f.add(bg);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Music starting = new Music("audios\\batsy.wav", "run");
        starting.start();
        try
        {
            TimeUnit.MILLISECONDS.sleep(6500);
            bg.bckimg = new ImageIcon("images\\island 6.png");
            bg.whole.setIcon(bg.bckimg);
            TimeUnit.MILLISECONDS.sleep(80);
            bg.bckimg = new ImageIcon("images\\island 7.png");
            bg.whole.setIcon(bg.bckimg);
            TimeUnit.MILLISECONDS.sleep(80);
            bg.bckimg = new ImageIcon("images\\island 6.png");
            bg.whole.setIcon(bg.bckimg);
            TimeUnit.MILLISECONDS.sleep(80);
            bg.bckimg = new ImageIcon("images\\island 7.png");
            bg.whole.setIcon(bg.bckimg);
            TimeUnit.MILLISECONDS.sleep(80);
            bg.bckimg = new ImageIcon("images\\island 6.png");
            bg.whole.setIcon(bg.bckimg);
            TimeUnit.MILLISECONDS.sleep(80);
            bg.bckimg = new ImageIcon("images\\island 8.png");
            bg.whole.setIcon(bg.bckimg);
            TimeUnit.SECONDS.sleep(1);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        f.remove(bg);
        startGame(f);
    }   
}
