package dosnumerosconoperaciones;

import java.util.Scanner;

public class DosNumerosConOperaciones {

    public static void main(String[] args) {
        int num1, num2;
        
        // Solicitamos al usuario que ingrese dos números
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese un primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Por favor ingrese un segundo numero: ");
        num2 = entrada.nextInt();
        
        // Verificamos cual es el mayor respecto al otro
        // Dependiendo de la validación adicionalmente se ejecutan unas operaciones matematicas con los 2 números
        if (num1 > num2) {
            System.out.println("El numero mayor es " + num1 + " y el menor es " + num2);
            int suma = num1 + num2;
            System.out.println("La suma de estos dos numero es igual a " + suma );
            int diferencia = num1 - num2;
            System.out.println("La diferencia entre estos dos numeros es igual a " + diferencia );
        } else {
            int producto = num2 * num1;
            System.out.println("El producto entre estos dos numeros es igual a " + producto);
            float division = num2 / num1;
            System.out.println("La division entre estos dos numeros es igual a " + division);
        }
    }
}
