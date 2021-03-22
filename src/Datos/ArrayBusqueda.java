package Datos;

import Interfaz.ResultadosBusqueda;
import Interfaz.ResultadosModificar;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ArrayBusqueda {

    public ArrayList<JPanel> paneles = new ArrayList();
    public ArrayList<String> dificultad1 = new ArrayList<String>();
    public ArrayList<String> dificultad2 = new ArrayList<String>();
    public ArrayList<String> id1 = new ArrayList<String>();
    public ArrayList<String> id2 = new ArrayList<String>();
    public ArrayList<String> usuario1 = new ArrayList<String>();
    public ArrayList<String> usuario2 = new ArrayList<String>();
    public ArrayList<String> duracion1 = new ArrayList<String>();
    public ArrayList<String> duracion2 = new ArrayList<String>();
    public ArrayList<String> comentario1 = new ArrayList<String>();
    public ArrayList<String> comentario2 = new ArrayList<String>();
    public ArrayList<String> descripcion1 = new ArrayList<String>();
    public ArrayList<String> descripcion2 = new ArrayList<String>();
    public ArrayList<String> idPasos1 = new ArrayList<String>();
    public ArrayList<String> idPasos2 = new ArrayList<String>();

    public void limpiarArrays() {

        paneles.clear();
        dificultad1.clear();
        dificultad2.clear();
        id1.clear();
        id2.clear();
        usuario2.clear();
        usuario1.clear();
        duracion1.clear();
        duracion2.clear();
        comentario1.clear();
        comentario2.clear();
        descripcion1.clear();
        descripcion2.clear();
        idPasos1.clear();
        idPasos2.clear();

    }

    public void cargarPaneles(JPanel resultados1) {

        if (paneles.size() != 0) {
            resultados1.removeAll();
            resultados1.setLayout(new GridLayout(paneles.size(), 1));

            for (JPanel panel : paneles) {
                resultados1.add(panel);
            }
            resultados1.updateUI();
            resultados1.repaint();

        } else {
            JOptionPane.showMessageDialog(null, "No hay resultados para su busqueda");

        }
    }

    public void forPanelesBuscar(int cantidad) {
        for (int i = 0; i < cantidad; i++) {

            dificultad2.add(dificultad1.get(i));
            usuario2.add(usuario1.get(i));
            id2.add(id1.get(i));
            duracion2.add(duracion1.get(i));
            comentario2.add(comentario1.get(i));
            descripcion2.add(descripcion1.get(i));

            Buscar.setIdpru(id1.get(i)); // String en la clase Buscar que manda el valor al metodo Pruebaing

            Buscar.setDificultad(dificultad2);
            Buscar.setId(id2);
            Buscar.setUsuario(usuario2);
            Buscar.setDuracion(duracion2);
            Buscar.setComentario(comentario2);
            Buscar.setDescripcion(descripcion2);

            paneles.add(new ResultadosBusqueda());

        }
    }

    public void forPanelesModificar(int cantidad) {
        for (int i = 0; i < cantidad; i++) {

            dificultad2.add(dificultad1.get(i));
            usuario2.add(usuario1.get(i));
            id2.add(id1.get(i));
            duracion2.add(duracion1.get(i));
            comentario2.add(comentario1.get(i));
            descripcion2.add(descripcion1.get(i));

            Buscar.setIdpru(id1.get(i)); // String en la clase Buscar que manda el valor al metodo Pruebaing

            Buscar.setDificultad(dificultad2);
            Buscar.setId(id2);
            Buscar.setUsuario(usuario2);
            Buscar.setDuracion(duracion2);
            Buscar.setComentario(comentario2);
            Buscar.setDescripcion(descripcion2);

            paneles.add(new ResultadosModificar());

        }
    }

}
