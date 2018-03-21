package mainmenuproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static mainmenuproject.Action.hasEnded;


class goesBack3 implements ActionListener
{
    JFrame f;
    Forward3 fw3;
    goesBack3(JFrame f, Forward3 fw3)
    {
        this.f=f;
        this.fw3=fw3;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Go back");
        fw3.setVisible(false);
        HallsAction3 ha3 = new HallsAction3(f, new Music("audios\\hobbits.wav", "stop"));
            String a = fw3.score.getText();
            char c = (char)(((int)a.charAt(0)));
            a=""+(char)(c);
            ha3.m3.score.setText(a);
    }
}



public class ForwardRoom3
{
    JFrame f;
    Forward3 fw3;
    GameEnd ge;
    ForwardRoom3(JFrame f)
    {
        this.f=f;
        fw3 = new Forward3(f);
        if(hasEnded)
        {
            fw3.setVisible(false);
            ge = new GameEnd(f, "mpm");
            hasEnded=false;
            return;
        }
        goesBack3 gb3 = new goesBack3(f, fw3);
        fw3.add(fw3.back3);
        fw3.add(fw3.score);
        fw3.back3.addActionListener(gb3);
        f.add(fw3);
        fw3.back3.setVisible(true);
    }
    
}
