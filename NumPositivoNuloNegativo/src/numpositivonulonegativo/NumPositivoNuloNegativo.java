package numpositivonulonegativo;

import java.util.Scanner;

public class NumPositivoNuloNegativo {

    public static void main(String[] args) {
        int numero;
        
        // Solicitamos al usuario que ingrese un número
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero: ");
        numero = entrada.nextInt();
        
        // Verificamos si el número ingresado es Positivo, Nulo o Negativo
        if (numero > 1) {
            System.out.println("El numero es Positivo");
        } else if (numero == 0 ) {
            System.out.println("El numero es nulo  ");
        } else {
            System.out.println("El numero es Negativo  ");
        }
    }
}
