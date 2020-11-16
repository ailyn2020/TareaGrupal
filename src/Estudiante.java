public class Estudiante extends Persona{
private String dedicacion;
private String escuela;
private String nivel;

public Estudiante(String nombre,String apellido,int edad, String dedicacion,String escuela, String nivel)
{
    super(nombre, apellido , edad );
    this.dedicacion=dedicacion;
    this.escuela=escuela;
    this.nivel=nivel;
}

public String getDedicacion() {
return dedicacion;
}
public void setDedicacion(String dedicacion) {
this.dedicacion = dedicacion;
}
public String getEscuela() {
return escuela;
}
public void setEscuela(String escuela) {
this.escuela = escuela;
}
public String getNivel() {
return nivel;
}
public void setNivel(String nivel) {
this.nivel = nivel;
}

}