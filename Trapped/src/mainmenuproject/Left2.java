package mainmenuproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static mainmenuproject.Action.hasEnded;

class goBack2 implements ActionListener
{
    JFrame f;
    LeftRoom2 lr2;
    goBack2(JFrame f, LeftRoom2 lr2)
    {
        this.f=f;
        this.lr2=lr2;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Go back");
        lr2.setVisible(false);
        HallsAction2 ha2 = new HallsAction2(f, new Music("audios\\hobbits.wav", "stop"));
        String a = lr2.score.getText();
        char c = (char)(((int)a.charAt(0)));
        a=""+(char)(c);
        ha2.m2.score.setText(a);
    }
}

class goesCorner2 implements ActionListener
{
    JFrame f;
    LeftRoom2 lr2;
    JButton b;
    boolean isFound;
    Corner2 c2;
    goesCorner2(JFrame f, LeftRoom2 lr2, boolean isFound )
    {
        this.f=f;
        this.lr2=lr2;
        this.isFound=isFound;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Going left");
        lr2.setVisible(false);
        if(isFound)
        {
            c2 = new Corner2(f, 1);
            String a = lr2.score.getText();
            char c = (char)(((int)a.charAt(0)));
            a=""+(char)(c);
            c2.cr2.score.setText(a);
        }
        else
        {
            c2 = new Corner2(f);
            String a = lr2.score.getText();
            char c = (char)(((int)a.charAt(0)));
            a=""+(char)(c);
            c2.cr2.score.setText(a);
        }
    }
}

public class Left2
{
    JFrame f;
    LeftRoom2 lr2;
    boolean isFound;
    GameEnd ge;
    Left2(JFrame f, boolean isFound)
    {
        this.f=f;
        this.isFound=isFound;
        lr2 = new LeftRoom2(f);
        if(hasEnded)
        {
            lr2.setVisible(false);
            ge = new GameEnd(f, "mpm");
            hasEnded=false;
            return;
        }
        goBack2 gb2 = new goBack2(f, lr2);
        goesCorner2 gc2 = new goesCorner2(f, lr2, isFound);
        lr2.add(lr2.back2);
        lr2.add(lr2.crnr2);
        lr2.add(lr2.score);
        lr2.back2.addActionListener(gb2);
        lr2.crnr2.addActionListener(gc2);
        f.add(lr2);
        lr2.back2.setVisible(true);        
    }
}
