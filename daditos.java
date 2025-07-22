import java.util.*;
public class daditos{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("¿Cuantos lanzamientos desea?: ");
        int n=sc.nextInt();
        int frec[]=new int[13];  
        for(int i=0;i<n;i++){
           int dado1=(int)(Math.random()*6+1); 
           int dado2=(int)(Math.random()*6+1);
           int sum=dado1+dado2;
           frec[sum]++;
        }System.out.println("\nSuma\tFrecuencia");
        int masFrecuen=0;
        int sumaFrecuen=0;
        for(int i=2;i<13;i++){
            System.out.println(i+"\t"+frec[i]);
            if(frec[i]>masFrecuen){
                masFrecuen=frec[i];
                sumaFrecuen=i;
            }
        }
        if(sumaFrecuen==7){
            System.out.println("7 es la suma mas frecuente");
        }else{
            System.out.println("7 no es la suma mas frecuente");
            System.out.println("La suma más frecuente es:"+sumaFrecuen);
        }
    }
}

