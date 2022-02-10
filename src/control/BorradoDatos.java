//Asociamos la clase con el paquete

package control;

//Declaramos la clase publica

/**
 * Esta clase será nuestra plantilla para borrar datos
 * 
 * @author Leonardo Machado Guazzelli
 * @version 1.0
 * 
 */

public class BorradoDatos {

	// Metodos para borrar datos

	// Buscamos el objeto que coincidan los datos y lo borramos

	/**
	 * Este metodo sirve para borrar usuarios, comprueba que existe y lo realiza
	 * @param usuario
	 * @param contraseña
	 */
	
	public static void borrarUsuario(String usuario, String contraseña) {

		for (int i = 0; i < OperacionesPrograma.usuariosSistema.size(); i++) {

			if (OperacionesPrograma.usuariosSistema.get(i).getUsuario().equals(usuario)
					&& OperacionesPrograma.usuariosSistema.get(i).getContraseña().equals(contraseña)) {

				OperacionesPrograma.usuariosSistema.remove(i);

				System.out.println("\nEl alumno ha sido borrado con éxito.");

			}

		}

	}

	/**
	 * Este metodo sirve para borrar un administrador, comprueba que existe y que al menos exista 1 administrador
	 * @param usuario
	 * @param contraseña
	 */
	
	public static void borrarAdministrador(String usuario, String contraseña) {

		for (int i = 0; i < OperacionesPrograma.administradoresSistema.size(); i++) {

			if (OperacionesPrograma.administradoresSistema.get(i).getUsuario().equals(usuario)
					&& OperacionesPrograma.administradoresSistema.get(i).getContraseña().equals(contraseña)) {

				OperacionesPrograma.administradoresSistema.remove(i);

				System.out.println("\nEl administrador ha sido borrado con éxito.");

			}

		}

	}

	/**
	 * Este metodo sirve para borrar un alumno, comprueba que existe, y borra los ficheros asociados, actualiza los cursos con alumnos inscritos
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param telefono
	 * @param email
	 */
	
	public static void borrarAlumno(String dni, String nombre, String apellido, String direccion, int telefono,
			String email) {

		for (int i = 0; i < OperacionesPrograma.alumnosSistema.size(); i++) {

			if (OperacionesPrograma.alumnosSistema.get(i).getDNI().equals(dni)
					&& OperacionesPrograma.alumnosSistema.get(i).getNombre().equals(nombre)
					&& OperacionesPrograma.alumnosSistema.get(i).getApellidos().equals(apellido)
					&& OperacionesPrograma.alumnosSistema.get(i).getDireccion().equals(direccion)
					&& OperacionesPrograma.alumnosSistema.get(i).getTelefono() == telefono
					&& OperacionesPrograma.alumnosSistema.get(i).getEmail().equals(email)) {

				OperacionesPrograma.alumnosSistema.remove(i);

				System.out.println("\nEl alumno ha sido borrado con éxito.");

			}

		}

		// Buscamos el fichero y lo borramos

		int idCurso = 0;
		String nombreCurso = "";
		int inscritos = 0;
		boolean borrado = false;

		for (int i = 0; i < OperacionesPrograma.ficherosSistema.size(); i++) {

			if (OperacionesPrograma.ficherosSistema.get(i).getDniAlumno().equals(dni)
					&& OperacionesPrograma.ficherosSistema.get(i).getNombreAlumno().equals(nombre)
					&& OperacionesPrograma.ficherosSistema.get(i).getApellidosAlumno().equals(apellido)
					&& OperacionesPrograma.ficherosSistema.get(i).getDireccionAlumno().equals(direccion)
					&& OperacionesPrograma.ficherosSistema.get(i).getTelefonoAlumno() == telefono
					&& OperacionesPrograma.ficherosSistema.get(i).getEmailAlumno().equals(email)) {

				idCurso = OperacionesPrograma.ficherosSistema.get(i).getIdCurso();
				nombreCurso = OperacionesPrograma.ficherosSistema.get(i).getNombreCurso();
				inscritos = OperacionesPrograma.ficherosSistema.get(i).getnParticipantesInscritosCurso();
				borrado = true;
				OperacionesPrograma.ficherosSistema.remove(i);

				System.out.println("El alumno ya no está matriculado.");

			}

		}

		// Buscamos el curso y reducimos los inscritos

		if (borrado == true) {

			for (int i = 0; i < OperacionesPrograma.cursosSistema.size(); i++) {

				if (OperacionesPrograma.cursosSistema.get(i).getID() == idCurso
						&& OperacionesPrograma.cursosSistema.get(i).getNombreCurso().equals(nombreCurso)) {

					OperacionesPrograma.cursosSistema.get(i).setnParticipantesInscritos(inscritos - 1);

				}

			}

		}

	}

	/**
	 * Este metodo sirve para borrar un fichero, comprueba que existe y luego actualiza los cursos donde se estaba inscrito
	 * @param dniAlumno
	 * @param nombreAlumno
	 * @param apellidoAlumno
	 * @param direccionAlumno
	 * @param telefonoAlumno
	 * @param emailAlumno
	 * @param idCurso
	 * @param nombreCurso
	 * @param fechaInicioCurso
	 * @param fechaFinCurso
	 * @param nParticipantesTotalCurso
	 * @param nParticipantesInscritosCurso
	 */
	
