//Asociamos la clase con el paquete

package control;

//Importamos Scanner para pedir datos por consola

import java.util.Scanner;

//Declaramos la clase publica

/**
 * Esta clase será nuestra plantilla para administrar datos
 * 
 * @author Leonardo Machado Guazzelli
 * @version 1.0
 * 
 */

public class AdministracionDatos {

	// Atributos de la clase

	private static Scanner sc = new Scanner(System.in);

	// Metodos para administrar datos

	// Comprobamos si es posible crear el usuario y lo generamos teniendo en cuenta
	// los administradores tambien

	/**
	 * Este metodo sirve para registrar un nuevo usuario, comprueba si ya existe y
	 * posteriormente lo genera
	 */

	public static void registrarUsuario() {

		// Pedimos datos del usuario

		boolean condicionUsuario = false;
		boolean condicionContraseña = false;

		// Limitamos los caracteres

		String nombreUsuario = "";
		String contraseñaUsuario = "";

		while (condicionUsuario != true) {

			System.out.println("¿Cuál es el nombre de cuenta?");
			nombreUsuario = sc.nextLine();

			if (nombreUsuario.length() <= 20 && nombreUsuario.length() > 0) {

				condicionUsuario = true;

			} else {

				System.out.println("Introduce un usuario de máximo 20 caracteres.");

			}

		}

		while (condicionContraseña != true) {

			System.out.println("¿Cuál es la contraseña de la cuenta?");
			contraseñaUsuario = sc.nextLine();

			if (contraseñaUsuario.length() <= 20 && contraseñaUsuario.length() > 0) {

				condicionContraseña = true;

			} else {

				System.out.println("Introduce una contraseña de máximo 20 caracteres.");

			}

		}

		if (condicionUsuario == true && condicionContraseña == true) {

			if (ComprobacionDatos.comprobacionUsuario(nombreUsuario, contraseñaUsuario) == true
					&& ComprobacionDatos.comprobacionAdministrador(nombreUsuario, contraseñaUsuario) == true) {

				GeneracionDatos.generarUsuario(nombreUsuario, contraseñaUsuario);

				System.out.println("\nSe ha generado el usuario con éxito.");

			} else {

				System.out.println("\nNo es posible crear el usuario, ya existe.");

			}

		} else {

			System.out.println("Los datos introducidos no son válidos.");

		}

	}

	// Metodo para matricular al alumno

	/**
	 * Este metodo sirve para matricular al alumno, pide los datos, comprueba la
	 * existencia de alumnos, ficheros y cursos y posteriormente lo genera
	 */

