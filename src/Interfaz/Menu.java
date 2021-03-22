package Interfaz;

import Datos.RegistroBDD;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import Datos.UsuarioTemporal;
import java.awt.Color;
import javafx.animation.FadeTransition;
import javafx.util.Duration;
import javax.swing.BorderFactory;

public class Menu extends javax.swing.JFrame {

    int posX = 0, posY = 0;
    boolean abierto = false;
    Login log = new Login();
    UsuarioTemporal us = new UsuarioTemporal();

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            setIconImage(new ImageIcon(getClass().getResource("../Imagenes/icono.png")).getImage());
        } catch (Exception e) {

        }
        nom.setText(us.getTexto());
        //200,40
        //260,160
        Animacion.Animacion.bajar(-20, 40, 15, 2, titulo);
        Animacion.Animacion.bajar(-20, 160, 10, 2, qdh);
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nom = new javax.swing.JLabel();
        bienvenido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        config = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelHome = new javax.swing.JPanel();
        qdh = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        buscarr = new javax.swing.JLabel();
        aniadir3 = new javax.swing.JLabel();
        eliminarr = new javax.swing.JLabel();
        editarr = new javax.swing.JLabel();
        modificar = new javax.swing.JButton();
        añadir = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusable(false);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 17, 17));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nom.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nom.setForeground(new java.awt.Color(255, 87, 34));
        nom.setText("Tu mama");
        jPanel1.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 115, 39));

        bienvenido.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        bienvenido.setText("Bienvenido:");
        jPanel1.add(bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 125, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(129, 129, 129));
        jLabel2.setText("Ver perfil");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        logout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 87, 34));
        logout.setText("Cerrar Sesión");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        config.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        config.setForeground(new java.awt.Color(129, 129, 129));
        config.setText("Configuración");
        config.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        config.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                configMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                configMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                configMouseExited(evt);
            }
        });
        jPanel1.add(config, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hamburger (2).png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 30, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(129, 129, 129));
        jLabel4.setText("Ayuda");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-182, 0, 230, 550));

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setForeground(new java.awt.Color(255, 255, 255));
        panelHome.setFocusable(false);
        panelHome.setMinimumSize(new java.awt.Dimension(790, 43));
        panelHome.setPreferredSize(new java.awt.Dimension(900, 600));
        panelHome.setLayout(null);

        qdh.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        qdh.setForeground(new java.awt.Color(129, 129, 129));
        qdh.setText("¿Qué desea hacer?");
        panelHome.add(qdh);
        qdh.setBounds(260, 160, 310, 60);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        titulo.setText("MENU PRINCIPAL");
        panelHome.add(titulo);
        titulo.setBounds(200, 40, 410, 70);

        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        panelHome.add(jLabel3);
        jLabel3.setBounds(470, 10, 230, 40);

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
        panelHome.add(btnSalir);
        btnSalir.setBounds(770, 0, 40, 40);

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
        panelHome.add(btnMinimizar);
        btnMinimizar.setBounds(740, 0, 26, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarr.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        buscarr.setText("Buscar");
        buscarr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarrMouseExited(evt);
            }
        });
        jPanel2.add(buscarr, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));

        aniadir3.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        aniadir3.setText("Añadir");
        aniadir3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aniadir3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aniadir3MouseExited(evt);
            }
        });
        jPanel2.add(aniadir3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        eliminarr.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        eliminarr.setText("Eliminar");
        eliminarr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarrMouseExited(evt);
            }
        });
        jPanel2.add(eliminarr, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 90, -1));

        editarr.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        editarr.setText("Modificar");
        editarr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editarrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editarrMouseExited(evt);
            }
        });
        jPanel2.add(editarr, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        modificar.setBackground(new java.awt.Color(255, 255, 255));
        modificar.setFont(new java.awt.Font("Nirmala UI", 0, 19)); // NOI18N
        modificar.setForeground(new java.awt.Color(255, 0, 51));
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-edit-100 (1).png"))); // NOI18N
        modificar.setBorder(null);
        modificar.setBorderPainted(false);
        modificar.setContentAreaFilled(false);
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        modificar.setDefaultCapable(false);
        modificar.setFocusPainted(false);
        modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modificar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarMouseExited(evt);
            }
        });
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPanel2.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 150, 100));

        añadir.setBackground(new java.awt.Color(255, 255, 255));
        añadir.setFont(new java.awt.Font("Nirmala UI", 0, 19)); // NOI18N
        añadir.setForeground(new java.awt.Color(255, 0, 1));
        añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-add-100.png"))); // NOI18N
        añadir.setBorder(null);
        añadir.setBorderPainted(false);
        añadir.setContentAreaFilled(false);
        añadir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        añadir.setDefaultCapable(false);
        añadir.setFocusPainted(false);
        añadir.setFocusable(false);
        añadir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        añadir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        añadir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });
        jPanel2.add(añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 150, 100));

        eliminar.setBackground(new java.awt.Color(255, 255, 255));
        eliminar.setFont(new java.awt.Font("Nirmala UI", 0, 19)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 0, 1));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-delete-100.png"))); // NOI18N
        eliminar.setBorder(null);
        eliminar.setBorderPainted(false);
        eliminar.setContentAreaFilled(false);
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eliminar.setDefaultCapable(false);
        eliminar.setFocusPainted(false);
        eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        eliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarMouseExited(evt);
            }
        });
        jPanel2.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 130, 100));

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setFont(new java.awt.Font("Nirmala UI", 0, 19)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 0, 1));
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-search-120.png"))); // NOI18N
        buscar.setBorder(null);
        buscar.setBorderPainted(false);
        buscar.setContentAreaFilled(false);
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buscar.setDefaultCapable(false);
        buscar.setFocusPainted(false);
        buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buscar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarMouseExited(evt);
            }
        });
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel2.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 130, 120));

        panelHome.add(jPanel2);
        jPanel2.setBounds(10, 260, 710, 280);

        getContentPane().add(panelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 810, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea cerrar sesión?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirmar == 0) {
            Login lol = new Login();
            lol.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        AñadirReceta añadir = new AñadirReceta();
        añadir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_añadirActionPerformed

    private void eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseExited

    }//GEN-LAST:event_eliminarMouseExited

    private void eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseEntered

    }//GEN-LAST:event_eliminarMouseEntered

    private void modificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseExited

    }//GEN-LAST:event_modificarMouseExited

    private void modificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseEntered

    }//GEN-LAST:event_modificarMouseEntered

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
//220X530
//30x260
//230+710
        int pos = jPanel1.getX();
        if (pos > -10) {
            Animacion.Animacion.mover_izquierda(0, -182, 2, 2, jPanel1);
            Animacion.Animacion.mover_izquierda(230, 30, 2, 2, jPanel2);

        } else {
            Animacion.Animacion.mover_derecha(-182, 0, 2, 2, jPanel1);
            Animacion.Animacion.mover_derecha(30, 230, 2, 2, jPanel2);
        }


    }//GEN-LAST:event_jLabel1MouseClicked

    private void configMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configMouseClicked
        EditarUsuario edit = new EditarUsuario();
        edit.setVisible(true);
    }//GEN-LAST:event_configMouseClicked

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed

        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseExited

    }//GEN-LAST:event_buscarMouseExited

    private void buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseEntered

    }//GEN-LAST:event_buscarMouseEntered

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setForeground(new Color(129, 129, 129));
    }//GEN-LAST:event_jLabel2MouseExited

    private void configMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configMouseExited
        config.setForeground(new Color(129, 129, 129));
    }//GEN-LAST:event_configMouseExited

    private void configMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configMouseEntered
        config.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_configMouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setForeground(new Color(255, 255, 255));

    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setForeground(new Color(129, 129, 129));
    }//GEN-LAST:event_jLabel4MouseExited

    private void eliminarrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarrMouseEntered
        eliminarr.setForeground(new Color(129, 129, 129));
    }//GEN-LAST:event_eliminarrMouseEntered

    private void eliminarrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarrMouseExited
        eliminarr.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_eliminarrMouseExited

    private void editarrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarrMouseEntered
        editarr.setForeground(new Color(129, 129, 129));
    }//GEN-LAST:event_editarrMouseEntered

    private void editarrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarrMouseExited
        editarr.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_editarrMouseExited

    private void buscarrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarrMouseEntered
        buscarr.setForeground(new Color(129, 129, 129));
    }//GEN-LAST:event_buscarrMouseEntered

    private void buscarrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarrMouseExited
        buscarr.setForeground(new Color(0, 0, 0));

    }//GEN-LAST:event_buscarrMouseExited

    private void aniadir3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aniadir3MouseEntered
        aniadir3.setForeground(new Color(129, 129, 129));
    }//GEN-LAST:event_aniadir3MouseEntered

    private void aniadir3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aniadir3MouseExited
        aniadir3.setForeground(new Color(0, 0, 0));

    }//GEN-LAST:event_aniadir3MouseExited

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        Busqueda bs = new Busqueda();
        this.dispose();
        bs.setVisible(true);

    }//GEN-LAST:event_buscarMouseClicked

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
      ModificarReceta rec= new ModificarReceta();
      rec.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_modificarActionPerformed
   public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aniadir3;
    private javax.swing.JButton añadir;
    private javax.swing.JLabel bienvenido;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel buscarr;
    private javax.swing.JLabel config;
    private javax.swing.JLabel editarr;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel eliminarr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logout;
    private javax.swing.JButton modificar;
    private javax.swing.JLabel nom;
    private javax.swing.JPanel panelHome;
    private javax.swing.JLabel qdh;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
