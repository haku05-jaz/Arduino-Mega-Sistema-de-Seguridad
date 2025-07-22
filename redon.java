import java.util.*;
public class redon{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) { 
            System.out.print("Ingrese un número real:");
            double x=sc.nextDouble();
            if(x==0){
                System.out.println("Fin del programa");
                break;
            }else{
                masCercano(x);
            }
        }
    }public static void masCercano(double x){
        long y= Math.round(x);
        System.out.println("El entero mas cercano es: "+ y);      
    }
}
