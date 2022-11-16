package poo_test;
/*
 * @author gutmanndev
*/
public class POO_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("Fernando Herrera", 28);
        Empleado e1 = new Empleado("Roberto Diaz", 35, 1500000);
        Directivo d1 = new Directivo("Victor Hernandez", 43, 12000000, "p1");
        System.out.println(p1.presentate());
        System.out.println(e1.presentate());
        System.out.println(d1.presentate());
    }
    
}

