package mainmenuproject;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MenuPanel extends JPanel
{
    JFrame f;
    BufferedImage temp = ImageIO.read(new File("images\\island 7.png"));
    boolean isClicked;
    Music menuMusic;
    public MenuPanel(JFrame f, boolean isClicked) throws IOException
    {
        this.isClicked=isClicked;
        this.f=f;
        menuMusic = new Music("audios\\dd.wav", "run");
        initComponents();
        menuMusic.start();
        Title.setOpaque(false);
        SinglePlayer.setOpaque(false);
        SinglePlayer.setContentAreaFilled(false);
        SinglePlayer.setBorderPainted(false);
        Multiplayer.setOpaque(false);
        Multiplayer.setContentAreaFilled(false);
        Multiplayer.setBorderPainted(false);
        Instructions.setOpaque(false);
        Instructions.setContentAreaFilled(false);
        Instructions.setBorderPainted(false);
        Credits.setOpaque(false);
        Credits.setContentAreaFilled(false);
        Credits.setBorderPainted(false);
        SignOut.setOpaque(false);
        SignOut.setContentAreaFilled(false);
        SignOut.setBorderPainted(false);
        ExitGame.setOpaque(false);
        ExitGame.setContentAreaFilled(false);
        ExitGame.setBorderPainted(false);
        Scoreboards.setOpaque(false);
        Scoreboards.setContentAreaFilled(false);
        Scoreboards.setBorderPainted(false);
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

        Instructions = new javax.swing.JButton();
        Credits = new javax.swing.JButton();
        SignOut = new javax.swing.JButton();
        ExitGame = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        SinglePlayer = new javax.swing.JButton();
        Scoreboards = new javax.swing.JButton();
        Multiplayer = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        Instructions.setBackground(new java.awt.Color(51, 51, 51));
        Instructions.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        Instructions.setForeground(new java.awt.Color(255, 255, 102));
        Instructions.setText("Instructions");
        Instructions.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        Instructions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InstructionsMouseClicked(evt);
            }
        });

        Credits.setBackground(new java.awt.Color(51, 51, 51));
        Credits.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        Credits.setForeground(new java.awt.Color(255, 255, 102));
        Credits.setText("Credits");
        Credits.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        Credits.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreditsMouseClicked(evt);
            }
        });

        SignOut.setBackground(new java.awt.Color(51, 51, 51));
        SignOut.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        SignOut.setForeground(new java.awt.Color(255, 255, 102));
        SignOut.setText("Sign Out");
        SignOut.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        SignOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignOutMouseClicked(evt);
            }
        });

        ExitGame.setBackground(new java.awt.Color(51, 51, 51));
        ExitGame.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        ExitGame.setForeground(new java.awt.Color(255, 255, 102));
        ExitGame.setText("Exit Game");
        ExitGame.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        ExitGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitGameMouseClicked(evt);
            }
        });

        Title.setBackground(new java.awt.Color(51, 51, 51));
        Title.setFont(new java.awt.Font("Viner Hand ITC", 0, 64)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 102));
        Title.setText("TRAPPED");

        SinglePlayer.setBackground(new java.awt.Color(51, 51, 51));
        SinglePlayer.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        SinglePlayer.setForeground(new java.awt.Color(255, 255, 102));
        SinglePlayer.setText("Single Player");
        SinglePlayer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        SinglePlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SinglePlayerMouseClicked(evt);
            }
        });

        Scoreboards.setBackground(new java.awt.Color(51, 51, 51));
        Scoreboards.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        Scoreboards.setForeground(new java.awt.Color(255, 255, 102));
        Scoreboards.setText("Scoreboards");
        Scoreboards.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        Scoreboards.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScoreboardsMouseClicked(evt);
            }
        });

        Multiplayer.setBackground(new java.awt.Color(51, 51, 51));
        Multiplayer.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        Multiplayer.setForeground(new java.awt.Color(255, 255, 102));
        Multiplayer.setText("Multiplayer");
        Multiplayer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        Multiplayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MultiplayerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Credits, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Scoreboards, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28))
                                    .addComponent(SignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ExitGame, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Instructions, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(Multiplayer))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addComponent(Title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addComponent(SinglePlayer)))
                .addContainerGap(477, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Title)
                .addGap(26, 26, 26)
                .addComponent(SinglePlayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Multiplayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Instructions, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Credits, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Scoreboards, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExitGame, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ExitGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitGameMouseClicked
        setVisible(false);
        Sure panel = new Sure(f);
        f.add(panel);
        menuMusic.closeSong();
//        menuMusic = new Music("audios\\menu.wav", "stop");
//        menuMusic=null;
    }//GEN-LAST:event_ExitGameMouseClicked

    private void SignOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignOutMouseClicked
        setVisible(false);
        NewJPanel opening = new NewJPanel(f);
        f.add(opening);
        menuMusic.closeSong();
    }//GEN-LAST:event_SignOutMouseClicked

    private void CreditsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreditsMouseClicked
        setVisible(false);
        Credit cs = new Credit(f);
        menuMusic.closeSong();
    }//GEN-LAST:event_CreditsMouseClicked

    private void InstructionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InstructionsMouseClicked
        setVisible(false);
        Instructions instructions = new Instructions(f);
        f.add(instructions);
        menuMusic.closeSong();
    }//GEN-LAST:event_InstructionsMouseClicked

    private void SinglePlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SinglePlayerMouseClicked
        setVisible(false);
        Action acc = new Action(f);
        menuMusic.closeSong();
    }//GEN-LAST:event_SinglePlayerMouseClicked

    private void ScoreboardsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScoreboardsMouseClicked
        setVisible(false);
        Scores scs = new Scores(f);
        f.add(scs);
        menuMusic.closeSong();
    }//GEN-LAST:event_ScoreboardsMouseClicked

    private void MultiplayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MultiplayerMouseClicked
        setVisible(false);
        Connect cnct = new Connect(f);
        f.add(cnct);
        menuMusic.closeSong();
    }//GEN-LAST:event_MultiplayerMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Credits;
    javax.swing.JButton ExitGame;
    private javax.swing.JButton Instructions;
    private javax.swing.JButton Multiplayer;
    private javax.swing.JButton Scoreboards;
    private javax.swing.JButton SignOut;
    private javax.swing.JButton SinglePlayer;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
