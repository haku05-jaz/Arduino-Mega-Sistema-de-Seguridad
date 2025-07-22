import java.util.*;
public class ejercicio{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingresar cantidad de estudiantes:");
        int n=sc.nextInt(); 
        notas(n);     
    }public static void notas(int n){
        Scanner sc=new Scanner(System.in);
        int i=1;
        int sum=0;
        while(i<=n){
            System.out.println("Ingrese la nota "+ (i));
            int x=sc.nextInt();
            while(x<0||x>20){
                System.out.print("Nota invalida.Ingrese una nota entre 0 a 20:");
                x=sc.nextInt();
            }
            sum+=x;
            i++;
        }
        double promed=(double)sum/n;
        System.out.println("El promedio es:"+promed);
        System.out.println("Desempeño:"+  promedio(promed));
    }public static String promedio(double promed1){
        if(promed1>=18)
            return"Excelente";
        else if(promed1>=14)
           return"Bueno";
        else if(promed1>=10)
            return"Regular";
        else if(promed1<10)
            return"Deficiente";
        return "Error";
    }
}



