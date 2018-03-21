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

public class Forward2 extends JPanel
{
    JFrame f;
    public JButton back2, score;
    ImageIcon backArrow2 = new ImageIcon("images\\arrow right.png");
    public Forward2(JFrame f)
    {
        this.f=f;
        try
        {
            halls2 = ImageIO.read(new File("images\\h2-4.png"));
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        back2 = new JButton();
        back2.setOpaque(false);
        back2.setContentAreaFilled(false);
        back2.setBorderPainted(false);
        back2.setIcon(backArrow2);
        
        score = new JButton("5");
        score.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        score.setOpaque(false);
        score.setContentAreaFilled(false);
        score.setBorderPainted(false);
    }
    BufferedImage halls2;
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(halls2, 0, 0, this);
        
        back2.setBounds(1100, 200, 110, 109);
        back2.setVisible(true);
        back2.setFocusable(true);
        
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
