/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_cambiar_tamaño;

/**
 *
 * @author eveli
 */
public class EVA1_10_CAMBIAR_TAMAÑO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] datos = new int[5]; 
      
      for(int i = 0; i < datos.length; i++){
          datos[i] = (int)(Math.random()* 100);
      }
      
       for(int i = 0; 1 < datos.length; i++){
        System.out.print("[" + datos[i] + "]");
      }
       System.out.println("");
       
       //RESPALDAR LA INFO EN UN NUEVO ARREGLO
       int[]copia = new int[3];
       for(int i=0; i< copia.length; i++){
           copia[i]=datos[i];
       }
       datos=copia; 
        System.out.println("Nuevo valores de datos: ");
        
        for(int i = 0; 1 < datos.length; i++){
        System.out.print("[" + datos[i] + "]");
      }
    
     
      
    }
}    

