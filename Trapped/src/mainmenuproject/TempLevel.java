package mainmenuproject;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TempLevel extends JPanel
{
    public long here;
    JFrame f;
    int i=0;
    public JButton arrow, T, R, A, P1, P2, E, D, mansion, mansion2, mansion3, score, cont;
    ImageIcon Rim = new ImageIcon("images\\r.png");
    ImageIcon P1im = new ImageIcon("images\\p1.png");
    ImageIcon Eim = new ImageIcon("images\\e.png");
    ImageIcon Dim = new ImageIcon("images\\d.png");
    ImageIcon blank = new ImageIcon("images\\blank.png");
    ImageIcon door = new ImageIcon("images\\mansion.png");
    ImageIcon door2 = new ImageIcon("images\\mansion2.png");
    ImageIcon door3 = new ImageIcon("images\\mansion33.png");
    public TempLevel(JFrame f, int x, int y)
    {
        this.f=f;
        here = startTime.st.getStart();
        try
        {                
          image = ImageIO.read(new File("images\\map.png"));
          D = new JButton();
          D.setOpaque(false);
          D.setContentAreaFilled(false);
          D.setBorderPainted(false);
          D.setIcon(Dim);
          P1 = new JButton();
          P1.setOpaque(false);
          P1.setContentAreaFilled(false);
          P1.setBorderPainted(false);
          P1.setIcon(P1im);
          R = new JButton();
          R.setOpaque(false);
          R.setContentAreaFilled(false);
          R.setBorderPainted(false);
          R.setIcon(Rim);
          E = new JButton();
          E.setOpaque(false);
          E.setContentAreaFilled(false);
          E.setBorderPainted(false);
          E.setIcon(Eim);
          
          score = new JButton("0");
          score.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
          score.setOpaque(false);
          score.setContentAreaFilled(false);
          score.setBorderPainted(false);
          
          arrow = new JButton();
          arrow.setOpaque(false);
          arrow.setContentAreaFilled(false);
          arrow.setIcon(blank);
          mansion = new JButton();
          mansion.setOpaque(false);
          mansion.setContentAreaFilled(false);
          mansion.setBorderPainted(false);
          mansion.setIcon(door);
          mansion2 = new JButton();
          mansion2.setOpaque(false);
          mansion2.setContentAreaFilled(false);
          mansion2.setBorderPainted(false);
          mansion2.setIcon(door2);
          mansion3 = new JButton();
          mansion3.setOpaque(false);
          mansion3.setContentAreaFilled(false);
          mansion3.setBorderPainted(false);
          mansion3.setIcon(door3);
        }
        catch (IOException ex)
        {
            System.out.println(ex);
        }
        cont = new JButton("You have found all the letters! Click anywhere to continue.");
        cont.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        cont.setOpaque(false);
        cont.setContentAreaFilled(false);
        cont.setBorderPainted(false);
    }
    public TempLevel(JFrame f, int x, int y, int i)
    {
        here = startTime.st.getStart();
        this.f=f;
        this.i=i;
        try {
            image = ImageIO.read(new File("images\\map.png"));
        } catch (IOException ex) {
            Logger.getLogger(TempLevel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          score = new JButton("0");
          score.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
          score.setOpaque(false);
          score.setContentAreaFilled(false);
          score.setBorderPainted(false);
          
          arrow = new JButton();
          arrow.setOpaque(false);
          arrow.setContentAreaFilled(false);
          arrow.setIcon(blank);
          mansion = new JButton();
          mansion.setOpaque(false);
          mansion.setContentAreaFilled(false);
          mansion.setBorderPainted(false);
          mansion.setIcon(door);
          mansion2 = new JButton();
          mansion2.setOpaque(false);
          mansion2.setContentAreaFilled(false);
          mansion2.setBorderPainted(false);
          mansion2.setIcon(door2);
          mansion3 = new JButton();
          mansion3.setOpaque(false);
          mansion3.setContentAreaFilled(false);
          mansion3.setBorderPainted(false);
          mansion3.setIcon(door3);
          
          if(!Action.foundD)
          {
              D = new JButton();
              D.setOpaque(false);
              D.setContentAreaFilled(false);
              D.setBorderPainted(false);
              D.setIcon(Dim);
          }
          
          if(!Action.foundP)
          {
                P1 = new JButton();
                P1.setOpaque(false);
                P1.setContentAreaFilled(false);
                P1.setBorderPainted(false);
                P1.setIcon(P1im);
          }
          
          if(!Action.foundR)
          {
              R = new JButton();
            R.setOpaque(false);
            R.setContentAreaFilled(false);
            R.setBorderPainted(false);
            R.setIcon(Rim);
          }
          
          if(!Action.foundE)
          {
              E = new JButton();
            E.setOpaque(false);
            E.setContentAreaFilled(false);
            E.setBorderPainted(false);
            E.setIcon(Eim);
          }
          cont = new JButton("You have found all the letters! Click anywhere to continue.");
          cont.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
          cont.setOpaque(false);
          cont.setContentAreaFilled(false);
          cont.setBorderPainted(false);
    }
    BufferedImage image;
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
        mansion.setBounds(420, 250, 84, 67);
        mansion.setVisible(true);
        mansion.setFocusable(true);
        mansion2.setBounds(780, 260, 84, 67);
        mansion2.setVisible(true);
        mansion2.setFocusable(true);
        mansion3.setBounds(1020, 260, 84, 67);
        mansion3.setVisible(true);
        mansion3.setFocusable(true);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        score.setVisible(true);
        score.setBounds(585, 20, 100, 35);
        score.setForeground(Color.WHITE);
        cont.setBounds(0, 0, 1280, 720);
        cont.setForeground(Color.WHITE);
        
        
        arrow.setBounds(0, 0, 1280, 720);
        
        if(!Action.foundD)
        {
            D.setBounds(13, 100, 114, 126);       
            D.setVisible(true);
            D.setFocusable(true);
        }
         
        if(!Action.foundR)
        {
            R.setBounds(1080, 40, 114, 126);
            R.setVisible(true);
            R.setFocusable(true);
        }
         
        if(!Action.foundE)
        {
            E.setBounds(1050, 500, 114, 126);
            E.setVisible(true);
            E.setFocusable(true);
        }
         
        if(!Action.foundP)
        {
            P1.setBounds(300, 230, 114, 126);
            P1.setVisible(true);
            P1.setFocusable(true);
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
