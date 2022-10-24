package calcularvalory;

import java.util.Scanner;

public class CalcularValorY {

    public static void main(String[] args) {
        
        // Se declara la variable a encontrar
        int y;
        
        // Se ingresa el valor de la variable x
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos a calcular el valor de Y en esta ecuación Y= 3 * x2 + 7x – 1");
        System.out.println("Por favor ingrese el valor de X: ");
        int x = entrada.nextInt();
        
        // Se realiza el calculo de la ecuación y se imprime el resultado
        y = (3 * (x * 2)) + ((7 * x) - 1);
        System.out.println("El valor de Y es: " + y);   
    }
}
