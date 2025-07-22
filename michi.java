import java.util.*;
public class michi{
    public static void mostrarTablero(String[] elTablero) {
        System.out.println(elTablero[7]+ "\t| " + elTablero[8]+ "\t|"+ elTablero[9]);
        System.out.println("__________________________");
        System.out.println(elTablero[4]+ "\t| " + elTablero[5]+ "\t|"+ elTablero[6]);
        System.out.println("__________________________");
        System.out.println(elTablero[1]+ "\t| " + elTablero[2]+ "\t|"+ elTablero[3]);
    }
    public static String ingreseLetra() {
        Scanner sc = new Scanner(System.in);
        String miLetra;
        System.out.println("Ingrese su letra X o O");
        miLetra = sc.next().toUpperCase();
        while (!(miLetra.equals("X") || miLetra.equals("O"))) {
            System.out.println("Letra no válida. Ingrese X o O:");
            miLetra = sc.next().toUpperCase();
        }
        return miLetra;
    }
    public static boolean esJugadaGanadora(String[] elTablero, String letra) {
        return (elTablero[1].equals(letra) && elTablero[2].equals(letra) && elTablero[3].equals(letra)) ||
               (elTablero[4].equals(letra) && elTablero[5].equals(letra) && elTablero[6].equals(letra)) ||
               (elTablero[7].equals(letra) && elTablero[8].equals(letra) && elTablero[9].equals(letra)) ||
               (elTablero[1].equals(letra) && elTablero[4].equals(letra) && elTablero[7].equals(letra)) ||
               (elTablero[2].equals(letra) && elTablero[5].equals(letra) && elTablero[8].equals(letra)) ||
               (elTablero[3].equals(letra) && elTablero[6].equals(letra) && elTablero[9].equals(letra)) ||
               (elTablero[1].equals(letra) && elTablero[5].equals(letra) && elTablero[9].equals(letra)) ||
               (elTablero[3].equals(letra) && elTablero[5].equals(letra) && elTablero[7].equals(letra));
    }
    public static boolean esEspacioLibre(String[] tablero, int pos) {
        return tablero[pos].equals("");
    }
    public static int ingreseJugada(String[] tablero) {
        Scanner sc = new Scanner(System.in);
        int jugada;
        System.out.println("Ingrese la posición de la jugada (1 de 9):");
        jugada = sc.nextInt();
        while (jugada < 1 || jugada > 9 || !esEspacioLibre(tablero, jugada)) {
            System.out.println("Posición inválida o ocupada. Intente otra (1-9):");
            jugada = sc.nextInt();
        }
        return jugada;
    }
    public static int obtenerMejorMovimiento(String[] tablero, String compLetra, String jugadorLetra) {
        for (int i = 1; i <= 9; i++) {
            if (esEspacioLibre(tablero, i)) {
                tablero[i] = compLetra;
                if (esJugadaGanadora(tablero, compLetra)) {
                    tablero[i] = "";
                    return i;
                }
                tablero[i] = "";
            }
        }
        for (int i = 1; i <= 9; i++) {
            if (esEspacioLibre(tablero, i)) {
                tablero[i] = jugadorLetra;
                if (esJugadaGanadora(tablero, jugadorLetra)) {
                    tablero[i] = "";
                    return i;
                }
                tablero[i] = "";
            }
        }
        if (esEspacioLibre(tablero, 5)) return 5;
        int[] esquinas = {1, 3, 7, 9};
        for (int pos : esquinas) {
            if (esEspacioLibre(tablero, pos)) return pos;
        }
        int[] lados = {2, 4, 6, 8};
        for (int pos : lados) {
            if (esEspacioLibre(tablero, pos)) return pos;
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] tablero = {"", "", "", "", "", "", "", "", "", ""};
        String jugadorLetra = ingreseLetra();
        String compLetra = jugadorLetra.equals("X") ? "O" : "X";
        boolean turnoJugador = jugadorLetra.equals("X");
        int contador = 1;
        mostrarTablero(tablero);
        while (contador <= 9) {
            int jugada;
            if (turnoJugador) {
                jugada = ingreseJugada(tablero);
                tablero[jugada] = jugadorLetra;
                System.out.println("Jugador juega:");
            } else {
                jugada = obtenerMejorMovimiento(tablero, compLetra, jugadorLetra);
                tablero[jugada] = compLetra;
                System.out.println("Computadora juega en posición: " + jugada);
            }
            mostrarTablero(tablero);
            if (esJugadaGanadora(tablero, turnoJugador ? jugadorLetra : compLetra)) {
                System.out.println(turnoJugador ? "¡Ganaste!" : "La computadora gana.");
                return;
            }
            turnoJugador = !turnoJugador;
            contador++;
        }
        System.out.println("¡Empate!");
    }
}
