package mainmenuproject;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.*;
import java.io.*;
import java.awt.*;

public class afterGame extends javax.swing.JPanel
{
    JFrame f;
    String writeTime="";
    Music ee;
    long here;
    int i=0;
    public afterGame(JFrame f)
    {
        this.f=f;
        initComponents();
        long end = System.currentTimeMillis();
        int tme = (int) ((end - here)/10000);
        writeTime = Integer.toString(tme);
    }
    public afterGame(JFrame f, Music ee)
    {
        this.f=f;
        this.ee=ee;
        i=1;
        initComponents();
        long tm = System.currentTimeMillis();
        int tme = (int)(tm/100);
        writeTime = Integer.toString(tme);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        Continue = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Congratulations! You Won!");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Enter Name");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));

        NameField.setBackground(new java.awt.Color(0, 102, 102));
        NameField.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        NameField.setForeground(new java.awt.Color(255, 255, 51));
        NameField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 51)));
        NameField.setCaretColor(new java.awt.Color(255, 255, 51));

        Continue.setBackground(new java.awt.Color(0, 102, 102));
        Continue.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        Continue.setForeground(new java.awt.Color(255, 255, 51));
        Continue.setText("Continue");
        Continue.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        Continue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContinueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(577, 577, 577)
                        .addComponent(Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(416, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(345, 345, 345))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(184, 184, 184)
                .addComponent(Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinueMouseClicked
        String temp = NameField.getText();
        try
        {
                FileWriter fw = new FileWriter("Scoreboard.txt", true);
                BufferedWriter bw=new BufferedWriter(fw);
                //bw.newLine();
                bw.write(temp);
                bw.newLine();
                bw.write("####");
                bw.newLine();
                bw.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        setVisible(false);
        Scores scs;
        if(i==1)scs = new Scores(f, ee);
        else
            scs = new Scores(f);
        f.add(scs);
        Action.hasEnded=false;
    }//GEN-LAST:event_ContinueMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continue;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
