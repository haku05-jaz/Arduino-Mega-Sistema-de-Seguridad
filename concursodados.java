import java.util.*;
public class concursodados{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de concursantes: ");
        int m = sc.nextInt();
        System.out.print("Ingrese la cantidad de dados por concursante: ");
        int n = sc.nextInt();
        int[] puntajes = new int[m];
        int[] frecuencias = new int[7];
        for (int i = 0; i < m; i++) {
            int suma = 0;
            System.out.print("Concursante " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                int dado = (int)(Math.random() * 6) + 1;
                System.out.print(dado + " ");
                suma += dado;
                frecuencias[dado]++;
            }
            puntajes[i] = suma;
            System.out.println("Suma de puntajes: " + suma);
        }int maxPuntaje = puntajes[0];
        int ganador = 0;
        for (int i = 1; i < m; i++) {
            if (puntajes[i] > maxPuntaje) {
                maxPuntaje = puntajes[i];
                ganador = i;
            }
        }int valorFrecuente = 1;
        int maxFrecuencia = frecuencias[1];
        for (int i = 2; i <= 6; i++) {
            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
                valorFrecuente = i;
            }
        }System.out.println("\nEl ganador es el jugador n°" + (ganador + 1) + " con " + maxPuntaje + " puntos.");
        System.out.println(" El valor de dado con mayor frecuencia fue: " + valorFrecuente + " y apareció " + maxFrecuencia + " veces)");
    }
}
