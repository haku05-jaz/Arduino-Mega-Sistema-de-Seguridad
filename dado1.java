import java.util.*;
public class dado1{
    public static void main(String[] args) {
        jugar();
    }
    public static int dado(){
        return(int)(Math.random() * 6) + 1;
    }
    public static void mostrar(int intentos,int dado1,int dado2){
        System.out.println("Lanzamiento "+intentos+": "+dado1+ "-"+dado2);

    }
    public static void jugar(){
        int dado1,dado2;
        int intent=0;
        do{
            dado1=dado();
            dado2=dado();
            if(dado1==6&&dado2==6){
                mostrar(intent,dado1,dado2);
                System.out.println("¡Doble seis conseguido en "+intent+" intento(s)!");
                break;
            }intent++;
            mostrar(intent,dado1,dado2);
        }while(true);
    }
}
