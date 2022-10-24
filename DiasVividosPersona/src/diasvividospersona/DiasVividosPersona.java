package diasvividospersona;

import java.util.Scanner;


public class DiasVividosPersona {

    public static void main(String[] args) {
        
        // Se le da la bienvenida al usuario y se le solicita el ingreso de su nombre y edad 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculadora de Dias Vividos");
        System.out.println("Por favor ingrese su Nombre ");
        String nombre = entrada.next();
        System.out.println("Por favor ingrese su Edad actual: ");
        int edad = entrada.nextInt();
        
        //Se calcula la cantidad de los dias vividos
        int resultado = edad * 365;
       
        // Se imprime el resultado
        System.out.println(nombre + " ha vivido hasta su edad actual " + resultado + " dias");   
    }
}
