package promedioestudiante;

import java.util.Scanner;

public class PromedioEstudiante {


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
        
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio del estudiante es:  " + promedio);
        
        // Se calcula el promedio y se imprime alguno de los mensajes de status final
        if (promedio >= 7) {
            System.out.println("Promocionado");
        } else if (promedio >= 4 && promedio <7 ) {
            System.out.println("Regular");
        } else if (promedio < 4) {
            System.out.println("Reprobado");
        } else {
            System.out.println("Fin");
        }
    }
}
