import java.util.*;
public class factorial2{
    public static void main(String[]args){
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros");
        System.out.print("Ingrese el primer numero:");
        num1=sc.nextInt();
        System.out.print("Ingrese el segundo numero:");
        num2=sc.nextInt();
        if (num1 < 0||num2<0) {
            System.out.println("Error, los numeros deben ser no negativos");
        }else{
        System.out.println("EL producto de sus factoriales es:"+factorial(num1)*factorial(num2));
        }
    }
    public static int factorial(int a){
        if (a==0||a==1){
        return 1;
        }else{
        int fact=1; 
        for(int i=2;i<=a;i++)
        fact=fact*i;
        return fact;
        }
    }    
}
