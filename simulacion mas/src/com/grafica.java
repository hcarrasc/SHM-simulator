
package com;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author hcarrasc
 */
public class grafica extends javax.swing.JFrame {

    public grafica() {
        
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        lienzo = new java.awt.Canvas();
        titulo = new javax.swing.JLabel();
        hilo = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ResAs = new javax.swing.JLabel();
        ResPos = new javax.swing.JLabel();
        ResVel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoOmega = new javax.swing.JTextField();
        campoAmplitud = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulacion M.A.S. Hector Carrasco");

        lienzo.setBounds(20, 250, 390, 300);
        jLayeredPane1.add(lienzo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        titulo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo.setText("Simulación del Movimiento Armónico Simple:        x = A*cos(wt+@)");
        titulo.setBounds(50, 10, 560, 30);
        jLayeredPane1.add(titulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        hilo.setBackground(new java.awt.Color(41, 0, 255));
        hilo.setForeground(new java.awt.Color(0, 11, 255));
        hilo.setOrientation(javax.swing.SwingConstants.VERTICAL);
        hilo.setToolTipText("cable ");
        hilo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(1, 0, 255), null));
        hilo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hilo.setOpaque(true);
        hilo.setBounds(170, 50, 10, 190);
        jLayeredPane1.add(hilo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setText("Omega");
        jLabel1.setBounds(340, 200, 100, 20);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Posición:");
        jLabel2.setBounds(340, 80, 100, 20);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Tiempo (wt)");
        jLabel3.setBounds(180, 550, 100, 20);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Detener Simulación");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(440, 410, 180, 29);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(1, 144, 16));
        jButton2.setText("Iniciar Simulación");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(440, 380, 180, 29);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ResAs.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        ResAs.setBounds(420, 140, 170, 20);
        jLayeredPane1.add(ResAs, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ResPos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        ResPos.setBounds(420, 80, 170, 20);
        jLayeredPane1.add(ResPos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ResVel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        ResVel.setBounds(410, 110, 170, 20);
        jLayeredPane1.add(ResVel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Asceleración:");
        jLabel4.setBounds(340, 140, 100, 20);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Amplitud");
        jLabel5.setBounds(340, 170, 70, 20);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        campoOmega.setText("1");
        campoOmega.setBounds(420, 200, 130, 25);
        jLayeredPane1.add(campoOmega, javax.swing.JLayeredPane.DEFAULT_LAYER);

        campoAmplitud.setText("100");
        campoAmplitud.setBounds(420, 170, 130, 25);
        jLayeredPane1.add(campoAmplitud, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/colores.png"))); // NOI18N
        jLabel6.setBounds(580, 80, 90, 70);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Velocidad:");
        jLabel7.setBounds(340, 110, 100, 20);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        simulacion sim = new simulacion();
        int amplitud = Integer.parseInt(campoAmplitud.getText());
        int omega = Integer.parseInt(campoOmega.getText());
        sim.animacion(this.hilo, this.ResPos, this.ResVel, this.ResAs, this.lienzo, amplitud, omega);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        simulacion sim = new simulacion();
        sim.detener();
        ResPos.setText("0");
        ResAs.setText("0");
        ResVel.setText("0");    
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        try {
                JFrame.setDefaultLookAndFeelDecorated(true);
                JDialog.setDefaultLookAndFeelDecorated(true);
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }   catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {}

        java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
                new grafica().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ResAs;
    private javax.swing.JLabel ResPos;
    private javax.swing.JLabel ResVel;
    private javax.swing.JTextField campoAmplitud;
    private javax.swing.JTextField campoOmega;
    private javax.swing.JSeparator hilo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private java.awt.Canvas lienzo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
