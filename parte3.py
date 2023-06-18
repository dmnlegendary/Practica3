'''
Autor: Díaz Jiménez Jorge Arif
Grupo: 3BV2
Fecha: 12/06/2023
'''

'''
Se necesitan las siguientes funciones obligatoriamente:
-Clase Calculadora.
-Constructor de la clase
-Método de suma
-Método de resta
-Método de multiplicación (decimales)
-Método de division (decimales)
-Método multiplicación (sumas sucesivas)
-Método de division (restas sucesivas)
-Método del módulo
'''

#Definicion de la clase "Calculadora" y sus atributos
class Calculadora:
    valorIngresado = None #Variable que almacenará un valor ingresado por el usuario
    
    def __init__(self, anyValue):#Método constructor 
        self.valorIngresado = anyValue #Asignación de dato al objeto
    
    def imprimirValor(self):#Método que permite imprimir los datos de un objeto
        print("El valor del numero es: ", self.valorIngresado)

    def sumar(self, value2):#Método que realiza la suma de dos números
        print(self.valorIngresado,"+",value2," = ",self.valorIngresado+value2)

    def restar(self, value2):#Método que realiza la resta de dos números
        print(self.valorIngresado,"-",value2," = ",self.valorIngresado-value2)
    
    def multiplicar(self, value2):#Método que realiza la multiplicación de dos números
        print(self.valorIngresado,"*",value2," = ",self.valorIngresado*value2)

    def dividir(self, value2):#Método que realiza la división de dos números
        print(self.valorIngresado,"/",value2," = ",self.valorIngresado/value2)
    
    def sumasSucesivas(self, value2): #Multiplicación por medio de sumas sucesivas
        resultado = 0
        contador = 0
        while contador<int(value2):#Controla la cantidad de veces que se sumara un mismo número
            resultado = resultado + int(self.valorIngresado)#almacenará las sumas que haga un mismo número
            contador = contador+1
        print(int(self.valorIngresado),"*",int(value2)," = ",resultado)#Imprime el resultado

    def restasSucesivas(self, value2):#División por medio de restas sucesivas
        resultado = 0
        residuo = int(self.valorIngresado)
        #Supondremos que la división se hara de la forma: "self.valorIngresador / value2"
        while residuo>int(value2):
            resultado = resultado + 1
            residuo = residuo - int(value2)
        print("La division enterea de ",int(self.valorIngresado),"/",int(value2)," = ", resultado)#Imprime el resultado

    def modulo(self, value2):#Obtiene el módulo de una división
        resultado = 0
        residuo = int(self.valorIngresado)
        #Supondremos que la división se hara de la forma: "self.valorIngresador / value2"
        while residuo>int(value2):
            resultado = resultado + 1
            residuo = residuo - int(value2)
        print("La division enterea de ",int(self.valorIngresado),"/",int(value2)," da el modulo: ", residuo)#Imprime el resultado

def extractNumber(): #Función que permite ingresar un número y retornarlo a una variable
    storedValue = input()
    return storedValue

print("Ingrese un número para almacenar en el objeto: ")

nueva_Calculadora = Calculadora(extractNumber())#Creacion de una variable de clase "Calculadora"
nueva_Calculadora.imprimirValor()#Impresion que nos permite conocer que datos se han registrado en nuestra variable de clase "Calculadora"

print("Ingrese un segundo número para realizar las operaciones: ")
apoyo = extractNumber()

nueva_Calculadora.sumar(apoyo) #Aplicación del método suma
nueva_Calculadora.restar(apoyo) #Aplicación del método resta
nueva_Calculadora.multiplicar(apoyo) #Aplicación del método multiplicar
nueva_Calculadora.dividir(apoyo) #Aplicación del método dividir
nueva_Calculadora.sumasSucesivas(apoyo) #Aplicación del método sumaSucesivas
nueva_Calculadora.restasSucesivas(apoyo) #Aplicación del método restasSucesivas
nueva_Calculadora.modulo(apoyo) #Aplicación del método modulo