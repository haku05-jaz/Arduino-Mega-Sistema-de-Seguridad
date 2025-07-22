import java.util.*;
public class problema3{
    public static void main(String[] args) {
        int []a=ingresar();
        int[]a2=modificar(a);
        imprimir(a2);
    }public static int [] ingresar(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el numero de enteros del arreglo: ");
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Ingrese el entero n°"+(i+1)+": ");
            a[i]=sc.nextInt();            
        }return a;
    } public static int[] modificar(int[]a){
        int[]a2=new int[a.length];
        for(int i=0;i<a.length;i++){
            a2[i]=2*a[i];  
        }return a2;
    }public static void imprimir(int[]b){
        System.out.println("\nEl array modificado por 2 es: ");
         System.out.println("b"+"["+b.length+"]: ");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
