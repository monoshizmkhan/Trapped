package mainmenuproject;

import javax.swing.*;

public class wrong extends javax.swing.JPanel
{
    JFrame f;
    public wrong(JFrame f)
    {
        this.f=f;
        initComponents();
        wrongMessage.setBounds(500, 600, 100, 200);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wrongMessage = new javax.swing.JLabel();
        tryAgain = new javax.swing.JLabel();
        OK = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 0, 0));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        wrongMessage.setBackground(new java.awt.Color(153, 0, 0));
        wrongMessage.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        wrongMessage.setForeground(new java.awt.Color(255, 255, 102));
        wrongMessage.setText("WRONG USERNAME/PASSWORD!!!");

        tryAgain.setBackground(new java.awt.Color(153, 0, 0));
        tryAgain.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        tryAgain.setForeground(new java.awt.Color(255, 255, 102));
        tryAgain.setText("PLEASE TRY AGAIN");

        OK.setBackground(new java.awt.Color(153, 0, 0));
        OK.setFont(new java.awt.Font("Viner Hand ITC", 0, 28)); // NOI18N
        OK.setForeground(new java.awt.Color(255, 255, 102));
        OK.setText("OK");
        OK.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 102)));
        OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(332, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(wrongMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tryAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(431, 431, 431))))
            .addGroup(layout.createSequentialGroup()
                .addGap(579, 579, 579)
                .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(wrongMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tryAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseClicked
        setVisible(false);
        Account panel = new Account(2, f);
        f.add(panel);
    }//GEN-LAST:event_OKMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JLabel tryAgain;
    private javax.swing.JLabel wrongMessage;
    // End of variables declaration//GEN-END:variables
}
