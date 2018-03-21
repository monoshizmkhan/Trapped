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


//D - P - R - E

class endedMap implements ActionListener
{
    JFrame f;
    TempLevel tl;
    boolean hasEnded=false;
    endedMap(JFrame f, TempLevel tl, boolean hasEnded)
    {
        this.f=f;
        this.tl=tl;
        this.hasEnded=hasEnded;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Music ee = new Music("audios\\star wars.wav", "run");
        ee.start();
        hasEnded=true;
        Action.hasEnded=true;
        tl.setVisible(false);
        GameEnd ge = new GameEnd(f, ee);
    }
}

class R implements ActionListener
{
    public TempLevel tl;
    JButton a;
    JPanel p;
    boolean state=false;
    boolean otherState=false;
    Music mmm;
    GameEnd ge;
    JFrame f;
    boolean abc;
    Music click = new Music("audios\\click.wav", "run");
    R(TempLevel tl, JButton a, JPanel p, boolean abc, JFrame f, Music mmm)
    {
        this.abc = abc;
        this.f = f;
        this.mmm = mmm;
        this.tl=tl;
        this.a=a;
        this.p=p;
        if(abc)
        {
            tl.setVisible(false);
            p.setVisible(false);
            System.out.println("eeeeeeeeeeeeeee");
            ge = new GameEnd (f, "mmm");
            return;
        }
        
    }
    boolean isClicked()
    {
        return state;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(abc)
        {
            tl.setVisible(false);
             p.setVisible(false);
            System.out.println("eeeeeeeeeeeeeee");
            ge = new GameEnd (f, "mmm");  
            return;
        }
        
        Action.foundR=true;
        score();
        state=true;
        click.start();
        tl.Rim = new ImageIcon("images\\blank.png");
        tl.R.setIcon(tl.Rim);
        tl.R.setVisible(false);
        tl.remove(tl.R);
        System.out.println("R was clicked");
    }
    void score()
    {   
        //tl.score.setText("3");
        String a = tl.score.getText();
        char c = (char)(((int)a.charAt(0))+1);
        a=""+(char)(c);
        tl.score.setText(a);
        if(a.equals("7"))
        {
            tl.cont.setVisible(true);
            tl.add(tl.cont);
            endedMap e = new endedMap(f, tl, hasEnded);
            tl.cont.addActionListener(e);
        }
    }
}

class P1 implements ActionListener
{
    public TempLevel tl;
    JButton a;
    JPanel p;
    JFrame f;
    GameEnd ge;
   
    boolean abc;
    boolean state=false;
    boolean otherState=false;
    Music click = new Music("audios\\click.wav", "run");
    P1(TempLevel tl, JButton a, JPanel p, JFrame f, boolean abc)
    {
        this.abc = abc;
        this.tl=tl;
        this.a=a;
        this.p=p;
        this.f=f;
        if(abc)
        {
            tl.setVisible(false);
             p.setVisible(false);
            System.out.println("eeeeeeeeeeeeeee");
            ge = new GameEnd (f, "mmm");
           
            return;
        }
    }
    boolean isClicked()
    {
        return state;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if(abc)
        {
            tl.setVisible(false);
             p.setVisible(false);
            System.out.println("eeeeeeeeeeeeeee");
            ge = new GameEnd (f, "mmm");
           
            return;
        }
        Action.foundP=true;
        score();
        state=true;
        final boolean willBe=state;
        click.start();
        tl.P1im = new ImageIcon("images\\blank.png");
        tl.P1.setIcon(tl.P1im);
        tl.P1.setVisible(false);
        tl.remove(tl.P1);
        System.out.println("P was clicked");
    }
    void score()
    {
        //tl.score.setText("3");
        String a = tl.score.getText();
        char c = (char)(((int)a.charAt(0))+1);
        a=""+(char)(c);
        tl.score.setText(a);
        if(a.equals("7"))
        {
            tl.cont.setVisible(true);
            tl.add(tl.cont);
            endedMap e = new endedMap(f, tl, hasEnded);
            tl.cont.addActionListener(e);
        }
    }
}

class E implements ActionListener
{
    public TempLevel tl;
    JButton a;
    JPanel p;
    GameEnd ge;
    JFrame f;
    boolean abc;
    boolean state=false;
    boolean otherState=false;
   
