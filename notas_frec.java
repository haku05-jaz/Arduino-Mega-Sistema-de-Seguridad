import java.util.*;
public class notas_frec{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("NOTAS DE ESTUDIANTES");
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int n=sc.nextInt();
        int[]notas=ingresar(n);
        mayor_menor(notas);
        
    }public static int[] ingresar(int n){
        Scanner sc=new Scanner(System.in);
        int[]notas=new int[21];
        for(int i=0;i<n;i++){
            System.out.print("Ingrese la nota #"+(i+1)+" : ");
            int nota=sc.nextInt();
            notas[nota]++;
        }return notas;
    }public static void mayor_menor(int []notas){
        int maxFrecuen=0;
        int notaFrecuen=notas[0];
        for(int i=1;i<notas.length;i++){
            if(notas[i]>maxFrecuen){
                notaFrecuen=notas[i];
                maxFrecuen=i;
            }
        }System.out.println("La nota con mayor frecuencia es: "+maxFrecuen+" con "+notaFrecuen+" estudiantes.");
        int minFrecuen=0;
        int notMenosFrec=notas[0];
        System.out.println("Notas con menor frecuencia: ");
         for(int i=1;i<notas.length;i++){
            if(notas[i]>maxFrecuen){
                notMenosFrec=notas[i];
                minFrecuen=i;
            }
        }System.out.println(minFrecuen+" con "+notMenosFrec+" estudiantes");
    }
}
