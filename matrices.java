import java.util.*;
public class matrices{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     System.out.print("Ingrese el número de filas: ");
        int m = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int n = sc.nextInt();
        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        int[][] suma = new int[m][n];
        int[][] resta = new int[m][n];
        int[][] multiplicacion = new int[m][n];
        System.out.println("\nIngrese los elementos de la matriz A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        } System.out.println("\nIngrese los elementos de la matriz B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                suma[i][j] = A[i][j] + B[i][j];
                resta[i][j] = A[i][j] - B[i][j];
                multiplicacion[i][j] = A[i][j] * B[i][j];
            }
        } System.out.println("\nMatriz Suma:");
        mostrarMatriz(suma);
        System.out.println("\nMatriz Resta:");
        mostrarMatriz(resta);
        System.out.println("\nMatriz Multiplicación punto a punto:");
        mostrarMatriz(multiplicacion);
    }
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elem : fila) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }   
    }
}