	public static void matricularAlumno() {

		// Variables de validacion de alumno

		String dni = "";
		String nombre = "";
		String apellidos = "";
		String direccion = "";
		int telefono = 0;
		String email = "";

		boolean validacionDNI = false;
		boolean validacionNombre = false;
		boolean validacionApellidos = false;
		boolean validacionDireccion = false;
		boolean validacionTelefono = false;
		boolean validacionEmail = false;

		// Variables de validacion de curso

		int idCurso = 0;
		String nombreCurso = "";
		String fechaInicioCurso = "";
		String fechaFinCurso = "";
		int nParticipantesTotalCurso = 0;
		int nParticipantesInscritosCurso = 0;

		boolean validacionID = false;
		boolean validacionNombreCurso = false;
		boolean validacionFechaI = false;
		boolean validacionFechaF = false;
		boolean validacionPTotal = false;
		boolean validacionPInscr = false;

		// Pedimos datos del alumno

		// Validacion DNI

		while (validacionDNI != true) {

			System.out.println("¿Cuál es el DNI del alumno?");
			dni = sc.nextLine();

			int number = 0;

			if (dni.length() == 9) {

				for (int i = 0; i < dni.length() - 1; i++) {

					if (dni.charAt(i) >= '0' && dni.charAt(i) <= '9') {

						number++;

					}

				}

				if (number == 8 && dni.charAt(8) <= 'Z' && dni.charAt(8) >= 'A') {

					validacionDNI = true;

				} else {

					System.out.println("La longitud del DNI tiene que ser de 8 números y tener una letra mayúscula.");

				}

			} else {

				System.out.println("La longitud del DNI tiene que ser de 8 números y tener una letra mayúscula.");

			}

		}

		// Validacion nombre

		while (validacionNombre != true) {

			System.out.println("¿Cuál es el nombre del alumno?");
			nombre = sc.nextLine();

			if (nombre.length() <= 10 && nombre.length() > 0) {

				validacionNombre = true;

			} else {

				System.out.println("El nombre no puede medir más de 10 carácteres.");

			}

		}

		// Validacion apellidos

		while (validacionApellidos != true) {

			System.out.println("¿Cuál es el apellidos del alumno?");
			apellidos = sc.nextLine();

			if (apellidos.length() <= 20 && apellidos.length() > 0) {

				validacionApellidos = true;

			} else {

				System.out.println("Los apellidos no pueden medir más de 20 carácteres.");

			}

		}

		// Validacion direccion

		while (validacionDireccion != true) {

			System.out.println("¿Cuál es el direccion del alumno?");
			direccion = sc.nextLine();

			if (direccion.length() <= 20 && direccion.length() > 0) {

				validacionDireccion = true;

			} else {

				System.out.println("La direccion no puede medir más de 20 carácteres.");

			}

		}

		// Validacion telefono

		while (validacionTelefono != true) {

			System.out.println("¿Cuál es el telefono del alumno?");
			String Stelefono = sc.nextLine();
			telefono = Integer.parseInt(Stelefono);

			if (telefono <= 999999999 && telefono >= 100000000) {

				validacionTelefono = true;

			} else {

				System.out.println("El telefono tiene que ser mayor que 100,000,000 y menor que 999,999,999.");

			}

		}

		// Validacion del email

		while (validacionEmail != true) {

			System.out.println("¿Cuál es el email del alumno?");
			email = sc.nextLine();

			if (email.length() <= 51 && email.length() > 0) {

				for (int i = 0; i < email.length() ; i++) {

					if (email.charAt(i) == '@') {

						validacionEmail = true;

					}

				}

			} else {

				System.out.println("El correo no puede ser mayor de 31 carácteres y tiene que tener el simbolo @.");

			}

			if (validacionEmail == false) {

				System.out.println("Falta el simbolo @ en el correo.");

			}

		}

		// Pedimos datos del curso

		// Validacion IDCurso

		while (validacionID != true) {

			System.out.println("¿Cuál es el ID del curso?");
			String SidCurso = sc.nextLine();
			idCurso = Integer.parseInt(SidCurso);

			if (idCurso <= 9999 && idCurso >= 0) {

				validacionID = true;

			} else {

				System.out.println("El ID del curso tiene que tener una longitud entre 9999 y 0.");

			}

		}

		// Validacion nombre curso

		while (validacionNombreCurso != true) {

			System.out.println("¿Cuál es el nombre del curso?");
			nombreCurso = sc.nextLine();

			if (nombreCurso.length() <= 10 && nombreCurso.length() >= 1) {

				validacionNombreCurso = true;

			} else {

				System.out.println("El nombre del curso tiene que tener una longitud de 10 carácteres.");

			}

		}

		// Validacion Inicio curso

		while (validacionFechaI != true) {

			System.out.println("¿Cuál es la fecha inicial del curso? (formato: dd/mm/aaaa)");
			fechaInicioCurso = sc.nextLine();

			if (fechaInicioCurso.length() <= 10 && fechaInicioCurso.length() >= 1) {

				validacionFechaI = true;

			} else {

				System.out.println(
						"La fecha del curso tiene máximo 10 caráceteres, 2 para el día, 2 para el mes, 4 para el año y 2 para los slash.");

			}

		}

		// Validacion Fin curso

		while (validacionFechaF != true) {

			System.out.println("¿Cuál es el fecha fin del curso? (formato: dd/mm/aaaa)");
			fechaFinCurso = sc.nextLine();

			if (fechaFinCurso.length() <= 10 && fechaFinCurso.length() >= 1) {

				validacionFechaF = true;

			} else {

				System.out.println(
						"La fecha del curso tiene máximo 10 caráceteres, 2 para el día, 2 para el mes, 4 para el año y 2 para los slash.");

			}

		}

		// Validacion total alumnos curso

		while (validacionPTotal != true) {

			System.out.println("¿Cuál es la cantidad total de alumnos del curso?");
			String SnParticipantesTotalCurso = sc.nextLine();
			nParticipantesTotalCurso = Integer.parseInt(SnParticipantesTotalCurso);

			if (nParticipantesTotalCurso <= 40 && nParticipantesTotalCurso >= 1) {

				validacionPTotal = true;

			} else {

				System.out.println("El total de alumnos tiene que estar entre el 40 y 1.");

			}

		}

		// Validacion total inscritos alumnos curso

		while (validacionPInscr != true) {

			System.out.println("¿Cuál es el numero de participantes inscritos del curso?");
			String SnParticipantesInscritosCurso = sc.nextLine();
			nParticipantesInscritosCurso = Integer.parseInt(SnParticipantesInscritosCurso);

			if (nParticipantesInscritosCurso <= 40 && nParticipantesInscritosCurso >= 0) {

				validacionPInscr = true;

			} else {

				System.out.println("El total de alumnos inscritos tiene que estar entre el 40 y 0.");

			}

		}

		// Si esta disponible el alumno y el curso lo generamos

		if (validacionDNI == true && validacionNombre == true && validacionApellidos == true
				&& validacionDireccion == true && validacionTelefono == true && validacionEmail == true
				&& validacionID == true && validacionNombre == true && validacionFechaI == true
				&& validacionFechaF == true && validacionPTotal == true && validacionPInscr == true) {

			// Comprobamos que no esta disponible la creacion de un nuevo curso, lo que
			// querra decir que existe
			// Comprobamos que no exista un fichero que indique que ya esta matriculado
			// Comprobamos que el alumno ya existe

			if (ComprobacionDatos.comprobacionFichero(dni, nombre, apellidos, direccion, telefono, email, idCurso,
					nombreCurso, fechaInicioCurso, fechaFinCurso, nParticipantesTotalCurso,
					nParticipantesInscritosCurso)
					&& ComprobacionDatos.comprobacionCurso(idCurso, nombreCurso, fechaInicioCurso, fechaFinCurso,
							nParticipantesTotalCurso, nParticipantesInscritosCurso) == false
					&& ComprobacionDatos.comprobacionAlumno(dni, nombre, apellidos, direccion, telefono, email) == false
					&& nParticipantesTotalCurso > nParticipantesInscritosCurso) {

				GeneracionDatos.generarFichero(dni, nombre, apellidos, direccion, telefono, email, idCurso, nombreCurso,
						fechaInicioCurso, fechaFinCurso, nParticipantesTotalCurso, nParticipantesInscritosCurso);

			} else {

				// Generamos el correo de rechazo

				System.out.println(
						"\nEl alumno no puede matricularle porque o el fichero ya existe, el curso esta completo, no existe el curso o no existe el alumno.");
				GeneracionDatos.generarEmail(dni, nombre, apellidos, idCurso, nombreCurso, email);
				System.out.println("Se ha enviado un correo electrónico a " + email);

			}

		} else {

			System.out.println("Los datos introducidos no son correctos.");

		}

	}

