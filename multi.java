import java.util.*;
public class multi{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el 1er número entero: ");
        int num1=sc.nextInt();
        System.out.print("Ingrese el 2do número entero: ");
        int num2=sc.nextInt();
        multi_divi(num1,num2);
        if(num2%num1==0){
           System.out.println("El producto es: "+multi_divi( num1,  num2));
        }else{
            System.out.println("La division es: "+multi_divi( num1,  num2));
            
        }
    }public static int multi_divi(int num1, int num2){
        if(num2%num1==0){
            int multi=num1*num2;
            return multi;
        }else{
            int divi=num1/num2;
            return divi;
        }
    }
}
