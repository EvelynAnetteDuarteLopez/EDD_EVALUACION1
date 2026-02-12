/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_multi;

/**
 *
 * @author eveli
 */
public class EVA1_13_MULTI {
    final static int FILAS =5;
    final static int COL =3;
    
    
    public static void main(String[] args) {
        int[][]arreglo = new int[FILAS][COL];//5 FILAS X 3 COLUMNAS = 15 ENTERON
        //ACCESO POR INDICES
        //PRIMER POSICION:
        arreglo[0][0]=100;
        //INTERMEDIA:
        arreglo[3][1] = 500;
        //ULTIMA POSICION:
        arreglo[4][2]=1600;
        
        for(int i=0; i < FILAS; i++){//primera dimesion -->FILAS
            for(int j =0; j< COL; j++){//SEGUNDA DIMENSION -->COLUMNAS
                arreglo[i][j] = (int)(Math.random() * 100);
            }
           
        }
        
        //DOS DIMENSIONES--> DOS CICLOS PARA PODER RECORRER EL ARREGLO
        for(int i=0; i < FILAS; i++){//primera dimesion -->FILAS
            for(int j =0; j< COL; j++){//SEGUNDA DIMENSION -->COLUMNAS
                System.out.print("[" + arreglo[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("arreglo: " + arreglo);
        System.out.println("arreglo[1]: " + arreglo[0]);
        System.out.println("arreglo[2]: " + arreglo[1]);
        System.out.println("arreglo[2]: " + arreglo[2]);
        System.out.println("arreglo[3]: " + arreglo[3]);
        System.out.println("arreglo[4]: " + arreglo[4]);
        
    }
    
}
