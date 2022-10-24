package numerounodosdigitos;

import java.util.Scanner;

public class NumeroUnoDosDigitos {

    public static void main(String[] args) {
        
        // Solicitamos al usuario que ingrese un número entre el rango indicado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese un número entre 1 y 99: ");
        int num = entrada.nextInt();
        
        // Validamos con los condicionales si el numero ingresado es de uno o dos digitos
        if (num <= 0 || num > 99) {
            System.out.println("El numero no se encuentra entre el rango requerido");
        }
        
        if (num > 0 && num < 10) {
            System.out.println("El numero ingresado es de un digito");
        }
        
        if (num >= 10 && num <= 99) {
            System.out.println("El numero ingresado es de dos digitos");
        }
    }
}
