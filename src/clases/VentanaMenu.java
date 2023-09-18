package clases;

import java.awt.*;
import javax.swing.*;

/**
 * @author Matias Abregú
 */
public class VentanaMenu extends javax.swing.JFrame {
    
    private int x, y;
    
    public VentanaMenu() {
        initComponents();
        setLocationRelativeTo(null);
        Cerrar.setOpaque(true);
        Minimizar.setOpaque(true);
        
        Icon iconoCargarCompras = new ImageIcon(new ImageIcon("src/img/Carrito-IMG.png")
                .getImage().getScaledInstance(labelCargarCompras.getWidth(), labelCargarCompras.getHeight(), Image.SCALE_DEFAULT));
        labelCargarCompras.setIcon(iconoCargarCompras);
        
        Icon iconoCargarDP = new ImageIcon(new ImageIcon("src/img/Registro.png")
                .getImage().getScaledInstance(labelCargarDatosPersona.getWidth(), labelCargarDatosPersona.getHeight(), Image.SCALE_DEFAULT));
        labelCargarDatosPersona.setIcon(iconoCargarDP);
        
        Icon iconoCargarNA = new ImageIcon(new ImageIcon("src/img/Calificaciones.png")
                .getImage().getScaledInstance(labelCargarNotasAlumno.getWidth(), labelCargarNotasAlumno.getHeight(), Image.SCALE_DEFAULT));
        labelCargarNotasAlumno.setIcon(iconoCargarNA);
        
        Icon iconoCargarCA = new ImageIcon(new ImageIcon("src/img/Auto.png")
                .getImage().getScaledInstance(labelCargaAutos.getWidth(), labelCargaAutos.getHeight(), Image.SCALE_DEFAULT));
        labelCargaAutos.setIcon(iconoCargarCA);
        
        labelFormularioContacto.setIcon(iconoCargarDP);
        
        Icon iconoCargarMM = new ImageIcon(new ImageIcon("src/img/MayorOMenor.png")
                .getImage().getScaledInstance(labelMayorMenor.getWidth(), labelMayorMenor.getHeight(), Image.SCALE_DEFAULT));
        labelMayorMenor.setIcon(iconoCargarMM);
        
        Icon iconoAA = new ImageIcon(new ImageIcon("src/img/Contabilidad.png")
                .getImage().getScaledInstance(labelAsientosContables.getWidth(), labelAsientosContables.getHeight(), Image.SCALE_DEFAULT));
        labelAsientosContables.setIcon(iconoAA);
        
        Icon iconoFPVEG = new ImageIcon(new ImageIcon("src/img/Deportes.png")
                .getImage().getScaledInstance(labelEquipoGanador.getWidth(), labelEquipoGanador.getHeight(), Image.SCALE_DEFAULT));
        labelEquipoGanador.setIcon(iconoFPVEG);
        
        Icon iconoTD = new ImageIcon(new ImageIcon("src/img/Dados.png")
                .getImage().getScaledInstance(labelTirarDados.getWidth(), labelTirarDados.getHeight(), Image.SCALE_DEFAULT));
        labelTirarDados.setIcon(iconoTD);
        
        Icon iconoDN = new ImageIcon(new ImageIcon("src/img/Dividir.png")
                .getImage().getScaledInstance(labelDividirNumero.getWidth(), labelDividirNumero.getHeight(), Image.SCALE_DEFAULT));
        labelDividirNumero.setIcon(iconoDN);
        
        Icon iconoBC = new ImageIcon(new ImageIcon("src/img/Cartas.png")
                .getImage().getScaledInstance(labelBarajarCartas.getWidth(), labelBarajarCartas.getHeight(), Image.SCALE_DEFAULT));
        labelBarajarCartas.setIcon(iconoBC);
        
        labelRegistroPago.setIcon(iconoCargarCompras);
    }
    
