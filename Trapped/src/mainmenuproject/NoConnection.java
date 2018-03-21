package mainmenuproject;
import javax.swing.*;
import java.io.*;

public class NoConnection extends javax.swing.JPanel
{
    JFrame f;    
    public NoConnection(JFrame f)
    {
        this.f=f;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();
        TryAgain = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 0, 0));

        jLabel1.setBackground(new java.awt.Color(51, 0, 0));
        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Could Not Connect");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 0)));

        Cancel.setBackground(new java.awt.Color(51, 0, 0));
        Cancel.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Cancel.setText("Cancel");
        Cancel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 0)));
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelMouseClicked(evt);
            }
        });

        TryAgain.setBackground(new java.awt.Color(51, 0, 0));
        TryAgain.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        TryAgain.setForeground(new java.awt.Color(255, 255, 255));
        TryAgain.setText("Try Again");
        TryAgain.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 0)));
        TryAgain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TryAgainMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(368, 368, 368))
            .addGroup(layout.createSequentialGroup()
                .addGap(505, 505, 505)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TryAgain)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Cancel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(TryAgain)
                .addGap(18, 18, 18)
                .addComponent(Cancel)
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TryAgainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TryAgainMouseClicked
        setVisible(false);
        Connect cnct = new Connect(f);
        f.add(cnct);
    }//GEN-LAST:event_TryAgainMouseClicked

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked
        MenuPanel panel;
        setVisible(false);
        try
        {
            panel = new MenuPanel(f, true);
            f.add(panel);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_CancelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton TryAgain;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
