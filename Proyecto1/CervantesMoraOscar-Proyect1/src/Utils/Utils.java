/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author ocerv
 */
public class Utils {
    public static boolean isNullOrWhiteSpace(String pString){
        // Esta función es una implementación manual del método del mismo nombre que existe en otros lenguajes como C#
        // Revisa si el string parámetro es null o si son solamente espacios en blanco
        return pString == null || pString.trim().isEmpty();
    }
}
