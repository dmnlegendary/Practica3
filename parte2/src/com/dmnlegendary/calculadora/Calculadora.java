package com.dmnlegendary.calculadora;

/**
 *
 * @author Diaz Jimenez Jorge Arif 3BV2
 */

//Declaración de la clase "Calculadora y asignación de atributos
public class Calculadora {
    /*
    En esta sección reservaremos tres atributos para todo objeto de clase "Calculadora"
    Posteriormente implementaremos métodos que permitan hacer uso de los atributos del 
    */
    private int value1;//Atributo de valor entero para todo objeto de clase "Calculadora"
    private float valu1;//Atributo de valor flotante para todo objeto de clase "Calculadora"
    private double val1;//Atributo de valor doble para todo objeto de clase "Calculadora"
    
    //Constructor sin parámetros
    public Calculadora(){
        this.value1 = 7;
        this.valu1 = 1.05f;
        this.val1 = 5.1755755754;
    }
    
    //Constructor con parámetros
    public Calculadora(int valor1){
        this.value1 = valor1;
    }
    public Calculadora(float valor1){
        this.valu1 = valor1;
    }
   public Calculadora(double valor1){
       this.val1 = valor1;
   }
    
    //Accesos a valores de una clase "calculadora"
   public int getIntX(){
       return this.value1;
   }
   public float getFloatX(){
       return this.valu1;
   }
   public double getDoubleX(){
       return this.val1;
   }
   
    /*
    Métodos sobrecargados: es la creacion de varios metodos bajo el mismo nombre
    pero con diferente lista de parámetros
    */
    public void getSuma(int b){
        int resultado = value1 + b;
        System.out.println("La suma de "+value1+" y "+b+" da "+resultado);
    }
    public void getSuma(float b){
        double resultado = valu1+b;
        System.out.println("La suma de "+valu1+" y "+b+" da "+resultado);
    }
    public void getSuma(double b){
        double resultado = val1+b;
        System.out.println("La suma de "+val1+" y "+b+" da "+resultado);
    }
    public void getResta(int b){
        double resultado = value1-b;
        System.out.println("La resta de "+value1+" y "+b+" da "+resultado);
    }
    public void getResta(float b){
        double resultado = valu1-b;
        System.out.println("La resta de "+valu1+" y "+b+" da "+resultado);
    }
    public void getResta(double b){
        double resultado = val1-b;
        System.out.println("La resta de "+val1+" y "+b+" da "+resultado);
    }
    
    /*
    Método que permite la múltiplicación de enteros por medio de sumas sucesivas
    */
    public void sumaSucesiva(int b){
        int clock;
        int resultado = 0;
        for (clock=1; clock<=b; clock++){
            resultado = resultado + value1;//suma 'a' unas 'b' veces
        }
        System.out.println(value1+"*"+b+" = "+resultado);
    }
    
    /*
    Método que permite la division de enteros por el método de restas sucesivas
    */
    public void restasSucesivas(int b){
        int conteoRestas = 0;
        int resultado = value1;
        while(resultado>=b){
            resultado = resultado - b;
            conteoRestas = conteoRestas + 1;//Variavle que cuenta las veces que 'b' a restado a 'a'
        }
        int sobrante = resultado;
        System.out.println(value1+"/"+b+" = "+conteoRestas+", con un residuo de "+sobrante);
    }
    
    /*
    Métodos sobrcargados que permiten la multiplicación y división de valores flotantes y dobles
    */
    public void multiplicar(float b){
        float resultado = valu1*b;
        System.out.println(valu1+"*"+b+" = "+resultado);
    }
    public void multiplicar(double b){
        double resultado = val1*b;
        System.out.println(val1+"*"+b+" = "+resultado);
    }
    public void dividir(float b){
        float resultado = valu1/b;
        System.out.println(valu1+"/"+b+" = "+resultado);
    }
    public void dividir(double b){
        double resultado = val1/b;
        System.out.println(val1+"/"+b+" = "+resultado);
    }
    
    /*
    Método que permite el cálculo del módulo de dos valores enteros
    */
    public void modulo(int b){
        int conteoRestas = 0;
        int resultado = value1;
        while(resultado>=b){//Ciclo que realiza el conteo de las veces que 'b' puede restar a 'a'
            resultado = resultado - b;
            conteoRestas = conteoRestas + 1;
        }
        int sobrante = resultado;//En esta variable guardamos el sobrante de restarle a 'b' las veces 'a' hasta que b>a
        System.out.println("El modulo de "+value1+" y "+b+" es "+sobrante);
    }
}