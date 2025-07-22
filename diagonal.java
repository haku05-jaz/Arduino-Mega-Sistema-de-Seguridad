import java.util.*;
public class diagonal {
    public static void main(String[] args) {
        System.out.println("DIAGONAL DE UNA MATRIZ::");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese el número de filas: ");
        int n = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int m = sc.nextInt();
        int[][] matriz = new int[n][m];
        int[]diagonal =diagonal(matriz);
        System.out.println("\nLa diagonal principal es: " );
        System.out.print("[");
        for (int i= 0; i < n; i++) {
            System.out.print(diagonal[i]);
            if (i<(n-1)) {
                System.out.print(", ");                
            }    
        } System.out.print("]");

    }
    public static int[] diagonal(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        int n = matriz.length;
        int[] diagonal = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el elemento (" + (i + 1) + "," + (j + 1) + "):");
                matriz[i][j] = sc.nextInt();
            }
        }for (int i = 0; i < n; i++) {
            diagonal[i] = matriz[i][i];
            }
        return diagonal;
    }
}
