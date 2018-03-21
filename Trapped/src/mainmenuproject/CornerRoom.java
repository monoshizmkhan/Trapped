package mainmenuproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class CornerRoom extends JPanel
{
    JFrame f;
    public JButton bck, A, score, cont;
    ImageIcon bckArrow = new ImageIcon("images\\arrow left.png");
    ImageIcon Aim = new ImageIcon("images\\a.png");
    public boolean isFound=false;
    ImageIcon next = new ImageIcon("images\\blank.png");
    public CornerRoom(JFrame f, boolean isFound)
    {
        this.f=f;
        this.isFound=isFound;
        try
        {
            halls = ImageIO.read(new File("images\\haunted4.png"));
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        bck = new JButton();
        bck.setOpaque(false);
        bck.setContentAreaFilled(false);
        bck.setBorderPainted(false);
        bck.setIcon(bckArrow);
        
        score = new JButton();
        score.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        score.setOpaque(false);
        score.setContentAreaFilled(false);
        score.setBorderPainted(false);
        
        System.out.println(Corner.foundA+" from CornerRoom");
        if(!Corner.foundA)
        {
            A = new JButton();
            A.setOpaque(false);
            A.setContentAreaFilled(false);
            A.setBorderPainted(false);
            A.setIcon(Aim);
        }
        
        cont = new JButton("You have found all the letters! Click anywhere to continue.");
        cont.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        cont.setOpaque(false);
        cont.setContentAreaFilled(false);
        cont.setBorderPainted(false);
        
        
    }
    BufferedImage halls;
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(halls, 0, 0, this);
        
        score.setVisible(true);
        score.setBounds(585, 20, 100, 35);
        score.setForeground(Color.WHITE);
        
        bck.setBounds(140, 160, 110, 109);
        bck.setVisible(true);
        bck.setFocusable(true);
        
        cont.setBounds(0, 0, 1280, 720);
        cont.setForeground(Color.WHITE);
        
        if(!Corner.foundA)
        {
            A.setBounds(1075, 250, 110, 109);
            A.setVisible(true);
            A.setFocusable(true);
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
