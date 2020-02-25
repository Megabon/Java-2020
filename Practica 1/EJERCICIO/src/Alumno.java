
public class Alumno {
 private    String nombre;
 private    String matricula;
 private    String asignaturas[];
 private    double calificacion;
 private    int numAsig;

 public Alumno(){
     nombre = " ";
     matricula = " ";
     calificacion = 0.0;
     numAsig = 0;
    asignaturas = new String[5];
 }
 public Alumno(String nombre, String matricula, double calificacion){
     this.nombre = nombre;
     this.matricula = matricula;
     this.calificacion = calificacion;
     numAsig = 0;
     asignaturas = new String[5];
 }
 public String getNombre(){
     return nombre;
 }
 public  void setNombre(String nom) {
     nombre = nom;
 }

public Double getCalificacion(){
     return calificacion;
}
public void setCalificacion(Double cal){
    calificacion = cal;
}
public void matriculaAsignatura(String asig) {
    if (numAsig < 5) {
        asignaturas[numAsig] = asig;
        numAsig++;
    }
}
public int getNumAsignaturas(){
        return numAsig;
    }
    void mostrarAsignaturas(){
     for (int i=0; i<numAsig; i++){
         System.out.println("- "+ asignaturas[i]);
     }
}
public void mostrarAlumno(){
    System.out.println (nombre+" (" + calificacion + ")");
     mostrarAsignaturas();
}

}
