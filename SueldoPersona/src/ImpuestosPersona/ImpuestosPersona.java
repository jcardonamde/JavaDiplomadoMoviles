package ImpuestosPersona;

import java.util.Scanner;

public class ImpuestosPersona {

    public static void main(String[] args) {
        
        // Solicitamos al usuario que ingrese el valor de su sueldo
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese el valor de su Sueldo: ");
        double sueldo = entrada.nextDouble();
        
        if (sueldo > 3000)
        {
            System.out.println("Debe abonar impuestos");
        } else {
            System.out.println("No debe abonar impuestos");
        }
    }
}
