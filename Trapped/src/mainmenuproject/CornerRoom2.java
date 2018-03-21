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

public class CornerRoom2 extends JPanel
{
    JFrame f;
    public JButton bck2, A2, score, cont;
    boolean isFound;
    ImageIcon bckArrow2 = new ImageIcon("images\\arrow right.png");
    ImageIcon Tim = new ImageIcon("images\\t.png");
    ImageIcon next = new ImageIcon("images\\blank.png");
    public CornerRoom2(JFrame f, boolean isFound)
    {
        this.f=f;
        try
        {
            halls2 = ImageIO.read(new File("images\\h2-2.png"));
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        this.isFound=isFound;
        bck2 = new JButton();
        bck2.setOpaque(false);
        bck2.setContentAreaFilled(false);
        bck2.setBorderPainted(false);
        bck2.setIcon(bckArrow2);
        
        score = new JButton("5");
        score.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        score.setOpaque(false);
        score.setContentAreaFilled(false);
        score.setBorderPainted(false);        
        
        if(!Corner2.foundT)
        {
            A2 = new JButton();
            A2.setOpaque(false);
            A2.setContentAreaFilled(false);
            A2.setBorderPainted(false);
            A2.setIcon(Tim);
        }
        
        cont = new JButton("You have found all the letters! Click anywhere to continue.");
        cont.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        cont.setOpaque(false);
        cont.setContentAreaFilled(false);
        cont.setBorderPainted(false);       
    }
    BufferedImage halls2;
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(halls2, 0, 0, this);
        
        score.setVisible(true);
        score.setBounds(585, 20, 100, 35);
        score.setForeground(Color.WHITE);
        
        bck2.setBounds(870, 350, 110, 109);
        bck2.setVisible(true);
        bck2.setFocusable(true);
        
        if(!Corner2.foundT)
        {
            A2.setBounds(-33, 550, 110, 109);
            A2.setVisible(true);
            A2.setFocusable(true);
        }
        
        cont.setBounds(0, 0, 1280, 720);
        cont.setForeground(Color.WHITE);
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