    Music click = new Music("audios\\click.wav", "run");
    E(TempLevel tl, JButton a, JPanel p, JFrame f, boolean abc)
    {
        this.f = f;
        this.abc = abc;
        this.tl=tl;
        this.a=a;
        this.p=p;
        if(abc)
        {
            tl.setVisible(false);
             p.setVisible(false);
            System.out.println("eeeeeeeeeeeeeee");
            ge = new GameEnd (f, "mmm");
           
            return;
        }
    }
    boolean isClicked()
    {
        return state;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(abc)
        {
            tl.setVisible(false);
            p.setVisible(false);
            System.out.println("eeeeeeeeeeeeeee");
            ge = new GameEnd (f, "mmm");
            return;
        }
        Action.foundE=true;
        score();
        state=true;
        click.start();
        tl.Eim = new ImageIcon("images\\blank.png");
        tl.E.setIcon(tl.Eim);
        tl.E.setVisible(false);
        tl.remove(tl.E);
        System.out.println("E was clicked");
    }
    void score()
    {
        //tl.score.setText("3");
        String a = tl.score.getText();
        char c = (char)(((int)a.charAt(0))+1);
        a=""+(char)(c);
        tl.score.setText(a);
        if(a.equals("7"))
        {
            tl.cont.setVisible(true);
            tl.add(tl.cont);
            endedMap e = new endedMap(f, tl, hasEnded);
            tl.cont.addActionListener(e);
        }
    }
}

class D implements ActionListener
{
    public TempLevel tl;
    JButton a;
    JPanel p;
    boolean state=false;
    boolean otherState=false;
    GameEnd ge;
    JFrame f;
    boolean abc;
   
    Music click = new Music("audios\\click.wav", "run");
    D(TempLevel tl, JButton a, JPanel p, JFrame f, boolean abc)
    {
        this.f = f;
        this.abc = abc;
        this.tl=tl;
        this.a=a;
        this.p=p;
        if(abc)
        {
            tl.setVisible(false);
             p.setVisible(false);
            System.out.println("eeeeeeeeeeeeeee");
            ge = new GameEnd (f, "mmm");
           
            return;
        }
    }
    boolean isClicked()
    {
        return state;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if(abc)
        {
            tl.setVisible(false);
             p.setVisible(false);
            System.out.println("eeeeeeeeeeeeeee");
            ge = new GameEnd (f, "mmm");
           
            return;
        }
        Action.foundD=true;
        score();
        state=true;
        click.start();
        tl.Dim = new ImageIcon("images\\blank.png");
        tl.D.setIcon(tl.Dim);
        tl.D.setVisible(false);
        tl.remove(tl.D);
        System.out.println("D was clicked");
        
    }
    void score()
    {
        //tl.score.setText("3");
        String a = tl.score.getText();
        char c = (char)(((int)a.charAt(0))+1);
        a=""+(char)(c);
        tl.score.setText(a);
        if(a.equals("7"))
        {
            tl.cont.setVisible(true);
            tl.add(tl.cont);
            endedMap e = new endedMap(f, tl, hasEnded);
            tl.cont.addActionListener(e);
        }
    }
}

class cave implements ActionListener
{
    JFrame f;
    TempLevel tl;
    Music mpm;
    GameEnd ge;
    cave(JFrame f, TempLevel tl, Music mpm)
    {
        this.f=f;
        this.tl=tl;
        this.mpm=mpm;
        tl.setVisible(false);
        if(hasEnded)
        {
            tl.setVisible(false);
            ge = new GameEnd(f, "mpm");
            return;
        }
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Entering mansion");
        tl.setVisible(false);
        HallsAction ha = new HallsAction(f);
        String a = tl.score.getText();
        char c = (char)(((int)a.charAt(0)));
        a=""+(char)(c);
        ha.m.score.setText(a);
        mpm.closeSong();
        //f.add(ha);
    }
}


class cave2 implements ActionListener
{
    JFrame f;
    TempLevel tl;
    Music mpm;
    GameEnd ge;
    cave2(JFrame f, TempLevel tl, Music mpm)
    {
        this.f=f;
        this.tl=tl;
        this.mpm=mpm;
        if(hasEnded)
        {
            tl.setVisible(false);
            ge = new GameEnd(f, "mpm");
            return;
        }
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Entering mansion2");
        tl.setVisible(false);
        HallsAction2 ha2 = new HallsAction2(f);
        String a = tl.score.getText();
        char c = (char)(((int)a.charAt(0)));
        a=""+(char)(c);
        ha2.m2.score.setText(a);
        mpm.closeSong();
        //f.add(ha);
    }
}


