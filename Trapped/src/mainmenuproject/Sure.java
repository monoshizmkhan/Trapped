package mainmenuproject;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Sure extends JPanel
{
    JFrame f;
    public Sure(JFrame f)
    {
        this.f=f;
        initComponents();
        yes.setBorderPainted(false);
        no.setBorderPainted(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yes = new javax.swing.JButton();
        no = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(255, 255, 51));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        yes.setBackground(new java.awt.Color(102, 102, 102));
        yes.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        yes.setForeground(new java.awt.Color(0, 204, 0));
        yes.setText("Yes");
        yes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        yes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yesMouseClicked(evt);
            }
        });

        no.setBackground(new java.awt.Color(102, 102, 102));
        no.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        no.setForeground(new java.awt.Color(255, 0, 0));
        no.setText("No");
        no.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noMouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 102));
        jButton3.setText("Are you sure you want to exit?");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(362, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(yes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(272, 272, 272)
                        .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(385, 385, 385))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(320, 320, 320))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(263, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseClicked
        setVisible(false);
        MenuPanel panel;
        try {
            panel = new MenuPanel(f, true);
            f.add(panel);
        } catch (IOException ex) {
            Logger.getLogger(Sure.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_noMouseClicked

    private void yesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesMouseClicked
        System.exit(0);
    }//GEN-LAST:event_yesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton no;
    private javax.swing.JButton yes;
    // End of variables declaration//GEN-END:variables
}
