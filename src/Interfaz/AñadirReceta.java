package Interfaz;

import Datos.ArrayIngredientes;
import Datos.Ingrediente;
import Datos.Pasos;
import Datos.UsuarioTemporal;
import Datos.RegistroBDD;
import Datos.RegistroReceta;
import Conexion.SQL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AñadirReceta extends javax.swing.JFrame {

    Ingrediente ing = new Ingrediente();
    UsuarioTemporal tm = new UsuarioTemporal();
    SQL sql = new SQL();

    public AñadirReceta() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            setIconImage(new ImageIcon(getClass().getResource("../Imagenes/icono.png")).getImage());
        } catch (Exception e) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelAñadirReceta = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        nombreReceta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        añadirPasos = new javax.swing.JButton();
        añadirIngredientes = new javax.swing.JButton();
        tipoReceta = new javax.swing.JComboBox<>();
        dificultadReceta = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comentarioReceta = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        descripcionReceta = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        tiempoReceta = new javax.swing.JFormattedTextField();

        jButton3.setText("jButton3");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAñadirReceta.setBackground(new java.awt.Color(255, 255, 255));
        panelAñadirReceta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelAñadirReceta.setForeground(new java.awt.Color(255, 255, 255));
        panelAñadirReceta.setFocusable(false);
        panelAñadirReceta.setMinimumSize(new java.awt.Dimension(790, 43));
        panelAñadirReceta.setPreferredSize(new java.awt.Dimension(900, 600));
        panelAñadirReceta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setText("Nombre");
        panelAñadirReceta.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        nombreReceta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombreReceta.setForeground(new java.awt.Color(102, 102, 102));
        nombreReceta.setBorder(null);
        nombreReceta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombreReceta.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nombreRecetaCaretUpdate(evt);
            }
        });
        nombreReceta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreRecetaFocusGained(evt);
            }
        });
        nombreReceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreRecetaMouseClicked(evt);
            }
        });
        nombreReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreRecetaActionPerformed(evt);
            }
        });
        nombreReceta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreRecetaKeyPressed(evt);
            }
        });
        panelAñadirReceta.add(nombreReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 200, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("___________________");
        jLabel10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel10FocusGained(evt);
            }
        });
        panelAñadirReceta.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 210, 20));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-close-window-26.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.setDefaultCapable(false);
        btnSalir.setFocusable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelAñadirReceta.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 30, 40));

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-minimize-window-26 (1).png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMinimizar.setDefaultCapable(false);
        btnMinimizar.setFocusable(false);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        panelAñadirReceta.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 26, 40));

        botonAtras.setBackground(new java.awt.Color(255, 255, 255));
        botonAtras.setFont(new java.awt.Font("Nirmala UI", 0, 19)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(255, 0, 1));
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-back-50.png"))); // NOI18N
        botonAtras.setBorder(null);
        botonAtras.setBorderPainted(false);
        botonAtras.setContentAreaFilled(false);
        botonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAtras.setDefaultCapable(false);
        botonAtras.setFocusPainted(false);
        botonAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtras.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAtrasMouseExited(evt);
            }
        });
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        panelAñadirReceta.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 40, -1));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        jLabel1.setText("Nueva Receta");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelAñadirReceta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 380, 40));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Guardar");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        panelAñadirReceta.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 200, 60));

        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btngurardarr.png"))); // NOI18N
        botonGuardar.setBorder(null);
        botonGuardar.setBorderPainted(false);
        botonGuardar.setContentAreaFilled(false);
        botonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonGuardar.setFocusPainted(false);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        panelAñadirReceta.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 200, 60));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setText("Descripción");
        panelAñadirReceta.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 150, 57));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setText("Comentario");
        panelAñadirReceta.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Añadir Paso");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        panelAñadirReceta.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 140, 50));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Añadir Ingrediente");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        panelAñadirReceta.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 190, 50));

        añadirPasos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        añadirPasos.setForeground(new java.awt.Color(255, 0, 0));
        añadirPasos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnverdeagua.png"))); // NOI18N
        añadirPasos.setBorder(null);
        añadirPasos.setBorderPainted(false);
        añadirPasos.setContentAreaFilled(false);
        añadirPasos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        añadirPasos.setDefaultCapable(false);
        añadirPasos.setFocusPainted(false);
        añadirPasos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        añadirPasos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        añadirPasos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        añadirPasos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                añadirPasosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                añadirPasosMouseExited(evt);
            }
        });
        añadirPasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirPasosActionPerformed(evt);
            }
        });
        panelAñadirReceta.add(añadirPasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, -1, -1));

        añadirIngredientes.setBackground(new java.awt.Color(255, 0, 0));
        añadirIngredientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        añadirIngredientes.setForeground(new java.awt.Color(255, 0, 0));
        añadirIngredientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnverddeawalargo2.png"))); // NOI18N
        añadirIngredientes.setBorder(null);
        añadirIngredientes.setBorderPainted(false);
        añadirIngredientes.setContentAreaFilled(false);
        añadirIngredientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        añadirIngredientes.setDefaultCapable(false);
        añadirIngredientes.setFocusPainted(false);
        añadirIngredientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        añadirIngredientes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        añadirIngredientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        añadirIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                añadirIngredientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                añadirIngredientesMouseExited(evt);
            }
        });
        añadirIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirIngredientesActionPerformed(evt);
            }
        });
        panelAñadirReceta.add(añadirIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 190, 50));

        tipoReceta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tipoReceta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plato Principal", "Ensalada", "Postre", "Bebida", "Carne", "Pasta" }));
        tipoReceta.setFocusable(false);
        tipoReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoRecetaActionPerformed(evt);
            }
        });
        panelAñadirReceta.add(tipoReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 143, 35));

        dificultadReceta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dificultadReceta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fácil", "Media", "Difícil" }));
        dificultadReceta.setToolTipText("");
        panelAñadirReceta.add(dificultadReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 143, 35));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setText("Tipo de receta");
        panelAñadirReceta.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 180, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setText("Dificultad");
        panelAñadirReceta.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel7.setText("Tiempo estimado");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelAñadirReceta.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 210, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("(HH:mm)");
        panelAñadirReceta.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 90, 25));

        comentarioReceta.setColumns(20);
        comentarioReceta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comentarioReceta.setRows(4);
        panelAñadirReceta.add(comentarioReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 210, 70));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("___________________");
        jLabel11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel11FocusGained(evt);
            }
        });
        panelAñadirReceta.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 210, 20));

        descripcionReceta.setColumns(20);
        descripcionReceta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descripcionReceta.setRows(4);
        panelAñadirReceta.add(descripcionReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 210, 70));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("___________________");
        jLabel12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel12FocusGained(evt);
            }
        });
        panelAñadirReceta.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 210, 20));

        try {
            tiempoReceta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tiempoReceta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tiempoReceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tiempoRecetaMouseClicked(evt);
            }
        });
        panelAñadirReceta.add(tiempoReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 90, 30));

        getContentPane().add(panelAñadirReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        if (nombreReceta.getText().equals("") && comentarioReceta.getText().equals("") && comentarioReceta.getText().equals("") && tiempoReceta.getText().equals("")) {
            System.exit(0);
        } else {
            if (!nombreReceta.getText().equals("") || !comentarioReceta.getText().equals("") || !comentarioReceta.getText().equals("") || !tiempoReceta.getText().equals("")) {
                int confirmar = JOptionPane.showConfirmDialog(null, "Tiene datos que no han sido guardados, ¿Desea cerrar el programa?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (confirmar == 0) {
                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        
        if (nombreReceta.getText().equals("") && comentarioReceta.getText().equals("") && comentarioReceta.getText().equals("") && tiempoReceta.getText().equals("")) {
            Menu inicio = new Menu();
            inicio.setVisible(true);
            ArrayIngredientes.getIngredientes().clear();
            ArrayIngredientes.getUnidades().clear();
            ArrayIngredientes.getCantidades().clear();
            ArrayIngredientes.getId().clear();
            Pasos.getNombre().clear();
            this.dispose();
        } else {
            if (!nombreReceta.getText().equals("") || !comentarioReceta.getText().equals("") || !comentarioReceta.getText().equals("") || !tiempoReceta.getText().equals("")) {
                int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea volver al menú?, se perderán los datos no guardados", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (confirmar == 0) {
                    Menu inicio = new Menu();
                    inicio.setVisible(true);
                    ArrayIngredientes.getIngredientes().clear();
                    ArrayIngredientes.getUnidades().clear();
                    ArrayIngredientes.getCantidades().clear();
                    ArrayIngredientes.getId().clear();
                    Pasos.getNombre().clear();
                    
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseExited

    }//GEN-LAST:event_botonAtrasMouseExited

    private void botonAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseEntered

    }//GEN-LAST:event_botonAtrasMouseEntered

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

    }//GEN-LAST:event_botonGuardarActionPerformed

    private void tipoRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoRecetaActionPerformed

    private void añadirIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirIngredientesActionPerformed


    }//GEN-LAST:event_añadirIngredientesActionPerformed

    private void añadirIngredientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirIngredientesMouseEntered
        añadirIngredientes.setText("Ingredientes");
    }//GEN-LAST:event_añadirIngredientesMouseEntered

    private void añadirIngredientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirIngredientesMouseExited
        añadirIngredientes.setText("");
    }//GEN-LAST:event_añadirIngredientesMouseExited

    private void añadirPasosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirPasosMouseEntered
        añadirPasos.setText("Añadir Pasos");
    }//GEN-LAST:event_añadirPasosMouseEntered

    private void añadirPasosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirPasosMouseExited
        añadirPasos.setText("");
    }//GEN-LAST:event_añadirPasosMouseExited

    private void añadirPasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirPasosActionPerformed


    }//GEN-LAST:event_añadirPasosActionPerformed

    private void nombreRecetaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_nombreRecetaCaretUpdate

    }//GEN-LAST:event_nombreRecetaCaretUpdate

    private void nombreRecetaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreRecetaFocusGained

    }//GEN-LAST:event_nombreRecetaFocusGained

    private void nombreRecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreRecetaMouseClicked

    }//GEN-LAST:event_nombreRecetaMouseClicked

    private void nombreRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreRecetaActionPerformed

    }//GEN-LAST:event_nombreRecetaActionPerformed

    private void nombreRecetaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreRecetaKeyPressed

    }//GEN-LAST:event_nombreRecetaKeyPressed

    private void jLabel10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel10FocusGained

    }//GEN-LAST:event_jLabel10FocusGained

    private void jLabel11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel11FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11FocusGained

    private void jLabel12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel12FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12FocusGained

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        MenuIngrediente dia = new MenuIngrediente(new javax.swing.JDialog(), true);
        dia.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked

        AñadirPasos aña = new AñadirPasos(new javax.swing.JDialog(), true);
        aña.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked

        RegistroReceta receta = new RegistroReceta();
        Ingrediente ing = new Ingrediente();
        Pasos pas = new Pasos();

        receta.setUsuario(tm.getTexto());
        receta.setNombre(nombreReceta.getText());
        receta.setDescripcion(comentarioReceta.getText());
        receta.setComentario(descripcionReceta.getText());
        receta.setTiempo(tiempoReceta.getText());
        receta.setTipo((String) tipoReceta.getSelectedItem());
        receta.setDificultad((String) dificultadReceta.getSelectedItem());

        if (nombreReceta.getText().equals("") || comentarioReceta.getText().equals("") || descripcionReceta.getText().equals("") || tiempoReceta.getText().equals(":")) {
            JOptionPane.showMessageDialog(null, "Debe llenar los datos");

        } else {
            if (Ingrediente.getId() == null || Ingrediente.getId().isEmpty() || Pasos.getNombre() == null || Pasos.getNombre().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No ingresaron ingredientes o pasos");
            } else {
                int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea ingresar esta receta?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                try {
                    if (confirmar == 0) {
                        if (sql.verificarReceta(tm.getTexto(), nombreReceta.getText()) == 0) {
                            if (sql.añadirReceta(tm, receta)) {
                                if (sql.idReceta(receta, tm)) {
                                    sql.ingresarIngrediente(ing, receta);                              
                                    sql.ingresarPasos(pas, receta);
                                    int costo = sql.buscarCosto_Calorias(receta, "SELECT SUM(ingrediente.costo) FROM ingrediente, recetas_has_ingrediente, recetas WHERE recetas.id_receta = ? and recetas_has_ingrediente.ingrediente = ingrediente.id_ingrediente and recetas_has_ingrediente.id_receta = recetas.id_receta");
                                    sql.updateCosto_Calorias(receta, costo, "UPDATE recetas SET costo = ? WHERE id_receta = ?");
                                    int calorias = sql.buscarCosto_Calorias(receta, "SELECT SUM(ingrediente.calorias) FROM ingrediente, recetas_has_ingrediente, recetas WHERE recetas.id_receta = ? and recetas_has_ingrediente.ingrediente = ingrediente.id_ingrediente and recetas_has_ingrediente.id_receta = recetas.id_receta");
                                    sql.updateCosto_Calorias(receta, calorias, "UPDATE recetas SET calorias = ? WHERE id_receta = ?");
                                    JOptionPane.showMessageDialog(null, "La receta fue creada con éxito");
                                    ArrayIngredientes.getIngredientes().clear();
                                    ArrayIngredientes.getUnidades().clear();
                                    ArrayIngredientes.getCantidades().clear();
                                    ArrayIngredientes.getId().clear();
                                    Pasos.getNombre().clear();
                                }
                                nombreReceta.setText("");
                                tiempoReceta.setText("");
                                comentarioReceta.setText("");
                                descripcionReceta.setText("");
                                tipoReceta.setSelectedIndex(0);
                                dificultadReceta.setSelectedIndex(0);
                                Ingrediente.setId(null);
                                Ingrediente.setNombre(null);
                                Ingrediente.setCantidad(null);
                                Ingrediente.setUnidad(null);
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al crear la receta");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Usted ya registró esta receta");
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al crear la receta");
                    Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void tiempoRecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoRecetaMouseClicked

    }//GEN-LAST:event_tiempoRecetaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirIngredientes;
    private javax.swing.JButton añadirPasos;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextArea comentarioReceta;
    private javax.swing.JTextArea descripcionReceta;
    private javax.swing.JComboBox<String> dificultadReceta;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField nombreReceta;
    private javax.swing.JPanel panelAñadirReceta;
    private javax.swing.JFormattedTextField tiempoReceta;
    private javax.swing.JComboBox<String> tipoReceta;
    // End of variables declaration//GEN-END:variables

}
