//Asociamos la clase con el paquete

package datos;

//Declaramos la clase publica

/**
 * Esta clase será nuestra plantilla para crear ficheros
 * 
 * @author Leonardo Machado Guazzelli
 * @version 1.0
 * 
 */

public class Ficheros {

	// Atributos de la clase

	private String dniAlumno;
	private String nombreAlumno;
	private String apellidosAlumno;
	private String direccionAlumno;
	private int telefonoAlumno;
	private String emailAlumno;

	private int idCurso;
	private String nombreCurso;
	private String fechaInicioCurso;
	private String fechaFinCurso;
	private int nParticipantesTotalCurso;
	private int nParticipantesInscritosCurso;

	// Constructor de la clase

	/**
	 * Este es el constructor de la clase ficheros
	 * @param dniAlumno sera el dni del alumno
	 * @param nombreAlumno sera el nombre del alumno
	 * @param apellidosAlumno seran los apellidos del alumno
	 * @param direccionAlumno sera la direccion del alumno
	 * @param telefonoAlumno sera el telefono del alumno
	 * @param emailAlumno sera el email del alumno
	 * @param idCurso sera la id del curso
	 * @param nombreCurso sera el nombre del curso
	 * @param fechaInicioCurso sera la fecha de inicio del curso
	 * @param fechaFinCurso sera la fecha fin del curso
	 * @param nParticipantesTotalCurso sera el numero participantes total del curso
	 * @param nParticipantesInscritosCurso sera el numero de participantes inscritos del curso
	 */

	public Ficheros(String dniAlumno, String nombreAlumno, String apellidosAlumno, String direccionAlumno,
			int telefonoAlumno, String emailAlumno, int idCurso, String nombreCurso, String fechaInicioCurso,
			String fechaFinCurso, int nParticipantesTotalCurso, int nParticipantesInscritosCurso) {

		this.dniAlumno = dniAlumno;
		this.nombreAlumno = nombreAlumno;
		this.apellidosAlumno = apellidosAlumno;
		this.direccionAlumno = direccionAlumno;
		this.telefonoAlumno = telefonoAlumno;
		this.emailAlumno = emailAlumno;

		this.idCurso = idCurso;
		this.nombreCurso = nombreCurso;
		this.fechaInicioCurso = fechaInicioCurso;
		this.fechaFinCurso = fechaFinCurso;
		this.nParticipantesTotalCurso = nParticipantesTotalCurso;
		this.nParticipantesInscritosCurso = nParticipantesInscritosCurso;

	}

	// Mostramos el fichero generado previamente

	/**
	 * Este metodo sirve para visualizar el fichero que hemos generado
	 */

	public void mostrarFichero() {

		System.out.println("\nDNI alumno: " + getDniAlumno() + "\nNombre alumno: " + getNombreAlumno()
				+ "\nApellidos alumno: " + getApellidosAlumno() + "\nDirección alumno: " + getDireccionAlumno()
				+ "\nTeléfono alumno: " + getTelefonoAlumno() + "\nEmail alumno: " + getEmailAlumno() + "\nID curso: "
				+ getIdCurso() + "\nNombre curso: " + getNombreCurso() + "\nFecha inicio del curso: "
				+ getFechaInicioCurso() + "\nFecha final del curso " + getFechaFinCurso()
				+ "\nNúmero de participantes total del curso " + getnParticipantesTotalCurso()
				+ "\nNúmero de participantes inscritos del curso " + getnParticipantesInscritosCurso());

	}

	// Gets de la clase privados

	/**
	 * @return Este metodo devuelve el atributo dni de alumnos
	 */

	public String getDniAlumno() {
		return dniAlumno;
	}

	/**
	 * @return Este metodo devuelve el atributo nombre de alumnos
	 */

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	/**
	 * @return Este metodo devuelve el atributo apellidos de alumnos 
	 */

	public String getApellidosAlumno() {
		return apellidosAlumno;
	}

	/**
	 * @return Este metodo devuelve el atributo direccion de alumnos
	 */

	public String getDireccionAlumno() {
		return direccionAlumno;
	}

	/**
	 * @return Este metodo devuelve el atributo telefono de alumnos
	 */

	public int getTelefonoAlumno() {
		return telefonoAlumno;
	}

	/**
	 * @return Este metodo devuelve el atributo email de alumnos
	 */

	public String getEmailAlumno() {
		return emailAlumno;
	}

	/**
	 * @return Este metodo devuelve el atributo ID de alumnos
	 */

	public int getIdCurso() {
		return idCurso;
	}

	/**
	 * @return Este metodo devuelve el atributo nombre del curso
	 */

	public String getNombreCurso() {
		return nombreCurso;
	}

	/**
	 * @return Este metodo devuelve el atributo fechaInicio del curso
	 */

	public String getFechaInicioCurso() {
		return fechaInicioCurso;
	}

	/**
	 * @return Este metodo devuelve el atributo fechaFin del curso
	 */

	public String getFechaFinCurso() {
		return fechaFinCurso;
	}

	/**
	 * @return Este metodo devuelve el atributo nParticipantesTotalCurso del curso
	 */

	public int getnParticipantesTotalCurso() {
		return nParticipantesTotalCurso;
	}

	/**
	 * @return Este metodo devuelve el atributo nParticipantesInscritosCurso del curso
	 */

	public int getnParticipantesInscritosCurso() {
		return nParticipantesInscritosCurso;
	}

}
