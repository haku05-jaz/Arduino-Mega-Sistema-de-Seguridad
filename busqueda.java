import java.util.*;
public class busqueda{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de elementos del arreglo: ");
        int n = sc.nextInt();
        int[] arreglo = new int[n];
        System.out.println("Ingrese " + n + " números enteros:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento [" + i + "]: ");
            arreglo[i] = sc.nextInt();
        }
        System.out.print("Ingrese el número que desea buscar: ");
        int valorBuscado = sc.nextInt();
        int posicion = -1;
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (arreglo[i] == valorBuscado) {
                System.out.println("Encontrado en la posición: " + i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Elemento no encontrado (-1)");
        }
    }
}
