/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;
import Entidades.Celebracion;
import java.util.ArrayList;

/**
 *
 * @author ocerv
 */
public class AlgoritmosDeOrdenamiento {
    public static void ordenamientoPorInsercion(ArrayList<Celebracion> pListaCelebraciones){
        int n = pListaCelebraciones.size();
        
        for (int i = 1 ; i < n ; i++){
            
            Celebracion actual = pListaCelebraciones.get(i);
            int j = i - 1;
            
            while (j>=0 && debeReordenarseParaInsercion(pListaCelebraciones.get(j),actual)){
                pListaCelebraciones.set(j + 1, pListaCelebraciones.get(j));
                j--;
            }
            pListaCelebraciones.set(j+1,actual);
        }
    }
    
    private static boolean debeReordenarseParaInsercion(Celebracion celebracion1, Celebracion celebracion2){
        // Prioridad 1: País en orden alfabético ascendente
        int comparacionPais = celebracion1.getPais().toLowerCase().compareTo(celebracion2.getPais().toLowerCase());
        
        // Prioridad 2: Fecha en orden cronológico ascendente
        int comparacionFecha = celebracion1.getFecha().compareTo(celebracion2.getFecha());
        
        /// Para priorización requerida, se van a utilizar las variables de comparación definidas arriba.
        /// Dependiendo de esas variables, primero comparacionPais (prioridad1) se decidirá si celebracion1 y celebracion2 deben reordenarse entre sí.
        if(comparacionPais > 0) return true; //En este caso, país de celebracion2 viene antes alfabéticamente, por lo que hay que reordenarlos
        else if (comparacionPais < 0) return false; //En este caso, país de celebracion viene antes alfabéticamente, por lo que NO hay que reordenarlos
        else return comparacionFecha > 0; //El caso pendiente es cuando los países son iguales, port lo que se utiliza la comparación de fecha para determinar si el reordenamiento es necesario
    }
    
    public static void ordenamientoMergeSort(ArrayList<Celebracion> pListaCelebraciones){
        if (pListaCelebraciones != null && pListaCelebraciones.size() > 1) {
            mergeSortRecursivo(pListaCelebraciones, 0, pListaCelebraciones.size() - 1);
        }
    }
    
    private static void mergeSortRecursivo(ArrayList<Celebracion> pListaCelebraciones, int pIzquierda, int pDerecha){
        if(pIzquierda < pDerecha) {
            int medio  = (pIzquierda + pDerecha) / 2;
            mergeSortRecursivo(pListaCelebraciones, pIzquierda, medio);
            mergeSortRecursivo(pListaCelebraciones, medio + 1 , pDerecha);
            merge(pListaCelebraciones, pIzquierda, medio, pDerecha);
        }
    }
    
    private static void merge(ArrayList<Celebracion> pListaCelebraciones, int pIzquierda, int pMedio, int pDerecha){
        // Variables que contienen el tamaño de los 2 subarreglos que se van a fusionar
        int tamanoIzquierda = pMedio - pIzquierda + 1;
        int tamanoDerecha = pDerecha - pMedio;
        
        // Se crean arreglos temporales para copiar los sub arreglos
        ArrayList<Celebracion> izquierdaTemp = new ArrayList<>(tamanoIzquierda);
        ArrayList<Celebracion> derechaTemp = new ArrayList<>(tamanoDerecha);
        
        // Ahora se copian los datos a las listas temporales reci[en creadas
        for(int i = 0 ; i < tamanoIzquierda ; i++){
            izquierdaTemp.add(pListaCelebraciones.get(pIzquierda + i));
        }
        for(int j = 0 ; j < tamanoDerecha ; j++){
            derechaTemp.add(pListaCelebraciones.get(pMedio + 1 + j));
        }
        
        // Estas variables van a servir como indice para recorrer las listas recien creadas y la lista principal fusionada
        int i = 0; // Indice para izquierdaTemp
        int j = 0; // Indice para derechaTemp
        int k = pIzquierda; // Indice para la lista principal
        
        while(i < tamanoIzquierda && j < tamanoDerecha){ //Cuando una de las dos condiciones se termine, van a sobrar algunos valores en la otra lista
            if(debeReordenarseParaMerge(izquierdaTemp.get(i),derechaTemp.get(j))){
                pListaCelebraciones.set(k,derechaTemp.get(j));
                j++;
            }
            else {
                pListaCelebraciones.set(k,izquierdaTemp.get(i));
                i++;
            }
            k++;
        }
        
        // Si los valores que sobraron estan en la izquierda, los agrega al final
        while(i < tamanoIzquierda){
            pListaCelebraciones.set(k,izquierdaTemp.get(i));
            i++;
            k++;
        }
        
        //Si los valores que sobraron estan en la derecha, los agrega al final
        while(j < tamanoDerecha){
            pListaCelebraciones.set(k,derechaTemp.get(j));
            j++;
            k++;
        }
        
    }
    
    private static boolean debeReordenarseParaMerge(Celebracion celebracion1, Celebracion celebracion2){
        // Prioridad 1: País en orden alfabético descendente
        int comparacionPais = celebracion1.getPais().toLowerCase().compareTo(celebracion2.getPais().toLowerCase());
        
         // Prioridad 2: Fecha en orden cronológico ascendente
        int comparacionFecha = celebracion1.getFecha().compareTo(celebracion2.getFecha());
        
        if (comparacionPais > 0) return false; // Se regresa false, contrario al método debeReordenarseParaInsercion porque se quiere ordenar de forma descendente
        else if (comparacionPais < 0) return true; 
        else return comparacionFecha < 0; // Contrario al método debeReordenarseParaInsercion porque se quiere ordenar de forma descendente
    }   
}


