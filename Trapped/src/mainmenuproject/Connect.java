package mainmenuproject;
import javax.swing.*;

import java.io.IOException;

public class Connect extends javax.swing.JPanel
{
    JFrame f;
    public Connect(JFrame f)
    {
        this.f=f;
        initComponents();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IP = new javax.swing.JLabel();
        PORT = new javax.swing.JLabel();
        IPText = new javax.swing.JTextField();
        PortText = new javax.swing.JTextField();
        Continue = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 0, 51));

        IP.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        IP.setForeground(new java.awt.Color(255, 255, 102));
        IP.setText("IP Address");
        IP.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 51)));

        PORT.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        PORT.setForeground(new java.awt.Color(255, 255, 102));
        PORT.setText("Port Number");
        PORT.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 51)));

        IPText.setBackground(new java.awt.Color(51, 0, 51));
        IPText.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        IPText.setForeground(new java.awt.Color(255, 255, 102));
        IPText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 102)));
        IPText.setCaretColor(new java.awt.Color(255, 255, 51));

        PortText.setBackground(new java.awt.Color(51, 0, 51));
        PortText.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        PortText.setForeground(new java.awt.Color(255, 255, 102));
        PortText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 102)));
        PortText.setCaretColor(new java.awt.Color(255, 255, 51));

        Continue.setBackground(new java.awt.Color(51, 0, 51));
        Continue.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        Continue.setForeground(new java.awt.Color(255, 255, 102));
        Continue.setText("Continue");
        Continue.setToolTipText("");
        Continue.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 51)));
        Continue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContinueMouseClicked(evt);
            }
        });

        Back.setBackground(new java.awt.Color(51, 0, 51));
        Back.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 102));
        Back.setText("Back");
        Back.setToolTipText("");
        Back.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 51)));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PORT)
                            .addComponent(IP))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IPText, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PortText, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(574, 574, 574)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(282, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(524, 524, 524))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IP)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(IPText, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PORT)
                    .addComponent(PortText, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
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
    }//GEN-LAST:event_BackMouseClicked

    private void ContinueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinueMouseClicked
        String IP = IPText.getText();
        String portString = PortText.getText();
        int port = Integer.parseInt(portString);
        setVisible(false);
//        if(IP.equals("") || portString.equals(""))
//        {
//            setVisible(false);
//            NoConnection nc = new NoConnection(f);
//            f.add(nc);
//            return;
//        }
        NetThread nt = new NetThread(f, IP, port, new Action(f));
        nt.start();
//        if(NetThread.isWrong==0)
//        {
//            setVisible(false);
//            NoConnection nc = new NoConnection(f);
//            f.add(nc);
//        }
    }//GEN-LAST:event_ContinueMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Continue;
    private javax.swing.JLabel IP;
    private javax.swing.JTextField IPText;
    private javax.swing.JLabel PORT;
    private javax.swing.JTextField PortText;
    // End of variables declaration//GEN-END:variables
}
