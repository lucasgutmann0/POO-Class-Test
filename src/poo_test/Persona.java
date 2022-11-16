/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_test;

/**
 *
 * @author sistemas
 */
public class Persona {
    private String nombre;
    private int edad;
    
    // Contructor
    public Persona (String n, int e) {
        this.nombre = n;
        this.edad = e;
    }
    
    public String presentate(){
        return "Mi nombre es " + this.nombre;
    }
    
    // Obtener nombre
    public String getNombre(){
        return this.nombre;
    }
    
    // Obtener Edad
    public int getEdad(){
        return this.edad;
    }
    
    // Setear nombre
    public void setName(String newName){
        this.nombre = newName;
    }
    
    // Setear edad
    public void setAge(int newEdad){
        this.edad = newEdad;
    }
}
