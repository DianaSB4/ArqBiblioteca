/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Libro {
     private int idlibro;
     private String titulo;
     private String editorial;
     private String autor;
     private String año;
     private String estado;

    public Libro() {
    } 

    public Libro(int idlibro, String titulo, String editorial, String autor, String año, String estado) {
        this.idlibro = idlibro;
        this.titulo = titulo;
        this.editorial = editorial;
        this.autor = autor;
        this.año = año;
        this.estado = estado;
    }

    public int getIdlibro() {
        return idlibro;
    }
    
    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getEditorial() {
        return editorial;
    }
    
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getAño() {
        return año;
    }
    
    public void setAño(String año) {
        this.año = año;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
