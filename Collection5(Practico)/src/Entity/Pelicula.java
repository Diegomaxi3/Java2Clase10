/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Comparator;

/**
 *
 * @author Diego
 */
public class Pelicula {
    String titulo;
    String director;
    int duracion;

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula peli1,Pelicula peli2){
        return peli1.getTitulo().compareTo(peli2.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula peli1,Pelicula peli2){
        return peli1.getDuracion() > peli2.getDuracion() ? 1:0;
        }
    };
    
    public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula peli1, Pelicula peli2){
            return peli1.getDirector().compareTo(peli2.getDirector());
        }
    };
    
}
