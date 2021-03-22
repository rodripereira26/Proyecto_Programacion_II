package Datos;

import java.util.ArrayList;

public class ArrayIngredientes {

    private static ArrayList unidades = new ArrayList();
    private static ArrayList ingredientes = new ArrayList();
    private static ArrayList cantidades = new ArrayList();
    private static ArrayList id = new ArrayList();

    public static ArrayList getUnidades() {
        return unidades;
    }

    public static void setUnidades(ArrayList unidades) {
        ArrayIngredientes.unidades = unidades;
    }

    public static ArrayList getIngredientes() {
        return ingredientes;
    }

    public static void setIngredientes(ArrayList ingredientes) {
        ArrayIngredientes.ingredientes = ingredientes;
    }

    public static ArrayList getCantidades() {
        return cantidades;
    }

    public static void setCantidades(ArrayList cantidades) {
        ArrayIngredientes.cantidades = cantidades;
    }

    public static ArrayList getId() {
        return id;
    }

    public static void setId(ArrayList id) {
        ArrayIngredientes.id = id;
    }

}