	// Metodo para crear al alumno

	/**
	 * Este metodo sirve para crear un nuevo alumno pidiendo datos, comprobando que
	 * existe y luego generandolo
	 */

	public static void creacionAlumno() {

		// Variables de validacion

		String dni = "";
		String nombre = "";
		String apellidos = "";
		String direccion = "";
		int telefono = 0;
		String email = "";

		boolean validacionDNI = false;
		boolean validacionNombre = false;
		boolean validacionApellidos = false;
		boolean validacionDireccion = false;
		boolean validacionTelefono = false;
		boolean validacionEmail = false;

		// Pedimos datos del alumno

		// Validacion DNI

		while (validacionDNI != true) {

			System.out.println("¿Cuál es el DNI del alumno?");
			dni = sc.nextLine();

			int number = 0;

			if (dni.length() == 9) {

				for (int i = 0; i < dni.length() - 1; i++) {

					if (dni.charAt(i) >= '0' && dni.charAt(i) <= '9') {

						number++;

					}

				}

				if (number == 8 && dni.charAt(8) <= 'Z' && dni.charAt(8) >= 'A') {

					validacionDNI = true;

				} else {

					System.out.println("La longitud del DNI tiene que ser de 8 números y tener una letra mayúscula.");

				}

			} else {

				System.out.println("La longitud del DNI tiene que ser de 8 números y tener una letra mayúscula.");

			}

		}

		// Validacion nombre

		while (validacionNombre != true) {

			System.out.println("¿Cuál es el nombre del alumno?");
			nombre = sc.nextLine();

			if (nombre.length() <= 10 && nombre.length() > 0) {

				validacionNombre = true;

			} else {

				System.out.println("El nombre no puede medir más de 10 carácteres.");

			}

		}

		// Validacion apellidos

		while (validacionApellidos != true) {

			System.out.println("¿Cuál es el apellidos del alumno?");
			apellidos = sc.nextLine();

			if (apellidos.length() <= 20 && apellidos.length() > 0) {

				validacionApellidos = true;

			} else {

				System.out.println("Los apellidos no pueden medir más de 20 carácteres.");

			}

		}

		// Validacion direccion

		while (validacionDireccion != true) {

			System.out.println("¿Cuál es el direccion del alumno?");
			direccion = sc.nextLine();

			if (direccion.length() <= 20 && direccion.length() > 0) {

				validacionDireccion = true;

			} else {

				System.out.println("La direccion no puede medir más de 20 carácteres.");

			}

		}

		// Validacion telefono

		while (validacionTelefono != true) {
			
			System.out.println("¿Cuál es el telefono del alumno?");
			String Stelefono = sc.nextLine();
			telefono = Integer.parseInt(Stelefono);

			if (telefono <= 999999999 && telefono >= 100000000) {

				validacionTelefono = true;

			} else {

				System.out.println("El telefono tiene que ser mayor que 100,000,000 y menor que 999,999,999.");

			}

		}

		// Validacion del email

		while (validacionEmail != true) {

			System.out.println("¿Cuál es el email del alumno?");
			email = sc.nextLine();

			if (email.length() <= 51 && email.length() > 0) {

				for (int i = 0; i < email.length() ; i++) {

					if (email.charAt(i) == '@') {

						validacionEmail = true;

					}

				}

			} else {

				System.out.println("El correo no puede ser mayor de 51 carácteres y tiene que tener el simbolo @.");

			}

			if (validacionEmail == false) {

				System.out.println("Falta el simbolo @ en el correo.");

			}

		}

		// Si esta disponible el alumno lo generamos

		if (validacionDNI == true && validacionNombre == true && validacionApellidos == true
				&& validacionDireccion == true && validacionTelefono == true && validacionEmail == true) {

			if (ComprobacionDatos.comprobacionAlumno(dni, nombre, apellidos, direccion, telefono, email) == true) {

				GeneracionDatos.generarAlumno(dni, nombre, apellidos, direccion, telefono, email);
				System.out.println("\nEl alumno ha sido creado con éxito.");

			} else {

				System.out.println("\nEl alumno ya existe.");

			}

		} else {

			System.out.println("Algún dato no se ha escrito correctamente.");

		}

	}

	// Metodo para borrar a un almumno

