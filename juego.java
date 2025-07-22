import javax.swing.*;

public class juego {
    static int jugadorGana = 0;
    static int computadoraGana = 0;
    public static void main(String[] args) {
        reglas();
        int jugar = jugarYes_No();
        while (jugar == JOptionPane.YES_OPTION) {
            int x = num_Ale();
            boolean gana = jugar(x);

            if (gana) {
                jugadorGana++;
            } else {
                computadoraGana++;
                JOptionPane.showMessageDialog(null, "¡La computadora gana!\nEl número era: " + x);
            }
            jugar = jugarYes_No();
        }
        mostrarResultados();
    } public static void reglas() {
        JOptionPane.showMessageDialog(null,
                "Juego MAYOR-MENOR\n-Se genera un número aleatorio entre 0 y 99\n-El jugador tiene 6 oportunidades para adivinarlo");
    }public static int jugarYes_No() {
        return JOptionPane.showConfirmDialog(null, "¿Desea jugar?");
    }public static int num_Ale() {
        return (int) (Math.random() * 100);
    }public static boolean jugar(int x) {
        int num;
        for (int i = 1; i <= 6; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Turno: " + i + "\nIngrese un número entre 0 y 99"));
            if (num < 0 || num > 99) {
                JOptionPane.showMessageDialog(null, "Número inválido. Intente de nuevo.");
                i--;
                continue;
            }
            if (num == x) {
                JOptionPane.showMessageDialog(null, "¡El jugador gana!\nTurnos usados: " + i);
                return true;
            } else if (num < x) {
                JOptionPane.showMessageDialog(null, "El número secreto es mayor.");
            } else {
                JOptionPane.showMessageDialog(null, "El número secreto es menor.");
            }
        }
        return false;
    }public static void mostrarResultados() {
        JOptionPane.showMessageDialog(null,
                "RESULTADOS FINALES\nJugador ganó: " + jugadorGana + " veces\nComputadora ganó: " + computadoraGana + " veces");
    }
}