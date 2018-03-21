package mainmenuproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static mainmenuproject.Action.hasEnded;


class goesBack2 implements ActionListener
{
    JFrame f;
    Forward2 fw2;
    goesBack2(JFrame f, Forward2 fw2)
    {
        this.f=f;
        this.fw2=fw2;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Go back");
        fw2.setVisible(false);
        HallsAction2 ha2 = new HallsAction2(f, new Music("audios\\hobbits.wav", "stop"));
            String a = fw2.score.getText();
            char c = (char)(((int)a.charAt(0)));
            a=""+(char)(c);
            ha2.m2.score.setText(a);
    }
}



public class ForwardRoom2
{
    JFrame f;
    Forward2 fw2;
    GameEnd ge;
    ForwardRoom2(JFrame f)
    {
        this.f=f;
        fw2 = new Forward2(f);
        if(hasEnded)
        {
            fw2.setVisible(false);
            ge = new GameEnd(f, "mpm");
            hasEnded=false;
            return;
        }
        goesBack2 gb2 = new goesBack2(f, fw2);
        fw2.add(fw2.back2);
        fw2.add(fw2.score);
        fw2.back2.addActionListener(gb2);
        f.add(fw2);
        fw2.back2.setVisible(true);
    }
    
}
