package mainmenuproject;
import javax.swing.JFrame;

public class NewJPanel extends javax.swing.JPanel
{
    JFrame f;
    public NewJPanel(JFrame f)
    {
        this.f=f;
        initComponents();
    }
    public int operation;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createAccount = new javax.swing.JButton();
        signIn = new javax.swing.JButton();
        ExitGame = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        createAccount.setBackground(new java.awt.Color(0, 51, 51));
        createAccount.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        createAccount.setForeground(new java.awt.Color(255, 255, 102));
        createAccount.setText("Create New Account");
        createAccount.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));
        createAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountMouseClicked(evt);
            }
        });

        signIn.setBackground(new java.awt.Color(0, 51, 51));
        signIn.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        signIn.setForeground(new java.awt.Color(255, 255, 102));
        signIn.setText("Sign In");
        signIn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));
        signIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInMouseClicked(evt);
            }
        });
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });

        ExitGame.setBackground(new java.awt.Color(0, 51, 51));
        ExitGame.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        ExitGame.setForeground(new java.awt.Color(255, 255, 102));
        ExitGame.setText("Exit Game");
        ExitGame.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));
        ExitGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitGameMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(454, 454, 454)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createAccount)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExitGame)
                            .addComponent(signIn))))
                .addContainerGap(485, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(createAccount)
                .addGap(37, 37, 37)
                .addComponent(signIn)
                .addGap(184, 184, 184)
                .addComponent(ExitGame)
                .addContainerGap(149, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signInActionPerformed

    private void createAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountMouseClicked
        setVisible(false);
        Account acc = new Account(1, f);
        f.add(acc);
        operation=1;
    }//GEN-LAST:event_createAccountMouseClicked

    private void signInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInMouseClicked
        setVisible(false);
        Account acc = new Account(2, f);
        f.add(acc);
        operation=2;
    }//GEN-LAST:event_signInMouseClicked

    private void ExitGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitGameMouseClicked
        setVisible(false);
        Sure sure = new Sure(f);
        f.add(sure);
    }//GEN-LAST:event_ExitGameMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitGame;
    public javax.swing.JButton createAccount;
    public javax.swing.JButton signIn;
    // End of variables declaration//GEN-END:variables
}
