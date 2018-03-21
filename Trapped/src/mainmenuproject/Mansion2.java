package mainmenuproject;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Mansion2 extends JPanel
{
    JFrame f;
    public JButton A, Map2, leftRoom2, ahead2, score;
    ImageIcon backToMap2 = new ImageIcon("images\\mansion2.png");
    ImageIcon toLeft2 = new ImageIcon("images\\arrow left.png");
    ImageIcon forward2 = new ImageIcon("images\\arrow.png");
    public Mansion2(JFrame f)
    {
        this.f=f;
        try
        {
            halls2 = ImageIO.read(new File("images\\h2-1.png"));
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
        Map2 = new JButton();
        Map2.setOpaque(false);
        Map2.setContentAreaFilled(false);
        Map2.setBorderPainted(false);
        Map2.setIcon(backToMap2);
        
        score = new JButton("5");
        score.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        score.setOpaque(false);
        score.setContentAreaFilled(false);
        score.setBorderPainted(false);
        
        leftRoom2 = new JButton();
        leftRoom2.setOpaque(false);
        leftRoom2.setContentAreaFilled(false);
        leftRoom2.setBorderPainted(false);
        leftRoom2.setIcon(toLeft2);
        
        ahead2 = new JButton();
        ahead2.setOpaque(false);
        ahead2.setContentAreaFilled(false);
        ahead2.setBorderPainted(false);
        ahead2.setIcon(forward2);
    }
    public int percentage, percentageOther;
    public String progress, progressOther;
    BufferedImage halls2;
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(halls2, 0, 0, this);
        
        Map2.setBounds(1, 1, 84, 67);
        Map2.setVisible(true);
        Map2.setFocusable(true);
        
        score.setVisible(true);
        score.setBounds(585, 20, 100, 35);
        score.setForeground(Color.WHITE);
        
        leftRoom2.setBounds(100, 290, 110, 109);
        leftRoom2.setVisible(true);
        leftRoom2.setFocusable(true);
        
        ahead2.setBounds(750, 330, 109, 110);
        ahead2.setVisible(true);
        ahead2.setFocusable(true);
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
