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

public class CornerRoom3 extends JPanel
{
    JFrame f;
    long here;
    public JButton bck3, A3, score, cont;
    boolean isFound;
    ImageIcon bckArrow3 = new ImageIcon("images\\arrow left.png");
    ImageIcon P2im = new ImageIcon("images\\p2.png");
    ImageIcon next = new ImageIcon("images\\blank.png");
    public CornerRoom3(JFrame f, boolean isFound)
    {
        this.f=f;
        this.isFound=isFound;
        try
        {
            halls3 = ImageIO.read(new File("images\\h3-3.png"));
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        bck3 = new JButton();
        bck3.setOpaque(false);
        bck3.setContentAreaFilled(false);
        bck3.setBorderPainted(false);
        bck3.setIcon(bckArrow3);
        
        score = new JButton("6");
        score.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        score.setOpaque(false);
        score.setContentAreaFilled(false);
        score.setBorderPainted(false);        
        
        if(!Corner3.foundP2)
        {
            A3 = new JButton();
            A3.setOpaque(false);
            A3.setContentAreaFilled(false);
            A3.setBorderPainted(false);
            A3.setIcon(P2im);
        }
        
        cont = new JButton("You have found all the letters! Click anywhere to continue.");
        cont.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        cont.setOpaque(false);
        cont.setContentAreaFilled(false);
        cont.setBorderPainted(false);       
    }
    BufferedImage halls3;
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(halls3, 0, 0, this);
        
        bck3.setBounds(60, 300, 110, 109);
        bck3.setVisible(true);
        bck3.setFocusable(true);
        
        if(!Corner3.foundP2)
        {
            A3.setBounds(-33, 150, 110, 109);
            A3.setVisible(true);
            A3.setFocusable(true);
        }
        
        cont.setBounds(0, 0, 1280, 720);
        cont.setForeground(Color.WHITE);
        
        score.setVisible(true);
        score.setBounds(585, 20, 100, 35);
        score.setForeground(Color.WHITE);
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
