//Asociamos la clase con el paquete

package control;

//Importamos el otro paquete para trabajar con el

import datos.*;
import java.util.ArrayList;

//Controlamos las excepciones

import java.util.InputMismatchException;

//Importamos Scanner para pedir datos por consola

import java.util.Scanner;

//Declaramos la clase publica

/**
 * Esta clase ser� nuestra plantilla para el menu principal
 * 
 * @author Leonardo Machado Guazzelli
 * @version 1.0
 * 
 */

public class OperacionesPrograma {

	// Atributos de la clase

	private static Scanner sc = new Scanner(System.in);

	// Listas necesarias del sistema donde se insertaran los datos

	public static ArrayList<Cursos> cursosSistema = new ArrayList<Cursos>();
	public static ArrayList<Alumnos> alumnosSistema = new ArrayList<Alumnos>();
	public static ArrayList<Administradores> administradoresSistema = new ArrayList<Administradores>();
	public static ArrayList<Usuarios> usuariosSistema = new ArrayList<Usuarios>();
	public static ArrayList<Ficheros> ficherosSistema = new ArrayList<Ficheros>();
	public static ArrayList<Emails> emailsSistema = new ArrayList<Emails>();

	// Declaramos el metodo main donde se van a ejecutar las instrucciones

	/**
	 * En este metodo se ejecutaran todas las instrucciones, y nos redireccionar� a
	 * los submenus de usuario o administrador, donde podremos ejecutar ciertas
	 * funcionas preestablecidas
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Creamos el administrador por defecto

		Administradores Administrador = new Administradores("administrador", "root");
		administradoresSistema.add(Administrador);

		// Bucle para elegir la funcion

		boolean rupturaMenu = false;
		int opcion = 4;

		while (rupturaMenu == false) {

			// Capturamos el error al introducir opciones no validas

			try {

				System.out.println("\n1.Iniciar sesi�n.\n2.Registrarse.\n3.Salir.\n");
				String Sopcion = sc.next();
				opcion = Integer.parseInt(Sopcion);

			} catch (InputMismatchException a) {

				System.out.println("\nError valor incorrecto.\n");
				rupturaMenu = true;

			}

			// Elegimos las opciones

			switch (opcion) {

			case 1:

				// Si devolvemos un 1 o un 2 iniciaremos sesion como administrador o usuario

				// Pedimos datos del usuario

				boolean condicionUsuario = false;
				boolean condicionContrase�a = false;

				// Limitamos los caracteres

				String nombreUsuario = "";
				String contrase�aUsuario = "";

				while (condicionUsuario != true) {
					
					System.out.println("�Cu�l es el nombre de cuenta?");
					nombreUsuario = sc.next();

					if (nombreUsuario.length() <= 20 && nombreUsuario.length() > 0) {
						
						condicionUsuario = true;

					} 
					else {

						System.out.println("Introduce un usuario de m�ximo 20 caracteres.");

					}
				
				}

				while (condicionContrase�a != true) {

					System.out.println("�Cu�l es la contrase�a de la cuenta?");
					contrase�aUsuario = sc.next();

					if (contrase�aUsuario.length() <= 20 && contrase�aUsuario.length() > 0) {

						condicionContrase�a = true;

					} else {

						System.out.println("Introduce una contrase�a de m�ximo 20 caracteres.");

					}

				}

				if (condicionUsuario == true && condicionContrase�a == true) {

					// En funcion de ser administrador o usuario, devolveremos un valor u otro

					if (ComprobacionDatos.comprobacionUsuario(nombreUsuario, contrase�aUsuario) == false
							&& ComprobacionDatos.comprobacionAdministrador(nombreUsuario, contrase�aUsuario) == true) {

						subMenuUsuario();

					} else if (ComprobacionDatos.comprobacionUsuario(nombreUsuario, contrase�aUsuario) == true
							&& ComprobacionDatos.comprobacionAdministrador(nombreUsuario, contrase�aUsuario) == false) {

						subMenuAdministrador();

					} else {

						System.out.println("\nEl usuario o contrase�a son incorrectos o la cuenta no existe.");

					}

				} else {

					System.out.println("\nIntroduce un usuario o contrase�a m�ximo de 20 car�cteres.");

				}

				break;

			case 2:

				System.out.println("\nProcedemos a crear un usuario.\n");

				// Registramos un usuario

				AdministracionDatos.registrarUsuario();
				break;

			case 3:

				System.out.println("\n//////////////\n Hasta pronto\n//////////////");
				rupturaMenu = true;
				break;

			default:

				System.out.println("Introduce una opci�n correcta.\n");
				break;

			}

		}

	}

	// Metodos para el uso de la informacion

	// Menu de un usuario

	/**
	 * Este metodo es un submenu de un usuario donde podremos ejecutar funciones
	 * solo de usuarios
	 */

