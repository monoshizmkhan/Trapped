package mainmenuproject;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Mansion3 extends JPanel
{
    JFrame f;
    public JButton A, Map3, leftRoom3, ahead3, score;
    long here;
    ImageIcon backToMap3 = new ImageIcon("images\\mansion2.png");
    ImageIcon toLeft3 = new ImageIcon("images\\arrow right.png");
    ImageIcon forward3 = new ImageIcon("images\\arrow left.png");
    public Mansion3(JFrame f)
    {
        this.f=f;
        try
        {
            halls3 = ImageIO.read(new File("images\\h3-1.png"));
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
        Map3 = new JButton();
        Map3.setOpaque(false);
        Map3.setContentAreaFilled(false);
        Map3.setBorderPainted(false);
        Map3.setIcon(backToMap3);
        
        score = new JButton("6");
        score.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        score.setOpaque(false);
        score.setContentAreaFilled(false);
        score.setBorderPainted(false);
        
        leftRoom3 = new JButton();
        leftRoom3.setOpaque(false);
        leftRoom3.setContentAreaFilled(false);
        leftRoom3.setBorderPainted(false);
        leftRoom3.setIcon(toLeft3);
        
        ahead3 = new JButton();
        ahead3.setOpaque(false);
        ahead3.setContentAreaFilled(false);
        ahead3.setBorderPainted(false);
        ahead3.setIcon(forward3);
    }
    public int percentage, percentageOther;
    public String progress, progressOther;
    BufferedImage halls3;
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(halls3, 0, 0, this);
        
        Map3.setBounds(1, 1, 84, 67);
        Map3.setVisible(true);
        Map3.setFocusable(true);
        
        leftRoom3.setBounds(800, 250, 110, 109);
        leftRoom3.setVisible(true);
        leftRoom3.setFocusable(true);
        
        score.setVisible(true);
        score.setBounds(585, 20, 100, 35);
        score.setForeground(Color.WHITE);
        
        ahead3.setBounds(400, 250, 109, 110);
        ahead3.setVisible(true);
        ahead3.setFocusable(true);
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
