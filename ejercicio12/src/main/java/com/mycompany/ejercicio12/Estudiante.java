/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio12;

/**
 *
 * @author jhon
 */
public class Estudiante {
    private String nombre;
    private double calificacion;
    
    
    public Estudiante(String nombre, double calificacion){
        this.nombre=nombre;
        this.calificacion=calificacion;
    }
    public String getNombre(){
        return nombre;
    }
    public double getCalificacion(){
        return calificacion;
    }
    public void setNombre(){
        this.nombre=nombre;
    }
    public void setCalificacion(){
        this.calificacion=calificacion;
    }
}
