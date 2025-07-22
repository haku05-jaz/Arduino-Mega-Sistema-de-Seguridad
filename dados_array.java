import java.util.*;
public class dados_array{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuantos lanzamientos desea realizar?: ");
        int n = sc.nextInt();

        ArrayList<Integer> frecuencia = lanzarDados(n);
        System.out.println("\nFrecuencia de las sumas:");
        for (int i = 2; i <= 12; i++) {
            System.out.println("Suma " + i + ": " + frecuencia.get(i));
        }
        int mayor = 2;
        int menor = 2;
        for (int i = 3; i <= 12; i++) {
            if (frecuencia.get(i) > frecuencia.get(mayor)) {
                mayor = i;
            }
            if (frecuencia.get(i) < frecuencia.get(menor)) {
                menor = i;
            }
        }
        System.out.println("\nLa suma más frecuente fue: " + mayor + " con " + frecuencia.get(mayor) + " veces.");
        System.out.println("La suma menos frecuente fue: " + menor + " con " + frecuencia.get(menor) + " veces.");
    }
    public static ArrayList<Integer> lanzarDados(int n) {
        ArrayList<Integer> frecuencia = new ArrayList<>();

        for (int i = 0; i <= 12; i++) {
            frecuencia.add(0);
        }
        for (int i = 0; i < n; i++) {
            int dado1 = dado();
            int dado2 = dado();
            int suma = dado1 + dado2;
            frecuencia.set(suma, frecuencia.get(suma) + 1);
        }
        return frecuencia;
    }
    public static int dado() {
        return (int)(Math.random() * 6) + 1;
    }
}

