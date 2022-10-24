package numerotrescifras;

import java.util.Scanner;

public class NumeroTresCifras {

    public static void main(String[] args) {
        // Solicitamos al usuario que ingrese un número positivo
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero: ");
        int num = entrada.nextInt();
        
        // Validamos con los condicionales si el numero ingresado es de uno o dos digitos
        if (num > 0 && num <= 9) {
            System.out.println("El numero ingresado es de una cifra");
        } else if (num > 9 && num <= 99) {
            System.out.println("El numero ingresado es de dos cifras");
        } else if (num > 99 && num <= 999) {
            System.out.println("El numero ingresado es de tres digitos");
        } else if (num < 0) {
            System.out.println("El numero ingresado no es positivo");
        } else {
            System.out.println("Error: el numero de cifras es mayor");
        }
    }
}
