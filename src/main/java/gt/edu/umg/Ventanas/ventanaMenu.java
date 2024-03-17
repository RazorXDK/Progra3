/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gt.edu.umg.Ventanas;

import static gt.edu.umg.GrupoII.LectorArchivo.File_Reader;
import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author rober
 */
public class ventanaMenu extends javax.swing.JFrame {

    /**
     * Creates new form ventanaMenu
     */
    public ventanaMenu() {
        initComponents();
        
        Ico1.setText("");
        Ico2.setText("");
        Ico3.setText("");
        Ico4.setText("");
        Ico5.setText("");
        Ico6.setText("");
        Ico7.setText("");
        
         content.setBackground(new Color(239,244,249));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        buttonArbolesB = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Ico1 = new javax.swing.JLabel();
        buton2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Ico2 = new javax.swing.JLabel();
        buton3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Ico3 = new javax.swing.JLabel();
        buton4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Ico4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SizeX = new javax.swing.JPanel();
        SizeY = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        Info = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        InfoB = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Ico6 = new javax.swing.JLabel();
        Ico5 = new javax.swing.JLabel();
        Ico7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(239, 244, 249));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 8)); // NOI18N
        jLabel13.setText("V 1.0");
        Background.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, -1, -1));

        menu.setBackground(new java.awt.Color(250, 252, 253));

        buttonArbolesB.setBackground(new java.awt.Color(250, 252, 253));
        buttonArbolesB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonArbolesBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonArbolesBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonArbolesBMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setText("Arboles Binarios");

        Ico1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\images\\tree.png"));
        Ico1.setText("Ico1");

        javax.swing.GroupLayout buttonArbolesBLayout = new javax.swing.GroupLayout(buttonArbolesB);
        buttonArbolesB.setLayout(buttonArbolesBLayout);
        buttonArbolesBLayout.setHorizontalGroup(
            buttonArbolesBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonArbolesBLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Ico1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        buttonArbolesBLayout.setVerticalGroup(
            buttonArbolesBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonArbolesBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonArbolesBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ico1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        buton2.setBackground(new java.awt.Color(250, 252, 253));
        buton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buton2MouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setText("Opcion2 XX");

        Ico2.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\images\\123.png"));
        Ico2.setText("Ico2");

        javax.swing.GroupLayout buton2Layout = new javax.swing.GroupLayout(buton2);
        buton2.setLayout(buton2Layout);
        buton2Layout.setHorizontalGroup(
            buton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buton2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Ico2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        buton2Layout.setVerticalGroup(
            buton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buton2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ico2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap())
        );

        buton3.setBackground(new java.awt.Color(250, 252, 253));
        buton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buton3MouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel10.setText("Opcion3 YY");

        Ico3.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\images\\abc.png"));
        Ico3.setText("Ico3");
        Ico3.setToolTipText("");

        javax.swing.GroupLayout buton3Layout = new javax.swing.GroupLayout(buton3);
        buton3.setLayout(buton3Layout);
        buton3Layout.setHorizontalGroup(
            buton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buton3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Ico3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buton3Layout.setVerticalGroup(
            buton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ico3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buton3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        buton4.setBackground(new java.awt.Color(250, 252, 253));
        buton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buton4MouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel14.setText("Salir");

        Ico4.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\images\\exit.png"));
        Ico4.setText("Ico4");

        javax.swing.GroupLayout buton4Layout = new javax.swing.GroupLayout(buton4);
        buton4.setLayout(buton4Layout);
        buton4Layout.setHorizontalGroup(
            buton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buton4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Ico4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        buton4Layout.setVerticalGroup(
            buton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buton4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ico4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(buton4Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Entregable 1");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(buton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(buttonArbolesB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonArbolesB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        Background.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 250, 270));

        SizeX.setBackground(new java.awt.Color(239, 244, 249));

        javax.swing.GroupLayout SizeXLayout = new javax.swing.GroupLayout(SizeX);
        SizeX.setLayout(SizeXLayout);
        SizeXLayout.setHorizontalGroup(
            SizeXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        SizeXLayout.setVerticalGroup(
            SizeXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(SizeX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 20));

        SizeY.setBackground(new java.awt.Color(239, 244, 249));

        javax.swing.GroupLayout SizeYLayout = new javax.swing.GroupLayout(SizeY);
        SizeY.setLayout(SizeYLayout);
        SizeYLayout.setHorizontalGroup(
            SizeYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        SizeYLayout.setVerticalGroup(
            SizeYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        Background.add(SizeY, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 30, 570));

        content.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        Background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 430, 480));

        Info.setBackground(new java.awt.Color(250, 252, 253));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("Grupo 2");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setText("Programacion 3");

        InfoB.setBackground(new java.awt.Color(250, 252, 253));
        InfoB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        InfoB.setForeground(new java.awt.Color(244, 247, 249));
        InfoB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InfoBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InfoBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InfoBMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("Informacion");

        javax.swing.GroupLayout InfoBLayout = new javax.swing.GroupLayout(InfoB);
        InfoB.setLayout(InfoBLayout);
        InfoBLayout.setHorizontalGroup(
            InfoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );
        InfoBLayout.setVerticalGroup(
            InfoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        Ico6.setBackground(new java.awt.Color(153, 255, 255));
        Ico6.setForeground(new java.awt.Color(204, 204, 204));
        Ico6.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\images\\deployed.png"));
        Ico6.setText("Ico6");

        Ico5.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\images\\database.png"));
        Ico5.setText("Ico5");

        Ico7.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\images\\javascript.png"));
        Ico7.setText("Ico7");

        javax.swing.GroupLayout InfoLayout = new javax.swing.GroupLayout(Info);
        Info.setLayout(InfoLayout);
        InfoLayout.setHorizontalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(InfoLayout.createSequentialGroup()
                        .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InfoLayout.createSequentialGroup()
                                .addComponent(Ico5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ico6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ico7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(InfoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );
        InfoLayout.setVerticalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ico7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ico5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ico6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Background.add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 250, -1));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InfoBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoBMouseClicked
        Page1 pl = new Page1();
        pl.setSize(430, 480);
        pl.setLocation(0, 0);

        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

// TODO add your handling code here:
    }//GEN-LAST:event_InfoBMouseClicked

    private void InfoBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoBMouseEntered
     InfoB.setBackground(new Color(194,231,255));   // TODO add your handling code here:
    }//GEN-LAST:event_InfoBMouseEntered

    private void InfoBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoBMouseExited
       InfoB.setBackground(new Color(250,252,253));
 // TODO add your handling code here:
    }//GEN-LAST:event_InfoBMouseExited

    private void buton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton3MouseExited
        buton3.setBackground(new Color(250, 252, 253));
    }//GEN-LAST:event_buton3MouseExited

    private void buton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton3MouseEntered
        buton3.setBackground(new Color(194, 231, 255));
    }//GEN-LAST:event_buton3MouseEntered

    private void buton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton2MouseExited
        buton2.setBackground(new Color(250, 252, 253));
    }//GEN-LAST:event_buton2MouseExited

    private void buton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton2MouseEntered
        buton2.setBackground(new Color(194, 231, 255));
    }//GEN-LAST:event_buton2MouseEntered

    private void buttonArbolesBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonArbolesBMouseExited
        buttonArbolesB.setBackground(new Color(250, 252, 253));
    }//GEN-LAST:event_buttonArbolesBMouseExited

    private void buttonArbolesBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonArbolesBMouseEntered
        buttonArbolesB.setBackground(new Color(194, 231, 255));
    }//GEN-LAST:event_buttonArbolesBMouseEntered

    private void buttonArbolesBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonArbolesBMouseClicked
        ArbolBinario pl = new ArbolBinario();
        pl.setSize(430, 480);
        pl.setLocation(0, 0);

        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        
        File_Reader("C:\\Users\\LENOVO\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto\\Progra3\\src\\main\\java\\gt\\edu\\umg\\GrupoII\\PruebaLectura");

        // TODO add your handling code here:
    }//GEN-LAST:event_buttonArbolesBMouseClicked

    private void buton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton4MouseEntered
        // TODO add your handling code here:
        buton4.setBackground(new Color(194,231,255));
    }//GEN-LAST:event_buton4MouseEntered

    private void buton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton4MouseExited
        // TODO add your handling code here:
        buton4.setBackground(new Color(250,252,253));
    }//GEN-LAST:event_buton4MouseExited

    private void buton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_buton4MouseClicked

    private void buton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton2MouseClicked
        // TODO add your handling code here:
        
        Page2 pl = new Page2();
        pl.setSize(430, 480);
        pl.setLocation(0, 0);

        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_buton2MouseClicked

    private void buton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton3MouseClicked
        // TODO add your handling code here:
        Page3 pl = new Page3();
        pl.setSize(430, 480);
        pl.setLocation(0, 0);

        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_buton3MouseClicked

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
            java.util.logging.Logger.getLogger(ventanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Ico1;
    private javax.swing.JLabel Ico2;
    private javax.swing.JLabel Ico3;
    public javax.swing.JLabel Ico4;
    private javax.swing.JLabel Ico5;
    private javax.swing.JLabel Ico6;
    private javax.swing.JLabel Ico7;
    private javax.swing.JPanel Info;
    private javax.swing.JPanel InfoB;
    private javax.swing.JPanel SizeX;
    private javax.swing.JPanel SizeY;
    private javax.swing.JPanel buton2;
    private javax.swing.JPanel buton3;
    private javax.swing.JPanel buton4;
    private javax.swing.JPanel buttonArbolesB;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
