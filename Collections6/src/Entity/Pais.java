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
public class Pais {
    String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + '}';
    }
    
    public static Comparator<Pais> compararNombre = new Comparator<Pais>(){
        @Override
        public int compare(Pais pais1, Pais pais2){
            return pais1.getNombre().compareTo(pais2.getNombre());
        }
    };
}
