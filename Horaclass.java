public class Horaclass{
    public static void main(String[]args){
         hora Hora = new hora(23, 59, 58);
        Hora.mostrarHora();
        Hora.aumentarSegundo();
        Hora.mostrarHora();
        Hora.aumentarSegundo();
        Hora.mostrarHora(); 
        Hora.setUnaHora(5, 3, 1);
        Hora.mostrarHora(); 
    }
}
class hora{
     private int hora;
    private int minuto;
    private int segundo;
    public hora(int h, int m, int s) {
        setUnaHora(h, m, s);
    }
    public void setUnaHora(int h, int m, int s) {
        setHora(h);
        setMinuto(m);
        setSegundo(s);
    }
    public void setHora(int h) {
        if (h >= 0 && h <= 23) {
            hora = h;
        } else {
            hora = 0;
        }
    }
    public void setMinuto(int m) {
        if (m >= 0 && m <= 59) {
            minuto = m;
        } else {
            minuto = 0;
        }
    }
    public void setSegundo(int s) {
        if (s >= 0 && s <= 59) {
            segundo = s;
        } else {
            segundo = 0;
        }
    }
    public void aumentarSegundo() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            aumentarMinuto();
        }
    }
    public void aumentarMinuto() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            aumentarHora();
        }
    }
    public void aumentarHora() {
        hora++;
        if (hora == 24) {
            hora = 0;
        }
    }
    public int getHora() {
        return hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public int getSegundo() {
        return segundo;
    }
    public void mostrarHora() {
        String hh = "";
        String mm = "";
        String ss = "";
        if (hora < 10) {
            hh = "0" + hora;
        } else {
            hh = "" + hora;
        }
        if (minuto < 10) {
            mm = "0" + minuto;
        } else {
            mm = "" + minuto;
        }
        if (segundo < 10) {
            ss = "0" + segundo;
        } else {
            ss = "" + segundo;
        }
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}