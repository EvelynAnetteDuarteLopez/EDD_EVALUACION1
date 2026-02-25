/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_sumatoria;

/**
 *
 * @author eveli
 */
public class EVA1_21_SUMATORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Sumatoria de 5:" + sumatoria(5));
    }
    
    public static int sumatoria(int val){
        if(val >0)
            return val + sumatoria(val-1);
        else
            return val ;
        
    }
    
}
