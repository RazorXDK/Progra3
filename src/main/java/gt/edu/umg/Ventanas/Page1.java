/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gt.edu.umg.Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author rober
 */
public class Page1 extends javax.swing.JPanel {

    /**
     * Creates new form Page1
     */
    public Page1() {
        initComponents();
        Panel.setBackground(new Color(250, 252, 253));
        Ico1.setText("");
        Ico2.setText("");
        Ico3.setText("");
        Ico4.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Ico1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Ico2 = new javax.swing.JLabel();
        Ico3 = new javax.swing.JLabel();
        Ico4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Buton = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 252, 253));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setBackground(new java.awt.Color(250, 252, 253));

        Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Integrantes");

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel15.setText("Lectura de archivo FileReader");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("Emily Hernandez Morales ");

        Ico1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\images\\guide.png"));
        Ico1.setText("Ico1");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setText("Mario Roberto Grajeda");
        jLabel3.setToolTipText("");

        Ico2.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\images\\database.png"));
        Ico2.setText("Ico2");

        Ico3.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\images\\terminal.png"));
        Ico3.setText("Ico3");

        Ico4.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\images\\code.png"));
        Ico4.setText("Ico4");

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setText("Repositorio Git");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("ORM Jpa controller");

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel10.setText("Conexion a BD");

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel11.setText("Gerson Herrera");

        jLabel12.setText("Diseño de interfaz JPanel");

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel13.setText("Brayan Mollinedo");

        jLabel14.setText("jLabel14");

        Buton.setBackground(new java.awt.Color(250, 252, 253));
        Buton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Buton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButonMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setText("Cerrar");

        javax.swing.GroupLayout ButonLayout = new javax.swing.GroupLayout(Buton);
        Buton.setLayout(ButonLayout);
        ButonLayout.setHorizontalGroup(
            ButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButonLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );
        ButonLayout.setVerticalGroup(
            ButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Buton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(Ico4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(Ico3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(Ico2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(Ico1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))))
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel12))
                    .addComponent(Ico1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Ico2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(Ico3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ico4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(23, 23, 23)
                .addComponent(Buton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void ButonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButonMouseClicked
        // TODO add your handling code here:
       content.setBackground(new Color(239,244,249));
        content.removeAll();
       
        content.revalidate();
        content.repaint();

    }//GEN-LAST:event_ButonMouseClicked

    private void ButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButonMouseEntered
        // TODO add your handling code here:
        Buton.setBackground(new Color(194,231,255));
    }//GEN-LAST:event_ButonMouseEntered

    private void ButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButonMouseExited
        // TODO add your handling code here:
        Buton.setBackground(new Color(250,252,253));
    }//GEN-LAST:event_ButonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Buton;
    private javax.swing.JLabel Ico1;
    private javax.swing.JLabel Ico2;
    private javax.swing.JLabel Ico3;
    private javax.swing.JLabel Ico4;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
