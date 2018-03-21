package mainmenuproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static mainmenuproject.Action.hasEnded;


class goesBck3 implements ActionListener
{
    JFrame f;
    CornerRoom3 cr3;
    boolean isFound;
    goesBck3(JFrame f, CornerRoom3 cr3, boolean isFound)
    {
        this.f=f;
        this.cr3=cr3;
        this.isFound=isFound;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Go back");
        cr3.setVisible(false);
        Left3 lftlft3 = new Left3(f, cr3.isFound);
        String a = cr3.score.getText();
        char cd = (char)(((int)a.charAt(0)));
        a=""+(char)(cd);
        lftlft3.lr3.score.setText(a);
    }
}

class ended3 implements ActionListener
{
    JFrame f;
    CornerRoom3 cr3;
    boolean hasEnded=false;
    ended3(JFrame f, CornerRoom3 cr3, boolean hasEnded)
    {
        this.f=f;
        this.cr3=cr3;
        this.hasEnded=hasEnded;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Music ee = new Music("audios\\star wars.wav", "run");
        ee.start();
        hasEnded=true;
        Action.hasEnded=true;
        cr3.setVisible(false);
        GameEnd ge = new GameEnd(f, ee);
        ge.here=cr3.here;
    }
}

class AButton3 implements ActionListener
{
    public TempLevel tl;
    JButton a3;
    JPanel p;
    CornerRoom3 cr3;
    JFrame f;
    boolean hasEnded;
    Music click = new Music("audios\\click.wav", "run");
    Music m1;
    AButton3(CornerRoom3 cr3, JButton a3, JFrame f, Music m1, boolean hasEnded)
    {
        this.a3=a3;
        this.f=f;
        this.cr3=cr3;
        this.m1=m1;
        this.hasEnded=hasEnded;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        cr3.isFound=true;
        click.start();
        cr3.P2im = new ImageIcon("images\\blank.png");
        cr3.A3.setIcon(cr3.P2im);
        cr3.A3.setVisible(false);
        cr3.remove(cr3.A3);
        System.out.println("A was clicked");
        m1.closeSong();
        score();
        Corner3.foundP2=true;
    }
    void score()
    {
        String a = cr3.score.getText();
        char cd = (char)(((int)a.charAt(0))+1);
        a=""+(char)(cd);
        cr3.score.setText(a);
        
        if(a.equals("7"))
        {
            cr3.bck3.setVisible(false);
            cr3.bck3.setFocusable(false);
            cr3.remove(cr3.bck3);
            cr3.cont.setVisible(true);
            cr3.add(cr3.cont);
            
            ended3 e = new ended3(f, cr3, hasEnded);
            cr3.cont.addActionListener(e);
        }
    }
}

public class Corner3
{
    JFrame f;
    CornerRoom3 cr3;
    GameEnd ge;
    boolean isFound, hasEnded=false;
    Music m1;
    public static boolean foundP2=false;
    Corner3(JFrame f, boolean isFound)
    {
        this.f=f;
        this.isFound=isFound;
        cr3 = new CornerRoom3(f, isFound);
        if(hasEnded)
        {
            cr3.setVisible(false);
            ge = new GameEnd(f, "mpm");
            hasEnded=false;
        }
        
        goesBck3 gbc3 = new goesBck3(f, cr3, isFound);
        cr3.add(cr3.bck3);
        cr3.add(cr3.score);
        cr3.bck3.addActionListener(gbc3);
        if(!foundP2)
        {
            AButton3 ab3 = new AButton3(cr3, cr3.A3, f, m1, hasEnded);
            cr3.add(cr3.A3);
            cr3.A3.addActionListener(ab3);
        }
        f.add(cr3);
        cr3.setVisible(true);
    }
    Corner3(JFrame f, boolean isFound, Music m1)
    {
        this.f=f;
        this.isFound=isFound;
        this.m1=m1;
        
        cr3 = new CornerRoom3(f, isFound);
        if(hasEnded)
        {
            cr3.setVisible(false);
            ge = new GameEnd(f, "mpm");
            hasEnded=false;
            return;
        }
        goesBck3 gbc3 = new goesBck3(f, cr3, isFound);
        cr3.add(cr3.bck3);
        cr3.add(cr3.score);
        cr3.bck3.addActionListener(gbc3);
        if(!foundP2)
        {
            AButton3 ab3 = new AButton3(cr3, cr3.A3, f, m1, hasEnded);
            cr3.add(cr3.A3);
            cr3.A3.addActionListener(ab3);
        }
        f.add(cr3);
        cr3.setVisible(true);
    }
}
