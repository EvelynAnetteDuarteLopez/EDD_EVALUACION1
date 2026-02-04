/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_referencias;

/**
 *
 * @author eveli
 */
public class EVA1_5_REFERENCIAS {
    public static void main(String[] args) {
        int x =100;
        prueba prueba = new prueba();//CREANDO UNA INSTANCIA DE PRUEBA
        System.out.println(x);
        System.out.println(prueba);
        //En java, una variable que guarda una dirección (memoria) se llama REFERENCIA
        //En otris lenguajes --> Apuntadores
        //COMO DESTRUYO EL OBJETO:
        prueba = null;//Esto solo desconecta la variable del objeto
    }
    
}
class prueba{
    int y =200;
    
}