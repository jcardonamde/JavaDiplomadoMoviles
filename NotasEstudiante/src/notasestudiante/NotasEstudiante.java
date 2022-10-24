package notasestudiante;

import java.util.Scanner;

public class NotasEstudiante {

    public static void main(String[] args) {
        float nota1, nota2, nota3, promedio;
        
        // Solicitamos al usuario que ingrese 3 notas de un estudiante
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese la primer nota, un numero entre 0 a 10: ");
        nota1 = entrada.nextFloat();
        System.out.println("Por favor ingrese la segunda nota, un numero entre 0 a 10 ");
        nota2 = entrada.nextFloat();
        System.out.println("Por favor ingrese la tercer nota, un numero entre 0 a 10 ");
        nota3 = entrada.nextFloat();
        
        // Se calcula el promedio del estudiante para definir si esta promovido o no
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio del estudiante es:  " + promedio);
        
        if (promedio >= 7) {
            System.out.println("Estas promocionado");
        } else {
            System.out.println("No estas promocionado, debes repetir el curso");
        }
    } 
}