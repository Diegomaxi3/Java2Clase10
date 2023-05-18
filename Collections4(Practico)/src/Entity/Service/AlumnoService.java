/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Service;

import Entity.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class AlumnoService {

    public AlumnoService() {
    }
    
    public ArrayList<Alumno> crearListaAlumnos(){
        Scanner sc = new Scanner(System.in);
        ArrayList <Alumno> alumnos = new ArrayList();
        char op = 's';
        while(op!='n' && op!='N'){
            if(op!='s' || op!='S')
             alumnos.add(crearAlumno());
            System.out.println("Desea continuar cargando alumnos? (S/n)");
            op = sc.next().charAt(0);
            switch (op){
                case 's':break;
                case 'S':break;
                case 'n':break;
                case 'N':break;
                default: System.out.println("Opcion incorrecta.");
            }
        }
        
        return alumnos;
    }
    
    private Alumno crearAlumno(){
        Scanner sc = new Scanner(System.in);
        Alumno alum = new Alumno();
        System.out.println("Ingrese el nombre del Alumno: ");        
        alum.setNombre(sc.nextLine());
        ArrayList <Integer> notas = new ArrayList();
        for (int i = 0; i < 3; i++) {
            double nota =  Math.random() * 10;
            notas.add((int)nota);
        }
        alum.setNotas(notas);
        return alum;
    }
    
    public void notaFinal( ArrayList<Alumno> alumno){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el alumno a buscar: ");
        String nombre = sc.nextLine();
        for (Alumno a: alumno){
            if(a.getNombre().compareTo(nombre) == 0){
                int suma = 0;
                for (Integer nota:a.getNotas()){
                    suma+= nota;
                }
                System.out.println("Promedio: "  + suma/3);
            }
        }       
    }
    
}
