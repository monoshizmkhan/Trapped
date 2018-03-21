 package mainmenuproject;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import java.util.concurrent.TimeUnit;
import static mainmenuproject.Action.hasEnded;


class backMap3 implements ActionListener
{
    JFrame f;
    Mansion3 m3;
    Music m1;
    backMap3(JFrame f, Mansion3 m3, Music m1)
    {
        this.f=f;
        this.m3=m3;
        this.m1=m1;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        m1.closeSong();
        System.out.println("Exiting mansion");
        m3.setVisible(false);
        Action ac = new Action(f, new Music("audios\\hobbits.wav", "stop"));
        String a = m3.score.getText();
        char c = (char)(((int)a.charAt(0)));
        a=""+(char)(c);
        ac.tl.score.setText(a);
    }
}

class goesLeft3 implements ActionListener
{
    JFrame f;
    Mansion3 m3;
    JButton b;
    Music m1;
    goesLeft3(JFrame f, Mansion3 m3, JButton b, Music m1)
    {
        this.f=f;
        this.m3=m3;
        this.b=b;
        this.m1=m1;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Going left");
        m3.setVisible(false);
        Left3 l3 = new Left3(f, false, m1);
        String a = m3.score.getText();
        char cd = (char)(((int)a.charAt(0)));
        a=""+(char)(cd);
        l3.lr3.score.setText(a);
    }
}

class goesForward3 implements ActionListener
{
    JFrame f;
    Mansion3 m3;
    JButton b;
    goesForward3(JFrame f, Mansion3 m3, JButton b)
    {
        this.f=f;
        this.m3=m3;
        this.b=b;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        m3.setVisible(false);
        ForwardRoom3 fwr3 = new ForwardRoom3(f);
        String a = m3.score.getText();
        char cd = (char)(((int)a.charAt(0)));
        a=""+(char)(cd);
        fwr3.fw3.score.setText(a);
    }
}


public final class HallsAction3 extends JPanel
{
    JFrame f;
    Mansion3 m3;
    Music m1;
    GameEnd ge;
    long here;
    public HallsAction3(JFrame f)
    {
        this.f=f;
        m3 = new Mansion3(f);
        if(hasEnded)
        {
            m3.setVisible(false);
            ge = new GameEnd(f, "mpm");
            hasEnded=false;
            return;
        }
        m1 = new Music("audios\\hobbits.wav", "run");
        m1.start();
        backMap3 back3 = new backMap3(f, m3, m1);
        goesLeft3 gl3 = new goesLeft3(f, m3, m3.leftRoom3, m1);
        goesForward3 gfw3 = new goesForward3(f, m3, m3.ahead3);
        m3.add(m3.Map3);
        m3.add(m3.leftRoom3);
        m3.add(m3.ahead3);
        m3.add(m3.score);
        m3.Map3.addActionListener(back3);
        m3.leftRoom3.addActionListener(gl3);
        m3.ahead3.addActionListener(gfw3);
        f.add(m3);
        m3.Map3.setVisible(true);
        m3.leftRoom3.setVisible(true);
        m3.ahead3.setVisible(true);
        m3.setVisible(true);
    }                   
    public HallsAction3(JFrame f, Music m1)
    {
        this.f=f;
        m3 = new Mansion3(f);
        if(hasEnded)
        {
            m3.setVisible(false);
            ge = new GameEnd(f, "mpm");
            hasEnded=false;
            return;
        }
        m1 = new Music("audios\\hobbits.wav", "stop");
        m1.start();
        backMap3 back3 = new backMap3(f, m3, m1);
        goesLeft3 gl3 = new goesLeft3(f, m3, m3.leftRoom3, m1);
        goesForward3 gfw3 = new goesForward3(f, m3, m3.ahead3);
        m3.add(m3.Map3);
        m3.add(m3.leftRoom3);
        m3.add(m3.ahead3);
        m3.add(m3.score);
        m3.Map3.addActionListener(back3);
        m3.leftRoom3.addActionListener(gl3);
        m3.ahead3.addActionListener(gfw3);
        f.add(m3);
        m3.Map3.setVisible(true);
        m3.leftRoom3.setVisible(true);
        m3.ahead3.setVisible(true);
        m3.setVisible(true);
    } 
}
