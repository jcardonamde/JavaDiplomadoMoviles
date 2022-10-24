package promedioysumanumeros;

import java.util.Scanner;

public class PromedioySumaNumeros {

    public static void main(String[] args) {
        
        //Se crean las variables para el array y la suma
        Scanner entrada = new Scanner(System.in);
        int i;
        int [] numeros = new int[5];
        int suma = 0;
        
        //Se solicita la entrada de los números a calcular
        System.out.println("Programa que Lee 5 numeros,25 calcula su sumatoria y el promedio.");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el numero " + (i+1) + ": ");
            //Se agregan los números entrados por el usuario al array
            numeros[i] = entrada.nextInt();
            // Se van sumando los números ingresados dentro de la variable suma
            suma = suma + numeros[i];
        }
        
        //Se hace calculo del promedio y finalmente se imprime la sumatoria y el promedio de los números
        float promedio  = suma / numeros.length;
        System.out.println("El total de la suma de los numeros ingresados es " + suma + " y el promedio es " + promedio);
    }
}
