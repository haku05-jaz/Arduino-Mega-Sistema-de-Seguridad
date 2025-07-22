import java.util.*;
public class principal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Alumno_clase alumno= new Alumno_clase();
        System.out.println("Ingrese el nombre del estudiante:");
        alumno.setNombre(sc.next());
        System.out.println("Ingrese el apellido del estudiante:");
        alumno.setApellido(sc.next());
        System.out.println("Ingrese el promedio del estudiante:");
        alumno.setPromedio(sc.nextDouble());

        System.out.println("\n"+alumno);
    }
} 
class Alumno_clase{
    private String nombre;
    private String apellido;
    private double promedio;
    public void setNombre(String name){
        nombre=name;
    }
    public void setApellido(String lastname){
        apellido=lastname;
    }
    public void setPromedio(double prom){
       promedio=prom;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public double getPromedio(){
        return promedio;
    }
    public String toString(){
        return apellido + ", "+nombre+" = "+promedio;
    }
}