	public static void borrarFichero(String dniAlumno, String nombreAlumno, String apellidoAlumno,
			String direccionAlumno, int telefonoAlumno, String emailAlumno, int idCurso, String nombreCurso,
			String fechaInicioCurso, String fechaFinCurso, int nParticipantesTotalCurso,
			int nParticipantesInscritosCurso) {

		// Buscamos el fichero y lo borramos

		int id = 0;
		String nombre = "";
		int inscritos = 0;
		boolean borrado = false;

		for (int i = 0; i < OperacionesPrograma.ficherosSistema.size(); i++) {

			if (OperacionesPrograma.ficherosSistema.get(i).getDniAlumno().equals(dniAlumno)
					&& OperacionesPrograma.ficherosSistema.get(i).getNombreAlumno().equals(nombreAlumno)
					&& OperacionesPrograma.ficherosSistema.get(i).getApellidosAlumno().equals(apellidoAlumno)
					&& OperacionesPrograma.ficherosSistema.get(i).getDireccionAlumno().equals(direccionAlumno)
					&& OperacionesPrograma.ficherosSistema.get(i).getTelefonoAlumno() == telefonoAlumno
					&& OperacionesPrograma.ficherosSistema.get(i).getEmailAlumno().equals(emailAlumno)
					&& OperacionesPrograma.ficherosSistema.get(i).getIdCurso() == idCurso
					&& OperacionesPrograma.ficherosSistema.get(i).getNombreCurso().equals(nombreCurso)
					&& OperacionesPrograma.ficherosSistema.get(i).getFechaInicioCurso().equals(fechaInicioCurso)
					&& OperacionesPrograma.ficherosSistema.get(i).getFechaFinCurso().equals(fechaFinCurso)
					&& OperacionesPrograma.ficherosSistema.get(i)
							.getnParticipantesTotalCurso() == nParticipantesTotalCurso
					&& OperacionesPrograma.ficherosSistema.get(i)
							.getnParticipantesInscritosCurso() == nParticipantesInscritosCurso) {

				id = OperacionesPrograma.ficherosSistema.get(i).getIdCurso();
				nombre = OperacionesPrograma.ficherosSistema.get(i).getNombreCurso();
				inscritos = OperacionesPrograma.ficherosSistema.get(i).getnParticipantesInscritosCurso() + 1;
				borrado = true;
				OperacionesPrograma.ficherosSistema.remove(i);

				System.out.println("Ya no existe la matricula.");

			}

		}

		// Buscamos el curso y reducimos los inscritos

		if (borrado == true) {

			for (int i = 0; i < OperacionesPrograma.cursosSistema.size(); i++) {

				if (OperacionesPrograma.cursosSistema.get(i).getID() == idCurso
						&& OperacionesPrograma.cursosSistema.get(i).getNombreCurso().equals(nombreCurso)) {

					OperacionesPrograma.cursosSistema.get(i).setnParticipantesInscritos(inscritos - 1);

				}

			}

		}

	}

	/**
	 * Este metodo sirve para borrar cursos, comprueba que existe y luego elimina todos los ficheros relacionados con el
	 * @param idCurso
	 * @param nombreCurso
	 * @param fechaInicioCurso
	 * @param fechaFinCurso
	 * @param nParticipantesTotalCurso
	 * @param nParticipantesInscritosCurso
	 */
	
	public static void borrarCurso(int idCurso, String nombreCurso, String fechaInicioCurso, String fechaFinCurso,
			int nParticipantesTotalCurso, int nParticipantesInscritosCurso) {

		boolean borrado = false;

		// Buscamos el curso y los borramos

		for (int i = 0; i < OperacionesPrograma.cursosSistema.size(); i++) {

			if (OperacionesPrograma.cursosSistema.get(i).getID() == idCurso
					&& OperacionesPrograma.cursosSistema.get(i).getNombreCurso().equals(nombreCurso)
					&& OperacionesPrograma.cursosSistema.get(i).getFechaInicio().equals(fechaInicioCurso)
					&& OperacionesPrograma.cursosSistema.get(i).getFechaFin().equals(fechaFinCurso)
					&& OperacionesPrograma.cursosSistema.get(i).getnParticipantesTotal() == nParticipantesTotalCurso
					&& OperacionesPrograma.cursosSistema.get(i)
							.getnParticipantesInscritos() == nParticipantesInscritosCurso) {

				OperacionesPrograma.cursosSistema.remove(i);
				borrado = true;
				System.out.println("\nEl curso ha sido borrado con éxito.");

			}

		}

		// Si hemos borrado el curso, buscamos los ficheros con sus datos y los borramos

		if (borrado == true) {

			for (int i = 0; i < OperacionesPrograma.ficherosSistema.size(); i++) {

				if (OperacionesPrograma.ficherosSistema.get(i).getIdCurso() == idCurso
						&& OperacionesPrograma.ficherosSistema.get(i).getNombreCurso().equals(nombreCurso)
						&& OperacionesPrograma.ficherosSistema.get(i).getFechaInicioCurso().equals(fechaInicioCurso)
						&& OperacionesPrograma.ficherosSistema.get(i).getFechaFinCurso().equals(fechaFinCurso)
						&& OperacionesPrograma.ficherosSistema.get(i)
								.getnParticipantesTotalCurso() == nParticipantesTotalCurso
						&& OperacionesPrograma.ficherosSistema.get(i)
								.getnParticipantesInscritosCurso() == nParticipantesInscritosCurso) {

					OperacionesPrograma.ficherosSistema.remove(i);

					System.out.println("Se han borrado todas matriculas relacionadas con el curso.");

				}

			}

		}

	}

}