	/**
	 * Este metodo sirve para borrar un alumno, si no existe, lo indica, una vez lo
	 * hace, borra todos los ficheros y reduce el numero de inscritos en el curso
	 * donde se matriculaba
	 */

	public static void borradoAlumno() {

		// Variables de validacion

		String dni = "";
		String nombre = "";
		String apellidos = "";
		String direccion = "";
		int telefono = 0;
		String email = "";

		boolean validacionDNI = false;
		boolean validacionNombre = false;
		boolean validacionApellidos = false;
		boolean validacionDireccion = false;
		boolean validacionTelefono = false;
		boolean validacionEmail = false;

		// Pedimos datos del alumno

		// Validacion DNI

		while (validacionDNI != true) {

			System.out.println("¿Cuál es el DNI del alumno?");
			dni = sc.nextLine();

			int number = 0;

			if (dni.length() == 9) {

				for (int i = 0; i < dni.length() - 1; i++) {

					if (dni.charAt(i) >= '0' && dni.charAt(i) <= '9') {

						number++;

					}

				}

				if (number == 8 && dni.charAt(8) <= 'Z' && dni.charAt(8) >= 'A') {

					validacionDNI = true;

				} else {

					System.out.println("La longitud del DNI tiene que ser de 8 números y tener una letra mayúscula.");

				}

			} else {

				System.out.println("La longitud del DNI tiene que ser de 8 números y tener una letra mayúscula.");

			}

		}

		// Validacion nombre

		while (validacionNombre != true) {

			System.out.println("¿Cuál es el nombre del alumno?");
			nombre = sc.nextLine();

			if (nombre.length() <= 10 && nombre.length() > 0) {

				validacionNombre = true;

			} else {

				System.out.println("El nombre no puede medir más de 10 carácteres.");

			}

		}

		// Validacion apellidos

		while (validacionApellidos != true) {

			System.out.println("¿Cuál es el apellidos del alumno?");
			apellidos = sc.nextLine();

			if (apellidos.length() <= 20 && apellidos.length() > 0) {

				validacionApellidos = true;

			} else {

				System.out.println("Los apellidos no pueden medir más de 20 carácteres.");

			}

		}

		// Validacion direccion

		while (validacionDireccion != true) {

			System.out.println("¿Cuál es el direccion del alumno?");
			direccion = sc.nextLine();

			if (direccion.length() <= 20 && direccion.length() > 0) {

				validacionDireccion = true;

			} else {

				System.out.println("La direccion no puede medir más de 20 carácteres.");

			}

		}

		// Validacion telefono

		while (validacionTelefono != true) {

			System.out.println("¿Cuál es el telefono del alumno?");
			String Stelefono = sc.nextLine();
			telefono = Integer.parseInt(Stelefono);

			if (telefono <= 999999999 && telefono >= 100000000) {

				validacionTelefono = true;

			} else {

				System.out.println("El telefono tiene que ser mayor que 100,000,000 y menor que 999,999,999.");

			}

		}

		// Validacion del email

		while (validacionEmail != true) {

			System.out.println("¿Cuál es el email del alumno?");
			email = sc.nextLine();

			if (email.length() <= 51 && email.length() > 0) {

				for (int i = 0; i < email.length() ; i++) {

					if (email.charAt(i) == '@') {

						validacionEmail = true;

					}

				}

			} else {

				System.out.println("El correo no puede ser mayor de 51 carácteres y tiene que tener el simbolo @.");

			}

			if (validacionEmail == false) {

				System.out.println("Falta el simbolo @ en el correo.");

			}

		}

		// Si esta disponible el alumno lo generamos

		if (validacionDNI == true && validacionNombre == true && validacionApellidos == true
				&& validacionDireccion == true && validacionTelefono == true && validacionEmail == true) {

			if (ComprobacionDatos.comprobacionAlumno(dni, nombre, apellidos, direccion, telefono, email) == false) {

				BorradoDatos.borrarAlumno(dni, nombre, apellidos, direccion, telefono, email);

			} else {

				System.out.println("\nEl alumno no existe.");

			}

		} else {

			System.out.println("Algún dato no se ha escrito correctamente.");

		}

	}

	// Metodo para crear a un administrador

	/**
	 * Este metodo sirve para crear un administrador, comprueba si existe tanto en
	 * usuarios como en admiinstradores y luego lo crea
	 */

	public static void creadoAdministrador() {

		// Pedimos datos del administrador

		boolean condicionUsuario = false;
		boolean condicionContraseña = false;

		// Limitamos los caracteres

		String nombreUsuario = "";
		String contraseñaUsuario = "";

		while (condicionUsuario != true) {

			System.out.println("¿Cuál es el nombre de cuenta?");
			nombreUsuario = sc.nextLine();

			if (nombreUsuario.length() <= 20 && nombreUsuario.length() > 0) {

				condicionUsuario = true;

			} else {

				System.out.println("Introduce un usuario de máximo 20 caracteres.");

			}

		}

		while (condicionContraseña = !true) {

			System.out.println("¿Cuál es la contraseña de la cuenta?");
			contraseñaUsuario = sc.nextLine();

			if (contraseñaUsuario.length() <= 20 && contraseñaUsuario.length() > 0) {

				condicionContraseña = true;

			} else {

				System.out.println("Introduce una contraseña de máximo 20 caracteres.");

			}

		}

		if (condicionUsuario == true && condicionContraseña == true) {

			if (ComprobacionDatos.comprobacionUsuario(nombreUsuario, contraseñaUsuario) == true
					&& ComprobacionDatos.comprobacionAdministrador(nombreUsuario, contraseñaUsuario) == true) {

				GeneracionDatos.generarAdministrador(nombreUsuario, contraseñaUsuario);

				System.out.println("\nSe ha generado el administrador con éxito.");

			} else {

				System.out.println("\nNo es posible crear el administrador, ya existe.");

			}

		}

	}

