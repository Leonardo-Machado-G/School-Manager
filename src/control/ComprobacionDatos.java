//Asociamos la clase con el paquete

package control;

//Importamos el otro paquete para trabajar con el

import datos.*;

//Declaramos la clase publica

/**
 * Esta clase será nuestra plantilla para comprobar si esta disponible la creacion de datos
 * 
 * @author Leonardo Machado Guazzelli
 * @version 1.0
 * 
 */

public class ComprobacionDatos {

	// Metodos para comprobar datos

	// Metodo para comprobar la existencia del usuario, si es el primer usuario, no
	// entra en el return false y permite el acceso directamente

	/**
	 * Este metodo devuelve un true si esta disponible crear un nuevo usuario
	 * @param usuario
	 * @param contraseña
	 * @return
	 */
	
	public static boolean comprobacionUsuario(String usuario, String contraseña) {

		try {

			for (int i = 0; i < OperacionesPrograma.usuariosSistema.size(); i++) {

				if (OperacionesPrograma.usuariosSistema.get(i).getUsuario().equals(usuario)
						&& OperacionesPrograma.usuariosSistema.get(i).getContraseña().equals(contraseña)) {

					return false;

				}

			}

		} catch (IndexOutOfBoundsException a) {

			System.out.println("\nError de fuera de rango en la lista de usuarios.\n");

		}

		return true;

	}

	// Metodo para comprobar la existencia del administrador

	/**
	 * Este metodo devuelve un true si esta disponible crear un nuevo administrador, comprobando los administradores y usuarios
	 * @param usuario
	 * @param contraseña
	 * @return
	 */
	
	public static boolean comprobacionAdministrador(String usuario, String contraseña) {

		try {

			for (int i = 0; i < OperacionesPrograma.administradoresSistema.size(); i++) {

				if (OperacionesPrograma.administradoresSistema.get(i).getUsuario().equals(usuario)
						&& OperacionesPrograma.administradoresSistema.get(i).getContraseña().equals(contraseña)) {

					return false;

				}

			}

		} catch (IndexOutOfBoundsException a) {

			System.out.println("\nError de fuera de rango en la lista de administradores.\n");

		}

		return true;

	}

	// Metodo para comprobar la existencia del alumno

	/**
	 * Este metodo devuelve un true si esta disponible crear un nuevo alumno
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param telefono
	 * @param email
	 * @return
	 */
	
	public static boolean comprobacionAlumno(String dni, String nombre, String apellido, String direccion, int telefono,
			String email) {

		try {

			for (int i = 0; i < OperacionesPrograma.alumnosSistema.size(); i++) {

				if (OperacionesPrograma.alumnosSistema.get(i).getDNI().equals(dni)
						&& OperacionesPrograma.alumnosSistema.get(i).getNombre().equals(nombre)
						&& OperacionesPrograma.alumnosSistema.get(i).getApellidos().equals(apellido)
						&& OperacionesPrograma.alumnosSistema.get(i).getDireccion().equals(direccion)
						&& OperacionesPrograma.alumnosSistema.get(i).getTelefono() == telefono
						&& OperacionesPrograma.alumnosSistema.get(i).getEmail().equals(email)) {

					return false;

				}

			}

		} catch (IndexOutOfBoundsException a) {

			System.out.println("\nError de fuera de rango en la lista de alumnos.\n");

		}

		return true;

	}

	// Metodo para comprobar la existencia del fichero

	/**
	 * Este metodo devuelve un true si esta disponible la creacion de un fichero
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
	 * @return
	 */
	
	public static boolean comprobacionFichero(String dniAlumno, String nombreAlumno, String apellidoAlumno,
			String direccionAlumno, int telefonoAlumno, String emailAlumno, int idCurso, String nombreCurso,
			String fechaInicioCurso, String fechaFinCurso, int nParticipantesTotalCurso,
			int nParticipantesInscritosCurso) {

		try {

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
								.getnParticipantesInscritosCurso() == nParticipantesInscritosCurso
						&& OperacionesPrograma.ficherosSistema.get(i)
								.getnParticipantesTotalCurso() > OperacionesPrograma.ficherosSistema.get(i)
										.getnParticipantesInscritosCurso()) {

					return false;

				}

			}

		} catch (IndexOutOfBoundsException a) {

			System.out.println("\nError de fuera de rango en la lista de ficheros.\n");

		}

		return true;

	}

	// Metodo para comprobar la existencia del curso

	/**
	 * Este metodo devuelve un true si esta disponible la creacion del curso
	 * @param idCurso
	 * @param nombreCurso
	 * @param fechaInicioCurso
	 * @param fechaFinCurso
	 * @param nParticipantesTotalCurso
	 * @param nParticipantesInscritosCurso
	 * @return
	 */
	
	public static boolean comprobacionCurso(int idCurso, String nombreCurso, String fechaInicioCurso,
			String fechaFinCurso, int nParticipantesTotalCurso, int nParticipantesInscritosCurso) {

		try {

			for (int i = 0; i < OperacionesPrograma.cursosSistema.size(); i++) {

				if (OperacionesPrograma.cursosSistema.get(i).getID() == idCurso
						&& OperacionesPrograma.cursosSistema.get(i).getNombreCurso().equals(nombreCurso)
						&& OperacionesPrograma.cursosSistema.get(i).getFechaInicio().equals(fechaInicioCurso)
						&& OperacionesPrograma.cursosSistema.get(i).getFechaFin().equals(fechaFinCurso)
						&& OperacionesPrograma.cursosSistema.get(i).getnParticipantesTotal() == nParticipantesTotalCurso
						&& OperacionesPrograma.cursosSistema.get(i)
								.getnParticipantesInscritos() == nParticipantesInscritosCurso) {

					return false;

				}

			}

		} catch (IndexOutOfBoundsException a) {

			System.out.println("\nError de fuera de rango en la lista de ficheros.\n");

		}

		return true;

	}

}
