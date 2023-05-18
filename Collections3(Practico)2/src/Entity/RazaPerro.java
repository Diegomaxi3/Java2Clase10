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
public class RazaPerro {
    String nombre;

    public RazaPerro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RazaPerro() {
    }

    @Override
    public String toString() {
        return "RazaPerro: " + nombre ;
    }   
    
    public static Comparator<RazaPerro> compararNombre = new Comparator<RazaPerro>(){
        @Override
        public int compare(RazaPerro r1, RazaPerro r2){
        return r1.getNombre().compareTo(r2.getNombre());
      }
    };
}
