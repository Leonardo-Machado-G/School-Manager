//Asociamos la clase con el paquete

package datos;

//Declaramos la clase publica

/**
 * Esta clase será nuestra plantilla para crear cursos
 * @author Leonardo Machado Guazzelli
 * @version 1.0
 * 
 * */

public class Cursos {

	// Atributos de la clase

	private int ID;
	private String nombreCurso;
	private String fechaInicio;
	private String fechaFin;
	private int nParticipantesTotal = 50;
	private int nParticipantesInscritos;

	// Constructor de la clase

	/**
	 * Este es el constructor de la clase cursos
	 * @param ID sera el ID del curso
	 * @param nombreCurso sera el nombre del curso
	 * @param fechaInicio sera la fecha de inicio del curso
	 * @param fechaFin sera la fecha del fin del curso
	 * @param nParticipantesTotal sera el numero de participantes total del curso
	 * @param nParticipantesInscritos sera el numero de participantes inscritos en el curso
	 */
	
	public Cursos(int ID, String nombreCurso, String fechaInicio, String fechaFin, int nParticipantesTotal,
			int nParticipantesInscritos) {

		this.ID = ID;
		this.nombreCurso = nombreCurso;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.nParticipantesTotal = nParticipantesTotal;
		this.nParticipantesInscritos = nParticipantesInscritos;

	}

	// Gets y Sets de la clase
	
	/**
	 * @return Este metodo devuelve el atributo ID de esta clase
	 */
	
	public int getID() {
		return ID;
	}

	/**
	 * @param iD Este metodo establece un nuevo ID
	 */
	
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @return Este metodo devuelve el atributo nombreCurso de esta clase
	 */
	
	public String getNombreCurso() {
		return nombreCurso;
	}

	/**
	 * @param nombreCurso Este metodo establece un nuevo nombreCurso
	 */
	
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	/**
	 * @return Este metodo devuelve el atributo fechaInicio de esta clase
	 */
	
	public String getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio Este metodo establece un nuevo fechaInicio
	 */
	
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return Este metodo devuelve el atributo fechaFin de esta clase
	 */
	
	public String getFechaFin() {
		return fechaFin;
	}

	/**
	 * @param fechaFin Este metodo establece un nuevo fechaFin
	 */
	
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
	 * @return Este metodo devuelve el atributo nParticipantesTotal de esta clase
	 */
	
	public int getnParticipantesTotal() {
		return nParticipantesTotal;
	}

	/**
	 * @param nParticipantesTotal Este metodo establece un nuevo nParticipantesTotal
	 */
	
	public void setnParticipantesTotal(int nParticipantesTotal) {
		this.nParticipantesTotal = nParticipantesTotal;
	}

	/**
	 * @return Este metodo devuelve el atributo nParticipantesInscritos de esta clase
	 */
	
	public int getnParticipantesInscritos() {
		return nParticipantesInscritos;
	}

	/**
	 * @param nParticipantesInscritos Este metodo establece un nuevo nParticipantesInscritos
	 */
	
	public void setnParticipantesInscritos(int nParticipantesInscritos) {
		this.nParticipantesInscritos = nParticipantesInscritos;
	}

}
