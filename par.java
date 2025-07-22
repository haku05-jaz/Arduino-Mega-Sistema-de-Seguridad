import java.util.*;
public class par{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese 1 número entero: ");
        int num1 = sc.nextInt();
        esPar(num1);
        System.out.println("¿El número es par?\n"+esPar(num1));
    }public static String esPar(int n) {
        if (n % 2 == 0) {
            return "true";
        } else {
            return "false";
        }
    }
}
    

