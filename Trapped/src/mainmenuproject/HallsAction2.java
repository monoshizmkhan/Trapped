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


class backMap2 implements ActionListener
{
    JFrame f;
    JPanel p;
    Mansion2 m2;
    Music m1;
    backMap2(JFrame f, Mansion2 m2, Music m1)
    {
        this.f=f;
        this.m2=m2;
        this.m1=m1;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        m1.closeSong();
        m1 = new Music("audios\\hobbits.wav", "stop");
        System.out.println("Exiting mansion");
        m2.setVisible(false);
        Action ac = new Action(f, new Music("audios\\hobbits.wav", "stop"));
        String a = m2.score.getText();
        char c = (char)(((int)a.charAt(0)));
        a=""+(char)(c);
        ac.tl.score.setText(a);
    }
}

class goesLeft2 implements ActionListener
{
    JFrame f;
    Mansion2 m2;
    JButton b;
    goesLeft2(JFrame f, Mansion2 m2, JButton b)
    {
        this.f=f;
        this.m2=m2;
        this.b=b;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Going left");
        m2.setVisible(false);
        Left2 l2 = new Left2(f, false);
        String a = m2.score.getText();
        char cd = (char)(((int)a.charAt(0)));
        a=""+(char)(cd);
        l2.lr2.score.setText(a);
    }
}

class goesForward2 implements ActionListener
{
    JFrame f;
    Mansion2 m2;
    JButton b;
    goesForward2(JFrame f, Mansion2 m2, JButton b)
    {
        this.f=f;
        this.m2=m2;
        this.b=b;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        m2.setVisible(false);
        ForwardRoom2 fwr2 = new ForwardRoom2(f);
        String a = m2.score.getText();
        char cd = (char)(((int)a.charAt(0)));
        a=""+(char)(cd);
        fwr2.fw2.score.setText(a);
    }
}


public final class HallsAction2 extends JPanel
{
    JFrame f;
    Mansion2 m2;
    Music m1;
    GameEnd ge;
    public HallsAction2(JFrame f)
    {
        this.f=f;
        m2 = new Mansion2(f);
        if(hasEnded)
        {
            m2.setVisible(false);
            ge = new GameEnd(f, "mpm");
            hasEnded=false;
            return;
        }
        m1 = new Music("audios\\hobbits.wav", "run");
        m1.start();
        backMap2 back2 = new backMap2(f, m2, m1);
        goesLeft2 gl2 = new goesLeft2(f, m2, m2.leftRoom2);
        goesForward2 gfw2 = new goesForward2(f, m2, m2.ahead2);
        m2.add(m2.Map2);
        m2.add(m2.leftRoom2);
        m2.add(m2.ahead2);
        m2.add(m2.score);
        m2.Map2.addActionListener(back2);
        m2.leftRoom2.addActionListener(gl2);
        m2.ahead2.addActionListener(gfw2);
        f.add(m2);
        m2.Map2.setVisible(true);
        m2.leftRoom2.setVisible(true);
        m2.ahead2.setVisible(true);
        m2.setVisible(true);
    }    
    public HallsAction2(JFrame f, Music m1)
    {
        this.f=f;
        m2 = new Mansion2(f);
        if(hasEnded)
        {
            m2.setVisible(false);
            ge = new GameEnd(f, "mpm");
            hasEnded=false;
            return;
        }
        m1 = new Music("audios\\hobbits.wav", "stop");
        m1.start();
        backMap2 back2 = new backMap2(f, m2, new Music("audios\\hobbits.wav", "stop"));
        goesLeft2 gl2 = new goesLeft2(f, m2, m2.leftRoom2);
        goesForward2 gfw2 = new goesForward2(f, m2, m2.ahead2);
        m2.add(m2.Map2);
        m2.add(m2.leftRoom2);
        m2.add(m2.ahead2);
        m2.add(m2.score);
        m2.Map2.addActionListener(back2);
        m2.leftRoom2.addActionListener(gl2);
        m2.ahead2.addActionListener(gfw2);
        f.add(m2);
        m2.Map2.setVisible(true);
        m2.leftRoom2.setVisible(true);
        m2.ahead2.setVisible(true);
        m2.setVisible(true);
    }    
}
