import java.util.*;
public class num_ale{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el rango [m,n]");
        System.out.print("m:");
        int m=sc.nextInt();
        System.out.print("n:");
        int n=sc.nextInt();
        num_ale(m,n);
        System.out.println("El numero generado es: "+num_ale(m,n));
    }public static int num_ale(int m, int n){
        if(m>n){
            int z=(int)(Math.random()*(m-n))+n;
            return z;
        }else{
            int z=(int)(Math.random()*(n-m))+m;
        return z;
        }
    }
}
