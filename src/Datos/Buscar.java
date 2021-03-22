package Datos;

import java.util.ArrayList;

public class Buscar {

    private static String nombre = "";
    private static String dificultadBusqueda = "";
    private static String tipoBusqueda = "";
    private static String ingredienteBusqueda = "";

    //----------------------------------------------------------
    private static boolean seleccionadoNombre = false;
    private static boolean seleccionadoTipo = false;
    private static boolean seleccionadoDificultad = false;
    private static boolean seleccionadoIngrediente = false;
    private static boolean seleccionadoCosto = false;
    private static boolean seleccionadoCalorias = false;

    public static boolean isSeleccionadoCosto() {
        return seleccionadoCosto;
    }

    public static void setSeleccionadoCosto(boolean seleccionadoCosto) {
        Buscar.seleccionadoCosto = seleccionadoCosto;
    }

    public static boolean isSeleccionadoCalorias() {
        return seleccionadoCalorias;
    }

    public static void setSeleccionadoCalorias(boolean seleccionadoCalorias) {
        Buscar.seleccionadoCalorias = seleccionadoCalorias;
    }
    

    public static boolean isSeleccionadoIngrediente() {
        return seleccionadoIngrediente;
    }

    public static void setSeleccionadoIngrediente(boolean seleccionadoIngrediente) {
        Buscar.seleccionadoIngrediente = seleccionadoIngrediente;
    }

    public static boolean isSeleccionadoNombre() {
        return seleccionadoNombre;
    }

    public static void setSeleccionadoNombre(boolean seleccionadoNombre) {
        Buscar.seleccionadoNombre = seleccionadoNombre;
    }

    public static boolean isSeleccionadoTipo() {
        return seleccionadoTipo;
    }

    public static void setSeleccionadoTipo(boolean seleccionadoTipo) {
        Buscar.seleccionadoTipo = seleccionadoTipo;
    }

    public static boolean isSeleccionadoDificultad() {
        return seleccionadoDificultad;
    }

    public static void setSeleccionadoDificultad(boolean seleccionadoDificultad) {
        Buscar.seleccionadoDificultad = seleccionadoDificultad;
    }

    //---------------------------------------------------------
    private static ArrayList<String> dificultad;
    private static ArrayList<String> nombre2;
    private static ArrayList<String> id;
    private static ArrayList<String> usuario;
    private static ArrayList<String> ingredientes;
    private static ArrayList<String> duracion;
    private static ArrayList<String> comentario;
    private static ArrayList<String> descripcion;
    private static ArrayList costo;
    private static ArrayList calorias;
    private static ArrayList<String> idPasos;
    private static ArrayList<String> nombrePorDificultad = new ArrayList();
    private static ArrayList<String> nombrePorTipo = new ArrayList();
    private static ArrayList<String> nombrePorIngrediente = new ArrayList();
    private static ArrayList<String> nombrePorCosto = new ArrayList();
    private static ArrayList<String> nombrePorCalorias = new ArrayList();

    public static ArrayList<String> getNombrePorCosto() {
        return nombrePorCosto;
    }

    public static void setNombrePorCosto(ArrayList<String> nombrePorCosto) {
        Buscar.nombrePorCosto = nombrePorCosto;
    }

    public static ArrayList<String> getNombrePorCalorias() {
        return nombrePorCalorias;
    }

    public static void setNombrePorCalorias(ArrayList<String> nombrePorCalorias) {
        Buscar.nombrePorCalorias = nombrePorCalorias;
    }

    public static ArrayList<String> getNombrePorIngrediente() {
        return nombrePorIngrediente;
    }

    public static void setNombrePorIngrediente(ArrayList<String> nombrePorIngrediente) {
        Buscar.nombrePorIngrediente = nombrePorIngrediente;
    }

    public static String getIngredienteBusqueda() {
        return ingredienteBusqueda;
    }

    public static void setIngredienteBusqueda(String ingredienteBusqueda) {
        Buscar.ingredienteBusqueda = ingredienteBusqueda;
    }

    public static ArrayList<String> getNombrePorTipo() {
        return nombrePorTipo;
    }

    public static void setNombrePorTipo(ArrayList<String> nombrePorTipo) {
        Buscar.nombrePorTipo = nombrePorTipo;
    }

    public static String getTipoBusqueda() {
        return tipoBusqueda;
    }

    public static void setTipoBusqueda(String tipoBusqueda) {
        Buscar.tipoBusqueda = tipoBusqueda;
    }

    public static ArrayList<String> getNombrePorDificultad() {
        return nombrePorDificultad;
    }

    public static void setNombrePorDificultad(ArrayList<String> nombrePorDificultad) {
        Buscar.nombrePorDificultad = nombrePorDificultad;
    }

    public static String getDificultadBusqueda() {
        return dificultadBusqueda;
    }

    public static void setDificultadBusqueda(String dificultadBusqueda) {
        Buscar.dificultadBusqueda = dificultadBusqueda;
    }

    public static ArrayList<String> getIdPasos() {
        return idPasos;
    }

    public static void setIdPasos(ArrayList<String> idPasos) {
        Buscar.idPasos = idPasos;
    }

    public static ArrayList getCosto() {
        return costo;
    }

    public static void setCosto(ArrayList costo) {
        Buscar.costo = costo;
    }

    public static ArrayList getCalorias() {
        return calorias;
    }

    public static void setCalorias(ArrayList calorias) {
        Buscar.calorias = calorias;
    }

    public static ArrayList<String> getDescripcion() {
        return descripcion;
    }

    public static void setDescripcion(ArrayList<String> descripcion) {
        Buscar.descripcion = descripcion;
    }

    public static ArrayList<String> getComentario() {
        return comentario;
    }

    public static void setComentario(ArrayList<String> comentario) {
        Buscar.comentario = comentario;
    }

    public static ArrayList<String> getDuracion() {
        return duracion;
    }

    public static void setDuracion(ArrayList<String> duracion) {
        Buscar.duracion = duracion;
    }
    private static String idpru;

    public static String getIdpru() {
        return idpru;
    }

    public static void setIdpru(String idpru) {
        Buscar.idpru = idpru;
    }

    public static ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public static void setIngredientes(ArrayList<String> ingredientes) {
        Buscar.ingredientes = ingredientes;
    }

    public static ArrayList<String> getUsuario() {
        return usuario;
    }

    public static void setUsuario(ArrayList<String> usuario) {
        Buscar.usuario = usuario;
    }

    public static ArrayList<String> getId() {
        return id;
    }

    public static void setId(ArrayList<String> id) {
        Buscar.id = id;
    }

    public static ArrayList<String> getNombre2() {
        return nombre2;
    }

    public static void setNombre2(ArrayList<String> nombre2) {
        Buscar.nombre2 = nombre2;
    }

    public static ArrayList<String> getDificultad() {
        return dificultad;
    }

    public static void setDificultad(ArrayList<String> dificultad) {
        Buscar.dificultad = dificultad;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Buscar.nombre = nombre;
    }

}
