package talleroperadores;

//Llamar librerias de java
import java.util.Scanner; //capturar datos por medio de la consola
public class TallerOperadores {
    
    public static void main(String[] args) {
        // Elabore una clase que permita leer el nombre, el sexo y 
        // el peso de una persona imprima los datos leídos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su Nombre");
        String nombre = entrada.next();
        System.out.println("Ingrese su Genero");
        String genero = entrada.next();
        System.out.println("Ingrese su Peso");
        float peso = entrada.nextFloat();
        
        System.out.println("El nombre ingresado es " + nombre);
        System.out.println("El genero ingresado es " + genero);
        System.out.println("El peso ingresado es " + peso + " Kilos");
    }
}
