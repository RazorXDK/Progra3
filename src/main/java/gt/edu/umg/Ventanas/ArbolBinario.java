/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gt.edu.umg.Ventanas;

import CRUD.Actualizar;
import CRUD.Crear;
import CRUD.Eliminar;
import Database.CrearBd;
import static Database.CrearBd.crearBaseDeDatos;
import gt.edu.umg.arbolBB.SimuladorArbolBinario;
import gt.edu.umg.arbolBB.Vistaa;
import gt.edu.umg.db.Arbol;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author rober
 */
public class ArbolBinario extends javax.swing.JPanel {

    /**
     * Creates new form Page1
     */
    private SimuladorArbolBinario simulador = new SimuladorArbolBinario();
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("gt.edu.umg_Ventanas_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();

    public ArbolBinario() {
        initComponents();

        Panel.setBackground(new Color(250, 252, 253));
        //crearArbol(0);

    }

    private void inicializar(boolean enable) {
        this.InOrden.setEnabled(enable);
        this.PostOrden.setEnabled(enable);
        this.PreOrden.setEnabled(enable);
    }

    public void complementos() {
        this.repintarArbol();
    }

    private void repintarArbol() {
        this.jDesktopPane1.removeAll();
        Rectangle tamaño = this.jInternalFrame2.getBounds();
        this.jInternalFrame2 = null;
        this.jInternalFrame2 = new JInternalFrame("Representación gráfica", true);
        this.jDesktopPane1.add(this.jInternalFrame2, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame2.setVisible(true);
        this.jInternalFrame2.setBounds(tamaño);
        this.jInternalFrame2.setEnabled(false);
        this.jInternalFrame2.add(this.simulador.getDibujo(), BorderLayout.CENTER);
    }

    private void crearArbol(int i) {
        try {

            if (this.simulador.insertar(i)) {
                //JOptionPane.showMessageDialog(null, "El dato fue insertado correctamente", " ...", 1);
                this.inicializar(true);

                complementos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo insertar el dato", "Intenta de nuevo...", 0);

        }
    }

    public void File_Reader(String ruta, JLabel Texto) {
        try {
            File archivo = new File(ruta);
            FileReader lector = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(lector);
            StringBuilder mensajeCompleto = new StringBuilder(); // Construir el mensaje completo
            String linea;
            boolean esValido = true; // Bandera para indicar si el archivo es válido

            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
                // Validar la línea actual
                if (!validarLinea(linea)) {
                    esValido = false;
                    break; // Si la línea no es válida, salir del bucle
                }
                // Eliminar comas y enviar cada dato válido al método crearArbol
                String[] datos = linea.split(","); // Separar los datos por comas
                for (String dato : datos) {
                    dato = dato.trim(); // Eliminar espacios en blanco al inicio y al final
                    if (!dato.isEmpty()) { // Verificar que el dato no esté vacío

                        int a = Integer.parseInt(dato);
                        //crearArbol(a); // Convertir el dato a entero y enviarlo al método crearArbol

                        Crear cre = new Crear(em, emf);
                        cre.crearTipoArbol("Arbol Binario");

                    }
                }
                mensajeCompleto.append(linea).append("\n"); // Agregar cada línea al mensaje completo
            }
            buffer.close();

            if (esValido) {
                // Configurar el texto en el componente Texto
                Texto.setText(mensajeCompleto.toString());
                JOptionPane.showMessageDialog(null, "Archivo cargado a Base de Datos");
            } else {
                // Mostrar mensaje de error
                Texto.setText("El formato del archivo debe contener solo números y comas.");
                JOptionPane.showMessageDialog(null, "El formato del archivo debe contener solo números y comas.");
            }
        } catch (Exception e) {
            System.out.println("Error al cargar el archivo: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo: " + e.getMessage());
        }
    }

    private boolean validarLinea(String linea) {
        // Utilizar una expresión regular para validar que la línea contiene solo números y comas

        return linea.matches("[0-9,]+")
                && !linea.startsWith(",")
                && !linea.endsWith(",")
                && !linea.contains(",,");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        Buton3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        Ico1 = new javax.swing.JLabel();
        Ico3 = new javax.swing.JLabel();
        Ico4 = new javax.swing.JLabel();
        Ico5 = new javax.swing.JLabel();
        Buton = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        InOrden = new javax.swing.JButton();
        PostOrden = new javax.swing.JButton();
        PreOrden = new javax.swing.JButton();
        Texto = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setBackground(new java.awt.Color(250, 252, 253));
        setToolTipText("");
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setBackground(new java.awt.Color(51, 51, 255));

        Buton3.setBackground(new java.awt.Color(250, 252, 253));
        Buton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Buton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Buton3MouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Cargar archivos a BD");

        javax.swing.GroupLayout Buton3Layout = new javax.swing.GroupLayout(Buton3);
        Buton3.setLayout(Buton3Layout);
        Buton3Layout.setHorizontalGroup(
            Buton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Buton3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        Buton3Layout.setVerticalGroup(
            Buton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Buton3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        Panel.setPreferredSize(new java.awt.Dimension(356, 445));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Arboles Binarios");

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setEnabled(false);

        jInternalFrame2.setBorder(null);
        jInternalFrame2.setEnabled(false);
        jInternalFrame2.setFocusCycleRoot(false);
        jInternalFrame2.setFocusable(false);
        jInternalFrame2.setRequestFocusEnabled(false);
        jInternalFrame2.setVerifyInputWhenFocusTarget(false);
        jInternalFrame2.setVisible(false);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        jDesktopPane1.add(jInternalFrame2);
        jInternalFrame2.setBounds(10, 20, 620, 340);

        Ico1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cloud.png"))); // NOI18N
        Ico1.setText("Cargar a DB");
        Ico1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ico1MouseClicked(evt);
            }
        });

        Ico3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nodo.png"))); // NOI18N
        Ico3.setText("Generar Arbol");
        Ico3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ico3MouseClicked(evt);
            }
        });

        Ico4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/print.png"))); // NOI18N
        Ico4.setText("Imprimir Arbol");
        Ico4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ico4MouseClicked(evt);
            }
        });

        Ico5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset.png"))); // NOI18N
        Ico5.setText("Eliminar arbol");
        Ico5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ico5MouseClicked(evt);
            }
        });

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

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setText("Cerrar");

        javax.swing.GroupLayout ButonLayout = new javax.swing.GroupLayout(Buton);
        Buton.setLayout(ButonLayout);
        ButonLayout.setHorizontalGroup(
            ButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButonLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );
        ButonLayout.setVerticalGroup(
            ButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ico4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Ico1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ico3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Ico5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Buton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(Buton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ico3)
                            .addComponent(Ico1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ico4)
                            .addComponent(Ico5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Buton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(Buton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 480));

        InOrden.setText("jButton1");
        add(InOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 20, 30, -1));

        PostOrden.setText("jButton2");
        add(PostOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 20, -1));

        PreOrden.setText("jButton3");
        add(PreOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 20, -1));

        Texto.setText("RutaArchivo");
        Texto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        add(Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 90, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void ButonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButonMouseClicked
        // TODO add your handling code here:
        content.setBackground(new Color(239, 244, 249));
        content.removeAll();

        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_ButonMouseClicked

    private void ButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButonMouseEntered
        // TODO add your handling code here:
        Buton.setBackground(new Color(194, 231, 255));
    }//GEN-LAST:event_ButonMouseEntered

    private void ButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButonMouseExited
        // TODO add your handling code here:
        Buton.setBackground(new Color(250, 252, 253));
    }//GEN-LAST:event_ButonMouseExited

    private void Buton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buton3MouseEntered
        // TODO add your handling code here:
        Buton3.setBackground(new Color(194, 231, 255));
    }//GEN-LAST:event_Buton3MouseEntered

    private void Buton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buton3MouseExited
        // TODO add your handling code here:
        Buton3.setBackground(new Color(250, 252, 253));
    }//GEN-LAST:event_Buton3MouseExited

    private void Ico1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ico1MouseClicked
        // TODO add your handling code here:

        String rutaArchivo = "";
        simulador.vaciarA();
        complementos();

        // Crear un nuevo JFrame para el JFileChooser
        JFrame explorador = new JFrame();
        explorador.setVisible(false);
        explorador.setSize(500, 500);

        // Crear un JFileChooser
        JFileChooser fileChooser = new JFileChooser();

        // Mostrar el diálogo para seleccionar archivos
        int seleccion = fileChooser.showOpenDialog(explorador);

        // Verificar si el usuario seleccionó un archivo
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            CrearBd crearBd = new CrearBd();
            crearBd.crearBaseDeDatos();
            // Obtener el archivo seleccionado
            File selectedFile = fileChooser.getSelectedFile();

            // Obtener la ruta absoluta del archivo y reemplazar las barras inclinadas con dobles barras inclinadas
            rutaArchivo = selectedFile.getAbsolutePath();

            // Mostrar la dirección del archivo seleccionado en la consola
            System.out.println("Dirección del archivo seleccionado: " + rutaArchivo);

            // Llamar al método File_Reader con la ruta del archivo y el componente Texto
            Texto.setText(rutaArchivo);
        } else if (seleccion == JFileChooser.CANCEL_OPTION) {
            // El usuario canceló la operación
            System.out.println("Operación cancelada");
        }
        File_Reader(rutaArchivo, Texto);
        // Cerrar el JFrame del JFileChooser
        explorador.dispose();
    }//GEN-LAST:event_Ico1MouseClicked

    private void Ico3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ico3MouseClicked
        // TODO add your handling code here:
        complementos();
        simulador.vaciarA();
        Actualizar actu = new Actualizar(em, emf);
        actu.actualizarTodosLosArboles();


    }//GEN-LAST:event_Ico3MouseClicked

    private void Ico5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ico5MouseClicked
        // TODO add your handling code here:
        complementos();
        simulador.vaciarA();
        Eliminar eli = new Eliminar(em, emf);
        eli.borrarTodosLosArboles();

    }//GEN-LAST:event_Ico5MouseClicked

    private void Ico4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ico4MouseClicked
        // TODO add your handling code here:
        simulador.vaciarA();
        complementos();
        try {
            em.getTransaction().begin();

            Query query = em.createQuery("SELECT a FROM Arbol a WHERE a.estado = 1");
            List<Arbol> arboles = query.getResultList();

            if (!arboles.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Arbol Binario");
                for (Arbol arbol : arboles) {
                    crearArbol(arbol.getDato()); // Suponiendo que crearArbol toma como argumento el Dato del árbol
                }
            } else {
                System.out.println("No hay árboles con estado igual a 1 en la base de datos.");
                JOptionPane.showMessageDialog(null, "No hay árboles con estado igual a 1 en la base de datos.");
            }

            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("Ha ocurrido una excepción: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepción: " + e.getMessage());
        } finally {
            //em.close(); // Esto depende de cómo estés gestionando tus EntityManagers
            //emf.close();
        }
    }//GEN-LAST:event_Ico4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Buton;
    private javax.swing.JPanel Buton3;
    private javax.swing.JLabel Ico1;
    private javax.swing.JLabel Ico3;
    private javax.swing.JLabel Ico4;
    private javax.swing.JLabel Ico5;
    private javax.swing.JButton InOrden;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton PostOrden;
    private javax.swing.JButton PreOrden;
    private javax.swing.JLabel Texto;
    private javax.swing.JPanel content;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
