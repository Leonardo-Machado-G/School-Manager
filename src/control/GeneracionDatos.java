//Asociamos la clase con el paquete

package control;

//Importamos el otro paquete para trabajar con el

import datos.*;

//Declaramos la clase publica

/**
 * Esta clase será nuestra plantilla para generar datos
 * 
 * @author Leonardo Machado Guazzelli
 * @version 1.0
 * 
 */

public class GeneracionDatos {

	// Metodos para generar datos

	/**
	 * Este metodo sirve para generar usuarios
	 * @param usuario
	 * @param contraseña
	 */
	
	public static void generarUsuario(String usuario, String contraseña) {

		// Creamos el usuario y lo introducimos en la lista

		Usuarios nuevoUsuario = new Usuarios(usuario, contraseña);
		OperacionesPrograma.usuariosSistema.add(nuevoUsuario);

	}

	/**
	 * Este metodo sirve para generar un administrador
	 * @param usuario
	 * @param contraseña
	 */
	
	public static void generarAdministrador(String usuario, String contraseña) {

		// Creamos el usuario y lo introducimos en la lista

		Administradores nuevoAdministrador = new Administradores(usuario, contraseña);
		OperacionesPrograma.administradoresSistema.add(nuevoAdministrador);

	}

	/**
	 * Este metodo sirve para generar un alumno
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param telefono
	 * @param email
	 */
	
	public static void generarAlumno(String dni, String nombre, String apellido, String direccion, int telefono,
			String email) {

		// Creamos el alumno y lo introducimos en la lista

		Alumnos nuevoAlumno = new Alumnos(dni, nombre, apellido, direccion, telefono, email);
		OperacionesPrograma.alumnosSistema.add(nuevoAlumno);

	}

	/**
	 * Este metodo genera un fichero y cambia el numero de alumnos inscritos en un curso a su vez muestra el fichero generado
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
	
	public static void generarFichero(String dniAlumno, String nombreAlumno, String apellidoAlumno,
			String direccionAlumno, int telefonoAlumno, String emailAlumno, int idCurso, String nombreCurso,
			String fechaInicioCurso, String fechaFinCurso, int nParticipantesTotalCurso,
			int nParticipantesInscritosCurso) {

		// Creamos el fichero y lo introducimos en la lista

		Ficheros nuevoFichero = new Ficheros(dniAlumno, nombreAlumno, apellidoAlumno, direccionAlumno, telefonoAlumno,
				emailAlumno, idCurso, nombreCurso, fechaInicioCurso, fechaFinCurso, nParticipantesTotalCurso,
				(nParticipantesInscritosCurso + 1));

		// Buscamos el curso y aumentamos los inscritos

		for (int i = 0; i < OperacionesPrograma.cursosSistema.size(); i++) {

			if (OperacionesPrograma.cursosSistema.get(i).getID() == idCurso
					&& OperacionesPrograma.cursosSistema.get(i).getNombreCurso().equals(nombreCurso)
					&& OperacionesPrograma.cursosSistema.get(i).getFechaInicio().equals(fechaInicioCurso)
					&& OperacionesPrograma.cursosSistema.get(i).getFechaFin().equals(fechaFinCurso)
					&& OperacionesPrograma.cursosSistema.get(i).getnParticipantesTotal() == nParticipantesTotalCurso
					&& OperacionesPrograma.cursosSistema.get(i)
							.getnParticipantesInscritos() == nParticipantesInscritosCurso) {

				OperacionesPrograma.cursosSistema.get(i).setnParticipantesInscritos(nParticipantesInscritosCurso + 1);

			}

		}

		System.out.println("\nEl alumno se ha matriculado con éxito.");
		System.out.println("\nFichero de la matricula:");
		nuevoFichero.mostrarFichero();
		OperacionesPrograma.ficherosSistema.add(nuevoFichero);

	}

	/**
	 * Este metodo genera un nuevo curso
	 * @param idCurso
	 * @param nombreCurso
	 * @param fechaInicioCurso
	 * @param fechaFinCurso
	 * @param nParticipantesTotalCurso
	 * @param nParticipantesInscritosCurso
	 */
	
	public static void generarCurso(int idCurso, String nombreCurso, String fechaInicioCurso, String fechaFinCurso,
			int nParticipantesTotalCurso, int nParticipantesInscritosCurso) {

		// Creamos el curso y lo introducimos en la lista

		Cursos nuevoCurso = new Cursos(idCurso, nombreCurso, fechaInicioCurso, fechaFinCurso, nParticipantesTotalCurso,
				nParticipantesInscritosCurso);
		OperacionesPrograma.cursosSistema.add(nuevoCurso);

	}

	/**
	 * Este metodo sirve para generar emails
	 * @param dniAlumno
	 * @param nombreAlumno
	 * @param apellidoAlumno
	 * @param idCurso
	 * @param nombreCurso
	 */
	
	public static void generarEmail(String dniAlumno, String nombreAlumno, String apellidoAlumno, int idCurso,
			String nombreCurso, String email) {

		// Creamos el email y lo introducimos en la lista

		Emails nuevoEmail = new Emails(dniAlumno, nombreAlumno, apellidoAlumno, idCurso, nombreCurso, email);
		OperacionesPrograma.emailsSistema.add(nuevoEmail);

	}
	
	

}
