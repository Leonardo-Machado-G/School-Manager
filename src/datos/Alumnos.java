//Asociamos la clase con el paquete

package datos;

//Declaramos la clase publica

/**
 * Esta clase será nuestra plantilla para crear alumnos
 * @author Leonardo Machado Guazzelli
 * @version 1.0
 * 
 * */

public class Alumnos {

	// Atributos de la clase

	private String DNI;
	private String nombre;
	private String apellidos;
	private String direccion;
	private int telefono;
	private String email;

	// Constructor de la clase
	/**
	 * Este es el constructor de la clase alumnos 
	 * @param DNI sera el atributo dni de la clase alumnos
	 * @param nombre sera el atributo nombre de la clase alumnos
	 * @param apellidos sera el atributo apellidos de la clase alumnos
	 * @param direccion sera el atributo direccion de la clase alumnos
	 * @param telefono sera el atributo telefono de la clase alumnos
	 * @param email sera el atributo email de la clase alumnos
	 */
	public Alumnos(String DNI, String nombre, String apellidos, String direccion, int telefono, String email) {

		this.DNI = DNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

	// Gets y Sets de la clase

	/**
	 * @return Este metodo sirve para devolver el atributo dni de un objeto alumnos
	 */
	
	public String getDNI() {
		return DNI;
	}

	/**
	 * @param DNI Este metodo sirve para establecer un nuevo atributo dni de un objeto alumnos
	 */
	
	public void setDNI(String dNI) {
		DNI = dNI;
	}

	/**
	 * @return Este metodo sirve para devolver el atributo nombre de un objeto alumnos
	 */
	
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre Este metodo sirve para establecer un nuevo atributo nombre de un objeto alumnos
	 */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return Este metodo sirve para devolver el atributo apellidos de un objeto alumnos
	 */
	
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos Este metodo sirve para establecer un nuevo atributo apellidos de un objeto alumnos
	 */
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return Este metodo sirve para devolver el atributo direccion de un objeto alumnos
	 */
	
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion Este metodo sirve para establecer un nuevo atributo direccion de un objeto alumnos
	 */
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return Este metodo sirve para devolver el atributo telefono de un objeto alumnos
	 */
	
	public int getTelefono() {
		return telefono;
	}

	/**
	 * 
	 * @param telefono Este metodo sirve para establecer un nuevo atributo telefono de un objeto alumnos
	 */
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return Este metodo sirve para devolver el atributo email de un objeto alumnos
	 */
	
	public String getEmail() {
		return email;
	}

	/**
	 * @param email Este metodo sirve para establecer un nuevo atributo email de un objeto alumnos
	 */
	
	public void setEmail(String email) {
		this.email = email;
	}

}
