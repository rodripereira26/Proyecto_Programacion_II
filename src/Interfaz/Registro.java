package Interfaz;

import Datos.CifradoContraseña;
import Datos.RegistroBDD;
import Conexion.SQL;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    //mover ventana
    int posY = 0, posX = 0;

    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            setIconImage(new ImageIcon(getClass().getResource("../Imagenes/icono.png")).getImage());
        } catch (Exception e) {
        }
        this.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        LabelApe = new javax.swing.JLabel();
        LabelNom = new javax.swing.JLabel();
        LabelPass = new javax.swing.JLabel();
        LabelMail = new javax.swing.JLabel();
        LabelPass2 = new javax.swing.JLabel();
        LabelUsr = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        nombre = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        repetirContraseña = new javax.swing.JPasswordField();
        apellido = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(500, 430));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        panelLogin.setForeground(new java.awt.Color(255, 255, 255));
        panelLogin.setMaximumSize(new java.awt.Dimension(500, 430));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelApe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelApe.setForeground(new java.awt.Color(204, 204, 204));
        LabelApe.setText("Apellido");
        panelLogin.add(LabelApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        LabelNom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNom.setForeground(new java.awt.Color(204, 204, 204));
        LabelNom.setText("Nombre");
        LabelNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LabelNomKeyPressed(evt);
            }
        });
        panelLogin.add(LabelNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 80, -1));

        LabelPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelPass.setForeground(new java.awt.Color(204, 204, 204));
        LabelPass.setText("Contraseña");
        panelLogin.add(LabelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 120, -1));

        LabelMail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelMail.setForeground(new java.awt.Color(204, 204, 204));
        LabelMail.setText("E-mail");
        panelLogin.add(LabelMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 70, -1));

        LabelPass2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelPass2.setForeground(new java.awt.Color(204, 204, 204));
        LabelPass2.setText("Repetir Contraseña");
        panelLogin.add(LabelPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 150, 40));

        LabelUsr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelUsr.setForeground(new java.awt.Color(204, 204, 204));
        LabelUsr.setText("Usuario");
        panelLogin.add(LabelUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 90, -1));

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
        panelLogin.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, 40));

        usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(102, 102, 102));
        usuario.setBorder(null);
        panelLogin.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 280, 30));

        contraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contraseña.setForeground(new java.awt.Color(102, 102, 102));
        contraseña.setBorder(null);
        panelLogin.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 280, 30));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(102, 102, 102));
        nombre.setBorder(null);
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreMouseClicked(evt);
            }
        });
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        panelLogin.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 280, 30));

        correo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        correo.setForeground(new java.awt.Color(102, 102, 102));
        correo.setBorder(null);
        panelLogin.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 280, 30));

        repetirContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        repetirContraseña.setForeground(new java.awt.Color(102, 102, 102));
        repetirContraseña.setBorder(null);
        panelLogin.add(repetirContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 280, 30));

        apellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apellido.setForeground(new java.awt.Color(102, 102, 102));
        apellido.setBorder(null);
        apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apellidoMouseClicked(evt);
            }
        });
        panelLogin.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 280, 30));

        btnAtras.setBackground(new java.awt.Color(255, 255, 255));
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-back-48.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtras.setDefaultCapable(false);
        btnAtras.setFocusPainted(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        panelLogin.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 40, 50));

        jLabel13.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Registrarse");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
        });
        panelLogin.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, -1, -1));

        btnRegistro.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regisbtn.png"))); // NOI18N
        btnRegistro.setBorder(null);
        btnRegistro.setBorderPainted(false);
        btnRegistro.setContentAreaFilled(false);
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistro.setDefaultCapable(false);
        btnRegistro.setFocusPainted(false);
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistroMouseExited(evt);
            }
        });
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        panelLogin.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 110, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("_________________________");
        panelLogin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 320, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("_________________________");
        panelLogin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 300, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("_________________________");
        panelLogin.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 320, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("_________________________");
        panelLogin.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 320, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("_________________________");
        panelLogin.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 320, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("_________________________");
        panelLogin.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 320, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regisbtn_1.png"))); // NOI18N
        jLabel14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel14MouseDragged(evt);
            }
        });
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });
        panelLogin.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 80));

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
        panelLogin.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 50, 40));
        panelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 50));

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Login lol = new Login();
        lol.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered

    }//GEN-LAST:event_jLabel13MouseEntered

    private void btnRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseEntered

        

    }//GEN-LAST:event_btnRegistroMouseEntered

    private void btnRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseExited
       
    }//GEN-LAST:event_btnRegistroMouseExited

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed

        SQL usuSQL = new SQL();

        RegistroBDD usu = new RegistroBDD();

        String pass = new String(contraseña.getPassword());

        String passValidacion = new String(repetirContraseña.getPassword());

        if (nombre.getText().equals("") || apellido.getText().equals("") || usuario.getText().equals("") || contraseña.getPassword().equals("") || repetirContraseña.getPassword().equals("") || correo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No deben quedar campos vacíos");
        } else {

            if (pass.equals(passValidacion)) {

                if (usuSQL.validacionUsuario(usuario.getText()) == 0) {

                    if (usuSQL.validacionCorreo(correo.getText())) {

                        if (usuSQL.existeCorreoRegistro(correo.getText()) == 0) {

                            if (pass.length() >= 6) {

                                String contra = CifradoContraseña.sha1(pass);
                                
                                usu.setNombreUsuario(usuario.getText());
                                usu.setContraseña(contra);
                                usu.setApellido(apellido.getText().toUpperCase());
                                usu.setNombre(nombre.getText().toUpperCase());
                                usu.setCorreo(correo.getText());

                                if (usuSQL.registro(usu)) {
                                    
                                    JOptionPane.showMessageDialog(null, "El usuario fue creado con éxito");
                                    Login lol = new Login();
                                    lol.setVisible(true);
                                    this.dispose();
                                    
                                } else {
                                    JOptionPane.showMessageDialog(null, "Hubo un error al crear el usuario");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "La contraseña no es segura\nMínimo 6 caracteres");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El correo ya está registrado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El correo no es válido");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya está registrado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas ingresadas no coinciden");
            }
        }
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void jLabel14MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseDragged
        //mover ventana
        setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_jLabel14MouseDragged

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        //mover ventana
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_jLabel14MousePressed

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked

    }//GEN-LAST:event_nombreMouseClicked

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void apellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoMouseClicked

    }//GEN-LAST:event_apellidoMouseClicked

    private void LabelNomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LabelNomKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelNomKeyPressed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
       SQL usuSQL = new SQL();

        RegistroBDD usu = new RegistroBDD();

        String pass = new String(contraseña.getPassword());

        String passValidacion = new String(repetirContraseña.getPassword());

        if (nombre.getText().equals("") || apellido.getText().equals("") || usuario.getText().equals("") || contraseña.getPassword().equals("") || repetirContraseña.getPassword().equals("") || correo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No deben quedar campos vacíos");
        } else {

            if (pass.equals(passValidacion)) {

                if (usuSQL.validacionUsuario(usuario.getText()) == 0) {

                    if (usuSQL.validacionCorreo(correo.getText())) {

                        if (usuSQL.existeCorreoRegistro(correo.getText()) == 0) {

                            if (pass.length() >= 6) {

                                String contra = CifradoContraseña.sha1(pass);
                                
                                usu.setNombreUsuario(usuario.getText());
                                usu.setContraseña(contra);
                                usu.setApellido(apellido.getText().toUpperCase());
                                usu.setNombre(nombre.getText().toUpperCase());
                                usu.setCorreo(correo.getText());

                                if (usuSQL.registro(usu)) {
                                    
                                    JOptionPane.showMessageDialog(null, "El usuario fue creado con éxito");
                                    Login lol = new Login();
                                    lol.setVisible(true);
                                    this.dispose();
                                    
                                } else {
                                    JOptionPane.showMessageDialog(null, "Hubo un error al crear el usuario");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "La contraseña no es segura\nMínimo 6 caracteres");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El correo ya está registrado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El correo no es válido");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya está registrado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas ingresadas no coinciden");
            }
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelApe;
    private javax.swing.JLabel LabelMail;
    private javax.swing.JLabel LabelNom;
    private javax.swing.JLabel LabelPass;
    private javax.swing.JLabel LabelPass2;
    private javax.swing.JLabel LabelUsr;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField repetirContraseña;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
