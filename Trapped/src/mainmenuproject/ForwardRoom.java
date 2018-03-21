package mainmenuproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static mainmenuproject.Action.hasEnded;


class goesBack implements ActionListener
{
    JFrame f;
    Forward fw;
    goesBack(JFrame f, Forward fw)
    {
        this.f=f;
        this.fw=fw;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Go back");
        fw.setVisible(false);
        HallsAction ha = new HallsAction(f, new Music("audios\\hobbits.wav", "stop"));
            String a = fw.score.getText();
            char c = (char)(((int)a.charAt(0)));
            a=""+(char)(c);
            ha.m.score.setText(a);
    }
}

public class ForwardRoom
{
    JFrame f;
    Forward fw;
    GameEnd ge;
    ForwardRoom(JFrame f)
    {
        this.f=f;
        
        fw = new Forward(f);
        if(hasEnded)
        {
            fw.setVisible(false);
            ge = new GameEnd(f, "mpm");
            hasEnded=false;
            return;
        }
        goesBack gb = new goesBack(f, fw);
        fw.add(fw.back);
        fw.add(fw.score);
        fw.back.addActionListener(gb);
        f.add(fw);
        fw.back.setVisible(true);
    }
    
}
