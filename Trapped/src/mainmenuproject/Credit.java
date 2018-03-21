package mainmenuproject;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;


class goingBack implements ActionListener
{
    JFrame f;
    creditImage ci;
    Music cre;
    int i=0;
    goingBack(JFrame f, creditImage ci, Music cre)
    {
        this.f=f;
        this.ci=ci;
        this.cre=cre;
    }
    @Override
    public void actionPerformed(ActionEvent evt)
    {
        i++;
        if(i==1)
        {
            ci.b.setIcon(new ImageIcon("images\\credits2.png"));
        }
        if(i==2)
        {
            ci.b.setIcon(new ImageIcon("images\\credits3.png"));
        }
        if(i==3)
        {
            ci.setVisible(false);
            MenuPanel panel;
            try
            {
                ci.setVisible(false);
                f.remove(ci);
                cre.closeSong();
                panel = new MenuPanel(f, true);
                f.add(panel);
            }
            catch (IOException ex)
            {
                System.out.println(ex);
            }
        }
    }
}


class creditImage extends JPanel
{
    JFrame f;
    JButton b;
    creditImage(JFrame f)
    {
        this.f=f;
        credits = new ImageIcon("images\\credits1.png");
        b = new JButton();
        b.setOpaque(false);
        b.setBorderPainted(false);
        b.setContentAreaFilled(false);
        b.setIcon(credits);
    }
    ImageIcon credits;
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        b.setBounds(0, 0, 1280, 720);
        b.setVisible(true);
    }
}


public class Credit
{
    JFrame f;
    Music cre = new Music("audios\\star wars.wav", "run");
    creditImage ci;
    public Credit(JFrame f)
    {
        this.f=f;
        ci = new creditImage(f);
        ci.add(ci.b);
        f.add(ci);
        cre = new Music("audios\\star wars.wav", "run");
        cre.start();
        goingBack gbck = new goingBack(f, ci, cre);
        ci.b.addActionListener(gbck);
    }
}