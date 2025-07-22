import java.util.*;
public class sorte_array{
    public static void main(String[] args) {
        System.out.println("SORTEO DE ORDEN DE 1 AL 6");
        ArrayList<Integer>lista=sorteo();
        numAleatorio();
        mostrar(lista);
    }
    public static int numAleatorio(){
        int numAleatorio=(int)(Math.random()*6+1);
        return numAleatorio;
    }
    public static ArrayList<Integer> sorteo(){
        ArrayList<Integer>lista=new ArrayList<Integer>();
         while (lista.size() < 6) {
            int aleatorio = (int)(Math.random() * 6) + 1;

            if (!lista.contains(aleatorio)) {
                lista.add(aleatorio);            
           }
        }return lista;
    }public static void mostrar(ArrayList<Integer> lista){
        int puesto = 1;
        for (int numero : lista) {
            System.out.println("Puesto "+puesto+": "+numero);            
            puesto++;
        }
    }
}
