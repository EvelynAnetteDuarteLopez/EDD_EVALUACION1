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
    
    public static int gcd(int val1, int val2){
        int menor;
        int resultado = 1;
        if(val1 < val2)
            menor =val1;
        else
            menor =val2;
        for(int i =1; i<= menor; i++){
            if(val1% i== 0 && val2% i ==0)
                resultado =i;
        }
        return resultado;
        
    }
    
}
