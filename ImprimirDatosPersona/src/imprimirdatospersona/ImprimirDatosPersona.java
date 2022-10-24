package imprimirdatospersona;

import java.util.Scanner;

public class ImprimirDatosPersona {

    public static void main(String[] args) {
        // Se genera la opción de leer los datos ingresados por el usuario 
        // En este caso el nombre, el sexo y peso
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su Nombre");
        String nombre = entrada.next();
        System.out.println("Ingrese su Genero");
        String genero = entrada.next();
        System.out.println("Ingrese su Peso");
        float peso = entrada.nextFloat();
        
        // Se imprimen los valores digitados por el usuario
        System.out.println("Su nombre es " + nombre);
        System.out.println("Su sexo ingresado es " + genero);
        System.out.println("El peso que usted tiene es " + peso + " Kilos");
    }
}