	// Metodo para borrar a un administrador

	/**
	 * Este metodo sirve para borrar un administrador, comprueba si existe y luego
	 * lo borra
	 */

	public static void borradoAdministrador() {

		// Pedimos datos del administrador

		boolean condicionUsuario = false;
		boolean condicionContraseña = false;

		// Limitamos los caracteres

		String nombreUsuario = "";
		String contraseñaUsuario = "";

		while (condicionUsuario != true) {

			System.out.println("¿Cuál es el nombre de cuenta?");
			nombreUsuario = sc.nextLine();

			if (nombreUsuario.length() <= 20 && nombreUsuario.length() > 0) {

				condicionUsuario = true;

			} else {

				System.out.println("Introduce un usuario de máximo 20 caracteres.");

			}

		}

		while (condicionContraseña != true) {

			System.out.println("¿Cuál es la contraseña de la cuenta?");
			contraseñaUsuario = sc.nextLine();

			if (contraseñaUsuario.length() <= 20 && contraseñaUsuario.length() > 0) {

				condicionContraseña = true;

			} else {

				System.out.println("Introduce una contraseña de máximo 20 caracteres.");

			}

		}

		if (condicionUsuario == true && condicionContraseña == true) {

			if (ComprobacionDatos.comprobacionAdministrador(nombreUsuario, contraseñaUsuario) == false
					&& OperacionesPrograma.administradoresSistema.size() > 1) {

				BorradoDatos.borrarAdministrador(nombreUsuario, contraseñaUsuario);

			} else {

				System.out.println("\nEl administrador no existe o debe de existir al menos un administrador.");

			}

		} else {

			System.out.println("Los datos introducidos no son válidos.");

		}

	}

	// Metodo para borrar a un usuario

	/**
	 * Este metodo sirve para borrar un usuario, comprueba si existe y luego lo
	 * borra
	 */

	public static void borradoUsuario() {

		// Pedimos datos del usuario

		boolean condicionUsuario = false;
		boolean condicionContraseña = false;

		// Limitamos los caracteres

		String nombreCuenta = "";
		String contraseñaUsuario = "";

		while (condicionUsuario != true) {

			System.out.println("¿Cuál es el nombre de cuenta?");
			nombreCuenta = sc.nextLine();

			if (nombreCuenta.length() <= 20 && nombreCuenta.length() > 0) {

				condicionUsuario = true;

			} else {

				System.out.println("Introduce un usuario de máximo 20 caracteres.");

			}

		}

		while (condicionContraseña != true) {

			System.out.println("¿Cuál es la contraseña de la cuenta?");
			contraseñaUsuario = sc.nextLine();

			if (contraseñaUsuario.length() <= 20 && contraseñaUsuario.length() > 0) {

				condicionContraseña = true;

			} else {

				System.out.println("Introduce una contraseña de máximo 20 caracteres.");

			}

		}

		if (condicionUsuario == true && condicionContraseña == true) {

			if (ComprobacionDatos.comprobacionUsuario(nombreCuenta, contraseñaUsuario) == false) {

				BorradoDatos.borrarUsuario(nombreCuenta, contraseñaUsuario);
				System.out.println("\nEl usuario ha sido borrado con éxito.");

			} else {

				System.out.println("\nEl usuario no existe.");

			}

		} else {

			System.out.println("Los datos introducidos no son correctos.");

		}

	}

	// Metodo para crear un curso

	/**
	 * Este metodo sirve para crear un curso, comprueba si existe y luego lo crea
	 */

