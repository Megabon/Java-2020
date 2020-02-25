

public class Main {

    public static void main(String[] args) {
	Alumno a1 = new Alumno("Felipe Arias Gonzalez", "aa1253", 3.50);
	Alumno a2 = new Alumno("Manuel García Sacedón", "ax0074", 8.35);
	Alumno a3 = new Alumno("Margarita López Medina", "mj7726", 7.70);
	Alumno a4 = new Alumno("Estela SánchezArellano", "bc2658", 6.75);

		a1.matriculaAsignatura("Estructura de Datos");
		a2.matriculaAsignatura("Estructura de Datos");
		a3.matriculaAsignatura("Estructura de Datos");
		a4.matriculaAsignatura("Estructura de Datos");
		a4.matriculaAsignatura("Algebra");
		a1.matriculaAsignatura("Fisica II");
		a4.mostrarAlumno();

	grupoAlumno grupo = new grupoAlumno(20, "GT11");
		grupo.insertarAlumno(a1);
		grupo.insertarAlumno(a2);
		grupo.insertarAlumno(a3);
		grupo.insertarAlumno(a4);
		grupo.mostrarGrupo();
		grupo.listaAlumno[1].mostrarAlumno();

	}
}
