package pkg3numerosmayor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int num1, num2, num3;
        
        // Solicitamos al usuario que ingrese dos números
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese un primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Por favor ingrese un segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Por favor ingrese un tercer numero: ");
        num3 = entrada.nextInt();
        
        // Verificamos cual es el número mayor de los 3 ingresados
        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor es " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero mayor es  " + num2);
        } else {
            System.out.println("El numero mayor es  " + num3);
        }
    }  
}
