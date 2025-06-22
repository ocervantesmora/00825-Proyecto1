/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/* UNED II Cuatrimestre
 * 00825 - Estructuras de datos
 * Proyecto 1: Sistema de gestión de celebraciones
 * Estudiante: Oscar Eduardo Cervantes Mora
 * Fecha: 2025-06-22
 * @author ocervantesmora
 */
public class Utils {
    public static boolean isNullOrWhiteSpace(String pString){
        // Esta función es una implementación manual del método del mismo nombre que existe en otros lenguajes como C#
        // Revisa si el string parámetro es null o si son solamente espacios en blanco
        return pString == null || pString.trim().isEmpty();
    }
    
    public static String invertirString(String pString){
        // Condición de parada: cuando el string restante es de longitud 1.
        // Para este caso se toma en cuenta tambiérn la posibilidad de que el string sea nulo o vacío.
        // En este caso, la lógica de recursividad es tomar el último caracter y concatenarlo al resultado de aplicar esta misma función pero al resto del string (sin el último caracter)
        if(pString == null || pString.isEmpty() || pString.length() == 1) return pString;
        
        char ultimoCaracter = pString.charAt(pString.length()-1);
        
        String restoDelString = pString.substring(0,pString.length()-1);
        
        return ultimoCaracter + invertirString(restoDelString);
    }
}
