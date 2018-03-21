package mainmenuproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static mainmenuproject.Action.hasEnded;


class ended2 implements ActionListener
{
    JFrame f;
    CornerRoom2 cr3;
    boolean hasEnded=false;
    ended2(JFrame f, CornerRoom2 cr3, boolean hasEnded)
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
        //ge.here=cr3.here;
    }
}


class goesBck2 implements ActionListener
{
    JFrame f;
    CornerRoom2 cr2;
    boolean isFound;
    goesBck2(JFrame f, CornerRoom2 cr2, boolean isFound)
    {
        this.f=f;
        this.cr2=cr2;
        this.isFound=isFound;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Go back");
        cr2.setVisible(false);
        Left2 lftlft2 = new Left2(f, cr2.isFound);
        String a = cr2.score.getText();
        char cd = (char)(((int)a.charAt(0)));
        a=""+(char)(cd);
        lftlft2.lr2.score.setText(a);
    }
}

class AButton2 implements ActionListener
{
    public TempLevel tl;
    JButton a2;
    JPanel p;
    JFrame f;
    CornerRoom2 cr2;
    boolean state=false;
    boolean otherState=false;
    Music click = new Music("audios\\click.wav", "run");
    AButton2(CornerRoom2 cr2, JButton a2, JPanel p, JFrame f)
    {
        this.a2=a2;
        this.p=p;
        this.cr2=cr2;
        this.f=f;
    }
    boolean isClicked()
    {
        return state;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        click.start();
        cr2.isFound=true;
        cr2.Tim = new ImageIcon("images\\blank.png");
        cr2.A2.setIcon(cr2.Tim);
        cr2.A2.setVisible(false);
        cr2.remove(cr2.A2);
        System.out.println("T was clicked");
        score();
        Corner2.foundT=true;
    }
    void score()
    {
        String a = cr2.score.getText();
        char cd = (char)(((int)a.charAt(0))+1);
        a=""+(char)(cd);
        cr2.score.setText(a);
        if(a.equals("7"))
        {
            cr2.bck2.setVisible(false);
            cr2.bck2.setFocusable(false);
            cr2.remove(cr2.bck2);
            cr2.cont.setVisible(true);
            cr2.add(cr2.cont);
            ended2 e = new ended2(f, cr2, hasEnded);
            cr2.cont.addActionListener(e);
        }
    }
}

public class Corner2
{
    JFrame f;
    CornerRoom2 cr2;
    boolean isFound;
    GameEnd ge;
    AButton2 ab2;
    public static boolean foundT=false;
    Corner2(JFrame f)
    {
        this.f=f;
        cr2 = new CornerRoom2(f, isFound);
        if(hasEnded)
        {
            cr2.setVisible(false);
            ge = new GameEnd(f, "mpm");
            hasEnded=false;
            return;
        }
        goesBck2 gbc2 = new goesBck2(f, cr2, isFound);
        cr2.add(cr2.bck2);
        cr2.add(cr2.score);
        cr2.bck2.addActionListener(gbc2);
        if(!foundT)
        {
            ab2 = new AButton2(cr2, cr2.A2, cr2, f);
            cr2.add(cr2.A2);
            cr2.A2.addActionListener(ab2);
        }
        f.add(cr2);
        cr2.setVisible(true);
    }
    
    Corner2(JFrame f, int i)
    {
        this.f=f;
        cr2 = new CornerRoom2(f, isFound);
        goesBck2 gbc2 = new goesBck2(f, cr2, isFound);
        if(!foundT)
        {
            ab2 = new AButton2(cr2, cr2.A2, cr2, f);
            cr2.add(cr2.A2);
            cr2.A2.addActionListener(ab2);
        }
        cr2.add(cr2.bck2);
        cr2.add(cr2.score);
        cr2.bck2.addActionListener(gbc2);
        f.add(cr2);
        cr2.setVisible(true);
    }
}
