import java.util.*;
public class simulación{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.print("¿Cuantos lanzamientos desea?: ");
        int n=sc.nextInt();
             int[][] dado = new int[6][2];
        for (int i = 0; i < 6; i++) {
            dado[i][0] = i + 1;
            dado[i][1] = 0;
        }for (int i = 0; i < n; i++) {
            int result= (int)(Math.random() * 6) + 1;
            dado[result-1][1]++;
        }System.out.println("\nFrecuencias de lanzamiento:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Número "+dado[i][0] +": "+ dado[i][1] +" veces");
        }
        int frecuencia = dado[0][1];
        int masFrecuen = dado[0][0];
        for (int i = 1; i < 6; i++) {
            if (dado[i][1] > frecuencia) {
                frecuencia = dado[i][1];
                masFrecuen = dado[i][0];
            }
        }
        System.out.println("\nEl número con más frecuencia fue: "+masFrecuen+" y salió "+frecuencia+" veces");
    }
}

