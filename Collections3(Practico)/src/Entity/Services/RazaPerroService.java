/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Services;
import Entity.RazaPerro;
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
        System.out.println("Ingrese EL nombre de la raza: ");
        RazaPerro raza = new RazaPerro(sc.nextLine());
        return raza;
    }  
}
