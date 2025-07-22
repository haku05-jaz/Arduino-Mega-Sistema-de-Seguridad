import java.util.*;
public class dificul{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de turnos: ");
        int turn=sc.nextInt();
        System.out.print("Ingrese el nivel de dificultad: ");
        int difi=sc.nextInt();
        aleatorio(turn,difi);
    }public static void aleatorio(int turn, int difi){
        Scanner sc=new Scanner(System.in);
        int jugador=0;
        int compu=0;
        int i=0;
        while(true){
            int y=(int)(Math.random()*difi)+1;
            System.out.println("\n¿Qué número cree que se generó entre el 1 y "+difi+"?:");
            int z=sc.nextInt(); 
            if(z==y){
                System.out.println("¡Adivinó correctamente!");
                jugador++;
            }else{
                System.out.println("¡No logró adivinar, el número correcto era: "+y+ "\nLa computadora gana!");
                compu++; 
            }
            i++;
            if(i==turn){
                System.out.println("\nScore final");
                System.out.println("Jugador: "+jugador);
                System.out.println("Computadora: "+compu);
                if(jugador>compu){
                    System.out.println("\nEL jugador gana");
                }else{
                     System.out.println("\nLa computadora gana");
                }
                break;
            }
            System.out.println("\nJugador: "+jugador);
            System.out.println("Computadora: "+compu);             
        }
    }
}
