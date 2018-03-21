package mainmenuproject;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Mansion extends JPanel
{
    JFrame f;
    public JButton A, Map, leftRoom, ahead, score;
    ImageIcon backToMap = new ImageIcon("images\\mansion.png");
    ImageIcon toLeft = new ImageIcon("images\\arrow left.png");
    ImageIcon forward = new ImageIcon("images\\arrow.png");
    public Mansion(JFrame f)
    {
        System.out.println("asdfasfa");
        this.f=f;
        try
        {
            halls = ImageIO.read(new File("images\\haunted5.png"));
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
        Map = new JButton();
        Map.setOpaque(false);
        Map.setContentAreaFilled(false);
        Map.setBorderPainted(false);
        Map.setIcon(backToMap);
        
        leftRoom = new JButton();
        leftRoom.setOpaque(false);
        leftRoom.setContentAreaFilled(false);
        leftRoom.setBorderPainted(false);
        leftRoom.setIcon(toLeft);
        
        ahead = new JButton();
        ahead.setOpaque(false);
        ahead.setContentAreaFilled(false);
        ahead.setBorderPainted(false);
        ahead.setIcon(forward);
        
        score = new JButton();
        score.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        score.setOpaque(false);
        score.setContentAreaFilled(false);
        score.setBorderPainted(false);
    }
    public int percentage, percentageOther;
    public String progress, progressOther;
    BufferedImage halls;
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(halls, 0, 0, this);
        
        Map.setBounds(1, 1, 84, 67);
        Map.setVisible(true);
        Map.setFocusable(true);
        
        score.setVisible(true);
        score.setBounds(585, 20, 100, 35);
        score.setForeground(Color.WHITE);
        
        leftRoom.setBounds(160, 270, 110, 109);
        leftRoom.setVisible(true);
        leftRoom.setFocusable(true);
        
        ahead.setBounds(600, 330, 109, 110);
        ahead.setVisible(true);
        ahead.setFocusable(true);
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
