package mainmenuproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static mainmenuproject.Action.hasEnded;

class goBack3 implements ActionListener
{
    JFrame f;
    LeftRoom3 lr3;
    goBack3(JFrame f, LeftRoom3 lr3)
    {
        this.f=f;
        this.lr3=lr3;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Go back");
        lr3.setVisible(false);
        HallsAction3 ha3 = new HallsAction3(f,new Music("audios\\hobbits.wav", "stop"));
            String a = lr3.score.getText();
            char c = (char)(((int)a.charAt(0)));
            a=""+(char)(c);
            ha3.m3.score.setText(a);
    }
}

class goesCorner3 implements ActionListener
{
    JFrame f;
    JPanel p;
    JButton b;
    boolean isFound;
    LeftRoom3 lr3;
    Corner3 c3;
    Music m1;
    goesCorner3(JFrame f, LeftRoom3 lr3, boolean isFound, Music m1)
    {
        this.f=f;
        this.lr3=lr3;
        this.isFound=isFound;
        this.m1=m1;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Going left");
        lr3.setVisible(false);
        c3 = new Corner3(f, isFound, m1);
        c3.cr3.here = lr3.here;
        String a = lr3.score.getText();
        char c = (char)(((int)a.charAt(0)));
        a=""+(char)(c);
        c3.cr3.score.setText(a);
    }
}

public class Left3
{
    JFrame f;
    LeftRoom3 lr3;
    boolean isFound;
    Music m1;
    GameEnd ge;
    long here;
    Left3(JFrame f, boolean isFound)
    {
        this.f=f;
        this.isFound = isFound;
        lr3 = new LeftRoom3(f);
        if(hasEnded)
        {
            lr3.setVisible(false);
            ge = new GameEnd(f, "mpm");
            return;
        }
        goBack3 gb3 = new goBack3(f, lr3);
        goesCorner3 gc3 = new goesCorner3(f, lr3, isFound, m1);
        lr3.add(lr3.back3);
        lr3.add(lr3.crnr3);
        lr3.add(lr3.score);
        lr3.back3.addActionListener(gb3);
        lr3.crnr3.addActionListener(gc3);
        f.add(lr3);
        lr3.back3.setVisible(true);       
    }
    Left3(JFrame f, boolean isFound, Music m1)
    {
        this.f=f;
        this.isFound = isFound;
        this.m1=m1;
        lr3 = new LeftRoom3(f);
        if(hasEnded)
        {
            lr3.setVisible(false);
            ge = new GameEnd(f, "mpm");
            hasEnded=false;
            return;
        }
        goBack3 gb3 = new goBack3(f, lr3);
        goesCorner3 gc3 = new goesCorner3(f, lr3, isFound, m1);
        lr3.add(lr3.back3);
        lr3.add(lr3.crnr3);
        lr3.add(lr3.score);
        lr3.back3.addActionListener(gb3);
        lr3.crnr3.addActionListener(gc3);
        f.add(lr3);
        lr3.back3.setVisible(true);       
    }
}
