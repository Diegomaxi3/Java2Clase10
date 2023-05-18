/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Service;
import Entity.Pelicula;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Diego
 */
public class PeliculaService {

    public PeliculaService() {
    }
    
    private Pelicula crearPelicula(){
        Scanner sc = new Scanner(System.in);
        Pelicula pelicula = new Pelicula();
        System.out.println("Ingrese el titulo de la pelicula: ");
        pelicula.setTitulo(sc.nextLine());
        System.out.println("Ingrese el director de la pelicula: ");
        pelicula.setDirector(sc.nextLine());
        System.out.println("Ingrese la duracion en minutos: ");
        pelicula.setDuracion(sc.nextInt());
        sc.nextLine();
        return pelicula;
    }
    
    
    public ArrayList <Pelicula> llenarListaPeliculas(){
        ArrayList <Pelicula> peliculas = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        char op = 's';
        do{
            if(op=='S' || op=='s')
                peliculas.add(crearPelicula());
            System.out.println("Desea cargar otra pelicula?(s/n) ");
            op = sc.next().charAt(0);
            switch(op){
                case 's':break;
                case 'S':break;
                case 'n':break;
                case 'N':break;
                default:System.out.println("Error!! opcion incorrecta!");
                
        }
        }while (op!='N' && op!='n'); 
        return peliculas;
    }
    
    public void imprimirPeliculas(ArrayList<Pelicula> peliculas){
        for (Pelicula peli:peliculas){
            System.out.println(peli.toString());
        }
    }
    
    public void imprimirMayor60Min(ArrayList<Pelicula> peliculas){
        for(Pelicula peli:peliculas){
            if(peli.getDuracion() > 60){
                System.out.println(peli.toString());
            }
        }
    }
    
    
}
