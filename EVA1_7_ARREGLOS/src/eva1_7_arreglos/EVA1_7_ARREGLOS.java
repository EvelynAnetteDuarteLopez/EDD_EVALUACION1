/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_arreglos;

/**
 *
 * @author eveli
 */
public class EVA1_7_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //String[] cade1, cade2, cade3; -->todos son arreglos
     //String cade1, cade2[], cade3; --> solo cade2 es arreglo
     int[] datos = new int[10]; //  40 bytes
     //MANEJO DE INDICES
     System.out.println(datos);
     datos[0]= 100;
     datos[1]= 200;
     datos[2]= 300;
     datos[9]= 1000;
     
     //datos[10] = 1100; //posicion 10 no existe (la ultima es 9)
     System.out.println("Valor en posicion 0 =" + datos[0]);
     
    }
    
}
