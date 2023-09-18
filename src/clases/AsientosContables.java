package clases;

import java.awt.*;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author Matias
 *
 * 7) Formulario de alta de asientos de gastos pagados en efectivo. Se requiere
 * datos de nombre cuenta de gasto, valor y fecha. Al presionar el boton debe
 * mostrarse en una Label. El formato del asiento es: fecha gasto	debe	haber
 * nombreCuentaDeGasto x	0 a Caja	0 x
 *
 */
public class AsientosContables extends javax.swing.JFrame {

    private int x, y, anioActual;
    private DefaultTableModel modelo;
    private JFormattedTextField tf1, tf2, tf3;

    public AsientosContables() {
        initComponents();
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
            java.util.logging.Logger.getLogger(AsientosContables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsientosContables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsientosContables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsientosContables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        setLocationRelativeTo(null);
        Cerrar.setOpaque(true);
        Minimizar.setOpaque(true);
        anioActual = new Date().getYear() + 1900;

        tf1 = ((JSpinner.DefaultEditor) jSpinner1.getEditor()).getTextField();
        tf1.setEditable(false);
        tf2 = ((JSpinner.DefaultEditor) jSpinner2.getEditor()).getTextField();
        tf2.setEditable(false);
        tf3 = ((JSpinner.DefaultEditor) jSpinner3.getEditor()).getTextField();
        tf3.setEditable(false);

        jSpinner1.setValue(new Date().getDate());
        jSpinner2.setValue(new Date().getMonth() + 1);
        jSpinner3.setValue(anioActual);
        
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.setGridColor(Color.gray);

        modelo = (DefaultTableModel) jTable1.getModel();
    }

    @Override
    public Image getIconImage() {
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/Contabilidad.png"));
        return icono;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraSuperior = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraSuperior.setBackground(new java.awt.Color(51, 51, 51));
        BarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraSuperiorMouseDragged(evt);
            }
        });
        BarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraSuperiorMousePressed(evt);
            }
        });
        BarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cerrar.setBackground(new java.awt.Color(51, 51, 51));
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("✕");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarMouseExited(evt);
            }
        });
        BarraSuperior.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 40, 30));

        Minimizar.setBackground(new java.awt.Color(51, 51, 51));
        Minimizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Minimizar.setForeground(new java.awt.Color(255, 255, 255));
        Minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimizar.setText("_");
        Minimizar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizarMouseExited(evt);
            }
        });
        BarraSuperior.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 40, 30));

        Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Asientos Contables");
        BarraSuperior.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 230, 30));

        getContentPane().add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 30));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de la cuenta de gasto:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, 20));

        jTextField1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 30));

        jTextField2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 200, 30));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 170, 20));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Dar de Alta Asiento");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 150, 40));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, 20));

        jSpinner3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinner3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });
        jPanel1.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 80, 30));

        jSpinner1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jSpinner1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 60, 30));

        jSpinner2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jSpinner2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 60, 30));

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Cuenta", "Debe", "Haber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 560, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_CerrarMouseClicked

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        Cerrar.setBackground(Color.red);
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        Cerrar.setBackground(null);
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_CerrarMouseExited

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void MinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseEntered
        Minimizar.setBackground(new Color(150, 150, 150));
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_MinimizarMouseEntered

    private void MinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseExited
        Minimizar.setBackground(null);
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_MinimizarMouseExited

    private void BarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraSuperiorMouseDragged
        int x2 = evt.getXOnScreen();
        int y2 = evt.getYOnScreen();

        this.setLocation(x2 - x, y2 - y);
    }//GEN-LAST:event_BarraSuperiorMouseDragged

    private void BarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraSuperiorMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_BarraSuperiorMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta rellenar uno/varios de los campos.");
        } else {
            try {
                if ((Integer) jSpinner3.getValue() > anioActual) {
                    JOptionPane.showMessageDialog(null, "No se puede introducir fechas superior a " + (new Date().getYear() + 1900));
                    jSpinner3.setValue(anioActual);
                } else {
                    Object[] filas1 = new Object[4];
                    Object[] filas2 = new Object[4];

                    for (int i = 0; i < 4; i++) {
                        switch (i) {
                            case 0 -> {
                                filas1[i] = (Integer) jSpinner1.getValue() + "/" + (Integer) jSpinner2.getValue() + "/" + (Integer) jSpinner3.getValue();
                                filas2[i] = (Integer) jSpinner1.getValue() + "/" + (Integer) jSpinner2.getValue() + "/" + (Integer) jSpinner3.getValue();
                            }
                            case 1 -> {
                                filas1[i] = jTextField1.getText();
                                filas2[i] = "Caja";
                            }
                            case 2 -> {
                                filas1[i] = "----";
                                filas2[i] = jTextField2.getText();
                            }
                            case 3 -> {
                                filas1[i] = jTextField2.getText();
                                filas2[i] = "----";
                            }
                        }
                    }
                    modelo.addRow(filas1);
                    modelo.addRow(filas2);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "En uno de los campos se introdujo algo no válido.");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if (Character.isLetter(evt.getKeyChar())) {
            JOptionPane.showMessageDialog(null, "En este campo no se admiten letras.");
            jTextField2.setText("");
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
    }//GEN-LAST:event_jSpinner3StateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
