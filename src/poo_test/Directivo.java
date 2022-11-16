/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_test;

/**
 *
 * @author sistemas
 */
public class Directivo extends Empleado {
    
    private String categoria;
    
    public Directivo(String n, int e, float s, String c) {
        super(n, e, s);
        this.categoria = c;
    }
    
    @Override
    public String presentate(){
        return "Mi nombre es " + super.getNombre() + " Y soy un Directivo de Categoría " + this.categoria;
    }
    
    
    public String getCategoria(){
        return this.categoria;
    }
    
    public void setCategoria(String c){
        this.categoria = c;
    }
}
