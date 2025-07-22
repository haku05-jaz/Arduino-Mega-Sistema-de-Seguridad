import java.util.*;
public class distancia1{
    public static void main(String[]args){
        double x1,y1,x2,y2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del turista:");
        System.out.print("X1:");
        x1=sc.nextDouble();
        System.out.print("Y1:");
        y1=sc.nextDouble();
        System.out.println("Ingrese las coordenadas del Starbucks:");
        System.out.print("X2:");
        x2=sc.nextDouble();
        System.out.print("Y2:");
        y2=sc.nextDouble();
        System.out.println("La distancia entre ellos es:"+distancia(x1,x2,y1,y2));
    }public static double distancia(double a,double b, double c,double d){
        return Math.sqrt(Math.pow((a-b),2)+Math.pow((c-d),2));

    }
}
