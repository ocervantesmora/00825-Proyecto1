/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;
        
/**
 *
 * @author ocerv
 */
public class Celebracion {
    // Atributos de la entidad Celebracion
    private static int contadorId = 0;
    private final int idDeLaCelebracion;
    private LocalDate fecha;
    private String descripcion;
    private String pais;
    
    // Constructor de la clase Celebracion
    public Celebracion(LocalDate fecha, String descripcion, String pais) {
        this.idDeLaCelebracion = ++contadorId;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.pais = pais;
    }
    
    // Métodos get para acceder a los atributos
    public int getIdDeLaCelebracion() {
        return idDeLaCelebracion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPais() {
        return pais;
    }

    // Métodos set para modificar los atributos (excepto el ID)
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
