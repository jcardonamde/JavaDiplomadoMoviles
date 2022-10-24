package programacionorientadaobjetos;

public class coche {
    private String color;
    private int velocidad;
    private float tamanio;
    
    //Constructor para inicialización y acceso de atributos
    public coche(String color, int velocidad, float tamanio) {
        this.color = color;
        this.velocidad = velocidad;
        this.tamanio = tamanio;
    }
    
    //Comportamientos
    public void avanzar() {}
    public void parar() {}
    public void girarIzquierda() {}
    public void girarDerecha() {}
    
    //Asignacion de propiedades a un objeto a partir de la clase
    public static void main(String[] args) {
        coche micoche = new coche("verde", 80, 3.2f);
        coche tucoche = new coche("rojo", 120, 4.1f);
        coche sucoche = new coche("amarillo", 100, 3.4f);
    }
}