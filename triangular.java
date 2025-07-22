import java.util.*;
public class triangular{
    public static void main(String[] args) {
      System.out.println("MATRIZ TRIANGULAR SUPERIOR/INFERIOR");
      Scanner sc=new Scanner(System.in);
      System.out.print("Ingrese el tamaño de la matriz (n x n): ");
      int n=sc.nextInt();
      int [ ] [ ] matriz= new int[n][n];
      System.out.println("\nIngrese los elementos de la matriz:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Ingrese el número ("+(i+1)+","+(j+1)+"):");
                matriz[i][j]=sc.nextInt();
            }
        } 
        System.out.println("¿Es una matriz triangular superior?: "+triSuperior(matriz));
        System.out.println("¿Es una matriz triangular inferior?: "+triInferior(matriz));
        
    }public static boolean triSuperior(int[][]matriz){
        for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz.length;j++){
                    if(i<j){
                       if(matriz[i][j]!=0){
                          return false;
                      }
                    }   
                } 
        }return true; 
    }public static boolean triInferior(int[][]matriz){
        for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz.length;j++){
                    if(i>j){
                       if(matriz[i][j]!=0){
                          return false;
                      }
                    }   
                } 
        }return true; 

    }
}
