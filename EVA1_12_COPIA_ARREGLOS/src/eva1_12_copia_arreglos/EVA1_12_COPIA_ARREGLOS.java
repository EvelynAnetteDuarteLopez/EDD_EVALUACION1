/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_copia_arreglos;

/**
 *
 * @author eveli
 */
public class EVA1_12_COPIA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Ejemplo[] arreglo =new Ejemplo[2];  
         System.out.println("arreglo" + arreglo); //Arreglo es la direccion
         //arreglo. --> nos permite acceder al arreglo
         //creamos cada objeto en las posiciones del arreglo
         arreglo[0] = new Ejemplo();
         arreglo[1] = new Ejemplo();
         //Imprimir las direcciones
         System.out.println("arreglo[0]" + arreglo[0]);
         System.out.println("arreglo[1]" + arreglo[1]);
         
         System.out.println(arreglo[0].val);
         System.out.println(arreglo[1].val);
         
        //Ejemplo[]copia =arreglo;//NO FUNCIONA, CREO UN DUPLICADO A LA DIRECCION
        Ejemplo[] copia = new Ejemplo[2]; //DEDO CREAR UN NUEVO ARREGLO
         System.out.println("Copia=" + copia);
         //POSICION POR POSICION COPIAR DE UN ARREGLO A OTROS
         //copia[0] = arreglo[0]; //no duplico el objeto, duplicamos la direccion
         //copia[1] = arreglo[1];
         copia[0]=new Ejemplo();
         copia[1]=new Ejemplo();
         //ahora si, hay que transferir la info de un objeto a otro (siempre y cuando
         //esa informacion no sean objetos tambien)
         
         System.out.println("Copia[0]" + copia[0]);
         System.out.println("Copia[1]" + copia[1]);
         
         System.out.println(copia[0].val);
         System.out.println(copia[1].val);
    }
    
    
}
class Ejemplo{
    int val=5;
}
