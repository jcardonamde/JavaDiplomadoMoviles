package minimomaximo5numeros;

import java.util.Scanner;
import java.lang.Math;

public class MinimoMaximo5Numeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
        int [] numero = new int[5];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        
        // Se Itera el array para definir cual es el número maximo y minimo contenido en el
        // Luego de leer los números ingresados por el usuario
        System.out.println("Programa que Lee 5 numeros y calcula el maximo, minimo y potencias.");
        for (i = 0; i < 5; i++) {
            System.out.print("Introduce el numero " + (i+1) + ": ");
            numero[i] = entrada.nextInt();
            if (numero[i] < minimo) {
                minimo = numero[i];
            }
            if (numero[i] > maximo) {
                maximo = numero[i];
            }
        }
        
        // Se Itera el array para comparar si alguno de los números coincide con la asignacion de maximo y minimo del ciclo anterior
        // Posteriormente se imprime cual es el número maximo y minimo contenido en el array
        for (i = 0; i < 5; i++) {
            if (numero[i] == maximo) {
                System.out.println("El numero maximo es: " + numero[i]);
                }
            if (numero[i] == minimo) {
                System.out.println("El numero minimo es: " + numero[i]);
            }
            
            
        }
       
        // Se recorre nuevamente el array para identificar los datos contenidos en las posiciones Inicial y Final
        int primerNumero = 0;
        int ultimoNumero = 0;
        // Itera en el array para encontrar los datos contenidos en las posiciones 0 y en la posicion Final
        for (i = 0; i < numero.length ; i++) {
                primerNumero = numero[0];
                ultimoNumero = numero[4];
        }
        // Se imprime cuales son los números ubicados en la posición Inicial y Final del Arreglo
        System.out.println("El primer numero de mi arreglo es: " + primerNumero);
        System.out.println("El Ultimo numero de mi arreglo es: " + ultimoNumero);
        
        //Se procede a calcular la potencia entre estos dos números y se imprime su resultado 
        double potenciaEntreNumeros = Math.pow(primerNumero, ultimoNumero);
        System.out.println("La potencia del primer numero, en este caso " + primerNumero + " con el ultimo numero en este caso " + ultimoNumero + " da : " + potenciaEntreNumeros);
    }
}


