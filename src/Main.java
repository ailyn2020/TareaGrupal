 public class Main {
      
   public static void main (String [ ] Args) {

      Estudiante estudiante = new Estudiante("Yessenia","Martinez", 16, "Estudiante", "Ramon Molina", "noveno");
      Deportista deportista=new Deportista("Mario", "Salinas ", 30, "Deportista" , "River");
      
     
       System.out.println("Persona 1");
       System.out.println("Nombre :"+estudiante.getNombre()+"\n"+"Apellido :"+estudiante.getApellido()+"\n"+"Edad  :"+ 
               estudiante.getEdad()+"\n"+"Dedicacion :"+estudiante.getDedicacion()+"\n"+"Escuela:"+estudiante.getEscuela()+"\n"+"Nivel:"+estudiante.getNivel());
 
       System.out.println(" "); 
       System.out.println("Persona 2");
        
       System.out.println("Nombre :"+deportista.getNombre()+"\n"+"Apellido :"+deportista.getApellido()+"\n"+"Edad :"+
               deportista.getEdad()+"\n"+"Dedicacion :"+deportista.getDedicacion()+"\n"+"Equipo :"+deportista.getEquipo());
        
}
    
}
