/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_fibonacci;

/**
 *
 * @author eveli
 */
public class EVA1_22_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Valor fibonacci en posicion 5 = " + fibonacci(5));
    }
    
    public static int fibonacci(int posi){
    if(posi == 0)
        return 0;
    if(posi == 1)
        return 1;      
    return fibonacci(posi -1) + fibonacci (posi -2);
    }
    
}
