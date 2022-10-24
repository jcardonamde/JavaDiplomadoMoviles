package valorabsolutonumero;

import java.util.Scanner;

public class ValorAbsolutoNumero {
    //El valor absoluto de un número positivo es él mismo.
    //El valor absoluto de un número negativo es su opuesto.
    //El valor absoluto de cero es él mismo.

    public static void main(String[] args) {
        // Se le pide al usuario que ingrese un numero cualquier y se almacena en la variable numero
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.println("Por favor ingrese un numero: ");
        numero = entrada.nextInt();
        
        // Se hacen las comparaciones del número ingresado por el usuario respecto a las condiciones del fundamento de Valor Absoluto
        if (numero < 0) 
        {
            System.out.println("Valor Absoluto: " + numero * (-1));
        } 
        else if (numero >= 0)
        {
            System.out.println("Valor Absoluto: " + numero);
        }
    }
}


