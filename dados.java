import java.util.*;
public class dados{
    public static void main(String[] args) {
        System.out.println("Juego de dados");
         Scanner sc=new Scanner(System.in);
        while(true){
            int dado1=dados();
            int dado2=dados();
            int sum1=dado1+dado2;

            int dadoco1=dados();
            int dadoco2=dados();
            int sum2=dadoco1+dadoco2;

            System.out.println("Puntos del jugador: "+sum1);
            System.out.println("Puntos de la computadora: "+sum2);

            if (sum1 > sum2) {
            System.out.println("¡Ganaste el juego!");
            } else if (sum1 < sum2) {
            System.out.println("La computadora gana");
            } else {
            System.out.println("El juego terminó, es un empate");
            }

            System.out.print("¿Quiere seguir jugando?(si/no):");
            String rpta=sc.nextLine();

            if(rpta.equals("no"))
            break;  
        }       
    }public static int dados(){
         return(int)((Math.random()*6)+1);
    }   
}
