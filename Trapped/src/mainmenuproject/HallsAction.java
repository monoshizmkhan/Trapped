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


class backMap implements ActionListener
{
    JFrame f;
    Mansion m;
    Music m1;
    backMap(JFrame f, Mansion m, Music m1)
    {
        this.f=f;
        this.m=m;
        this.m1=m1;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        m1.closeSong();
        System.out.println("Exiting mansion");
        m.setVisible(false);
        Action ac = new Action(f, m1);
        String a = m.score.getText();
        char c = (char)(((int)a.charAt(0)));
        a=""+(char)(c);
        ac.tl.score.setText(a);
    }
}

class goesLeft implements ActionListener
{
    JFrame f;
    Mansion m;
    JButton b;
    goesLeft(JFrame f, Mansion m, JButton b)
    {
        this.f=f;
        this.m=m;
        this.b=b;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Going left");
        m.setVisible(false);
        Left l = new Left(f, false);
        String a = m.score.getText();
        char cd = (char)(((int)a.charAt(0)));
        a=""+(char)(cd);
        l.lr.score.setText(a);
    }
}

class goesForward implements ActionListener
{
    JFrame f;
    Mansion m;
    JButton b;
    goesForward(JFrame f, Mansion m, JButton b)
    {
        this.f=f;
        this.m=m;
        this.b=b;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        m.setVisible(false);
        ForwardRoom fwr = new ForwardRoom(f);
        String a = m.score.getText();
        char cd = (char)(((int)a.charAt(0)));
        a=""+(char)(cd);
        fwr.fw.score.setText(a);
    }
}


public final class HallsAction extends JPanel
{
    JFrame f;
    Mansion m;
    public Music m1;
    GameEnd ge;
    
    public HallsAction(JFrame f)
    {
        this.f=f;
        System.out.println("asdfasfa");
        m = new Mansion(f);
        if(hasEnded)
        {
            m.setVisible(false);
            ge = new GameEnd(f, "mpm");
            hasEnded=false;
            return;
        }
        m1 = new Music("audios\\hobbits.wav", "run");
        m1.start();
        backMap back = new backMap(f, m, m1);
        goesLeft gl = new goesLeft(f, m, m.leftRoom);
        goesForward gfw = new goesForward(f, m, m.ahead);
        m.add(m.Map);
        m.add(m.leftRoom);
        m.add(m.ahead);
        m.add(m.score);
        m.Map.addActionListener(back);
        m.leftRoom.addActionListener(gl);
        m.ahead.addActionListener(gfw);
        f.add(m);
        m.Map.setVisible(true);
        m.leftRoom.setVisible(true);
        m.ahead.setVisible(true);
        m.setVisible(true);
    }                   
    public HallsAction(JFrame f, Music m1)
    {
        this.f=f;
        System.out.println("asdfasfa");
        m = new Mansion(f);
        if(hasEnded)
        {
            m.setVisible(false);
            ge = new GameEnd(f, "mpm");
            hasEnded=false;
            return;
        }
        m1 = new Music("audios\\hobbits.wav", "stop");
        m1.start();
        backMap back = new backMap(f, m, m1);
        goesLeft gl = new goesLeft(f, m, m.leftRoom);
        goesForward gfw = new goesForward(f, m, m.ahead);
        m.add(m.Map);
        m.add(m.leftRoom);
        m.add(m.ahead);
        m.add(m.score);
        m.Map.addActionListener(back);
        m.leftRoom.addActionListener(gl);
        m.ahead.addActionListener(gfw);
        f.add(m);
        m.Map.setVisible(true);
        m.leftRoom.setVisible(true);
        m.ahead.setVisible(true);
        m.setVisible(true);
    }         
}
