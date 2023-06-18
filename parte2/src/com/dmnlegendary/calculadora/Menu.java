package com.dmnlegendary.calculadora;
/**
 *
 * @author Diaz Jimenez Jorge Arif 3BV2
 */

//Clase público 
public class Menu {
    public static void main(String args[]){
        
        /*
        Creacion de objetos con la clase Calculadora
        */
        Calculadora variable = new Calculadora();
        Calculadora entero = new Calculadora(5);
        Calculadora flotante = new Calculadora(3.15f);
        Calculadora doble = new Calculadora(1.07910537);
        
        /*
        Uso de los métodos sobrecargados:
        - getSuma()
        - getResta()
        - multiplicar()
        - dividir()
        */
        variable.getSuma(27);
        entero.getResta(7);
        flotante.getSuma(5.89f);
        doble.getResta(0.890588585);
        
        //Método que calcula la multiplicación de dos enteros
        variable.sumaSucesiva(8);
        
        //Método que calcula la division de dos números enteros
        variable.restasSucesivas(2);
        
        //Método que calcula el módulo de dos números enteros
        variable.modulo(5);
    }
}
