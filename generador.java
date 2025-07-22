import java.util.*;
public class generador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz identidad (n x n): ");
        int n = sc.nextInt();
        int[][] identidad = new int[n][n];
        for (int i = 0; i < n; i++) {
            identidad[i][i] = 1;
        }System.out.println("\nMatriz Identidad de " + n + " x " + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(identidad[i][j] + " ");
            }
            System.out.println();
        }
    }
}
