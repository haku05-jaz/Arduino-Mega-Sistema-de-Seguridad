import java.util.*;
public class menor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el 1er número entero:");
        int num1=sc.nextInt();
        System.out.println("Ingrese el 2do número entero:");
        int num2=sc.nextInt();
        System.out.println("Ingrese el 3er número entero:");
        int num3=sc.nextInt();
        System.out.println("Ingrese el 4to número entero:");
        int num4=sc.nextInt();
        System.out.println("Ingrese el 5to número entero:");
        int num5=sc.nextInt();
        menor3(num1, num2, num3);
        System.out.println("El menor número es:"+menor3(num1,num2,menor3(num3,num4,num5)));
        
    } public static int menor3(int a, int b, int c) {
        if(a<b && a<c){
           return a;     
        }else if(b<c && b<a){
            return b;
        }else{
            return c;
        }
    }
}
