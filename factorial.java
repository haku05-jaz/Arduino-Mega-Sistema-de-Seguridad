import java.util.*;
public class factorial{
    public static void main(String[]args){
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros");
        System.out.print("Ingrese el primer numero:");
        num1=sc.nextInt();
        System.out.print("Ingrese el segundo numero:");
        num2=sc.nextInt();
        int fact=1; 
        int fact2=1;
        if (num1 < 0 || num2 < 0) {
            System.out.println("Error: ambos números deben ser no negativos.");
            return;
        }if (num1==0||num1==1){
              fact=1;
        }else{
            for(int i=2;i<=num1;i++){
               fact=fact*i;
            }
        }if (num2==0||num2==1){
              fact2=1;
        }else{
            for(int i=2;i<=num2;i++){
              fact2=fact2*i;
            }
        }
        System.out.println("EL producto de sus factoriales es:"+ fact*fact2);        
   }
}
