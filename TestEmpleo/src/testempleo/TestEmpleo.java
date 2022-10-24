package testempleo;

import java.util.Scanner;

public class TestEmpleo {

    public static void main(String[] args) {
        // Solicitamos al usuario que ingrese un número positivo
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese Nombre del Empleado");
        String nombre = entrada.next();
        System.out.println("Ingrese cantidad de total preguntas que se le realizaron: ");
        int cantidadPreguntas = entrada.nextInt();
        System.out.println("Ingrese cantidad de total preguntas que respondio correctamente: ");
        int respuestasCorrectas = entrada.nextInt();
        
        // Se calcula el nivel de porcentaje 
        int nivel = (respuestasCorrectas * 100) / cantidadPreguntas;
        // Validamos con los condicionales para evaluar el porcentaje de respuestas correctas que ha obtenido
        if (nivel >= 90) {
            System.out.println("El postulante " + nombre + " obtuvo un nivel Maximo");
        } else if (nivel >= 75 && nivel < 90) {
            System.out.println("El postulante " + nombre + " obtuvo un nivel Medio");
        } else if (nivel >= 50 && nivel < 75) {
            System.out.println("El postulante " + nombre + " obtuvo un nivel Regular");
        } else if (nivel < 50) {
            System.out.println("La califacion esta Fuera de Nivel");
        } else {
            System.out.println("La califacion esta Fuera de Nivel");
        }
    }
}
