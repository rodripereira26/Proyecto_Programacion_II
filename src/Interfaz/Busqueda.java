


package Interfaz;

import Datos.ArrayBusqueda;
import Datos.Buscar;
import Conexion.SQL;
import Datos.UsuarioTemporal;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Busqueda extends javax.swing.JFrame {

    static boolean titulo = true;
    ArrayBusqueda busqueda = new ArrayBusqueda();
    SQL sql = new SQL();
    Buscar nom = new Buscar();

    public Busqueda() {

        initComponents();

        this.setLocationRelativeTo(null);
        try {
            setIconImage(new ImageIcon(getClass().getResource("../Imagenes/icono.png")).getImage());
        } catch (Exception e) {

        }

    }

    /*
    public void cargarPaneles() {
        
        if (busqueda.paneles.size() != 0) {
            resultados1.removeAll();
            resultados1.setLayout(new GridLayout(busqueda.paneles.size(), 1));
           
            for (JPanel panel : busqueda.paneles) {
                resultados1.add(panel);
            }
            resultados1.updateUI();
            resultados1.repaint();
            this.repaint();

        } else {
            JOptionPane.showMessageDialog(null, "No hay resultados para su busqueda");
       
        }
    }

    public void forPaneles(int cantidad) {
        for (int i = 0; i < cantidad; i++) {

            busqueda.dificultad2.add(busqueda.dificultad1.get(i));
            busqueda.usuario2.add(busqueda.usuario1.get(i));
            busqueda.id2.add(busqueda.id1.get(i));
            busqueda.duracion2.add(busqueda.duracion1.get(i));
            busqueda.comentario2.add(busqueda.comentario1.get(i));
            busqueda.descripcion2.add(busqueda.descripcion1.get(i));

            Buscar.setIdpru(busqueda.id1.get(i)); // String en la clase Buscar que manda el valor al metodo Pruebaing

            Buscar.setDificultad(busqueda.dificultad2);
            Buscar.setId(busqueda.id2);
            Buscar.setUsuario(busqueda.usuario2);
            Buscar.setDuracion(busqueda.duracion2);
            Buscar.setComentario(busqueda.comentario2);
            Buscar.setDescripcion(busqueda.descripcion2);

            busqueda.paneles.add(new BusquedaReceta());

        }
    }
     */
    public void limpiar() {

        Animacion.Animacion.bajar(-580, 0, 2, 3, PanelBusqueda);

        CampoNombre.setText("");
        campoIngrediente.setText("");
        ComboDificultad.setSelectedItem("");
        ComboDificultad.setSelectedItem("");
        desdeCosto.setText("");
        desde1.setText("");
        hastaCosto.setText("");
        hasta1.setText("");

        busqueda.limpiarArrays();

        Buscar.setNombre("");
        Buscar.setIdpru("");
        Buscar.setTipoBusqueda("");
        Buscar.setDificultadBusqueda("");
        Buscar.setIngredienteBusqueda("");
        Buscar.getId().clear();
        Buscar.getUsuario().clear();
        Buscar.getDuracion().clear();
        Buscar.getComentario().clear();
        Buscar.getDescripcion().clear();
        Buscar.getDificultad().clear();
        Buscar.getNombrePorCalorias().clear();
        Buscar.getNombrePorCosto().clear();
        //Buscar.getNombrePorTipo().clear();
        //Buscar.getNombrePorDificultad().clear();
        Buscar.getNombrePorIngrediente().clear();
        Buscar.setSeleccionadoDificultad(false);
        Buscar.setSeleccionadoNombre(false);
        Buscar.setSeleccionadoTipo(false);
        Buscar.setSeleccionadoIngrediente(false);
        Buscar.setSeleccionadoCalorias(false);
        Buscar.setSeleccionadoCosto(false);

        principal.updateUI();
        principal.repaint();
        resultados1.updateUI();
        resultados1.repaint();
        this.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBusqueda = new javax.swing.JPanel();
        LabelCalorias = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        labelCosto = new javax.swing.JLabel();
        LabelIngrediente = new javax.swing.JLabel();
        LabelDificultad = new javax.swing.JLabel();
        LabelTipo = new javax.swing.JLabel();
        PanelCosto = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        hastaCosto = new javax.swing.JTextField();
        desdeCosto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        BuscarCosto = new javax.swing.JLabel();
        PanelNombre = new javax.swing.JPanel();
        CampoNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BuscarNombre = new javax.swing.JLabel();
        PanelTitulo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PanelCal = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        hasta1 = new javax.swing.JTextField();
        desde1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        PanelDificultad = new javax.swing.JPanel();
        ComboDificultad = new javax.swing.JComboBox<>();
        BuscarDificultad = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        PanelTipo = new javax.swing.JPanel();
        ComboTipo = new javax.swing.JComboBox<>();
        buscarTipo = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        PanelIngrediente = new javax.swing.JPanel();
        campoIngrediente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        buscarIngrediente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        principal = new javax.swing.JPanel();
        displayScroll1 = new javax.swing.JScrollPane();
        resultados1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cantResultados = new javax.swing.JLabel();
        cantResult = new javax.swing.JLabel();
        atras = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        BusquedaPor1 = new javax.swing.JLabel();
        displayScroll = new javax.swing.JScrollPane();
        resultados = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBusqueda.setBackground(new java.awt.Color(51, 51, 51));
        PanelBusqueda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelCalorias.setFont(new java.awt.Font("Segoe UI Black", 1, 32)); // NOI18N
        LabelCalorias.setForeground(new java.awt.Color(255, 255, 255));
        LabelCalorias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelCalorias.setText("Buscar por Calorías");
        LabelCalorias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LabelCalorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelCaloriasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelCaloriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelCaloriasMouseExited(evt);
            }
        });
        PanelBusqueda.add(LabelCalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 350, 50));

        LabelNombre.setBackground(new java.awt.Color(102, 102, 102));
        LabelNombre.setFont(new java.awt.Font("Segoe UI Black", 1, 32)); // NOI18N
        LabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelNombre.setText("Buscar por Nombre");
        LabelNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LabelNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelNombreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelNombreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelNombreMouseExited(evt);
            }
        });
        PanelBusqueda.add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 350, 50));

        labelCosto.setBackground(new java.awt.Color(255, 255, 255));
        labelCosto.setFont(new java.awt.Font("Segoe UI Black", 1, 32)); // NOI18N
        labelCosto.setForeground(new java.awt.Color(255, 255, 255));
        labelCosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCosto.setText("Buscar por Costo");
        labelCosto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelCosto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCostoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCostoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCostoMouseExited(evt);
            }
        });
        PanelBusqueda.add(labelCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 300, 50));

        LabelIngrediente.setFont(new java.awt.Font("Segoe UI Black", 1, 32)); // NOI18N
        LabelIngrediente.setForeground(new java.awt.Color(255, 255, 255));
        LabelIngrediente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelIngrediente.setText("Buscar por Ingrediente");
        LabelIngrediente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LabelIngrediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelIngredienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelIngredienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelIngredienteMouseExited(evt);
            }
        });
        PanelBusqueda.add(LabelIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, 50));

        LabelDificultad.setFont(new java.awt.Font("Segoe UI Black", 1, 32)); // NOI18N
        LabelDificultad.setForeground(new java.awt.Color(255, 255, 255));
        LabelDificultad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDificultad.setText("Buscar por Dificultad");
        LabelDificultad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LabelDificultad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelDificultadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelDificultadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelDificultadMouseExited(evt);
            }
        });
        PanelBusqueda.add(LabelDificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 380, 50));

        LabelTipo.setFont(new java.awt.Font("Segoe UI Black", 1, 32)); // NOI18N
        LabelTipo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTipo.setText("Buscar por Tipo");
        LabelTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LabelTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelTipoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelTipoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelTipoMouseExited(evt);
            }
        });
        PanelBusqueda.add(LabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 280, 50));

        PanelCosto.setBackground(new java.awt.Color(51, 51, 51));
        PanelCosto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Hasta");
        PanelCosto.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, 32));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Desde");
        PanelCosto.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 32));

        hastaCosto.setBackground(new java.awt.Color(51, 51, 51));
        hastaCosto.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        hastaCosto.setForeground(new java.awt.Color(204, 204, 204));
        hastaCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hastaCosto.setBorder(null);
        PanelCosto.add(hastaCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 140, 40));

        desdeCosto.setBackground(new java.awt.Color(51, 51, 51));
        desdeCosto.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        desdeCosto.setForeground(new java.awt.Color(204, 204, 204));
        desdeCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        desdeCosto.setBorder(null);
        PanelCosto.add(desdeCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 39));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("/");
        PanelCosto.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 20, 40));
        PanelCosto.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, 10));
        PanelCosto.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 140, 10));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("$");
        PanelCosto.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("$");
        PanelCosto.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        BuscarCosto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-search-50 (1).png"))); // NOI18N
        BuscarCosto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarCostoMouseClicked(evt);
            }
        });
        PanelCosto.add(BuscarCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        PanelBusqueda.add(PanelCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, -145, 500, 140));

        PanelNombre.setBackground(new java.awt.Color(51, 51, 51));
        PanelNombre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoNombre.setBackground(new java.awt.Color(51, 51, 51));
        CampoNombre.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        CampoNombre.setForeground(new java.awt.Color(255, 255, 255));
        CampoNombre.setBorder(null);
        PanelNombre.add(CampoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 280, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Búsqueda");
        PanelNombre.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 150, 50));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("______________________________________________________________________");
        jLabel4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel4FocusGained(evt);
            }
        });
        PanelNombre.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 320, 10));

        BuscarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-search-50 (1).png"))); // NOI18N
        BuscarNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BuscarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarNombreMouseClicked(evt);
            }
        });
        PanelNombre.add(BuscarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 50, -1));

        PanelBusqueda.add(PanelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -175, 490, 170));

        PanelTitulo.setBackground(new java.awt.Color(51, 51, 51));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 65)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(234, 234, 183));
        jLabel6.setText("Buscar");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Selecicone un criterio ");

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloLayout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(200, 200, 200))
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        PanelBusqueda.add(PanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 730, 190));

        PanelCal.setBackground(new java.awt.Color(51, 51, 51));
        PanelCal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hasta");
        PanelCal.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, 32));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Desde");
        PanelCal.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 32));

        hasta1.setBackground(new java.awt.Color(51, 51, 51));
        hasta1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        hasta1.setForeground(new java.awt.Color(204, 204, 204));
        hasta1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        hasta1.setBorder(null);
        PanelCal.add(hasta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 160, 40));

        desde1.setBackground(new java.awt.Color(51, 51, 51));
        desde1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        desde1.setForeground(new java.awt.Color(204, 204, 204));
        desde1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        desde1.setBorder(null);
        PanelCal.add(desde1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 39));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("/");
        PanelCal.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 20, 40));
        PanelCal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, 10));
        PanelCal.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 160, 10));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-search-50 (1).png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        PanelCal.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        PanelBusqueda.add(PanelCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, -145, 510, 140));

        PanelDificultad.setBackground(new java.awt.Color(51, 51, 51));

        ComboDificultad.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        ComboDificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fácil", "Media", "Difícil" }));

        BuscarDificultad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-search-64 (2).png"))); // NOI18N
        BuscarDificultad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarDificultadMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Dificultad");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelDificultadLayout = new javax.swing.GroupLayout(PanelDificultad);
        PanelDificultad.setLayout(PanelDificultadLayout);
        PanelDificultadLayout.setHorizontalGroup(
            PanelDificultadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDificultadLayout.createSequentialGroup()
                .addGroup(PanelDificultadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDificultadLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(ComboDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BuscarDificultad))
                    .addGroup(PanelDificultadLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel18)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        PanelDificultadLayout.setVerticalGroup(
            PanelDificultadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDificultadLayout.createSequentialGroup()
                .addGroup(PanelDificultadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelDificultadLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BuscarDificultad))
                    .addGroup(PanelDificultadLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ComboDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );

        PanelBusqueda.add(PanelDificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -195, 540, 190));

        PanelTipo.setBackground(new java.awt.Color(51, 51, 51));

        ComboTipo.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        ComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Postres", "Carnes", "Pastas", "Ensalada", "Plato Principal", " " }));

        buscarTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-search-64 (2).png"))); // NOI18N
        buscarTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarTipoMouseClicked(evt);
            }
        });

        jlabel.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jlabel.setForeground(new java.awt.Color(255, 255, 255));
        jlabel.setText("Tipo de Receta");
        jlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelTipoLayout = new javax.swing.GroupLayout(PanelTipo);
        PanelTipo.setLayout(PanelTipoLayout);
        PanelTipoLayout.setHorizontalGroup(
            PanelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTipoLayout.createSequentialGroup()
                .addGroup(PanelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTipoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(ComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarTipo))
                    .addGroup(PanelTipoLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jlabel)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        PanelTipoLayout.setVerticalGroup(
            PanelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTipoLayout.createSequentialGroup()
                .addGroup(PanelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelTipoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarTipo))
                    .addGroup(PanelTipoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );

        PanelBusqueda.add(PanelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -195, 540, 190));

        PanelIngrediente.setBackground(new java.awt.Color(51, 51, 51));
        PanelIngrediente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoIngrediente.setBackground(new java.awt.Color(51, 51, 51));
        campoIngrediente.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        campoIngrediente.setForeground(new java.awt.Color(255, 255, 255));
        campoIngrediente.setBorder(null);
        campoIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIngredienteActionPerformed(evt);
            }
        });
        PanelIngrediente.add(campoIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 280, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Búsqueda");
        PanelIngrediente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 150, 50));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("______________________________________________________________________");
        jLabel22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel22FocusGained(evt);
            }
        });
        PanelIngrediente.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 320, 10));

        buscarIngrediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-search-50 (1).png"))); // NOI18N
        buscarIngrediente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buscarIngrediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarIngredienteMouseClicked(evt);
            }
        });
        PanelIngrediente.add(buscarIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 50, -1));

        PanelBusqueda.add(PanelIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -175, 490, 170));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-back-50_1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        PanelBusqueda.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(PanelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 580));

        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        displayScroll1.setBorder(null);

        resultados1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout resultados1Layout = new javax.swing.GroupLayout(resultados1);
        resultados1.setLayout(resultados1Layout);
        resultados1Layout.setHorizontalGroup(
            resultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        resultados1Layout.setVerticalGroup(
            resultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        displayScroll1.setViewportView(resultados1);

        principal.add(displayScroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 860, 470));

        Titulo.setBackground(new java.awt.Color(231, 158, 109));
        Titulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("RESULTADOS");
        Titulo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 56));

        cantResultados.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cantResultados.setText("Cantidad de resultados:");
        Titulo.add(cantResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 81, 130, 20));

        cantResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Titulo.add(cantResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 81, 102, 20));

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-back-50.png"))); // NOI18N
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });
        atras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                atrasKeyPressed(evt);
            }
        });
        Titulo.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel17.setText("Búsqueda por: ");
        Titulo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 81, 31));

        BusquedaPor1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BusquedaPor1.setText("fdafdsfds");
        Titulo.add(BusquedaPor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 102, 31));

        principal.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 110));

        getContentPane().add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, -1, 580));

        resultados.setBackground(new java.awt.Color(255, 255, 255));
        resultados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displayScroll.setViewportView(resultados);

        getContentPane().add(displayScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 860, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel4FocusGained

    }//GEN-LAST:event_jLabel4FocusGained

    private void labelCostoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCostoMouseEntered
        labelCosto.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_labelCostoMouseEntered

    private void labelCostoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCostoMouseExited
        labelCosto.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_labelCostoMouseExited

    private void LabelNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelNombreMouseEntered
        LabelNombre.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_LabelNombreMouseEntered

    private void LabelNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelNombreMouseExited
        LabelNombre.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_LabelNombreMouseExited

    private void LabelTipoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelTipoMouseEntered
        LabelTipo.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_LabelTipoMouseEntered

    private void LabelTipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelTipoMouseExited
        LabelTipo.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_LabelTipoMouseExited

    private void LabelDificultadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelDificultadMouseEntered
        LabelDificultad.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_LabelDificultadMouseEntered

    private void LabelDificultadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelDificultadMouseExited
        LabelDificultad.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_LabelDificultadMouseExited

    private void LabelCaloriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCaloriasMouseEntered
        LabelCalorias.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_LabelCaloriasMouseEntered

    private void LabelCaloriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCaloriasMouseExited
        LabelCalorias.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_LabelCaloriasMouseExited

    private void LabelIngredienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelIngredienteMouseEntered
        LabelIngrediente.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_LabelIngredienteMouseEntered

    private void LabelIngredienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelIngredienteMouseExited
        LabelIngrediente.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_LabelIngredienteMouseExited
    /**
     * ************
     *
     * ANIMACIONES
     */
    private void LabelNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelNombreMouseClicked

        int y = PanelTitulo.getY();
        int y2 = PanelCosto.getY();

        int y4 = PanelCal.getY();
        int y5 = PanelDificultad.getY();
        int y6 = PanelTipo.getY();
        int y7 = PanelIngrediente.getY();

        if (y > -1) {

            Animacion.Animacion.subir(30, -190, 2, 3, PanelTitulo);
            Animacion.Animacion.bajar(-175, 30, 2, 3, PanelNombre);
        } else if (y2 > 0) {
            Animacion.Animacion.subir(30, -190, 2, 3, PanelCosto);
            Animacion.Animacion.bajar(-175, 30, 2, 3, PanelNombre);

        } else if (y4 > 0) {
            Animacion.Animacion.subir(30, -145, 2, 3, PanelCal);
            Animacion.Animacion.bajar(-175, 30, 2, 3, PanelNombre);
        } else if (y5 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelDificultad);
            Animacion.Animacion.bajar(-175, 30, 2, 3, PanelNombre);
        } else if (y6 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelTipo);
            Animacion.Animacion.bajar(-175, 30, 2, 3, PanelNombre);

        } else if (y7 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelIngrediente);
            Animacion.Animacion.bajar(-175, 30, 2, 3, PanelNombre);

        }
    }//GEN-LAST:event_LabelNombreMouseClicked

    private void LabelIngredienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelIngredienteMouseClicked
        int y = PanelTitulo.getY();
        int y2 = PanelCosto.getY();
        int y3 = PanelNombre.getY();
        int y4 = PanelCal.getY();
        int y5 = PanelDificultad.getY();
        int y6 = PanelTipo.getY();

        if (y > -1) {

            Animacion.Animacion.subir(30, -190, 2, 3, PanelTitulo);
            Animacion.Animacion.bajar(-175, 30, 2, 3, PanelIngrediente);
        } else if (y2 > 0) {
            Animacion.Animacion.subir(30, -190, 2, 3, PanelCosto);
            Animacion.Animacion.bajar(-175, 30, 2, 3, PanelIngrediente);
        } else if (y3 > 0) {
            Animacion.Animacion.subir(30, -190, 2, 3, PanelNombre);
            Animacion.Animacion.bajar(-175, 30, 2, 3, PanelIngrediente);
        } else if (y4 > 0) {
            Animacion.Animacion.subir(30, -145, 2, 3, PanelCal);
            Animacion.Animacion.bajar(-175, 30, 2, 3, PanelIngrediente);
        } else if (y5 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelDificultad);
            Animacion.Animacion.bajar(-175, 30, 2, 3, PanelIngrediente);
        } else if (y6 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelTipo);
            Animacion.Animacion.bajar(-175, 30, 2, 3, PanelIngrediente);

        }


    }//GEN-LAST:event_LabelIngredienteMouseClicked

    private void labelCostoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCostoMouseClicked

        int y = PanelTitulo.getY();

        int y3 = PanelNombre.getY();
        int y4 = PanelCal.getY();
        int y5 = PanelDificultad.getY();
        int y6 = PanelTipo.getY();
        int y7 = PanelIngrediente.getY();

        if (y > -1) {
            Animacion.Animacion.subir(30, -190, 2, 3, PanelTitulo);
            Animacion.Animacion.bajar(-145, 30, 2, 3, PanelCosto);

        } else if (y3 > 0) {
            Animacion.Animacion.subir(30, -190, 2, 3, PanelNombre);
            Animacion.Animacion.bajar(-145, 30, 2, 3, PanelCosto);
        } else if (y4 > 0) {
            Animacion.Animacion.subir(30, -145, 2, 3, PanelCal);
            Animacion.Animacion.bajar(-145, 30, 2, 3, PanelCosto);
        } else if (y5 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelDificultad);
            Animacion.Animacion.bajar(-145, 30, 2, 3, PanelCosto);
        } else if (y6 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelTipo);
            Animacion.Animacion.bajar(-145, 30, 2, 3, PanelCosto);

        } else if (y7 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelIngrediente);
            Animacion.Animacion.bajar(-145, 30, 2, 3, PanelCosto);

        }


    }//GEN-LAST:event_labelCostoMouseClicked

    private void LabelCaloriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCaloriasMouseClicked

        int y = PanelTitulo.getY();
        int y2 = PanelCosto.getY();
        int y3 = PanelNombre.getY();

        int y5 = PanelDificultad.getY();
        int y6 = PanelTipo.getY();
        int y7 = PanelIngrediente.getY();

        if (y > -1) {
            Animacion.Animacion.subir(30, -190, 2, 3, PanelTitulo);
            Animacion.Animacion.bajar(-145, 30, 2, 3, PanelCal);

        } else if (y2 > 0) {
            Animacion.Animacion.subir(30, -145, 2, 3, PanelCosto);
            Animacion.Animacion.bajar(-145, 30, 2, 3, PanelCal);
        } else if (y3 > 0) {
            Animacion.Animacion.subir(30, -190, 2, 3, PanelNombre);
            Animacion.Animacion.bajar(-145, 30, 2, 3, PanelCal);
        } else if (y5 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelDificultad);
            Animacion.Animacion.bajar(-145, 30, 2, 3, PanelCal);
        } else if (y6 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelTipo);
            Animacion.Animacion.bajar(-145, 30, 2, 3, PanelCal);

        } else if (y7 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelIngrediente);
            Animacion.Animacion.bajar(-145, 30, 2, 3, PanelCal);

        }
    }//GEN-LAST:event_LabelCaloriasMouseClicked

    private void LabelDificultadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelDificultadMouseClicked

        int y = PanelTitulo.getY();
        int y2 = PanelCosto.getY();
        int y3 = PanelNombre.getY();
        int y4 = PanelCal.getY();

        int y6 = PanelTipo.getY();
        int y7 = PanelIngrediente.getY();

        if (y > -1) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelTitulo);
            Animacion.Animacion.bajar(-195, 30, 2, 3, PanelDificultad);

        } else if (y2 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelCosto);
            Animacion.Animacion.bajar(-195, 30, 2, 3, PanelDificultad);
        } else if (y3 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelNombre);
            Animacion.Animacion.bajar(-195, 30, 2, 3, PanelDificultad);
        } else if (y4 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelCal);
            Animacion.Animacion.bajar(-195, 30, 2, 3, PanelDificultad);
        } else if (y6 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelTipo);
            Animacion.Animacion.bajar(-195, 30, 2, 3, PanelDificultad);
        } else if (y7 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelIngrediente);
            Animacion.Animacion.bajar(-195, 30, 2, 3, PanelDificultad);

        }


    }//GEN-LAST:event_LabelDificultadMouseClicked

    private void LabelTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelTipoMouseClicked

        int y = PanelTitulo.getY();
        int y2 = PanelCosto.getY();
        int y3 = PanelNombre.getY();
        int y4 = PanelCal.getY();
        int y5 = PanelDificultad.getY();

        int y7 = PanelIngrediente.getY();
        if (y > -1) {
            Animacion.Animacion.subir(30, -190, 2, 3, PanelTitulo);
            Animacion.Animacion.bajar(-195, 30, 2, 3, PanelTipo);

        } else if (y2 > 0) {
            Animacion.Animacion.subir(30, -145, 2, 3, PanelCosto);
            Animacion.Animacion.bajar(-195, 30, 2, 3, PanelTipo);
        } else if (y3 > 0) {
            Animacion.Animacion.subir(30, -190, 2, 3, PanelNombre);
            Animacion.Animacion.bajar(-195, 30, 2, 3, PanelTipo);
        } else if (y4 > 0) {
            Animacion.Animacion.subir(30, -145, 2, 3, PanelCal);
            Animacion.Animacion.bajar(-195, 30, 2, 3, PanelTipo);
        } else if (y5 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelDificultad);
            Animacion.Animacion.bajar(-195, 30, 2, 3, PanelTipo);
        } else if (y7 > 0) {
            Animacion.Animacion.subir(30, -195, 2, 3, PanelIngrediente);
            Animacion.Animacion.bajar(-15, 30, 2, 3, PanelTipo);

        }

    }//GEN-LAST:event_LabelTipoMouseClicked
    /**
     * ***************
     *
     * FIN ANIMACIONES
     *
     * ***************
     *
     */
    private void BuscarNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarNombreMouseClicked

        Buscar.setSeleccionadoNombre(true);

        BusquedaPor1.setText("Nombre");
        Buscar.setNombre(CampoNombre.getText());

        int cantidad = 0;
        cantidad = sql.cantidadNombres(Buscar.getNombre(), "SELECT count(nombre) FROM recetas WHERE nombre = ?");

        if (cantidad != 0) {
            Animacion.Animacion.subir(0, -580, 2, 3, PanelBusqueda);
            cantResult.setText(String.valueOf(cantidad));

            busqueda.dificultad1 = sql.dificultad("SELECT dificultadreceta FROM recetas WHERE nombre = ?", Buscar.getNombre());
            busqueda.duracion1 = sql.duracionReceta("SELECT tiemporeceta FROM recetas WHERE nombre = ?", Buscar.getNombre());
            busqueda.id1 = sql.traerId("SELECT id_receta FROM recetas WHERE nombre = ?", Buscar.getNombre());
            busqueda.usuario1 = sql.usuario("SELECT nombreusuario FROM recetas WHERE nombre = ?", Buscar.getNombre());
            busqueda.comentario1 = sql.comentarioReceta("SELECT comentarioreceta FROM recetas WHERE nombre = ?", Buscar.getNombre());
            busqueda.descripcion1 = sql.descripcionReceta("SELECT descripcion FROM recetas WHERE nombre = ?", Buscar.getNombre());

            busqueda.forPanelesBuscar(cantidad);
            busqueda.cargarPaneles(resultados1);
        } else {
            JOptionPane.showMessageDialog(null, "No hay resultados para su busqueda");
        }
    }//GEN-LAST:event_BuscarNombreMouseClicked

    private void buscarTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarTipoMouseClicked

        Buscar.setSeleccionadoTipo(true);

        BusquedaPor1.setText("Tipo");

        //---------------------------------
        ArrayList ali = new ArrayList();
        ArrayList ali2 = new ArrayList();
        //---------------------------------

        Buscar.setTipoBusqueda((String) ComboTipo.getSelectedItem()); //seteo el tipo

        int cantidad = 0;
        cantidad = sql.busqueda(Buscar.getTipoBusqueda(), "SELECT count(nombre) FROM recetas where tiporeceta = ?");

        ali = sql.nombrePor("SELECT nombre FROM recetas WHERE tiporeceta = ?", Buscar.getTipoBusqueda(), "nombre");

        for (int i = 0; i < cantidad; i++) {
            ali2.add(ali.get(i));
            nom.setNombrePorTipo(ali2);
        }

        if (cantidad != 0) {
            Animacion.Animacion.subir(0, -580, 2, 3, PanelBusqueda);
            cantResult.setText(String.valueOf(cantidad));

            busqueda.dificultad1 = sql.dificultad("SELECT dificultadreceta FROM recetas WHERE tiporeceta = ?", Buscar.getTipoBusqueda());
            busqueda.duracion1 = sql.duracionReceta("SELECT tiemporeceta FROM recetas WHERE tiporeceta = ?", Buscar.getTipoBusqueda());
            busqueda.id1 = sql.traerId("SELECT id_receta FROM recetas WHERE tiporeceta = ?", Buscar.getTipoBusqueda());
            busqueda.usuario1 = sql.usuario("SELECT nombreusuario FROM recetas WHERE tiporeceta = ?", Buscar.getTipoBusqueda());
            busqueda.comentario1 = sql.comentarioReceta("SELECT comentarioreceta FROM recetas WHERE tiporeceta = ?", Buscar.getTipoBusqueda());
            busqueda.descripcion1 = sql.descripcionReceta("SELECT descripcion FROM recetas WHERE tiporeceta = ?", Buscar.getTipoBusqueda());

            busqueda.forPanelesBuscar(cantidad);
            busqueda.cargarPaneles(resultados1);

        } else {
            JOptionPane.showMessageDialog(null, "No hay resultados para su busqueda");
        }
    }//GEN-LAST:event_buscarTipoMouseClicked

    private void BuscarDificultadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarDificultadMouseClicked

        Buscar.setSeleccionadoDificultad(true);

        BusquedaPor1.setText("Dificultad");

        //---------------------------------
        ArrayList ali = new ArrayList();
        ArrayList ali2 = new ArrayList();
        //---------------------------------

        Buscar.setDificultadBusqueda((String) ComboDificultad.getSelectedItem()); //seteo la dificultad

        //---------------------------------
        int cantidad = 0;
        cantidad = sql.busqueda(Buscar.getDificultadBusqueda(), "SELECT count(nombre) FROM recetas where dificultadreceta = ?");
        //---------------------------------

        ali = sql.nombrePor("SELECT nombre FROM recetas WHERE dificultadreceta = ?", Buscar.getDificultadBusqueda(), "nombre");
        for (int i = 0; i < cantidad; i++) {
            ali2.add(ali.get(i));
            Buscar.setNombrePorDificultad(ali2);
        }

        if (cantidad != 0) {
            Animacion.Animacion.subir(0, -580, 2, 3, PanelBusqueda);
            cantResult.setText(String.valueOf(cantidad));

            busqueda.dificultad1 = sql.dificultad("SELECT dificultadreceta FROM recetas WHERE dificultadreceta = ?", Buscar.getDificultadBusqueda());
            busqueda.duracion1 = sql.duracionReceta("SELECT tiemporeceta FROM recetas WHERE dificultadreceta = ?", Buscar.getDificultadBusqueda());
            busqueda.id1 = sql.traerId("SELECT id_receta FROM recetas WHERE dificultadreceta = ?", Buscar.getDificultadBusqueda());
            busqueda.usuario1 = sql.usuario("SELECT nombreusuario FROM recetas WHERE dificultadreceta = ?", Buscar.getDificultadBusqueda());
            busqueda.comentario1 = sql.comentarioReceta("SELECT comentarioreceta FROM recetas WHERE dificultadreceta = ?", Buscar.getDificultadBusqueda());
            busqueda.descripcion1 = sql.descripcionReceta("SELECT descripcion FROM recetas WHERE dificultadreceta = ?", Buscar.getDificultadBusqueda());

            busqueda.forPanelesBuscar(cantidad);
            busqueda.cargarPaneles(resultados1);
        } else {
            JOptionPane.showMessageDialog(null, "No hay resultados para su busqueda");
        }
    }//GEN-LAST:event_BuscarDificultadMouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked

        Buscar.setSeleccionadoCalorias(true);

        BusquedaPor1.setText("Calorias");

        //---------------------------------
        ArrayList ali = new ArrayList();
        ArrayList ali2 = new ArrayList();
        //---------------------------------

        //---------------------------------
        int cantidad = 0;
        cantidad = sql.cantidadNombresRango(desde1.getText(), hasta1.getText(), "SELECT count(nombre) FROM recetas WHERE calorias BETWEEN ? and ?");
        //---------------------------------

        ali = sql.nombrePorCosto_Calorias("SELECT nombre FROM recetas WHERE calorias BETWEEN ? and ?", desde1.getText(), "nombre", hasta1.getText());
        for (int i = 0; i < cantidad; i++) {
            ali2.add(ali.get(i));
            Buscar.setNombrePorCalorias(ali2);
        }

        if (cantidad != 0) {
            Animacion.Animacion.subir(0, -580, 2, 3, PanelBusqueda);
            cantResult.setText(String.valueOf(cantidad));

            busqueda.dificultad1 = sql.dificultadCosto("SELECT dificultadreceta FROM recetas WHERE calorias BETWEEN ? and ?", desde1.getText(), hasta1.getText());
            busqueda.duracion1 = sql.duracionRecetaCosto("SELECT tiemporeceta FROM recetas WHERE calorias BETWEEN ? and ?", desde1.getText(), hasta1.getText());
            busqueda.id1 = sql.traerIdCosto("SELECT id_receta FROM recetas WHERE calorias BETWEEN ? and ?", desde1.getText(), hasta1.getText());
            busqueda.usuario1 = sql.usuarioCosto("SELECT nombreusuario FROM recetas WHERE calorias BETWEEN ? and ?", desde1.getText(), hasta1.getText());
            busqueda.comentario1 = sql.comentarioRecetaCosto("SELECT comentarioreceta FROM recetas WHERE calorias BETWEEN ? and ?", desde1.getText(), hasta1.getText());
            busqueda.descripcion1 = sql.descripcionRecetaCosto("SELECT descripcion FROM recetas WHERE calorias BETWEEN ? and ?", desde1.getText(), hasta1.getText());

            busqueda.forPanelesBuscar(cantidad);
            busqueda.cargarPaneles(resultados1);
        } else {
            JOptionPane.showMessageDialog(null, "No hay resultados para su busqueda");
        }

    }//GEN-LAST:event_jLabel21MouseClicked

    private void jlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelMouseClicked

    }//GEN-LAST:event_jlabelMouseClicked

    private void BuscarCostoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarCostoMouseClicked

        Buscar.setSeleccionadoCosto(true);

        BusquedaPor1.setText("Costo");

        //---------------------------------
        ArrayList ali = new ArrayList();
        ArrayList ali2 = new ArrayList();
        //---------------------------------

        int cantidad = 0;
        cantidad = sql.cantidadNombresRango(desdeCosto.getText(), hastaCosto.getText(), "SELECT count(nombre) FROM recetas WHERE costo BETWEEN ? and ?");

        ali = sql.nombrePorCosto_Calorias("SELECT nombre FROM recetas WHERE costo BETWEEN ? and ?", desdeCosto.getText(), "nombre", hastaCosto.getText());
        for (int i = 0; i < cantidad; i++) {
            ali2.add(ali.get(i));
            Buscar.setNombrePorCosto(ali2);
        }

        if (cantidad != 0) {
            Animacion.Animacion.subir(0, -580, 2, 3, PanelBusqueda);
            cantResult.setText(String.valueOf(cantidad));

            busqueda.dificultad1 = sql.dificultadCosto("SELECT dificultadreceta FROM recetas WHERE costo BETWEEN ? and ?", desdeCosto.getText(), hastaCosto.getText());
            busqueda.duracion1 = sql.duracionRecetaCosto("SELECT tiemporeceta FROM recetas WHERE costo BETWEEN ? and ?", desdeCosto.getText(), hastaCosto.getText());
            busqueda.id1 = sql.traerIdCosto("SELECT id_receta FROM recetas WHERE costo BETWEEN ? and ?", desdeCosto.getText(), hastaCosto.getText());
            busqueda.usuario1 = sql.usuarioCosto("SELECT nombreusuario FROM recetas WHERE costo BETWEEN ? and ?", desdeCosto.getText(), hastaCosto.getText());
            busqueda.comentario1 = sql.comentarioRecetaCosto("SELECT comentarioreceta FROM recetas WHERE costo BETWEEN ? and ?", desdeCosto.getText(), hastaCosto.getText());
            busqueda.descripcion1 = sql.descripcionRecetaCosto("SELECT descripcion FROM recetas WHERE costo BETWEEN ? and ?", desdeCosto.getText(), hastaCosto.getText());

            busqueda.forPanelesBuscar(cantidad);
            busqueda.cargarPaneles(resultados1);
        } else {
            JOptionPane.showMessageDialog(null, "No hay resultados para su busqueda");
        }

    }//GEN-LAST:event_BuscarCostoMouseClicked

    private void jLabel22FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel22FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22FocusGained

    private void buscarIngredienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarIngredienteMouseClicked

        Buscar.setSeleccionadoIngrediente(true);

        BusquedaPor1.setText("Ingrediente");

        //---------------------------------
        ArrayList ali = new ArrayList();
        ArrayList ali2 = new ArrayList();
        //---------------------------------

        Buscar.setIngredienteBusqueda(campoIngrediente.getText());

        int cantidad = 0;
        cantidad = sql.cantidadNombres(Buscar.getIngredienteBusqueda(), "SELECT count(nombre) FROM recetas_has_ingrediente, ingrediente, recetas WHERE nombreingrediente = ? and recetas_has_ingrediente.ingrediente = ingrediente.id_ingrediente and recetas_has_ingrediente.id_receta = recetas.id_receta");

        ali = sql.nombrePor("SELECT nombre FROM recetas_has_ingrediente, ingrediente, recetas WHERE nombreingrediente = ? and recetas_has_ingrediente.ingrediente = ingrediente.id_ingrediente and recetas_has_ingrediente.id_receta = recetas.id_receta ", Buscar.getIngredienteBusqueda(), "nombre");
        for (int i = 0; i < cantidad; i++) {
            ali2.add(ali.get(i));
            Buscar.setNombrePorIngrediente(ali2);
        }

        if (cantidad != 0) {
            Animacion.Animacion.subir(0, -580, 2, 3, PanelBusqueda);
            cantResult.setText(String.valueOf(cantidad));

            busqueda.dificultad1 = sql.dificultad("SELECT dificultadreceta FROM recetas_has_ingrediente, ingrediente, recetas WHERE nombreingrediente = ? and recetas_has_ingrediente.ingrediente = ingrediente.id_ingrediente and recetas_has_ingrediente.id_receta = recetas.id_receta ", Buscar.getIngredienteBusqueda());
            busqueda.duracion1 = sql.duracionReceta("SELECT tiemporeceta FROM recetas_has_ingrediente, ingrediente, recetas WHERE nombreingrediente = ? and recetas_has_ingrediente.ingrediente = ingrediente.id_ingrediente and recetas_has_ingrediente.id_receta = recetas.id_receta ", Buscar.getIngredienteBusqueda());
            busqueda.id1 = sql.traerId("SELECT recetas.id_receta FROM recetas_has_ingrediente, ingrediente, recetas WHERE nombreingrediente = ? and recetas_has_ingrediente.ingrediente = ingrediente.id_ingrediente and recetas_has_ingrediente.id_receta = recetas.id_receta ", Buscar.getIngredienteBusqueda());
            busqueda.usuario1 = sql.usuario("SELECT nombreusuario FROM recetas_has_ingrediente, ingrediente, recetas WHERE nombreingrediente = ? and recetas_has_ingrediente.ingrediente = ingrediente.id_ingrediente and recetas_has_ingrediente.id_receta = recetas.id_receta ", Buscar.getIngredienteBusqueda());
            busqueda.comentario1 = sql.comentarioReceta("SELECT comentarioreceta FROM recetas_has_ingrediente, ingrediente, recetas WHERE nombreingrediente = ? and recetas_has_ingrediente.ingrediente = ingrediente.id_ingrediente and recetas_has_ingrediente.id_receta = recetas.id_receta ", Buscar.getIngredienteBusqueda());
            busqueda.descripcion1 = sql.descripcionReceta("SELECT descripcion FROM recetas_has_ingrediente, ingrediente, recetas WHERE nombreingrediente = ? and recetas_has_ingrediente.ingrediente = ingrediente.id_ingrediente and recetas_has_ingrediente.id_receta = recetas.id_receta ", Buscar.getIngredienteBusqueda());

            busqueda.forPanelesBuscar(cantidad);
            busqueda.cargarPaneles(resultados1);
        } else {
            JOptionPane.showMessageDialog(null, "No hay resultados para su busqueda");
        }
    }//GEN-LAST:event_buscarIngredienteMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        Menu men = new Menu();
        this.dispose();
        men.setVisible(true);

    }//GEN-LAST:event_jLabel3MouseClicked

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        limpiar();
        this.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_atrasMouseClicked

    private void atrasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atrasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasKeyPressed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked

    }//GEN-LAST:event_jLabel18MouseClicked

    private void campoIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIngredienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BuscarCosto;
    private javax.swing.JLabel BuscarDificultad;
    private javax.swing.JLabel BuscarNombre;
    private javax.swing.JLabel BusquedaPor1;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JComboBox<String> ComboDificultad;
    private javax.swing.JComboBox<String> ComboTipo;
    private javax.swing.JLabel LabelCalorias;
    private javax.swing.JLabel LabelDificultad;
    private javax.swing.JLabel LabelIngrediente;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelTipo;
    private javax.swing.JPanel PanelBusqueda;
    private javax.swing.JPanel PanelCal;
    private javax.swing.JPanel PanelCosto;
    private javax.swing.JPanel PanelDificultad;
    private javax.swing.JPanel PanelIngrediente;
    private javax.swing.JPanel PanelNombre;
    private javax.swing.JPanel PanelTipo;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JPanel Titulo;
    private javax.swing.JLabel atras;
    private javax.swing.JLabel buscarIngrediente;
    private javax.swing.JLabel buscarTipo;
    private javax.swing.JTextField campoIngrediente;
    private javax.swing.JLabel cantResult;
    private javax.swing.JLabel cantResultados;
    private javax.swing.JTextField desde1;
    private javax.swing.JTextField desdeCosto;
    private javax.swing.JScrollPane displayScroll;
    private javax.swing.JScrollPane displayScroll1;
    private javax.swing.JTextField hasta1;
    private javax.swing.JTextField hastaCosto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel labelCosto;
    private javax.swing.JPanel principal;
    private javax.swing.JPanel resultados;
    private javax.swing.JPanel resultados1;
    // End of variables declaration//GEN-END:variables
}
