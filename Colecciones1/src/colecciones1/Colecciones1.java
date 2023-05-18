/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones1;

import java.util.*;


/**
 *
 * @author Diego
 */
public class Colecciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Integer> numeros = new ArrayList();
        HashSet <Integer> numeros2 = new HashSet();
        TreeSet <Integer> tree = new TreeSet();
        HashMap<Integer,String> map = new HashMap();
        LinkedHashMap <Integer,String> map2 = new LinkedHashMap();
        
        numeros.add(10);
        System.out.println(numeros.toString());
        numeros.add(20);
        numeros.add(22);
        numeros.add(15);
        System.out.println(numeros.toString());
        
        Collections.sort(numeros);
        System.out.println(numeros);
         
         
        numeros.remove(0);
        numeros2.add(10);
        numeros2.add(10);
        numeros2.add(20);
        System.out.println(numeros2);
        
       
        tree.add(10);
        tree.add(5);
        tree.add(12);
        tree.add(11);
        System.out.println(tree.toString());
        map.put(0, "Diego");
        map.put(1,"Laura");
        System.out.println(map.toString());
        map.remove(0);
        System.out.println(map.toString());
        map.put(2,"Lulu");
        map.put(3,"Angi");
        map.put(0,"Yo");
        System.out.println(map.toString());
        for(Integer num: numeros){
            System.out.println(num);
        }
        
        for (Integer num:numeros2){
            System.out.println("2: - " + num);
        }
        
        for (Integer num:tree){
            System.out.println("Tree: - " + num );
        }
        
        map2.put(0, "Diego");
        map2.put(10,"Lulu");
        map2.put(9, "Angi");
        System.out.println(map2.toString()) ;
        
        
        
        ArrayList <String> bebidas= new ArrayList();
         bebidas.add("café");
         bebidas.add("té");
         System.out.println(bebidas.toString());
         Iterator<String> it =bebidas.iterator();
         while (it.hasNext()){
           if (it.next().equals("café")){
            it.remove();
           }
         }
         System.out.println(bebidas.toString());
    }
}
