package calcularareas;

import java.util.Scanner;

public class CalcularAreas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos a calcular el area de las siguientes figuras en metros");
        System.out.println("Iniciemos con el cuadrado.");
        
        //Solicitamos datos para calcular area del Cuadrado
        System.out.println("Por favor ingrese cual es la medida de una de las caras del cuadrado: ");
        float ladoCuadrado = entrada.nextFloat();
        
        //Solicitamos datos para calcular area del Triangulo
        System.out.println("Perfecto, ahora vamos a continuar con el Triangulo.");
        System.out.println("Por favor ingrese cual es la longitud de la base del Triangulo: ");
        float baseTriangulo = entrada.nextFloat();
        System.out.println("Por favor ingrese cual es la altura del Triangulo: ");
        float alturaTriangulo = entrada.nextFloat();
        
        //Solicitamos datos para calcular el area del Circulo
        System.out.println("Muy bien, ya finalmente concluimos con las medidas del circulo.");
        System.out.println("Por favor ingrese el valor del radio del Circulo: ");
        float radioCirculo = entrada.nextFloat();
        
        //Se realiza la ejecución de las formulas para el calculo de la respectiva area de cada figura geometrica
        //Se imprimen los valores de cada solución
        float areaCuadrado = ladoCuadrado * ladoCuadrado;
        System.out.println("El area del cuadrado es: " +  areaCuadrado + " m2");
        float areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.println("El area del triangulo es: " +  areaTriangulo + " m2");
        double areaCirculo =  3.1416 * Math.pow(radioCirculo, 2);
        System.out.println("El area del triangulo es: " + areaCirculo + " m2"); 
    }
}
