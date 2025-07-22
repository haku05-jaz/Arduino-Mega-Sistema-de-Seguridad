import java.util.*;
public class orde{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingresar un numero entero: ");
        int a=sc.nextInt();
        esPar(a);
    }public static void esPar(int a){
       System.out.print("El numero es: ");
       if(a%2==0){
       System.out.println(" Par");
       }else{
        System.out.println(" Impar");
       }
    }
}
