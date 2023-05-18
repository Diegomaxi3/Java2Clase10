/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections3.practico;
import java.util.Scanner;
import java.util.ArrayList;
import Entity.RazaPerro;
import Entity.Services.RazaPerroService;
/**
 *
 * @author Diego
 */
public class Collections3Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <RazaPerro> razas =  new ArrayList(); 
        RazaPerroService rps = new RazaPerroService();
        Scanner sc = new Scanner(System.in);
        char op= 's';
        while(op!='n' && op!='N'){
            if(op=='s' || op=='S')
              razas.add(rps.crearRaza());
            System.out.println("Desae continuar(s/n): ");
            op = sc.next().charAt(0);
            switch (op){
                case 's': break; 
                case 'S': break;
                case 'n': break;
                case 'N': break;
                default: System.out.println("La opcion ingresada es incorrecta"); 
             }
        }
        System.out.println(razas.toString());
    }
    
}
