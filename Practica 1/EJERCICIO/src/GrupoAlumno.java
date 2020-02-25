public class GrupoAlumno {
    private String nombreGrupo;
    private String listaAlumnos[];
    private int numAlumnos;
    private int maxAlumnos;

    public grupoAlumno(){
        nombreGrupo = "Grupo desconocido";
        maxAlumnos = 10;
        numAlumnos = 0;
        listaAlumnos = new String[maxAlumnos];
    }
    public grupoAlumno(int max, String nombre){
        nombreGrupo = nombre;
        maxAlumnos = max;
        numAlumnos = 0;
        listaAlumnos = new String[maxAlumnos];
    }

    public String getNombre(){
        return nombreGrupo;
    }

    public void setNombre(String nom){
        nombreGrupo = nom;
    }
    public int getMaximo(){
        return maxAlumnnos;
    }
    public boolean insertarAlumno(Alumno alumno){
        if (numAlumnos< maxAlumnos){
            listaAlumnos[numAlumno] = alumno;
            return true;        }
        else(){
            System.out.println("Error al añadir Alumno al grupo");
            return false;
        }
    }
    public int getNumAlumnos(){
        return numAlumnos;
    }

    public Alumno getAlumno(int i){
        return listaAlumno[i];
    }

    public void mostrarGrupo(){
        System.out.println("GRUPO "+ nombreGrupo: numAlumnos + "alumnos");
        for(int i=0; i<=maxAlumnos; i++){
            mostrarAlumno[i];
        }
    }
}