package clases;

import java.awt.*;
import javax.swing.JOptionPane;

/**
 * @author Matias
 *
 * 6) Formulario que tenga 2 TextBox (menor y mayor) para ingresar valores
 * enteros. Debe verificar que el valor de uno sea menor al otro. Debe haber 2
 * botones (rango aumentado de a 1 y rango aumentado de a 2) que muestre el
 * rango de números entre menor y mayor (aumentado de a 1 o de a 2, dependiendo
 * cual boton se presiono).
 *
 */
public class MayoryMenor extends javax.swing.JFrame {

    private int x, y;

    public MayoryMenor() {
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
            java.util.logging.Logger.getLogger(MayoryMenor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MayoryMenor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MayoryMenor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MayoryMenor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        setLocationRelativeTo(null);
        Cerrar.setOpaque(true);
        Minimizar.setOpaque(true);
    }

    @Override
    public Image getIconImage() {
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/MayorOMenor.png"));
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
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

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
        BarraSuperior.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 40, 30));

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
        BarraSuperior.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 40, 30));

        Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Mayor o Menor");
        BarraSuperior.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 30));

        getContentPane().add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 30));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 30));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Valor 2:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 90, 20));

        jTextField3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 100, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Rango Aumentado 1");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 40));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 290, 260));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor 1:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 20));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Rango Aumentado 2");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 370));

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
        if (jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta rellenar uno/varios de los campos.");
        } else {
            try {
                jTextField2.setText(jTextField2.getText().replaceAll("\\p{Punct}", ""));
                jTextField3.setText(jTextField3.getText().replaceAll("\\p{Punct}", ""));

                jTextArea1.setText("");
                if (Integer.parseInt(jTextField2.getText()) == Integer.parseInt(jTextField3.getText())) {
                    JOptionPane.showMessageDialog(null, "Los números no deben ser iguales.");
                } else if(Integer.parseInt(jTextField2.getText()) > Integer.parseInt(jTextField3.getText())){
                    for (int i = Integer.parseInt(jTextField3.getText()); i <= Integer.parseInt(jTextField2.getText()); i++) {
                        jTextArea1.append(String.valueOf(i) + ", ");
                    }     
                } else {
                    for (int i = Integer.parseInt(jTextField2.getText()); i <= Integer.parseInt(jTextField3.getText()); i++) {
                        jTextArea1.append(String.valueOf(i) + ", ");
                    }   
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

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        if (Character.isLetter(evt.getKeyChar())) {
            JOptionPane.showMessageDialog(null, "En este campo no se admiten letras.");
            jTextField3.setText("");
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta rellenar uno/varios de los campos.");
        } else {
            try {
                jTextField2.setText(jTextField2.getText().replaceAll("\\p{Punct}", ""));
                jTextField3.setText(jTextField3.getText().replaceAll("\\p{Punct}", ""));

                jTextArea1.setText("");
                if (Integer.parseInt(jTextField2.getText()) == Integer.parseInt(jTextField3.getText())) {
                    JOptionPane.showMessageDialog(null, "Los números no deben ser iguales.");
                } else if(Integer.parseInt(jTextField2.getText()) > Integer.parseInt(jTextField3.getText())){
                    for (int i = Integer.parseInt(jTextField3.getText()); i <= Integer.parseInt(jTextField2.getText()); i+=2) {
                        jTextArea1.append(String.valueOf(i) + ", ");
                    }            
                } else {
                    for (int i = Integer.parseInt(jTextField2.getText()); i <= Integer.parseInt(jTextField3.getText()); i+=2) {
                        jTextArea1.append(String.valueOf(i) + ", ");
                    }   
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "En uno de los campos se introdujo algo no válido.");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