	private static void subMenuUsuario() {

		System.out.println("\nHas iniciado sesi�n como usuario.");

		// Bucle para elegir la funcion

		boolean rupturaMenu = false;
		int opcion = 4;

		while (rupturaMenu == false) {

			System.out.println("\nMenu de usuario:");

			// Capturamos el error al introducir opciones no validas

			try {

				System.out.println("\n1.Crear alumno.\n2.Matricular alumno.\n3.Cerrar sesi�n.\n");
				String Sopcion = sc.next();
				opcion = Integer.parseInt(Sopcion);

			} catch (InputMismatchException a) {

				System.out.println("\nError valor incorrecto.");
				rupturaMenu = true;

			}

			// Elegimos las opciones

			switch (opcion) {

			case 1:

				System.out.println("\nProcedemos a crear a un alumno.\n");

				// Metodo para crear al alumno

				AdministracionDatos.creacionAlumno();
				break;

			case 2:

				System.out.println("\nProcedemos a matricular a un alumno.\n");

				// Metodo para matricular al alumno

				AdministracionDatos.matricularAlumno();
				break;

			case 3:

				System.out.println("\nHas cerrado sesi�n.");
				rupturaMenu = true;
				break;

			default:

				System.out.println("Introduce una opci�n correcta.");
				break;

			}

		}

	}

	// Menu de un administrador

	/**
	 * Este metodo es un submenu de un administrador donde podremos ejecutar
	 * funciones solo de administradores
	 */

	private static void subMenuAdministrador() {

		System.out.println("\nHas iniciado sesi�n como administrador.");

		// Bucle para elegir la funcion

		boolean rupturaMenu = false;
		int opcion = 4;

		while (rupturaMenu == false) {

			System.out.println("\nMenu de administrador:");

			// Capturamos el error al introducir opciones no validas

			try {

				System.out.println(
						"\n1.Crear alumno.\n2.Borrar alumno.\n3.Crear curso.\n4.Borrar curso.\n5.Matricular alumno.\n"
								+ "6.Crear administrador.\n7.Borrar administrador.\n8.Borrar usuario.\n9.Borrar fichero.\n10.Cerrar sesi�n.\n");
				String Sopcion = sc.next();
				opcion = Integer.parseInt(Sopcion);

			} catch (InputMismatchException a) {

				System.out.println("\nError valor incorrecto.");
				rupturaMenu = true;

			}

			// Elegimos las opciones

			switch (opcion) {

			case 1:

				System.out.println("\nProcedemos a crear a un alumno.\n");

				// Metodo para crear al alumno

				AdministracionDatos.creacionAlumno();
				break;

			case 2:

				System.out.println("\nProcedemos a borrar a un alumno.\n");

				// Metodo para matricular al alumno
				// Borrar alumnos conlleva deshacer matriculas y actualizar los cursos

				AdministracionDatos.borradoAlumno();
				break;

			case 3:

				System.out.println("\nProcedemos a crear un curso.\n");

				// Metodo para crear un curso

				AdministracionDatos.creadoCurso();
				break;

			case 4:

				System.out.println("\nProcedemos a borrar un curso.\n");

				// Metodo para borrar un curso
				// Borrar cursos conlleva deshacer matriculas

				AdministracionDatos.borradoCurso();
				break;

			case 5:

				System.out.println("\nProcedemos a matricular a un alumno.\n");

				// Metodo para matricular a un alumno
				// Borrar alumnos conlleva borrar matriculas y actualizar cursos

				AdministracionDatos.matricularAlumno();
				break;

			case 6:

				System.out.println("\nProcedemos a crear a un administrador.\n");

				// Metodo para crear a un administrador

				AdministracionDatos.creadoAdministrador();
				break;

			case 7:

				System.out.println("\nProcedemos a borrar a un administrador.\n");

				// Metodo para borrar a un administrador

				AdministracionDatos.borradoAdministrador();
				break;

			case 8:

				System.out.println("\nProcedemos a borrar a un usuario.\n");

				// Metodo para borrar a un usuario

				AdministracionDatos.borradoUsuario();
				break;

			case 9:

				System.out.println("\nProcedemos a borrar un fichero.\n");

				// Metodo para borrar un fichero
				// Borrar ficheros conlleva deshacer matriculas

				AdministracionDatos.borradoFichero();

				break;

			case 10:

				System.out.println("\nHas cerrado sesi�n.");
				rupturaMenu = true;

				break;

			default:

				System.out.println("Introduce una opci�n correcta.");
				break;

			}

		}

	}

}