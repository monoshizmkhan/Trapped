package mainmenuproject;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
public class Instructions extends javax.swing.JPanel
{
    JFrame f;
    BufferedImage temp;
    public Instructions(JFrame f)
    {
        this.f=f;
        initComponents();
        try
        {
            temp = ImageIO.read(new File("images\\instructions.png"));
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(temp, 0, 0, this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 0, 0));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jButton1.setBackground(new java.awt.Color(51, 0, 0));
        jButton1.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 214, 0));
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 0)));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(565, 565, 565)
                .addComponent(jButton1)
                .addContainerGap(622, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(605, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try
        {
            setVisible(false);
            MenuPanel mp = new MenuPanel(f, true);
            f.add(mp);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
