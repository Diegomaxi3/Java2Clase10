/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Service;
import Entity.Pais;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
/**
 *
 * @author Diego
 */
public class PaisService {

    public PaisService() {
    }
    
    public Pais crearPais(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del pais: ");
        Pais pais = new Pais(sc.nextLine());
        return pais;
    }
    
    public HashSet<Pais> ingresarLista(){
        Scanner sc = new Scanner(System.in);
        HashSet<Pais> paises = new HashSet<>();
        char op = 's';
        do{
            if(op == 's' || op == 'S' )
                paises.add(crearPais());
            System.out.println("Desea guardar otro pais? (s/n)");
            op = sc.next().charAt(0);
            
            switch(op){
                case 's':break;
                case 'S':break;
                case 'n':break;
                case 'N':break;
                default: System.out.println("Error, opcion incorrecta!");
            }
        }while(op != 'n' && op != 'N');
      return paises;  
    }
    
    public void imprimirLista(HashSet <Pais> paises){
        for (Pais pais:paises){
            System.out.println(pais.toString());
        }
    }
    
    public void imprimirLista(ArrayList <Pais> paises){
        for (Pais pais:paises){
            System.out.println(pais.toString());
        }
    }
    
     public void buscar(HashSet <Pais> paises){
         Scanner sc = new Scanner(System.in);
         Iterator <Pais> it = paises.iterator();
         System.out.println("Ingrese el pais a buscar: ");
         String nombre = sc.nextLine();
         boolean esta = false;
        while (it.hasNext()){
             Pais pais = it.next();
            if(pais.getNombre().compareTo(nombre) == 0){           
                System.out.println(pais.toString());
                it.remove();
                esta = true;
            }
        }
        if(!esta){System.out.println("No se encontro ningun pais con ese nombre.");}
    }

}