	public static void creadoCurso() {

		// Variables de validacion

		int idCurso = 0;
		String nombreCurso = "";
		String fechaInicioCurso = "";
		String fechaFinCurso = "";
		int nParticipantesTotalCurso = 0;
		int nParticipantesInscritosCurso = 0;

		boolean validacionID = false;
		boolean validacionNombre = false;
		boolean validacionFechaI = false;
		boolean validacionFechaF = false;
		boolean validacionPTotal = false;
		boolean validacionPInscr = false;

		// Pedimos datos del curso

		// Validacion IDCurso

		while (validacionID != true) {

			System.out.println("¿Cuál es el ID del curso?");
			String SidCurso = sc.nextLine();
			idCurso = Integer.parseInt(SidCurso);

			if (idCurso <= 9999 && idCurso >= 0) {

				validacionID = true;

			} else {

				System.out.println("El ID del curso tiene que tener una longitud entre 9999 y 0.");

			}

		}

		// Validacion nombre curso

		while (validacionNombre != true) {

			System.out.println("¿Cuál es el nombre del curso?");
			nombreCurso = sc.nextLine();

			if (nombreCurso.length() <= 10 && nombreCurso.length() >= 1) {

				validacionNombre = true;

			} else {

				System.out.println("El nombre del curso tiene que tener una longitud de 10 carácteres.");

			}

		}

		// Validacion Inicio curso

		while (validacionFechaI != true) {

			System.out.println("¿Cuál es la fecha inicial del curso? (formato: dd/mm/aaaa)");
			fechaInicioCurso = sc.nextLine();

			if (fechaInicioCurso.length() <= 10 && fechaInicioCurso.length() >= 1) {

				validacionFechaI = true;

			} else {

				System.out.println(
						"La fecha del curso tiene máximo 10 caráceteres, 2 para el día, 2 para el mes, 4 para el año y 2 para los slash.");

			}

		}

		// Validacion Fin curso

		while (validacionFechaF != true) {

			System.out.println("¿Cuál es el fecha fin del curso? (formato: dd/mm/aaaa)");
			fechaFinCurso = sc.nextLine();

			if (fechaFinCurso.length() <= 10 && fechaFinCurso.length() >= 1) {

				validacionFechaF = true;

			} else {

				System.out.println(
						"La fecha del curso tiene máximo 10 caráceteres, 2 para el día, 2 para el mes, 4 para el año y 2 para los slash.");

			}

		}

		// Validacion total alumnos curso

		while (validacionPTotal != true) {

			System.out.println("¿Cuál es la cantidad total de alumnos del curso?");
			String SnParticipantesTotalCurso = sc.nextLine();
			nParticipantesTotalCurso = Integer.parseInt(SnParticipantesTotalCurso);

			if (nParticipantesTotalCurso <= 40 && nParticipantesTotalCurso >= 1) {

				validacionPTotal = true;

			} else {

				System.out.println("El total de alumnos tiene que estar entre el 40 y 1.");

			}

		}

		// Validacion total inscritos alumnos curso

		while (validacionPInscr != true) {

			System.out.println("¿Cuál es el numero de participantes inscritos del curso?");
			String SnParticipantesInscritosCurso = sc.nextLine();
			nParticipantesInscritosCurso = Integer.parseInt(SnParticipantesInscritosCurso);

			
			if (nParticipantesInscritosCurso <= 40 && nParticipantesInscritosCurso >= 0) {

				validacionPInscr = true;

			} else {

				System.out.println("El total de alumnos inscritos tiene que estar entre el 40 y 0.");

			}

		}

		if (validacionID == true && validacionNombre == true && validacionFechaI == true && validacionFechaF == true
				&& validacionPTotal == true && validacionPInscr == true) {

			if (ComprobacionDatos.comprobacionCurso(idCurso, nombreCurso, fechaInicioCurso, fechaFinCurso,
					nParticipantesTotalCurso, nParticipantesInscritosCurso) == true) {

				GeneracionDatos.generarCurso(idCurso, nombreCurso, fechaInicioCurso, fechaFinCurso,
						nParticipantesTotalCurso, nParticipantesInscritosCurso);

				System.out.println("\nSe ha generado el curso con éxito.");

			} else {

				System.out.println("\nNo es posible crear el curso, ya existe.");

			}

		} else {

			System.out.println("Los datos introducidos no son válidos.");

		}

	}

	// Metodo para borrar un curso

	/**
	 * Este metodo sirve para borrar un curso, comprueba si existe, y luego borra
	 * todas las matriculas existentes
	 */

