/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import javax.swing.*;

/**
 *
 * @author jhnyx
 */
public class Start extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    public Start() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoPanel = new javax.swing.JPanel();
        devLabel = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        titleLabel1 = new javax.swing.JLabel();
        titleLabel2 = new javax.swing.JLabel();
        gifPanel = new javax.swing.JPanel();
        gifLabel = new javax.swing.JLabel();
        loadingPanel = new javax.swing.JPanel();
        pBar = new javax.swing.JProgressBar();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoPanel.setOpaque(false);

        devLabel.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
        devLabel.setText("© John Onyx Abcede");
        devLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(devLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(devLabel)
                .addContainerGap())
        );

        getContentPane().add(infoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 650, 250, 50));

        titlePanel.setMaximumSize(new java.awt.Dimension(0, 0));
        titlePanel.setMinimumSize(new java.awt.Dimension(0, 0));
        titlePanel.setOpaque(false);
        titlePanel.setPreferredSize(new java.awt.Dimension(600, 200));

        titleLabel1.setFont(new java.awt.Font("Russo One", 1, 48)); // NOI18N
        titleLabel1.setForeground(new java.awt.Color(255, 102, 102));
        titleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel1.setText("MENU DRIVEN PROGRAM");
        titleLabel1.setMaximumSize(new java.awt.Dimension(0, 0));
        titleLabel1.setMinimumSize(new java.awt.Dimension(0, 0));
        titlePanel.add(titleLabel1);

        titleLabel2.setFont(new java.awt.Font("Russo One", 2, 36)); // NOI18N
        titleLabel2.setForeground(new java.awt.Color(204, 204, 204));
        titleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel2.setText("DATA STRUCTURES");
        titleLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        titleLabel2.setMaximumSize(new java.awt.Dimension(0, 0));
        titleLabel2.setMinimumSize(new java.awt.Dimension(0, 0));
        titleLabel2.setPreferredSize(new java.awt.Dimension(400, 50));
        titlePanel.add(titleLabel2);

        getContentPane().add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 650, 120));

        gifPanel.setMaximumSize(new java.awt.Dimension(0, 0));
        gifPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        gifPanel.setOpaque(false);
        gifPanel.setPreferredSize(new java.awt.Dimension(600, 200));

        gifLabel.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
        gifLabel.setForeground(new java.awt.Color(255, 255, 255));
        gifLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gifLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/animations/loading_gif.gif"))); // NOI18N
        gifLabel.setText("LOADING...");
        gifLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gifLabel.setMaximumSize(new java.awt.Dimension(0, 0));
        gifLabel.setMinimumSize(new java.awt.Dimension(0, 0));
        gifLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gifPanel.add(gifLabel);

        getContentPane().add(gifPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 520, 340));

        loadingPanel.setOpaque(false);

        pBar.setBackground(new java.awt.Color(255, 255, 255));
        pBar.setFont(new java.awt.Font("Russo One", 0, 10)); // NOI18N
        pBar.setForeground(new java.awt.Color(0, 0, 0));
        pBar.setBorder(null);
        pBar.setBorderPainted(false);
        pBar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        pBar.setPreferredSize(new java.awt.Dimension(150, 10));
        pBar.setStringPainted(true);

        javax.swing.GroupLayout loadingPanelLayout = new javax.swing.GroupLayout(loadingPanel);
        loadingPanel.setLayout(loadingPanelLayout);
        loadingPanelLayout.setHorizontalGroup(
            loadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1285, Short.MAX_VALUE)
        );
        loadingPanelLayout.setVerticalGroup(
            loadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadingPanelLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(pBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(loadingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1280, 50));

        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backgrounds/java_dark_background.png"))); // NOI18N
        bgImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Start ps = new Start();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ps.setVisible(true);
            }
        });

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(30);
                ps.pBar.setValue(i);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        Home hm = new Home();
        hm.setVisible(true);

        ps.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JLabel devLabel;
    private javax.swing.JLabel gifLabel;
    private javax.swing.JPanel gifPanel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JPanel loadingPanel;
    private javax.swing.JProgressBar pBar;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JLabel titleLabel2;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}