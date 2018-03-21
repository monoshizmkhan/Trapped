package mainmenuproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static mainmenuproject.Action.hasEnded;


class ended implements ActionListener
{
    JFrame f;
    CornerRoom cr;
    boolean hasEnded=false;
    ended(JFrame f, CornerRoom cr, boolean hasEnded)
    {
        this.f=f;
        this.cr=cr;
        this.hasEnded=hasEnded;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Music ee = new Music("audios\\star wars.wav", "run");
        ee.start();
        hasEnded=true;
        Action.hasEnded=true;
        cr.setVisible(false);
        GameEnd ge = new GameEnd(f, ee);
        //ge.here=cr3.here;
    }
}


class goesBck implements ActionListener
{
    JFrame f;
    JPanel p;
    boolean isFound=false;
    CornerRoom cr;
    goesBck(JFrame f, JPanel p, CornerRoom cr)
    {
        this.f=f;
        this.p=p;
        this.cr=cr;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Go back");
        p.setVisible(false);
        Left lftlft = new Left(f, cr.isFound);
        String a = cr.score.getText();
        char cd = (char)(((int)a.charAt(0)));
        a=""+(char)(cd);
        lftlft.lr.score.setText(a);
    }
}

class AButton implements ActionListener
{
    public TempLevel tl;
    JButton a;
    JPanel p;
    CornerRoom cr;
    boolean state=false;
    boolean otherState=false;
    JFrame f;
    Music click = new Music("audios\\click.wav", "run");
    AButton(CornerRoom cr, JButton a, JPanel p, JFrame f)
    {
        this.a=a;
        this.p=p;
        this.cr=cr;
        this.f=f;
    }
    boolean isClicked()
    {
        return state;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        cr.isFound=true;
        click.start();
        Corner.foundA=true;
        cr.Aim = new ImageIcon("images\\blank.png");
        cr.A.setIcon(cr.Aim);
        //System.out.println(Corner.foundA+" from Corner");
        cr.A.setBounds(1000000, 1000000, 1, 1);
        cr.A.setVisible(false);
        cr.remove(cr.A);
        System.out.println("A was clicked");
        score();
    }
    void score()
    {
        String a = cr.score.getText();
        char cd = (char)(((int)a.charAt(0))+1);
        a=""+(char)(cd);
        cr.score.setText(a);
        if(a.equals("7"))
        {
            cr.bck.setVisible(false);
            cr.bck.setFocusable(false);
            cr.remove(cr.bck);
            cr.cont.setVisible(true);
            cr.add(cr.cont);
            ended e = new ended(f, cr, hasEnded);
            cr.cont.addActionListener(e);
        }
        
    }
}

public class Corner
{
    JFrame f;
    CornerRoom cr;
    GameEnd ge;
    boolean isFound;
    static boolean foundA=false;
    static boolean s=false;
    Corner(JFrame f, boolean isFound)
    {
        this.f=f;
        cr = new CornerRoom(f, isFound);
        this.isFound=isFound;
        if(hasEnded)
        {
            cr.setVisible(false);
            System.out.println(s);
            ge = new GameEnd(f, "mpm");
            hasEnded=false;
            return;
        }
        goesBck gbc = new goesBck(f, cr, cr);
        AButton ab = new AButton(cr, cr.A, cr, f);
        cr.add(cr.bck);
        cr.add(cr.score);
        cr.bck.addActionListener(gbc);
        if(!foundA)
        {
            cr.add(cr.A);
            cr.A.addActionListener(ab);
        }
        f.add(cr);
        cr.setVisible(true);
    }
    
}