	public static void borradoCurso() {

		// Variables de validacion

		int idCurso = 0;
		String nombreCurso = "";
		String fechaInicioCurso = "";
		String fechaFinCurso = "";
		int nParticipantesTotalCurso = 0;
		int nParticipantesInscritosCurso = 0;

		boolean validacionID = false;
		boolean validacionNombre = false;
		boolean validacionFechaI = false;
		boolean validacionFechaF = false;
		boolean validacionPTotal = false;
		boolean validacionPInscr = false;

		// Pedimos datos del curso

		// Validacion IDCurso

		while (validacionID != true) {

			System.out.println("¿Cuál es el ID del curso?");
			String SidCurso = sc.nextLine();
			idCurso = Integer.parseInt(SidCurso);


			if (idCurso <= 9999 && idCurso >= 0) {

				validacionID = true;

			} else {

				System.out.println("El ID del curso tiene que tener una longitud entre 9999 y 0.");

			}

		}

		// Validacion nombre curso

		while (validacionNombre != true) {

			System.out.println("¿Cuál es el nombre del curso?");
			nombreCurso = sc.nextLine();

			if (nombreCurso.length() <= 10 && nombreCurso.length() >= 1) {

				validacionNombre = true;

			} else {

				System.out.println("El nombre del curso tiene que tener una longitud de 10 carácteres.");

			}

		}

		// Validacion Inicio curso

		while (validacionFechaI != true) {

			System.out.println("¿Cuál es la fecha inicial del curso? (formato: dd/mm/aaaa)");
			fechaInicioCurso = sc.nextLine();

			if (fechaInicioCurso.length() <= 10 && fechaInicioCurso.length() >= 1) {

				validacionFechaI = true;

			} else {

				System.out.println(
						"La fecha del curso tiene máximo 10 caráceteres, 2 para el día, 2 para el mes, 4 para el año y 2 para los slash.");

			}

		}

		// Validacion Fin curso

		while (validacionFechaF != true) {

			System.out.println("¿Cuál es el fecha fin del curso? (formato: dd/mm/aaaa)");
			fechaFinCurso = sc.nextLine();

			if (fechaFinCurso.length() <= 10 && fechaFinCurso.length() >= 1) {

				validacionFechaF = true;

			} else {

				System.out.println(
						"La fecha del curso tiene máximo 10 caráceteres, 2 para el día, 2 para el mes, 4 para el año y 2 para los slash.");

			}

		}

		// Validacion total alumnos curso

		while (validacionPTotal != true) {

			System.out.println("¿Cuál es la cantidad total de alumnos del curso?");
			String SnParticipantesTotalCurso = sc.nextLine();
			nParticipantesTotalCurso = Integer.parseInt(SnParticipantesTotalCurso);

			if (nParticipantesTotalCurso <= 40 && nParticipantesTotalCurso >= 1) {

				validacionPTotal = true;

			} else {

				System.out.println("El total de alumnos tiene que estar entre el 40 y 1.");

			}

		}

		// Validacion total inscritos alumnos curso

		while (validacionPInscr != true) {

			System.out.println("¿Cuál es el numero de participantes inscritos del curso?");
			String SnParticipantesInscritosCurso = sc.nextLine();
			nParticipantesInscritosCurso = Integer.parseInt(SnParticipantesInscritosCurso);

			if (nParticipantesInscritosCurso <= 40 && nParticipantesInscritosCurso >= 0) {

				validacionPInscr = true;

			} else {

				System.out.println("El total de alumnos inscritos tiene que estar entre el 40 y 0.");

			}

		}

		if (validacionID == true && validacionNombre == true && validacionFechaI == true && validacionFechaF == true
				&& validacionPTotal == true && validacionPInscr == true) {

			if (ComprobacionDatos.comprobacionCurso(idCurso, nombreCurso, fechaInicioCurso, fechaFinCurso,
					nParticipantesTotalCurso, nParticipantesInscritosCurso) == false) {

				BorradoDatos.borrarCurso(idCurso, nombreCurso, fechaInicioCurso, fechaFinCurso,
						nParticipantesTotalCurso, nParticipantesInscritosCurso);

			} else {

				System.out.println("\nEl curso no existe.");

			}

		}

	}

	// Metodo para borrar un fichero

	/**
	 * Este metodo sirve para borrar una matricula especifica, comprueba si existe,
	 * actualiza los cursos una vez lo borra
	 */

