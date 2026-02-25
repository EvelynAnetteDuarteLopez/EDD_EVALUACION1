/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_gcd;

/**
 *
 * @author eveli
 */
public class EVA1_19_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Maximo comun divisor de 180 y 48 es " + gcd(180,48));
    }
    
    public static int gcd(int valor, int divisor){
    //como resuelvo
    int resi = valor%divisor;//me interesa el residuo
    //llamada recursiva
    //detener recursividad
    if(resi >0)
        return gcd(divisor, resi);
    else
        return divisor;
        
    }
    
    
    
    
}
