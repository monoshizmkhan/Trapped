package mainmenuproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static mainmenuproject.Action.hasEnded;

class goBack implements ActionListener
{
    JFrame f;
    LeftRoom lr;
    goBack(JFrame f, LeftRoom lr)
    {
        this.f=f;
        this.lr=lr;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Go back");
        lr.setVisible(false);
        HallsAction ha = new HallsAction(f, new Music("audios\\hobbits.wav", "stop"));
        String a = lr.score.getText();
        char c = (char)(((int)a.charAt(0)));
        a=""+(char)(c);
        ha.m.score.setText(a);
    }
}

class goesCorner implements ActionListener
{
    JFrame f;
    LeftRoom lr;
    JButton b;
    boolean isFound;
    Corner c;
    goesCorner(JFrame f, LeftRoom lr, boolean isFound)
    {
        this.f=f;
        this.lr=lr;
        this.isFound=isFound;
        //this.b=b;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Going left");
        lr.setVisible(false);
        if(isFound==false)
        {
            c = new Corner(f, false);
            String a = lr.score.getText();
            char cd = (char)(((int)a.charAt(0)));
            a=""+(char)(cd);
            c.cr.score.setText(a);
        }
        else
        {
            c = new Corner(f, true);
            String a = lr.score.getText();
            char cd = (char)(((int)a.charAt(0)));
            a=""+(char)(cd);
            c.cr.score.setText(a);
        }
        
    }
}

public class Left
{
    JFrame f;
    LeftRoom lr;
    boolean isFound;
    GameEnd ge;
    Left(JFrame f, boolean isFound)
    {
        this.f=f;
        this.isFound=isFound;
        lr = new LeftRoom(f);
        if(hasEnded)
        {
            lr.setVisible(false);
            ge = new GameEnd(f, "mpm");
            hasEnded=false;
            return;
        }
        goBack gb = new goBack(f, lr);
        goesCorner gc = new goesCorner(f, lr, isFound);
        lr.add(lr.back);
        lr.add(lr.crnr);
        lr.add(lr.score);
        lr.back.addActionListener(gb);
        lr.crnr.addActionListener(gc);
        f.add(lr);
        lr.back.setVisible(true);        
    }
}
