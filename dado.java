public class dado{
    public static int dado() {
        return(int)Math.random()*6+1;
    }
    public static void mostrar(int intentos,int dado1,int dado2){
        System.out.println("Lanzamiento "+intentos+": "+dado1+ "-"+dado2);

    }
    public static void jugar(){
        int dado1,dado2;
        dado1=dado();
        dado2=dado();
        int intent=0;
        while(true){
            dado1=dado();
            dado2=dado();
            
            intent++;
            if(dado1==6&&dado2==6){
                mostrar(intent,dado1,dado2);
                System.out.println("¡Doble seis conseguido en "+intent+" intento(s)!");
            }
            mostrar(intent,dado1,dado2);
        }
    }
}
