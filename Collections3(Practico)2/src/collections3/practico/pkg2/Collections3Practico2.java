/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections3.practico.pkg2;
import Entity.RazaPerro;
import Entity.Service.RazaPerroService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Collections3Practico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList <RazaPerro> perros = new ArrayList();
        RazaPerroService rps = new RazaPerroService();
        char op = 's';
        
        while(op!='n' && op!='N' ){
            if(op=='s' || op=='S')
              perros.add(rps.crearRaza());
            
            System.out.println("Desea continuar? (s/n)");
            op = sc.next().charAt(0);
            switch(op){
                case 's':break;
                case 'S':break;
                case 'n':break;
                case 'N':break;
                default: System.out.println("La opcion ingresada es incorrecta");
            }            
        }
        
        sc.nextLine();
        System.out.println("Ingrese un perro a buscar: ");
        String perro = sc.nextLine();
        
      // RazaPerro raza = rps.ingresarRaza(perro);
        
        
        Iterator <RazaPerro> it = perros.iterator();
        while (it.hasNext()){
            if(it.next().getNombre().compareTo(perro) == 0){
                it.remove();
           }
       }
        
   
//        Iterator it = perros.iterator();
//        while (it.hasNext()) {
//            if (it.next().equals(raza)) {
//                it.remove();
//           }
//        }
       
        perros.sort(RazaPerro.compararNombre);
        
        System.out.println(perros.toString());
        for (RazaPerro p: perros){
            System.out.println("Nombre: " + p.getNombre());
        }
    }
    
}
