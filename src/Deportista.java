 public class Deportista extends Persona{
private String dedicacion;
private String equipo;

public Deportista(String nombre,String apellido,int edad, String dedicacion, String equipo)
{
    super(nombre, apellido , edad );
    this.dedicacion=dedicacion;
    this.equipo=equipo;

}

public String getDedicacion() {
return dedicacion;
}
public void setDedicacion(String dedicacion) {
this.dedicacion = dedicacion;
}
public String getEquipo() {
return equipo;
}
public void setEquipo(String equipo) {
this.equipo = equipo;
}


}