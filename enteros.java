import java.util.*;
public class enteros{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]califi=new int[10];
        int[] frecuencia = new int[6];  
        System.out.println("Ingrese 10 calificaciones entre 1 y 5:");
        for (int i = 0; i < 10; i++) {
            int nota;
            do {
                System.out.print("Calificación " + (i + 1) + ": ");
                nota = sc.nextInt();
                if (nota < 1 || nota > 5) {
                    System.out.println("Valor inválido. Ingrese un número entre 1 y 5: ");
                }
            } while (nota < 1 || nota > 5);
            califi[i] = nota;
            frecuencia[nota]++;
        }
        System.out.println("\nTabla de calificaciones (5x2):");
        for (int i = 0; i < 5; i++) {
            System.out.println(califi[i] + "\t" + califi[i + 5]);
        }
        System.out.println("\nHistograma de frecuencias:");
        System.out.println("Calificación\tfrecuencias:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("\t"+i + "\t");
            for (int j = 0; j < frecuencia[i]; j++) {
                System.out.print("*");
            }System.out.print("\n");
        }
    }
}
