/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;
import Entidades.Celebracion;
import java.util.ArrayList;

/**
 *
 * @author ocerv
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
