/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections2;
import java.util.ArrayList;
import Entity.Libros;
import Entity.Services.ServicioLibros;
import java.util.Iterator;
/**
 *
 * @author Diego
 */
public class Collections2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioLibros sl = new ServicioLibros();
        ArrayList <Libros> libros = new ArrayList();
        for (int i = 0; i < 3;i++){
            libros.add(sl.crearLibro());
        }
        
        Iterator <Libros> iterator = libros.iterator();
        
        while(iterator.hasNext()){
            sl.imprimir((Libros)iterator.next());
           // System.out.println(iterator.next().toString());
        }
        
        System.out.println("-----------------");
        libros.forEach((l) -> {
            sl.imprimir(l);
        });
        System.out.println("------------------");
        System.out.println(libros.toString());
        
        libros.sort(Libros.compararNombre);
        System.out.println(libros.toString());
    }
    
}
