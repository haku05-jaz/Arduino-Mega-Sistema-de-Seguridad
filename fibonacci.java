import java.util.*;
public class fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el número del termino de fibonacci: ");
        int n=sc.nextInt();
        fibonacci(n);
        System.out.print("FIbonacci de "+n+" es: "+fibonacci(n));
        
    }public static int fibonacci(int n){
        if (n == 0){
            return 0;
        }if (n == 1){  
            return 1;
        }
        int a=0;
        int b=1;
        int fibo=0;
        for (int i = 2; i <= n; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
        }return fibo;
    }
}
