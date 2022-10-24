package calcularsalarioobrero;

import java.util.Scanner;

public class CalcularSalarioObrero {

    public static void main(String[] args) {
        
        double incremento, nuevoSalario;
       
        // Se le da la bienvenida al usuario y se le solicita el ingreso de su salario actual 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculadora de Salarios.");
        System.out.println("Por favor ingrese su salario actual.");
        double salario = entrada.nextDouble();
        
        // Se calcula el monto del incremento y el valor total del nuevoSalario
        incremento = salario * 0.25;
        nuevoSalario = salario + incremento;
        
        // Se imprime el resultado
        System.out.println("Su nuevo salario con un aumento del 25% seria: " + nuevoSalario);   
    }
}
