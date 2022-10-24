package formulacuadratica;

import java.util.Scanner;

public class FormulaCuadratica {
    
    public static void main(String[] args) {
        //Se declaran las variables
        Scanner entrada = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        
        System.out.println("Bienvenido al sistema para el cálculo de trinomios cuadrados por medio de la fórmula cuadratica general");
        System.out.println("Por favor ingrese el valor del coeficiente a: ");
        a = entrada.nextDouble();
        
        // Se compara el valor ingresado si es igual a 0, sino lo es solicita el ingreso de b y c
        if (a == 0) {
            System.out.println("Cero no es un valor posible para a");
        } 
        else 
        {
            System.out.println("Por favor ingrese el valor del coeficiente b: ");
            b = entrada.nextDouble();
        
            System.out.println("Por favor ingrese el valor del coeficiente c: ");
            c = entrada.nextDouble();
            
            // Se hace el calculo del determinante en este caso nombrado como delta
            delta = (b*b) - (4*a*c);
            System.out.println("Delta: " + delta);
            
            // Se compara el resultado obtenido para finalmente validar si la ecuación tiene solución en los Reales
            if (delta < 0) {
                System.out.println("Su ecuacion no tiene solucion en los Reales");
            }
            else if (delta == 0)
            {
                x1 = -b / (2*a);
                System.out.println("Su ecuacion tiene una solucion en los Reales");
                System.out.println("El valor de x1 seria: " + x1);
            }
            else
            {
                x1 = (-b + Math.sqrt(delta)) / (2*a);
                x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("Su ecuacion tiene dos solucion en los Reales");
                System.out.println("El valor de x1 seria: " + x1);
                System.out.println("El valor de x1 seria: " + x2);
            }
        }
    }
}

