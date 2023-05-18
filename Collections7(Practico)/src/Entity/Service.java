/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Service {

    
    public Service() {
    }
    
    public void menu(){
        HashMap <String,Double> productos = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        char op = '0';
        do{
            System.out.println("Seleccione una opción: ");
            System.out.println("");
            System.out.println("1 - Ingresar un nuevo producto");
            System.out.println("2 - Modificar valor producto");
            System.out.println("3 - Imprimir lista productos");
            System.out.println("4 - Salir");
            System.out.print("opcion: ");
            op = sc.next().charAt(0);
        }while(!opcionMenu(op, productos));
                
    }
    
    
    private boolean opcionMenu(char op,HashMap<String,Double> productos ){
        boolean salir = false;
        switch(op){
            case '1': ingresar(productos) ;break;
            case '2': modificar(productos);break;
            case '3': imprimir(productos);break;
            case '4': salir = true;break;
            default:System.out.println("Erroe, la opcion ingresada no es correcta.");
        }
        return salir;
    }
    
    private void ingresar(HashMap<String,Double> productos){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el producto:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        sc.nextLine();
        productos.put(nombre, precio);
    }
    
    private void imprimir(HashMap<String,Double> productos){
        System.out.println(productos.toString());
    }
    
    private void modificar(HashMap<String,Double>productos){
        Scanner sc = new Scanner(System.in);
        String prodBuscado = sc.nextLine();
      
        for(Map.Entry<String,Double> prod: productos.entrySet()){
            if(prod.getKey().compareTo(prodBuscado) == 0){
                System.out.println("Ingrese el nuevo valor: ");
                prod.setValue(sc.nextDouble());
            }     
        }
    }
}
