/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_recursividad;

/**
 *
 * @author eveli
 */
public class EVA1_17_RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirLista(5);
        System.out.println("");
        imprimirListaRec(5);
        System.out.println("");
        imprimirListaUp(5);
        System.out.println("");
        imprimirListaRecUp(1,5);
    }
    
    public static void imprimirLista(int val){
        for(int i = val; i >0; i--){
            System.out.print(i + " - ");
        }
   
    }
        public static void imprimirListaUp(int val){
        for(int i = 1; i<=val; i++){
            System.out.print(i + " - ");
        }
   
    }

    public static void imprimirListaRec(int val){
        //seccion que resuelve el problema
        System.out.print(val + " - "); //llamada recursivas el metodo se invoca a si 
        if(val > 1)
        imprimirListaRec(val - 1); //detener la recursividad
        
    }
    
    public static void imprimirListaRecUp(int ini,int val){
    System.out.print(ini + " - ");
    if(ini < val)//detener la recursividad
        imprimirListaRecUp(ini +1, val);
   

    
    }
    
    
    
    
}
