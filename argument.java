import java.util.*;
public class argument{
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Ingrese un numero real: ");
       double x=sc.nextDouble();
       System.out.print("Ingrese un numero entero: ");
       int n=sc.nextInt();
       elevar(x,n);
       System.out.print("\n"+x+" elevado a "+n+" es: "+elevar(x,n));

    }public static double elevar(double a, int b){
        int i=1;
        double pow=1;
        while(i<=b){
            pow*=a;
            i++; }   
        return pow;
    }
}
