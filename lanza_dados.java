import java.util.*;
public class lanza_dados{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("¿Cuántos lanzamientos desea?:");
     int n=sc.nextInt();
     int []frecuencia=dados(n);
     System.out.println("\nFrecuencia de cadad posiblidad de lanzamiento:");
     mostrar(frecuencia);
     maxFrecuencia(frecuencia);
    }public static int[] dados(int n){
        int[]frecuencia=new int[7];
        for(int i=0;i<n;i++){
           int dado=(int)(Math.random()*6)+1;
            frecuencia[dado]++;
        }return frecuencia;
    }public static void maxFrecuencia(int[]frecuencia){
        int maxFrec=frecuencia[1];
        int num_Frecuen=0;
        for (int i=2;i<frecuencia.length;i++){
            if(frecuencia[i]>maxFrec){
                maxFrec=frecuencia[i];
                num_Frecuen=i;
            }
        }System.out.println("El valor con maxima frecuencia es: "+num_Frecuen+" y salió " + maxFrec+" veces.");
    }public static void mostrar(int[]frecuencia){
        for(int i=1;i<frecuencia.length;i++){
            System.out.println("#"+i+" = "+frecuencia[i]);
        }
    }
}
