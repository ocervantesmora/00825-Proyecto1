/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;
import Entidades.Celebracion;
import java.util.ArrayList;

/* UNED II Cuatrimestre
 * 00825 - Estructuras de datos
 * Proyecto 1: Sistema de gestión de celebraciones
 * Estudiante: Oscar Eduardo Cervantes Mora
 * Fecha: 2025-06-22
 * @author ocervantesmora
 */
public class CelebracionAD {
    private static final ArrayList<Celebracion> listaDeCelebraciones = new ArrayList();
    
    public static boolean registrarCelebracion(Celebracion pCelebracion){
        try {
            listaDeCelebraciones.add(pCelebracion);
            return true;
        }
        catch(Exception e){
            return false;
        }
    
    }
    
    public static ArrayList<Celebracion> consultarCelebraciones(){
        return listaDeCelebraciones;
    }
    
}
