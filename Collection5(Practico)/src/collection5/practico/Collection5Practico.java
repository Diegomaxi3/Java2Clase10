/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection5.practico;
import Entity.Pelicula;
import Entity.Service.PeliculaService;
import java.util.ArrayList;
/**
 *
 * @author Diego
 */
public class Collection5Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PeliculaService ps = new PeliculaService();
        ArrayList <Pelicula> peliculas = ps.llenarListaPeliculas();
        ps.imprimirPeliculas(peliculas);
        System.out.println("---------- Mayor a 60 min ----------");
        ps.imprimirMayor60Min(peliculas);
        System.out.println("---------- Ordenado por duracion ----------");
        peliculas.sort(Pelicula.compararDuracion);
        ps.imprimirPeliculas(peliculas);
        System.out.println("---------- Ordenado por Titulo----------");
        peliculas.sort(Pelicula.compararTitulo);
        ps.imprimirPeliculas(peliculas);
        System.out.println("---------- Ordenado por Director ----------");
        peliculas.sort(Pelicula.compararDirector);
        ps.imprimirPeliculas(peliculas);
    }
    
}
