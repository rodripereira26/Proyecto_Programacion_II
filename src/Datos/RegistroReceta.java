
package Datos;

import java.util.ArrayList;

public class RegistroReceta {
    
    private String nombre;
    private String descripcion;
    private String usuario;
    private String comentario;
    private String tiempo;
    private String tipo;
    private String dificultad;
    private String id;
    private ArrayList pasos;
    private String pasos1;

    public String getPasos1() {
        return pasos1;
    }

    public void setPasos1(String pasos1) {
        this.pasos1 = pasos1;
    }

    public ArrayList getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList pasos) {
        this.pasos = pasos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
