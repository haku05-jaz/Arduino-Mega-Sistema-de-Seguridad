
public class Alumno_clase{
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
