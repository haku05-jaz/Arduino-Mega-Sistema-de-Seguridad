import java.util.*;
public class notas_array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nIngrese la cantidad de estudiantes: ");
        int n=sc.nextInt();
        ArrayList<Integer>notas=notasList(n); 
        menor(notas);
        descendientes(notas,n);
    }
    public static ArrayList<Integer> notasList(int n){
         ArrayList<Integer>notas= new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            notas.add(nota());
        }return notas;
    }
    public static int nota(){
        return (int)(Math.random()*21);
    }
    public static void descendientes(ArrayList<Integer>notas,int n){
        System.out.println("\nNOTAS ORDENADAS DE FORMA DESCENDENTE:");
       for (int i = 0; i < n; i++) {
        int menor1 = menor(notas);
        System.out.println(menor1);
        notas.remove((Object)menor1);
    }
    }public static int menor(ArrayList<Integer>notas){
        int menor=notas.get(0);
        for(int i=1;i<notas.size();i++){
            if(notas.get(i)<menor){
                menor=notas.get(i);
            }
        }return menor;
    }
}
