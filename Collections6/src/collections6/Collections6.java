/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections6;
import Entity.Pais;
import Entity.Service.PaisService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
/**
 *
 * @author Diego
 */
public class Collections6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PaisService ps= new PaisService();
        HashSet <Pais> paises =  ps.ingresarLista();
        ps.imprimirLista(paises);
        ArrayList<Pais> paisesList = new ArrayList<Pais>(paises);
        paisesList.sort(Pais.compararNombre);
        System.out.println("-------------Lista Ordenada---------------");
        ps.imprimirLista(paisesList);
        ps.buscar(paises);
    }
    
}