	public static void borradoFichero() {

		// Variables de validacion de alumno

		String dni = "";
		String nombre = "";
		String apellidos = "";
		String direccion = "";
		int telefono = 0;
		String email = "";

		boolean validacionDNI = false;
		boolean validacionNombre = false;
		boolean validacionApellidos = false;
		boolean validacionDireccion = false;
		boolean validacionTelefono = false;
		boolean validacionEmail = false;

		// Variables de validacion de curso

		int idCurso = 0;
		String nombreCurso = "";
		String fechaInicioCurso = "";
		String fechaFinCurso = "";
		int nParticipantesTotalCurso = 0;
		int nParticipantesInscritosCurso = 0;

		boolean validacionID = false;
		boolean validacionNombreCurso = false;
		boolean validacionFechaI = false;
		boolean validacionFechaF = false;
		boolean validacionPTotal = false;
		boolean validacionPInscr = false;

		// Pedimos datos del alumno

		// Validacion DNI

		while (validacionDNI != true) {

			System.out.println("¿Cuál es el DNI del alumno?");
			dni = sc.nextLine();

			int number = 0;

			if (dni.length() == 9) {

				for (int i = 0; i < dni.length() - 1; i++) {

					if (dni.charAt(i) >= '0' && dni.charAt(i) <= '9') {

						number++;

					}

				}

				if (number == 8 && dni.charAt(8) <= 'Z' && dni.charAt(8) >= 'A') {

					validacionDNI = true;

				} else {

					System.out.println("La longitud del DNI tiene que ser de 8 números y tener una letra mayúscula.");

				}

			} else {

				System.out.println("La longitud del DNI tiene que ser de 8 números y tener una letra mayúscula.");

			}

		}

		// Validacion nombre

		while (validacionNombre != true) {

			System.out.println("¿Cuál es el nombre del alumno?");
			nombre = sc.nextLine();

			if (nombre.length() <= 10 && nombre.length() > 0) {

				validacionNombre = true;

			} else {

				System.out.println("El nombre no puede medir más de 10 carácteres.");

			}

		}

		// Validacion apellidos

		while (validacionApellidos != true) {

			System.out.println("¿Cuál es el apellidos del alumno?");
			apellidos = sc.nextLine();

			if (apellidos.length() <= 20 && apellidos.length() > 0) {

				validacionApellidos = true;

			} else {

				System.out.println("Los apellidos no pueden medir más de 20 carácteres.");

			}

		}

		// Validacion direccion

		while (validacionDireccion != true) {

			System.out.println("¿Cuál es el direccion del alumno?");
			direccion = sc.nextLine();

			if (direccion.length() <= 20 && direccion.length() > 0) {

				validacionDireccion = true;

			} else {

				System.out.println("La direccion no puede medir más de 20 carácteres.");

			}

		}

		// Validacion telefono

		while (validacionTelefono != true) {

			System.out.println("¿Cuál es el telefono del alumno?");
			String Stelefono = sc.nextLine();
			telefono = Integer.parseInt(Stelefono);

			if (telefono <= 999999999 && telefono >= 100000000) {

				validacionTelefono = true;

			} else {

				System.out.println("El telefono tiene que ser mayor que 100,000,000 y menor que 999,999,999.");

			}

		}

		// Validacion del email

		while (validacionEmail != true) {

			System.out.println("¿Cuál es el email del alumno?");
			email = sc.nextLine();

			if (email.length() <= 51 && email.length() > 0) {

				for (int i = 0; i < email.length() ; i++) {

					if (email.charAt(i) == '@') {

						validacionEmail = true;

					}

				}

			} else {

				System.out.println("El correo no puede ser mayor de 51 carácteres y tiene que tener el simbolo @.");

			}

			if (validacionEmail == false) {

				System.out.println("Falta el simbolo @ en el correo.");

			}

		}

		// Pedimos datos del curso

		// Validacion IDCurso

		while (validacionID != true) {

			System.out.println("¿Cuál es el ID del curso?");
			String SidCurso = sc.nextLine();
			idCurso = Integer.parseInt(SidCurso);

			if (idCurso <= 9999 && idCurso >= 0) {

				validacionID = true;

			} else {

				System.out.println("El ID del curso tiene que tener una longitud entre 9999 y 0.");

			}

		}

		// Validacion nombre curso

		while (validacionNombreCurso != true) {

			System.out.println("¿Cuál es el nombre del curso?");
			nombreCurso = sc.nextLine();

			if (nombreCurso.length() <= 10 && nombreCurso.length() >= 1) {

				validacionNombreCurso = true;

			} else {

				System.out.println("El nombre del curso tiene que tener una longitud de 10 carácteres.");

			}

		}

		// Validacion Inicio curso

		while (validacionFechaI != true) {

			System.out.println("¿Cuál es la fecha inicial del curso? (formato: dd/mm/aaaa)");
			fechaInicioCurso = sc.nextLine();

			if (fechaInicioCurso.length() <= 10 && fechaInicioCurso.length() >= 1) {

				validacionFechaI = true;

			} else {

				System.out.println(
						"La fecha del curso tiene máximo 10 caráceteres, 2 para el día, 2 para el mes, 4 para el año y 2 para los slash.");

			}

		}

		// Validacion Fin curso

		while (validacionFechaF != true) {

			System.out.println("¿Cuál es el fecha fin del curso? (formato: dd/mm/aaaa)");
			fechaFinCurso = sc.nextLine();

			if (fechaFinCurso.length() <= 10 && fechaFinCurso.length() >= 1) {

				validacionFechaF = true;

			} else {

				System.out.println(
						"La fecha del curso tiene máximo 10 caráceteres, 2 para el día, 2 para el mes, 4 para el año y 2 para los slash.");

			}

		}

		// Validacion total alumnos curso

		while (validacionPTotal != true) {

			System.out.println("¿Cuál es la cantidad total de alumnos del curso?");
			String SnParticipantesTotalCurso = sc.nextLine();
			nParticipantesTotalCurso = Integer.parseInt(SnParticipantesTotalCurso);

			if (nParticipantesTotalCurso <= 40 && nParticipantesTotalCurso >= 1) {

				validacionPTotal = true;

			} else {

				System.out.println("El total de alumnos tiene que estar entre el 40 y 1.");

			}

		}

		// Validacion total inscritos alumnos curso

		while (validacionPInscr != true) {

			System.out.println("¿Cuál es el numero de participantes inscritos del curso?");
			String SnParticipantesInscritosCurso = sc.nextLine();
			nParticipantesInscritosCurso = Integer.parseInt(SnParticipantesInscritosCurso);

			if (nParticipantesInscritosCurso <= 40 && nParticipantesInscritosCurso >= 0) {

				validacionPInscr = true;

			} else {

				System.out.println("El total de alumnos inscritos tiene que estar entre el 40 y 0.");

			}

		}

		// Si esta disponible el alumno y el curso lo generamos

		if (validacionDNI == true && validacionNombre == true && validacionApellidos == true
				&& validacionDireccion == true && validacionTelefono == true && validacionEmail == true
				&& validacionID == true && validacionNombre == true && validacionFechaI == true
				&& validacionFechaF == true && validacionPTotal == true && validacionPInscr == true) {

			if (ComprobacionDatos.comprobacionFichero(dni, nombre, apellidos, direccion, telefono, email, idCurso,
					nombreCurso, fechaInicioCurso, fechaFinCurso, nParticipantesTotalCurso,
					nParticipantesInscritosCurso) == false) {

				BorradoDatos.borrarFichero(dni, nombre, apellidos, direccion, telefono, email, idCurso, nombreCurso,
						fechaInicioCurso, fechaFinCurso, nParticipantesTotalCurso, nParticipantesInscritosCurso);

			} else {

				System.out.println("\nEl fichero no existe.");

			}

		} else {

			System.out.println("Los datos introducidos no son correcto.");

		}

	}

}
