package mainmenuproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class LeftRoom extends JPanel
{
    JFrame f;
    JButton crnr, score;
    JButton back;
    ImageIcon backImage = new ImageIcon("images\\arrow right.png");
    ImageIcon cornerImage = new ImageIcon("images\\arrow left.png");
  
    public LeftRoom(JFrame f)
    {
        this.f=f;
        try
        {
            halls = ImageIO.read(new File("images\\haunted1.png"));
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
        crnr = new JButton();
        crnr.setOpaque(false);
        crnr.setBorderPainted(false);
        crnr.setContentAreaFilled(false);
        crnr.setIcon(cornerImage);
        
        score = new JButton();
        score.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        score.setOpaque(false);
        score.setContentAreaFilled(false);
        score.setBorderPainted(false);

        back = new JButton();
        back.setOpaque(false);
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setIcon(backImage);
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
        crnr.setBounds(350, 250, 110, 109);
        crnr.setVisible(true);
        crnr.setFocusable(true);
        back.setBounds(1000, 300, 110, 109);
        back.setVisible(true);
        back.setFocusable(true);
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
