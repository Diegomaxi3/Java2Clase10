/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Services;
import java.util.Scanner;
import Entity.Libros;
/**
 *
 * @author Diego
 */
public class ServicioLibros {

    public ServicioLibros() {
    }
    
    public Libros crearLibro(){
        Scanner sc = new Scanner(System.in);
        Libros libro = new Libros();
        System.out.println("Ingrese el identificador: ");
        libro.setIdentificador(sc.nextInt());
        System.out.println("Ingrese el nombre del libro: ");
        sc.nextLine();
        libro.setNombre(sc.nextLine());
        return libro;
    }
    
    public void imprimir(Libros l){
        System.out.println(l.toString());
    }
}
