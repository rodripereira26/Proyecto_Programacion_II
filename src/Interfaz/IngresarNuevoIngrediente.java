package Interfaz;

import Datos.Ingrediente;
import Datos.NuevoIngrediente;
import Conexion.SQL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class IngresarNuevoIngrediente extends javax.swing.JDialog {

    int suma = 0;

    public IngresarNuevoIngrediente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        nom.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        costo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        carbohidratos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        grasas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        proteinas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelCal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel25.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 0, 153));
        jLabel25.setText("GOURMET");

        jLabel26.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel26.setText("Carbohidratos: 4  Kcal/gramo");

        jLabel27.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel27.setText("Proteínas: 4  Kcal/gramo");

        jLabel28.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel28.setText("Grasas: 9  Kcal/gramo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(11, Short.MAX_VALUE)
                        .addComponent(jLabel26))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel27))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel28))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(41, 41, 41)
                .addComponent(jLabel26)
                .addGap(37, 37, 37)
                .addComponent(jLabel27)
                .addGap(29, 29, 29)
                .addComponent(jLabel28)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -265, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Costo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 60, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Carbohidratos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Grasas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Proteinas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 90, -1));

        nom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nom.setForeground(new java.awt.Color(102, 102, 102));
        nom.setBorder(null);
        nom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nom.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nomCaretUpdate(evt);
            }
        });
        nom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomFocusGained(evt);
            }
        });
        nom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomMouseClicked(evt);
            }
        });
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomKeyPressed(evt);
            }
        });
        jPanel1.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("___________________");
        jLabel7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel7FocusGained(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 210, 20));

        costo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        costo.setForeground(new java.awt.Color(102, 102, 102));
        costo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costo.setBorder(null);
        costo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        costo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                costoCaretUpdate(evt);
            }
        });
        costo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                costoFocusGained(evt);
            }
        });
        costo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                costoMouseClicked(evt);
            }
        });
        costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoActionPerformed(evt);
            }
        });
        costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                costoKeyPressed(evt);
            }
        });
        jPanel1.add(costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 120, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("__________");
        jLabel8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel8FocusGained(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 120, 20));

        carbohidratos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        carbohidratos.setForeground(new java.awt.Color(102, 102, 102));
        carbohidratos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        carbohidratos.setBorder(null);
        carbohidratos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        carbohidratos.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                carbohidratosCaretUpdate(evt);
            }
        });
        carbohidratos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                carbohidratosFocusGained(evt);
            }
        });
        carbohidratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carbohidratosMouseClicked(evt);
            }
        });
        carbohidratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carbohidratosActionPerformed(evt);
            }
        });
        carbohidratos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                carbohidratosKeyPressed(evt);
            }
        });
        jPanel1.add(carbohidratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("__________");
        jLabel9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel9FocusGained(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 110, 20));

        grasas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grasas.setForeground(new java.awt.Color(102, 102, 102));
        grasas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        grasas.setBorder(null);
        grasas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        grasas.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                grasasCaretUpdate(evt);
            }
        });
        grasas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                grasasFocusGained(evt);
            }
        });
        grasas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grasasMouseClicked(evt);
            }
        });
        grasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grasasActionPerformed(evt);
            }
        });
        grasas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grasasKeyPressed(evt);
            }
        });
        jPanel1.add(grasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 110, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("__________");
        jLabel11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel11FocusGained(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 110, 20));

        proteinas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        proteinas.setForeground(new java.awt.Color(102, 102, 102));
        proteinas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        proteinas.setBorder(null);
        proteinas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        proteinas.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                proteinasCaretUpdate(evt);
            }
        });
        proteinas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                proteinasFocusGained(evt);
            }
        });
        proteinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proteinasMouseClicked(evt);
            }
        });
        proteinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinasActionPerformed(evt);
            }
        });
        proteinas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                proteinasKeyPressed(evt);
            }
        });
        jPanel1.add(proteinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 110, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("__________");
        jLabel12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel12FocusGained(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 110, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-back-50.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        labelCal.setBackground(new java.awt.Color(0, 0, 0));
        labelCal.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        labelCal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(-115, 420, 110, 40));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Calorias");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-85, 380, 80, 20));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel13.setText("$");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Crear");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 120, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnvioleta.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 120, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-95, 410, 90, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-information-24.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_nomCaretUpdate

    }//GEN-LAST:event_nomCaretUpdate

    private void nomFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomFocusGained

    }//GEN-LAST:event_nomFocusGained

    private void nomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomMouseClicked

    }//GEN-LAST:event_nomMouseClicked

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed

    }//GEN-LAST:event_nomActionPerformed

    private void nomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyPressed

    }//GEN-LAST:event_nomKeyPressed

    private void jLabel7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel7FocusGained

    }//GEN-LAST:event_jLabel7FocusGained

    private void costoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_costoCaretUpdate

    }//GEN-LAST:event_costoCaretUpdate

    private void costoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_costoFocusGained

    }//GEN-LAST:event_costoFocusGained

    private void costoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_costoMouseClicked

    }//GEN-LAST:event_costoMouseClicked

    private void costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoActionPerformed

    }//GEN-LAST:event_costoActionPerformed

    private void costoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costoKeyPressed

    }//GEN-LAST:event_costoKeyPressed

    private void jLabel8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel8FocusGained

    }//GEN-LAST:event_jLabel8FocusGained

    private void carbohidratosCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_carbohidratosCaretUpdate


    }//GEN-LAST:event_carbohidratosCaretUpdate

    private void carbohidratosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_carbohidratosFocusGained

    }//GEN-LAST:event_carbohidratosFocusGained

    private void carbohidratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carbohidratosMouseClicked

    }//GEN-LAST:event_carbohidratosMouseClicked

    private void carbohidratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carbohidratosActionPerformed

    }//GEN-LAST:event_carbohidratosActionPerformed

    private void carbohidratosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carbohidratosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int x = jLabel5.getX();

            if (!carbohidratos.getText().equals("") && !grasas.getText().equals("") && !proteinas.equals("")) {

                int grasa = (Integer.parseInt(grasas.getText())) * 9;
                int carbs = (Integer.parseInt(carbohidratos.getText())) * 4;
                int prot = (Integer.parseInt(proteinas.getText())) * 4;

                suma = grasa + carbs + prot;

                labelCal.setText(Integer.toString(suma));

                if (x < -80) {

                    Animacion.Animacion.mover_derecha(-85, 70, 2, 10, jLabel5);
                    Animacion.Animacion.mover_derecha(-95, 60, 10, 10, jSeparator1);
                    Animacion.Animacion.mover_derecha(-115, 50, 10, 10, labelCal);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
            }
        }
    }//GEN-LAST:event_carbohidratosKeyPressed

    private void jLabel9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel9FocusGained

    }//GEN-LAST:event_jLabel9FocusGained

    private void grasasCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_grasasCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_grasasCaretUpdate

    private void grasasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_grasasFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_grasasFocusGained

    private void grasasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grasasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grasasMouseClicked

    private void grasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grasasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grasasActionPerformed

    private void grasasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grasasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int x = jLabel5.getX();

            if (!carbohidratos.getText().equals("") && !grasas.getText().equals("") && !proteinas.equals("")) {

                int grasa = (Integer.parseInt(grasas.getText())) * 9;
                int carbs = (Integer.parseInt(carbohidratos.getText())) * 4;
                int prot = (Integer.parseInt(proteinas.getText())) * 4;

                int suma = grasa + carbs + prot;

                labelCal.setText(Integer.toString(suma));

                if (x < -80) {

                    Animacion.Animacion.mover_derecha(-85, 70, 2, 10, jLabel5);
                    Animacion.Animacion.mover_derecha(-95, 60, 10, 10, jSeparator1);
                    Animacion.Animacion.mover_derecha(-115, 50, 10, 10, labelCal);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
            }
        }
    }//GEN-LAST:event_grasasKeyPressed

    private void jLabel11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel11FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11FocusGained

    private void proteinasCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_proteinasCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinasCaretUpdate

    private void proteinasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_proteinasFocusGained


    }//GEN-LAST:event_proteinasFocusGained

    private void proteinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proteinasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinasMouseClicked

    private void proteinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinasActionPerformed

    private void proteinasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proteinasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int x = jLabel5.getX();

            if (!carbohidratos.getText().equals("") && !grasas.getText().equals("") && !proteinas.equals("")) {

                int grasa = (Integer.parseInt(grasas.getText())) * 9;
                int carbs = (Integer.parseInt(carbohidratos.getText())) * 4;
                int prot = (Integer.parseInt(proteinas.getText())) * 4;

                suma = grasa + carbs + prot;

                labelCal.setText(Integer.toString(suma));

                if (x < -80) {

                    Animacion.Animacion.mover_derecha(-85, 70, 2, 10, jLabel5);
                    Animacion.Animacion.mover_derecha(-95, 60, 10, 10, jSeparator1);
                    Animacion.Animacion.mover_derecha(-115, 50, 10, 10, labelCal);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
            }
        }
    }//GEN-LAST:event_proteinasKeyPressed

    private void jLabel12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel12FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12FocusGained

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        dispose();

    }//GEN-LAST:event_jLabel10MouseClicked

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed


    }//GEN-LAST:event_jPanel1KeyPressed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked


    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered

        //-265,0
        Animacion.Animacion.bajar(-265, 0, 2, 2, jPanel4);

    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited

        Animacion.Animacion.subir(0, -265, 2, 2, jPanel4);
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        NuevoIngrediente ing = new NuevoIngrediente();
        Ingrediente ing2 = new Ingrediente();
        SQL sql = new SQL();

        String nombre = nom.getText().toLowerCase();
        String nombre2 = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);

        if (!nom.getText().equals("") || !costo.getText().equals("") || !carbohidratos.getText().equals("") || !grasas.getText().equals("") || !proteinas.getText().equals("")) {

            int grasa = (Integer.parseInt(grasas.getText())) * 9;
            int carbs = (Integer.parseInt(carbohidratos.getText())) * 4;
            int prot = (Integer.parseInt(proteinas.getText())) * 4;
            suma = grasa + carbs + prot;

            NuevoIngrediente.setNombre(nombre2);
            NuevoIngrediente.setCosto(Integer.valueOf(costo.getText()));
            NuevoIngrediente.setCarbohidratos(Integer.parseInt(carbohidratos.getText()));
            NuevoIngrediente.setGrasas(Integer.parseInt(grasas.getText()));
            NuevoIngrediente.setProteinas(Integer.parseInt(proteinas.getText()));
            NuevoIngrediente.setCalorias(suma);

            if (sql.existeIngrediente(ing) == 0) {
                if (sql.insertarIngrediente(ing)) {

                    try {
                        Thread.sleep(3000);
                        int x = jLabel5.getX();

                        int grasa1 = (Integer.parseInt(grasas.getText())) * 9;
                        int carbs1 = (Integer.parseInt(carbohidratos.getText())) * 4;
                        int prot1 = (Integer.parseInt(proteinas.getText())) * 4;

                        suma = grasa1 + carbs1 + prot1;

                        labelCal.setText(Integer.toString(suma));

                        if (x < -80) {

                            Animacion.Animacion.mover_derecha(-85, 70, 2, 10, jLabel5);
                            Animacion.Animacion.mover_derecha(-95, 60, 10, 10, jSeparator1);
                            Animacion.Animacion.mover_derecha(-115, 50, 10, 10, labelCal);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(IngresarNuevoIngrediente.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    MenuIngrediente men = new MenuIngrediente(new javax.swing.JDialog(), true);
                    men.dispose();
                    men.setVisible(true);
                    men.nombreIngrediente.setSelectedItem(nombre2);
                    this.dispose();
                    System.out.println(Ingrediente.getNombre());
                    JOptionPane.showMessageDialog(null, "Ingrediente creado con éxito");

                } else {
                    JOptionPane.showMessageDialog(null, "Error al crear el ingrediente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El ingrediente ya fue creado");
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField carbohidratos;
    public javax.swing.JTextField costo;
    private javax.swing.JTextField grasas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCal;
    public javax.swing.JTextField nom;
    private javax.swing.JTextField proteinas;
    // End of variables declaration//GEN-END:variables
}
