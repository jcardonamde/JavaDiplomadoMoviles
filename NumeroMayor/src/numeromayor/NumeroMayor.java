package numeromayor;

import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {
        
        int num1, num2;
        
        // Solicitamos al usuario que ingrese dos números
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese un primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Por favor ingrese un segundo numero: ");
        num2 = entrada.nextInt();
        
        // Verificamos cual es el mayor respecto al otro
        if (num1 > num2) {
            System.out.println("El numero mayor es " + num1 + " y el menor es " + num2);
        } else {
            System.out.println("El numero mayor es  " + num2 + " y el menor es " + num1);
        }
    }
}
