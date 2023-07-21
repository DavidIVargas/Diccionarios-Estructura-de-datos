/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.clase_diccionarios_estructura_datos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ESTUDIANTE
 */
public class Clase_diccionarios_estructura_datos {

    public static void main(String[] args) {
        Map<String, Integer> edades = new HashMap<>();
        
        //Agregar valores al diccionario
        edades.put("Juan",21);
        edades.put("María",30);
        edades.put("Carlos", 22);
        edades.put("Mateo",11);
        edades.put("Xavier",11);
        System.out.println(edades);
        
        
        imprimir(edades);
        edades.put("Maria", 32);
        //Eliminar valor del diccionario
        edades.remove("Maria", 32);
        imprimir(edades);
        
        
        System.out.println("Contiene clave nombre :" + contieneClave(edades, "nombre"));
        //System.out.println("Tamaño del diccionario: " + obtenerTamaño(edades));
        
        System.out.println("Todas las claves");
        obtenerTodasLasClaves(edades);
    }
    
    public static void imprimir (Map<String, Integer> edades){
        for (Map.Entry<String,Integer> entry : edades.entrySet()){
            String nombre = entry.getKey();
            int edad = entry.getValue();
            System.out.println(nombre + ":" + edad + "años");
        }
        System.out.println("-------------------------------");
    }
    
    public static boolean contieneClave(Map<String, Integer> diccionario, String clave){
        return diccionario.containsKey(clave);
    }
    public static int obtenerTamaño(Map<String, Integer> diccionario){
        return diccionario.size();
    }
    
    public static void obtenerTodasLasClaves(Map<String, Integer> diccionario){
        for(String clave: diccionario.keySet()){
            /*
            if(valor == 32)
            Agregamos pila
            }
            while(pila.isEmpty){
                diccionario.remove(pila.pop());
            }
            */
            System.out.println(clave);
            
        }
    }
}
