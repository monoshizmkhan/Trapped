package mainmenuproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class LeftRoom3 extends JPanel
{
    JFrame f;
    JButton crnr3, score;
    JButton back3;
    long here;
    ImageIcon backImage3 = new ImageIcon("images\\arrow left.png");
    ImageIcon cornerImage3 = new ImageIcon("images\\arrow right.png");
  
    public LeftRoom3(JFrame f)
    {
        this.f=f;
        try
        {
            halls3 = ImageIO.read(new File("images\\h3-2.png"));
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
        crnr3 = new JButton();
        crnr3.setOpaque(false);
        crnr3.setBorderPainted(false);
        crnr3.setContentAreaFilled(false);
        crnr3.setIcon(cornerImage3);

        back3 = new JButton();
        back3.setOpaque(false);
        back3.setBorderPainted(false);
        back3.setContentAreaFilled(false);
        back3.setIcon(backImage3);
        score = new JButton("6");
        score.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        score.setOpaque(false);
        score.setContentAreaFilled(false);
        score.setBorderPainted(false);
    }
    BufferedImage halls3;
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(halls3, 0, 0, this);
        crnr3.setBounds(800, 300, 110, 109);
        crnr3.setVisible(true);
        crnr3.setFocusable(true);
        back3.setBounds(10, 10, 110, 109);
        back3.setVisible(true);
        back3.setFocusable(true);
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
