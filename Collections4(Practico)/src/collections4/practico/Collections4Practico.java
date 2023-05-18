/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections4.practico;
import Entity.Alumno;
import Entity.Service.AlumnoService;
import java.util.ArrayList;
/**
 *
 * @author Diego
 */
public class Collections4Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Alumno> alumnos = new ArrayList();
        AlumnoService as = new AlumnoService();
        alumnos = as.crearListaAlumnos();
        
        for (Alumno a: alumnos){
            System.out.println(a.toString());
        }
        
        as.notaFinal(alumnos);
    }
    
}
