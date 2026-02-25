/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_potencia;

/**
 *
 * @author eveli
 */
public class EVA1_20_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("elevar de 2 elevado al cubo" + potencia(2,3));
    }
    
    public static int potencia(int base, int expo){
    if(expo ==1)
        return base;
    else
        return base*potencia(base, expo-1);//resuelve el problema, llamada recursiva
    
        
        
    }
    
}
