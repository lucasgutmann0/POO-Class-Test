/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_test;

/**
 *
 * @author sistemas
 */
public class Empleado extends Persona {
    private float sueldoBruto;
    
    public Empleado(String n, int e, float s){
        super(n, e); // Utilizar el constructor de la clase extendida
        this.sueldoBruto = s;
    }
    
    @Override
    public String presentate() {
        return "Mi nombre es " + super.getNombre() + " y soy un Empleado";
    }
    
    public float getSueldo(){
        return this.sueldoBruto;
    }
    
    public void setSueldo(int s){
        this.sueldoBruto = s;
    }
}
