
package Datos;

import java.util.ArrayList;


public class Ingrediente {
    
    private static ArrayList id; 
    private static ArrayList nombre;
    private static ArrayList cantidad;
    private static ArrayList unidad;

    public static ArrayList getNombre() {
        return nombre;
    }

    public static void setNombre(ArrayList nombre) {
        Ingrediente.nombre = nombre;
    }

    public static ArrayList getCantidad() {
        return cantidad;
    }

    public static void setCantidad(ArrayList cantidad) {
        Ingrediente.cantidad = cantidad;
    }

    public static ArrayList getUnidad() {
        return unidad;
    }

    public static void setUnidad(ArrayList unidad) {
        Ingrediente.unidad = unidad;
    }

    public static ArrayList getId() {
        return id;
    }

    public static void setId(ArrayList id) {
        Ingrediente.id = id;
    }
    
}
