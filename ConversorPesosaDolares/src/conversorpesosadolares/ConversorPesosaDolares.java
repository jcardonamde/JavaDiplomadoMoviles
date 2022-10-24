package conversorpesosadolares;

import java.util.Scanner;

public class ConversorPesosaDolares {

    public static void main(String[] args) {
        
        // Se crean las variables
        int equivalencia, cantidadDolares;
        
        // Se Solicitan por teclado los datos de la divisa
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor del dolar en pesos: ");
        equivalencia = sc.nextInt();
        System.out.println("Ingresa la cantidad de dolares: ");
        cantidadDolares = sc.nextInt();
        
        // Se ejecuta la siguiente formula para hacer la conversión
        int pesos = cantidadDolares * equivalencia;
        // Imprimir resultado
        System.out.println(cantidadDolares + " dolares equivalen a " + pesos);   
    }
}