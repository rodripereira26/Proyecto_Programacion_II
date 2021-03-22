package Interfaz;

import Datos.ArrayIngredientes;
import Datos.Ingrediente;
import Datos.NuevoIngrediente;
import Datos.Pasos;
import Conexion.SQL;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class MenuIngrediente extends javax.swing.JDialog {

    Ingrediente ing = new Ingrediente();
    SQL sql = new SQL();
    AñadirReceta an = new AñadirReceta();
    ArrayIngredientes arrayIng = new ArrayIngredientes();

    int posX = 0;
    int posY = 0;

    ArrayList id = new ArrayList();
    ArrayList nombres2 = new ArrayList();

    public MenuIngrediente(javax.swing.JDialog parent, boolean modal) {

        initComponents();
        this.setLocationRelativeTo(null);
        nombreIngrediente.removeAllItems();
        ArrayList<String> ali = new ArrayList<String>();
        ali = sql.traerIngrediente();
        for (int i = 0; i < ali.size(); i++) {
            nombreIngrediente.addItem(ali.get(i).substring(0, 1).toUpperCase() + ali.get(i).substring(1));
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        panelAñadirIngrediente = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        unidadIngrediente = new javax.swing.JComboBox<>();
        cantidadIngrediente = new javax.swing.JSpinner();
        nombreIngrediente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(520, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAñadirIngrediente.setBackground(new java.awt.Color(255, 255, 255));
        panelAñadirIngrediente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        panelAñadirIngrediente.setForeground(new java.awt.Color(255, 255, 255));
        panelAñadirIngrediente.setFocusable(false);
        panelAñadirIngrediente.setPreferredSize(new java.awt.Dimension(530, 250));
        panelAñadirIngrediente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        panelAñadirIngrediente.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tituloAña.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelAñadirIngrediente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 430, 61));

        unidadIngrediente.setEditable(true);
        unidadIngrediente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "gramos", "unidad", "kilos", "libras" }));
        unidadIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadIngredienteActionPerformed(evt);
            }
        });
        panelAñadirIngrediente.add(unidadIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 150, 38));
        panelAñadirIngrediente.add(cantidadIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 150, 38));

        nombreIngrediente.setEditable(true);
        nombreIngrediente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        nombreIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreIngredienteActionPerformed(evt);
            }
        });
        nombreIngrediente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreIngredienteKeyPressed(evt);
            }
        });
        panelAñadirIngrediente.add(nombreIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 150, 38));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Ingrediente");
        panelAñadirIngrediente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Cantidad");
        panelAñadirIngrediente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Unidad");
        panelAñadirIngrediente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Añadir");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        panelAñadirIngrediente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncelestitolargo.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        panelAñadirIngrediente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-search-32.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("_________");

        buscar.setForeground(new java.awt.Color(102, 102, 102));
        buscar.setBorder(null);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel6))
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAñadirIngrediente.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 360, 170, 60));

        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel9MouseDragged(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        panelAñadirIngrediente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 60));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nuevo");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        panelAñadirIngrediente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 60, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncelestitolargo.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        panelAñadirIngrediente.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, 70));

        getContentPane().add(panelAñadirIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 532, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseEntered

    }//GEN-LAST:event_botonAtrasMouseEntered

    private void botonAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseExited

    }//GEN-LAST:event_botonAtrasMouseExited

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void unidadIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadIngredienteActionPerformed

    }//GEN-LAST:event_unidadIngredienteActionPerformed

    private void nombreIngredienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreIngredienteKeyPressed

    }//GEN-LAST:event_nombreIngredienteKeyPressed

    private void nombreIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreIngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreIngredienteActionPerformed

    private void buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String ingrediente = buscar.getText().toLowerCase();
            String ingrediente2 = ingrediente.substring(0, 1).toUpperCase() + ingrediente.substring(1);
            ArrayList ali = new ArrayList();
            boolean ok = true;

            for (int i = 0; i < nombreIngrediente.getModel().getSize(); i++) {
                ali.add(nombreIngrediente.getModel().getElementAt(i));
            }
            for (int i = 0; i < ali.size(); i++) {
                if (!buscar.getText().equals("")) {
                    if (ingrediente2.equals(ali.get(i))) {
                        nombreIngrediente.setSelectedItem(ingrediente2);
                        buscar.setText("");
                        int x = jPanel3.getX();
                        if (x < 472) {
                            Animacion.Animacion.mover_derecha(362, 472, 2, 2, jPanel3);
                        }
                        buscar.setText("");
                        ok = true;
                        break;

                    } else {
                        if (!ingrediente2.equals(ali.get(i))) {

                            ok = false;
                        }
                    }
                }
            }
            if (ok == false) {
                NuevoIngrediente nuevoIng = new NuevoIngrediente();
                nuevoIng.setNombre(buscar.getText());
                int confirmar = JOptionPane.showConfirmDialog(null, "No se encuentra registrado este ingrediente\n\t¿Desea registrarlo?", "Error", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (confirmar == 0) {
                    IngresarNuevoIngrediente ingresarIng = new IngresarNuevoIngrediente(new javax.swing.JFrame(), true);
                    ingresarIng.nom.setText(buscar.getText());
                    ingresarIng.costo.requestFocus();
                    ingresarIng.setVisible(true);
                    this.dispose();

                }
            }
        }
    }//GEN-LAST:event_buscarKeyPressed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        buscar.requestFocus();
        //410
        int x = jPanel3.getX();
        if (x > 460) {
            Animacion.Animacion.mover_izquierda(472, 362, 2, 2, jPanel3);
        } else {
            Animacion.Animacion.mover_derecha(362, 472, 2, 2, jPanel3);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        if (ArrayIngredientes.getIngredientes().contains(nombreIngrediente.getSelectedItem())) {
            JOptionPane.showMessageDialog(null, "Ya agregó este ingrediente");
        } else {
            if (!cantidadIngrediente.getValue().equals(0)) {
                ArrayIngredientes.getIngredientes().add(nombreIngrediente.getSelectedItem());
                ArrayIngredientes.getUnidades().add(unidadIngrediente.getSelectedItem());
                ArrayIngredientes.getCantidades().add(cantidadIngrediente.getValue());
                for (int i = 0; i < ArrayIngredientes.getIngredientes().size(); i++) {
                    Ingrediente.setNombre(ArrayIngredientes.getIngredientes());
                }
                for (int i = 0; i < ArrayIngredientes.getCantidades().size(); i++) {
                    Ingrediente.setCantidad(ArrayIngredientes.getCantidades());
                }
                for (int i = 0; i < ArrayIngredientes.getUnidades().size(); i++) {
                    Ingrediente.setUnidad(ArrayIngredientes.getUnidades());
                }
                id = sql.ingrediente();
                for (int o = 0; o < id.size(); o++) {
                    ArrayIngredientes.getId().add(id.get(o));
                    Ingrediente.setId(ArrayIngredientes.getId());
                }
                System.out.println(Ingrediente.getId());
                System.out.println(ArrayIngredientes.getIngredientes());
                nombreIngrediente.setSelectedIndex(0);
                unidadIngrediente.setSelectedIndex(0);
                cantidadIngrediente.setValue(0);
            } else {
                JOptionPane.showMessageDialog(null, "No agregó una cantidad");
            }
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseDragged
        setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_jLabel9MouseDragged

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed

        int posX = evt.getX();
        int posY = evt.getY();

    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        if (ArrayIngredientes.getIngredientes().contains(nombreIngrediente.getSelectedItem())) {
            JOptionPane.showMessageDialog(null, "Ya agregó este ingrediente");
        } else {
            ArrayIngredientes.getIngredientes().add(nombreIngrediente.getSelectedItem());
            ArrayIngredientes.getUnidades().add(unidadIngrediente.getSelectedItem());
            ArrayIngredientes.getCantidades().add(cantidadIngrediente.getValue());
            for (int i = 0; i < ArrayIngredientes.getIngredientes().size(); i++) {
                Ingrediente.setNombre(ArrayIngredientes.getIngredientes());
            }
            for (int i = 0; i < ArrayIngredientes.getCantidades().size(); i++) {
                Ingrediente.setCantidad(ArrayIngredientes.getCantidades());
            }
            for (int i = 0; i < ArrayIngredientes.getUnidades().size(); i++) {
                Ingrediente.setUnidad(ArrayIngredientes.getUnidades());
            }
            id = sql.ingrediente();
            for (int o = 0; o < id.size(); o++) {
                ArrayIngredientes.getId().add(id.get(o));
                Ingrediente.setId(ArrayIngredientes.getId());
            }
            System.out.println(Ingrediente.getId());
            System.out.println(ArrayIngredientes.getIngredientes());
            nombreIngrediente.setSelectedIndex(0);
            unidadIngrediente.setSelectedIndex(0);
            cantidadIngrediente.setValue(0);
        }


    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked

        IngresarNuevoIngrediente inn = new IngresarNuevoIngrediente(new javax.swing.JFrame(), true);
        inn.setVisible(true);
        inn.nom.requestFocus();

    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JTextField buscar;
    private javax.swing.JSpinner cantidadIngrediente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JComboBox<String> nombreIngrediente;
    private javax.swing.JPanel panelAñadirIngrediente;
    public javax.swing.JComboBox<String> unidadIngrediente;
    // End of variables declaration//GEN-END:variables
}
