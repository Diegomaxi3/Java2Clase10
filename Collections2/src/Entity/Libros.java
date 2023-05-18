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
public class Libros {
    String nombre;
    int identificador;

    public Libros() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "Libros{" + "nombre=" + nombre + '}';
    }
    
   public static Comparator<Libros> compararNombre = new Comparator<Libros>(){
       @Override
       public int compare(Libros l1, Libros l2){
       return l1.getNombre().compareTo(l2.getNombre()); 
       }
    };
}