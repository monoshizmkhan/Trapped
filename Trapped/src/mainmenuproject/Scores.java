package mainmenuproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


class backToMenu implements ActionListener
{
    JFrame f;
    JPanel p;
    Music ee;
    backToMenu(JFrame f, JPanel p)
    {
        this.f=f;
        this.p=p;
    }
    backToMenu(JFrame f, JPanel p, Music ee)
    {
        this.f=f;
        this.p=p;
        this.ee=ee;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        p.setVisible(false);
        MenuPanel mnpnl;
        if(ee!=null) ee.closeSong();
        try
        {
            mnpnl = new MenuPanel(f, true);
            f.add(mnpnl);
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
    }
}

public class Scores extends JPanel
{
    JFrame f;
    JButton back;
    Music ee;
    public Scores(JFrame f)
    {
        this.f=f;
        System.out.println("a");
        initComponents();
        back = new JButton("Back");
        back.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        back.setForeground(Color.WHITE);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        backToMenu btm = new backToMenu(f, this, ee);
        back.addActionListener(btm);
    }
    public Scores(JFrame f, Music ee)
    {
        this.f=f;
        this.ee=ee;
        back = new JButton("Back");
        back.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        back.setForeground(Color.WHITE);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        backToMenu btm = new backToMenu(f, this, ee);
        back.addActionListener(btm);
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        System.out.println("asdf");
        super.paintComponent(g);
        g.setColor(Color.GRAY);
        g.drawRect(0, 0, 1280, 720);
        g.fillRect(0, 0, 1280, 720);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        g.drawString("Scoreboard (Past Winners)", 485, 30);
        
        back.setBounds(570, 600, 100, 60);
        back.setVisible(true);
        this.add(back);
        
        int posX=200, posY=150;
        try
        {
            File f = new File("Scoreboard.txt");
            Scanner fsc = new Scanner(f);
            int i=0;
            String tempN="", tempT="";
            g.drawString("Name", posX, 100);
            while(fsc.hasNextLine())
            {
                if(posY==600)break;
                tempN=fsc.nextLine();
                if(tempN.equals("####"))continue;
                g.drawString(tempN, posX, posY);
                posY+=30;
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
