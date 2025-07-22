import java.util.*;
public class nombre{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo:");
        String nombre = sc.nextLine();
        mostrarNombre(nombre);
    }
    public static void mostrarNombre(String nombre) {
        System.out.println("El nombre ingresado es: " + nombre);
    }
}