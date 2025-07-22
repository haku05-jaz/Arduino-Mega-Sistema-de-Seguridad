import java.util.*;
public class copaAmerica{
    public static void main(String[] args) {
       ArrayList<Jugador> equipo = new ArrayList<>();
        equipo.add(new Jugador("Gallese", 1, "Portero"));
        equipo.add(new Jugador("Ramírez", 2, "Defensa"));
        equipo.add(new Jugador("Fernández", 3, "Defensa"));
        equipo.add(new Jugador("Pérez", 4, "Defensa"));
        equipo.add(new Jugador("Gómez", 5, "Defensa"));
        equipo.add(new Jugador("López", 6, "Mediocampista"));
        equipo.add(new Jugador("Martínez", 7, "Mediocampista"));
        equipo.add(new Jugador("Díaz", 8, "Mediocampista"));
        equipo.add(new Jugador("Sánchez", 9, "Delantero"));
        equipo.add(new Jugador("García", 10, "Delantero"));
        equipo.add(new Jugador("Rodríguez", 11, "Delantero"));

        System.out.println("Alineación del equipo:");
        for (Jugador i : equipo) {
            System.out.println(i);
        }
    }    
}
class Jugador{
    private String nombre;
    private int numeroCamiseta;
    private String posicion;
    public Jugador(String nom, int num, String pos){
        nombre=nom;
        numeroCamiseta = num;
        posicion = pos;
    }
    public void setNombre(String nom){
        nombre =nom;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNumeroCamiseta(int num){
        numeroCamiseta=num;
    }
    public int getNumeroCamiseta(){
        return numeroCamiseta;
    }
    public void setPosicion(String pos){
        posicion=pos;
    }
    public String getPosicion(){
        return posicion;
    }
    public String toString(){
        return nombre+ ", "+numeroCamiseta+", "+posicion;
    }
}
class Estadio{
    private String nombreEstadio;
    private String ciudad;
    public Estadio(){
        nombreEstadio="sin nombre";
        ciudad="desconocido";
    }
    public Estadio(String nombre, String lugar){
        nombreEstadio=nombre;
        ciudad=lugar;
    }
    public void setNombre(String nombre){
        nombreEstadio=nombre;
    }
    public String getNombre(){
        return nombreEstadio;
    }
    public void setCiudad(String lugar){
        ciudad=lugar;
    }
    public String getCiudad(){
        return ciudad;
    }
}
