import java.util.*;
public class promedio_array{
    public static void main(String[] args) {
        System.out.println("LISTA DE NÚMEROS ALEATORIOS");
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos que desea: ");
        int n=sc.nextInt();
        lista(n);
        ArrayList<Integer>lista=lista(n);
        promedio(lista);
        mayor_menor(lista);
        pares(lista);

    }public static ArrayList<Integer> lista(int n){
        ArrayList<Integer>lista=new ArrayList<Integer>();
        Random aleatorio = new Random();
        for(int i=0;i<n;i++){
            int num=aleatorio.nextInt();
            lista.add(num);
        }return lista;
    }
    public static void promedio(ArrayList<Integer>lista){
        int sum=0;
        for(int n:lista ){
            sum+=n;
        }int promed=(sum/(lista.size()));
        System.out.println("El promedio es: "+promed);     
    }
    public static void mayor_menor(ArrayList<Integer>lista){
        int mayor=lista.get(0);
        for(int i=1;i<lista.size();i++){
            if(lista.get(i)>mayor){
                mayor=lista.get(i);
            }
        }System.out.println("El mayor número es: "+mayor);
         
        int menor=lista.get(0);
        for(int i=1;i<lista.size();i++){
            if(lista.get(i)<menor){
                menor=lista.get(i);
            }
        }System.out.println("El menor número es: "+menor);       
    }
    public static void pares(ArrayList<Integer>lista){
        System.out.println("\nLos números pares de la lista son:");
        for(int i=0;i<lista.size();i++){
            if(lista.get(i)%2==0){
                System.out.println(lista.get(i));
            }
        }
    }
}
