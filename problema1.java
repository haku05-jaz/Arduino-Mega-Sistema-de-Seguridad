public class problema1{
    public static void main(String[]args){
        int[] a={1,2,3,4,5};
        sum(a);

    }public static void sum(int[] a){
        int sum=0;
        for(int i=0; i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("La suma del arreglo de enteros es: "+sum);
    }
}
