import java.util.*;

public class areacir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo:");
        double radio = sc.nextDouble();
        areaCirculo(radio);
        System.out.println("El área del circulo es: " + areaCirculo(radio));
    }

    public static double areaCirculo(double radio) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo:");
        radio = sc.nextDouble();
        double area=Math.PI * (Math.pow(radio, 2));
        return area;
    }
}