    @Override
    public Image getIconImage() {
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/Practica.png"));
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
        labelCargarDatosPersona = new javax.swing.JLabel();
        labelCargarCompras = new javax.swing.JLabel();
        labelCargaAutos = new javax.swing.JLabel();
        labelCargarNotasAlumno = new javax.swing.JLabel();
        labelEquipoGanador = new javax.swing.JLabel();
        labelAsientosContables = new javax.swing.JLabel();
        labelMayorMenor = new javax.swing.JLabel();
        labelFormularioContacto = new javax.swing.JLabel();
        labelRegistroPago = new javax.swing.JLabel();
        labelBarajarCartas = new javax.swing.JLabel();
        labelDividirNumero = new javax.swing.JLabel();
        labelTirarDados = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(560, 590));
        setUndecorated(true);
        setResizable(false);
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
        Titulo.setText("Varios Proyectos En 1 - JAVA AUTODIDACTA");
        BarraSuperior.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 370, 30));

        getContentPane().add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 30));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html> <center>Formulario Registro <br> de Pago</center> </html>");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 110, 40));

        labelCargarDatosPersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCargarDatosPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCargarDatosPersonaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCargarDatosPersonaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCargarDatosPersonaMouseExited(evt);
            }
        });
        jPanel1.add(labelCargarDatosPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 100, 100));

        labelCargarCompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCargarCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCargarComprasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCargarComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCargarComprasMouseExited(evt);
            }
        });
        jPanel1.add(labelCargarCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 100));

        labelCargaAutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCargaAutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCargaAutosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCargaAutosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCargaAutosMouseExited(evt);
            }
        });
        jPanel1.add(labelCargaAutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 100, 100));

        labelCargarNotasAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCargarNotasAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCargarNotasAlumnoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCargarNotasAlumnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCargarNotasAlumnoMouseExited(evt);
            }
        });
        jPanel1.add(labelCargarNotasAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 100, 100));

        labelEquipoGanador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEquipoGanador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelEquipoGanadorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelEquipoGanadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelEquipoGanadorMouseExited(evt);
            }
        });
        jPanel1.add(labelEquipoGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 100, 100));

        labelAsientosContables.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAsientosContables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAsientosContablesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAsientosContablesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAsientosContablesMouseExited(evt);
            }
        });
        jPanel1.add(labelAsientosContables, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 100, 100));

        labelMayorMenor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMayorMenor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMayorMenorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMayorMenorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMayorMenorMouseExited(evt);
            }
        });
        jPanel1.add(labelMayorMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 100, 100));

        labelFormularioContacto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFormularioContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelFormularioContactoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelFormularioContactoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelFormularioContactoMouseExited(evt);
            }
        });
        jPanel1.add(labelFormularioContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 100, 100));

        labelRegistroPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRegistroPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegistroPagoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelRegistroPagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelRegistroPagoMouseExited(evt);
            }
        });
        jPanel1.add(labelRegistroPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 100, 100));

        labelBarajarCartas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBarajarCartas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBarajarCartasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelBarajarCartasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelBarajarCartasMouseExited(evt);
            }
        });
        jPanel1.add(labelBarajarCartas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 100, 100));

        labelDividirNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDividirNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDividirNumeroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDividirNumeroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelDividirNumeroMouseExited(evt);
            }
        });
        jPanel1.add(labelDividirNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 100, 100));

        labelTirarDados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTirarDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTirarDadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelTirarDadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelTirarDadosMouseExited(evt);
            }
        });
        jPanel1.add(labelTirarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 100, 100));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡Bienvenido/a, selecciona la aplicación a la que deseas ingresar!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 520, 30));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html>\n<center>Carga de Datos <br> de Persona</center>\n</html>");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 100, 30));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html>\n<center>Carga de Notas <br> de Alumno</center>\n</html>");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 100, 30));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Asientos Contables");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 120, 20));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Carga de Compras");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, 20));

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Barajar Cartas");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 100, 20));

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("<html>\n<center>Carga de Datos <br> de Automóvil</center>\n</html>");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 100, 30));

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Mayor o Menor");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 100, 20));

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Tirar Dados");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 100, 20));

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Dividir Número");
        jLabel12.setToolTipText("");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 100, 20));

        jLabel13.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Formulario de Contacto");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 140, 20));

        jLabel14.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("<html> <center>Formulario para ver <br> equipo ganador</center> </html>");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
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

    private void labelCargarComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCargarComprasMouseEntered
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_labelCargarComprasMouseEntered

    private void labelCargarDatosPersonaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCargarDatosPersonaMouseEntered
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_labelCargarDatosPersonaMouseEntered

    private void labelCargarNotasAlumnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCargarNotasAlumnoMouseEntered
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_labelCargarNotasAlumnoMouseEntered

    private void labelCargaAutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCargaAutosMouseEntered
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_labelCargaAutosMouseEntered

    private void labelFormularioContactoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelFormularioContactoMouseEntered
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_labelFormularioContactoMouseEntered

    private void labelMayorMenorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMayorMenorMouseEntered
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_labelMayorMenorMouseEntered

    private void labelAsientosContablesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAsientosContablesMouseEntered
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_labelAsientosContablesMouseEntered

    private void labelEquipoGanadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEquipoGanadorMouseEntered
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_labelEquipoGanadorMouseEntered

    private void labelTirarDadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTirarDadosMouseEntered
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_labelTirarDadosMouseEntered

    private void labelDividirNumeroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDividirNumeroMouseEntered
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_labelDividirNumeroMouseEntered

    private void labelBarajarCartasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBarajarCartasMouseEntered
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_labelBarajarCartasMouseEntered

    private void labelRegistroPagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistroPagoMouseEntered
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_labelRegistroPagoMouseEntered

    private void labelCargarComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCargarComprasMouseExited
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_labelCargarComprasMouseExited

    private void labelCargarDatosPersonaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCargarDatosPersonaMouseExited
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_labelCargarDatosPersonaMouseExited

    private void labelCargarNotasAlumnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCargarNotasAlumnoMouseExited
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_labelCargarNotasAlumnoMouseExited

    private void labelCargaAutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCargaAutosMouseExited
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_labelCargaAutosMouseExited

    private void labelFormularioContactoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelFormularioContactoMouseExited
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_labelFormularioContactoMouseExited

    private void labelMayorMenorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMayorMenorMouseExited
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_labelMayorMenorMouseExited

    private void labelAsientosContablesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAsientosContablesMouseExited
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_labelAsientosContablesMouseExited

    private void labelEquipoGanadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEquipoGanadorMouseExited
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_labelEquipoGanadorMouseExited

    private void labelTirarDadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTirarDadosMouseExited
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_labelTirarDadosMouseExited

    private void labelDividirNumeroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDividirNumeroMouseExited
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_labelDividirNumeroMouseExited

    private void labelBarajarCartasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBarajarCartasMouseExited
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_labelBarajarCartasMouseExited

    private void labelRegistroPagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistroPagoMouseExited
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_labelRegistroPagoMouseExited

    private void labelCargarComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCargarComprasMouseClicked
        new CargaCompras().setVisible(true);
    }//GEN-LAST:event_labelCargarComprasMouseClicked

    private void labelCargarDatosPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCargarDatosPersonaMouseClicked
        new CargaDePersonas().setVisible(true);
    }//GEN-LAST:event_labelCargarDatosPersonaMouseClicked

    private void labelCargarNotasAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCargarNotasAlumnoMouseClicked
        new CargaDeNotas().setVisible(true);
    }//GEN-LAST:event_labelCargarNotasAlumnoMouseClicked

    private void labelCargaAutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCargaAutosMouseClicked
        new CargaDeDatosAutomovil().setVisible(true);
    }//GEN-LAST:event_labelCargaAutosMouseClicked

    private void labelFormularioContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelFormularioContactoMouseClicked
        new FormularioContacto().setVisible(true);
    }//GEN-LAST:event_labelFormularioContactoMouseClicked

    private void labelMayorMenorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMayorMenorMouseClicked
        new MayoryMenor().setVisible(true);
    }//GEN-LAST:event_labelMayorMenorMouseClicked

    private void labelAsientosContablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAsientosContablesMouseClicked
        new AsientosContables().setVisible(true);
    }//GEN-LAST:event_labelAsientosContablesMouseClicked

    private void labelEquipoGanadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEquipoGanadorMouseClicked
        new FormularioEquipoGanador().setVisible(true);
    }//GEN-LAST:event_labelEquipoGanadorMouseClicked

    private void labelTirarDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTirarDadosMouseClicked
        new TirarDados().setVisible(true);
    }//GEN-LAST:event_labelTirarDadosMouseClicked

    private void labelDividirNumeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDividirNumeroMouseClicked
        new DividirNumero().setVisible(true);
    }//GEN-LAST:event_labelDividirNumeroMouseClicked

    private void labelBarajarCartasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBarajarCartasMouseClicked
        new BarajarCartas().setVisible(true);
    }//GEN-LAST:event_labelBarajarCartasMouseClicked

    private void labelRegistroPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistroPagoMouseClicked
        new FormularioRegistroPago().setVisible(true);
    }//GEN-LAST:event_labelRegistroPagoMouseClicked
    
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
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAsientosContables;
    private javax.swing.JLabel labelBarajarCartas;
    private javax.swing.JLabel labelCargaAutos;
    private javax.swing.JLabel labelCargarCompras;
    private javax.swing.JLabel labelCargarDatosPersona;
    private javax.swing.JLabel labelCargarNotasAlumno;
    private javax.swing.JLabel labelDividirNumero;
    private javax.swing.JLabel labelEquipoGanador;
    private javax.swing.JLabel labelFormularioContacto;
    private javax.swing.JLabel labelMayorMenor;
    private javax.swing.JLabel labelRegistroPago;
    private javax.swing.JLabel labelTirarDados;
    // End of variables declaration//GEN-END:variables
}
