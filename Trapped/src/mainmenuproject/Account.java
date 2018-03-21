package mainmenuproject;
import java.awt.Color;
import java.io.*;
import javax.swing.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Account extends JPanel
{
    public int operation;
    JFrame f;
    public Account(int operation, JFrame f)
    {
        this.f=f;
        this.operation=operation;
        initComponents();
        namePanel.setCaretColor(Color.YELLOW);
        passwordPanel.setCaretColor(Color.YELLOW);
    }
    BufferedWriter bw = null;
    FileWriter fw = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namePanel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        passwordPanel = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));

        namePanel.setBackground(new java.awt.Color(0, 51, 51));
        namePanel.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        namePanel.setForeground(new java.awt.Color(255, 255, 102));
        namePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 102)));
        namePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 102));
        jButton1.setText("Enter");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 102)));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        passwordPanel.setBackground(new java.awt.Color(0, 51, 51));
        passwordPanel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        passwordPanel.setForeground(new java.awt.Color(255, 255, 102));
        passwordPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 102)));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Username");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Password");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 102));
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 102)));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(581, 581, 581)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namePanel)
                            .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(403, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(140, 140, 140)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String name = namePanel.getText();
        String password = passwordPanel.getText();
        if(name.equals("") || password.equals(""))
        {
            setVisible(false);
            wrong wpanel = new wrong(f);
            f.add(wpanel);
            return;
        }
        int next=0;
        if(operation==1)
        {
            try
            {
                FileReader f = new FileReader("Account Details.txt");
                FileWriter fw = new FileWriter("Account Details.txt", true);
                BufferedWriter bw=new BufferedWriter(fw);
                bw.newLine();
                bw.write(name);
                bw.newLine();
                bw.write(password);
                bw.newLine();
                bw.write("####");
                bw.close();
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
            next=1;
        }
        
        else if(operation==2)
        {
            try
            {
                File f = new File("Account Details.txt");
                Scanner fsc = new Scanner(f);
                while(fsc.hasNextLine())
                {
                    String temp = fsc.nextLine();
                    if(temp.equals(name))
                    {
                        temp=fsc.nextLine();
                        if(temp.equals(password))
                        {
                            next=1;
                            break;
                        }
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("File not found");
            }
        }
        if(next==1)
        {
            setVisible(false);
            MenuPanel panel;
            try {
                panel = new MenuPanel(f, true);
                f.add(panel);
            } catch (IOException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else if(next==0)
        {
            setVisible(false);
            wrong wpanel = new wrong(f);
            f.add(wpanel);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        setVisible(false);
        NewJPanel opening = new NewJPanel(f);       
        f.add(opening);
        f.setSize(1280, 720);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField namePanel;
    private javax.swing.JPasswordField passwordPanel;
    // End of variables declaration//GEN-END:variables
}
