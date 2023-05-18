/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Service;
import Entity.RazaPerro;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class RazaPerroService {

    public RazaPerroService() {
    }
    
    public RazaPerro crearRaza(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la raza: ");       
        RazaPerro perro = new RazaPerro(sc.nextLine());
        return perro;
    }
    
    public RazaPerro ingresarRaza(String nombre){         
        RazaPerro perro = new RazaPerro();
        perro.setNombre(nombre);
        return perro;
    }
    
   
   
}
