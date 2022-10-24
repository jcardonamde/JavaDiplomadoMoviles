package areaperimetrocirculo;

import java.util.Scanner;

public class AreaPerimetroCirculo {

    public static void main(String[] args) {
        
        // Declaramos las variables de Perimetro y Area
        double perimetro, area;
        
        // Solicitamos al usuario que ingrese el valor del radio del circulo que vamos a calcular
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos a calcular el perimetro y el area de un Circulo");
        System.out.println("Por favor ingrese el valor del radio del Circulo: ");
        double radio = entrada.nextDouble();
        
        // Se ejecutan las formulas para el calculo respectivo
        perimetro = 2 * Math.PI * radio;
        area =  Math.PI * Math.pow(radio, 2);
        
        System.out.println("El perimetro del circulo es: " + perimetro + " m");
        System.out.println("El area del circulo es: " + area + " m2");
    }
}
