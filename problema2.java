public class problema2{
    public static void main(String[] args) {
        System.out.println("Suma de notas:");
        int[]a=generar();
        int[]b=generar();
        int[] sum=sumar(a, b);
        imprimir(sum,a,b); 
    }public static int[] generar(){
        int[]c = new int[10];
        for(int i=1;i<c.length;i++){
            c[i]=(int)(Math.random()*21);
        }
        return c;
    }public static int[] sumar(int[]a,int[]b){
        int[]sum=new int[10];
        for(int i=0;i<a.length;i++){
            sum[i]=a[i]+b[i];             
        }return sum;
    }public static void imprimir(int[]sum,int[]a,int[]b){
       for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " + " + b[i] + " = " + sum[i]);
        }
    }
}