class cave3 implements ActionListener
{
    JFrame f;
    TempLevel tl;
    Music mpm;
    GameEnd ge;
    cave3(JFrame f, TempLevel tl, Music mpm)
    {
        this.f=f;
        this.tl=tl;
        this.mpm=mpm;
        if(hasEnded)
        {
            tl.setVisible(false);
            ge = new GameEnd(f, "mpm");
            return;
        }
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Entering mansion3");
        tl.setVisible(false);
        HallsAction3 ha3 = new HallsAction3(f);
        String a = tl.score.getText();
        char c = (char)(((int)a.charAt(0)));
        a=""+(char)(c);
        ha3.m3.score.setText(a);
        mpm.closeSong();
        ha3.m3.here=tl.here;
        //f.add(ha);
    }
}

public class Action extends JPanel
{
    JFrame f;
    TempLevel tl;
    Music mpm; 
    GameEnd ge;
    static boolean hasEnded=false;
    static boolean foundD=false, foundP=false, foundE=false, foundR=false;
    public Action(JFrame f)
    {
        this.f=f;
        mpm = new Music("audios\\indiana.wav", "run");
        mpm.start();
        tl = new TempLevel(f, 200, 600);
        if(hasEnded)
        {
            hasEnded=false;
            tl.setVisible(false);
            ge = new GameEnd(f, "mpm");
            
            return;
        }
        
        cave enter = new cave(f, tl, mpm);
        cave2 enter2 = new cave2(f, tl, mpm);
        cave3 enter3 = new cave3(f, tl, mpm);
        if(!foundD)
        {
            tl.add(tl.D);
            D clickedD = new D(tl, tl.D, tl, f, hasEnded);
            tl.D.addActionListener(clickedD);
        }
        if(!foundP)
        {
            tl.add(tl.P1);
            P1 clickedP1 = new P1(tl, tl.P1, tl, f, hasEnded);
            tl.P1.addActionListener(clickedP1);
        }
        if(!foundE)
        {
            tl.add(tl.E);
            E clickedE = new E(tl, tl.E, tl, f, hasEnded);
            tl.E.addActionListener(clickedE);
        }
        if(!foundR)
        {
            tl.add(tl.R);
            R clickedR = new R(tl, tl.R, tl, hasEnded, f, mpm);
            tl.R.addActionListener(clickedR);
        }
        tl.add(tl.mansion);
        tl.add(tl.mansion2);
        tl.add(tl.mansion3);
        tl.add(tl.score);
        tl.mansion.addActionListener(enter);
        tl.mansion2.addActionListener(enter2);
        tl.mansion3.addActionListener(enter3);
        f.add(tl);
        tl.setVisible(true);
        if(hasEnded)
        {
            hasEnded=false;
            tl.setVisible(false);
            ge = new GameEnd(f, "mpm");
            
            return;
        }
    }   
    public Action(JFrame f, int i)
    {
        this.f=f;
        mpm = new Music("audios\\indiana.wav", "run");
        mpm.start();
        if(hasEnded)
        {
            hasEnded=false;
            tl.setVisible(false);
            ge = new GameEnd(f, "mpm");
            
            return;
        }
        tl = new TempLevel(f, 200, 600, i);
        if(!foundD)
        {
            tl.add(tl.D);
            D clickedD = new D(tl, tl.D, tl, f, hasEnded);
            tl.D.addActionListener(clickedD);
        }
        if(!foundP)
        {
            tl.add(tl.P1);
            P1 clickedP1 = new P1(tl, tl.P1, tl, f, hasEnded);
            tl.P1.addActionListener(clickedP1);
        }
        if(!foundE)
        {
            tl.add(tl.E);
            E clickedE = new E(tl, tl.E, tl, f, hasEnded);
            tl.E.addActionListener(clickedE);
        }
        if(!foundR)
        {
            tl.add(tl.R);
            R clickedR = new R(tl, tl.R, tl, hasEnded, f, mpm);
            tl.R.addActionListener(clickedR);
        }
        tl.add(tl.mansion);
        tl.add(tl.mansion2);
        tl.add(tl.mansion3);
        tl.add(tl.score);
        cave enter = new cave(f, tl, mpm);
        cave2 enter2 = new cave2(f, tl, mpm);
        cave3 enter3 = new cave3(f, tl, mpm);
        tl.mansion.addActionListener(enter);
        tl.mansion2.addActionListener(enter2);
        tl.mansion3.addActionListener(enter3);
        f.add(tl);
        tl.setVisible(true);
        if(hasEnded)
        {
            hasEnded=false;
            tl.setVisible(false);
            ge = new GameEnd(f, "mpm");
            
            return;
        }
    }
    public Action(JFrame f, int i, Music m1)
    {
        this.f=f;
        m1.closeSong();
        mpm = new Music("audios\\indiana.wav", "run");
        mpm.start();
        tl = new TempLevel(f, 200, 600, i);
        if(!foundD)
        {
            tl.add(tl.D);
            D clickedD = new D(tl, tl.D, tl, f, hasEnded);
            tl.D.addActionListener(clickedD);
        }
        if(!foundP)
        {
            tl.add(tl.P1);
            P1 clickedP1 = new P1(tl, tl.P1, tl, f, hasEnded);
            tl.P1.addActionListener(clickedP1);
        }
        if(!foundE)
        {
            tl.add(tl.E);
            E clickedE = new E(tl, tl.E, tl, f, hasEnded);
            tl.E.addActionListener(clickedE);
        }
        if(!foundR)
        {
            tl.add(tl.R);
            R clickedR = new R(tl, tl.R, tl, hasEnded, f, mpm);
            tl.R.addActionListener(clickedR);
        }
        tl.add(tl.mansion);
        tl.add(tl.mansion2);
        tl.add(tl.mansion3);
        tl.add(tl.score);
        cave enter = new cave(f, tl, mpm);
        cave2 enter2 = new cave2(f, tl, mpm);
        cave3 enter3 = new cave3(f, tl, mpm);
        tl.mansion.addActionListener(enter);
        tl.mansion2.addActionListener(enter2);
        tl.mansion3.addActionListener(enter3);
        f.add(tl);
        tl.setVisible(true);
        if(hasEnded)
        {
            hasEnded=false;
            tl.setVisible(false);
            ge = new GameEnd(f, "mpm");
            return;
        }
    }
    public Action(JFrame f, Music m1)
    {
        this.f=f;
        m1.closeSong();
        //m1 = new Music("audios\\hobbits.wav", "stop");
        mpm = new Music("audios\\indiana.wav", "run");
        mpm.start();
        tl = new TempLevel(f, 200, 600, 100);
        if(hasEnded)
        {
            hasEnded=false;
            tl.setVisible(false);
            ge = new GameEnd(f, "mpm");
            return;
        }
        if(!foundD)
        {
            tl.add(tl.D);
            D clickedD = new D(tl, tl.D, tl, f, hasEnded);
            tl.D.addActionListener(clickedD);
        }
        if(!foundP)
        {
            tl.add(tl.P1);
            P1 clickedP1 = new P1(tl, tl.P1, tl, f, hasEnded);
            tl.P1.addActionListener(clickedP1);
        }
        if(!foundE)
        {
            tl.add(tl.E);
            E clickedE = new E(tl, tl.E, tl, f, hasEnded);
            tl.E.addActionListener(clickedE);
        }
        if(!foundR)
        {
            tl.add(tl.R);
            R clickedR = new R(tl, tl.R, tl, hasEnded, f, mpm);
            tl.R.addActionListener(clickedR);
        }
        tl.add(tl.mansion);
        tl.add(tl.mansion2);
        tl.add(tl.mansion3);
        tl.add(tl.score);
        cave enter = new cave(f, tl, mpm);
        cave2 enter2 = new cave2(f, tl, mpm);
        cave3 enter3 = new cave3(f, tl, mpm);
        tl.mansion.addActionListener(enter);
        tl.mansion2.addActionListener(enter2);
        tl.mansion3.addActionListener(enter3);
        f.add(tl);
        tl.setVisible(true);
        if(hasEnded)
        {
            hasEnded=false;
            tl.setVisible(false);
            ge = new GameEnd(f, "mpm");
            return;
        }
    }
    
}
