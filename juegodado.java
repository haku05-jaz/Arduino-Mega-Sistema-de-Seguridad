import java.util.*;
public class juegodado{
    public static void main(String[]args){
        System.out.println("Juego de dados");
        jugar();

    }public static int dados(){
        return (int)(Math.random()*6)+1;
    }
    public static void jugar(){
        Scanner sc=new Scanner(System.in);
        int partidas=0;
        int jugador=0;
        int casa=0;
        while (true) { 
            int numGana=0;
            int dado1=dados();
            int dado2=dados();
            int sum=dado1+dado2;
           if(sum==2||sum==12||sum==numGana){
                System.out.println("\nSuma de dados: "+sum);
                System.out.println("¡EL jugador gana!");
                jugador++;            
            }else if(sum==7||sum==11){
                System.out.println("\nSuma de dados: "+sum);
                System.out.println("¡La casa gana!");
            casa++;
            }else{
                System.out.println("\nSuma de dados: "+sum);
                System.out.println("Ninguno gana, nuevo numero ganador: "+sum);
                numGana+=sum;
            }            
            partidas++;
            System.out.println("\n¿Quiere continuar?(si/no):");
            String rpta=sc.next();
            if(rpta.equals("no")){
               break;  
            }
        }
        System.out.println("\nFin del juego");
        System.out.println("Total de partidas: " + partidas);
        System.out.println("Puntaje final \n Jugador: " + jugador + "\n Casa: " + casa);
        if (jugador>casa) {
            System.out.println("¡El jugador gana el juego!");
        } else if (jugador<casa) {
            System.out.println("¡La casa gana el juego!");
        } else {
            System.out.println(" Empate.");
        }
    }
}
