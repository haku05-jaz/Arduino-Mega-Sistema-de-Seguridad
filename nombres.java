import java.util.*;
public class nombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de amigos:");
        int n = sc.nextInt();
        sc.nextLine();
        String[] nombres = ingresa(n);
        mostrar(nombres);
    }public static String[] ingresa(int n) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresar el nombre " + (i + 1) + ":");
            nombres[i] = sc.nextLine();
        }
        return nombres;
    }public static void mostrar(String[] nombres) {
        System.out.println("\nLos nombres de sus amigos son:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("nombre n°" + (i + 1) + " = " + nombres[i]);
        }
    }
}
