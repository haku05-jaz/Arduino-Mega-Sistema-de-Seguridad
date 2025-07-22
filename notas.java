import java.util.*;
public class notas{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingresar número de alumnos: ");
        int n=sc.nextInt();
        int[][]notas=new int[21][2];
        for (int i=0;i<n;i++){
            int nota=(int)(Math.random()*21);
            notas[nota][1]++;
        }
        int frecuen=0;
        int notafrecuen=notas[0][1];
        int notaMenosfrecuen=notas[0][1];
        int frecuen1=0;
        for(int i=0;i<=20;i++){
            if(notas[i][1]>notafrecuen){
            frecuen=notas[i][1];
            notafrecuen=i;
           }
           if(notas[i][1]<notaMenosfrecuen){
            frecuen1=notas[i][1];
            notaMenosfrecuen=i;
           }
        }System.out.println("la nota con más frecuencia: "+notafrecuen);
        System.out.println("la nota con menos frecuencia: "+notaMenosfrecuen);
        System.out.println("\nNota\tFrecuencia");
        for (int i=0;i<=20;i++){
            System.out.print("\n"+i+"\t");
                for (int j = 0; j < notas[i][1]; j++) {
                System.out.print("*");
            }
        }
    }
}
