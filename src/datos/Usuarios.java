//Asociamos la clase con el paquete

package datos;

//Declaramos la clase publica

/**
 * Esta clase será nuestra plantilla para crear usuarios
 * @author Leonardo Machado Guazzelli
 * @version 1.0
 * 
 * */

public class Usuarios {

	// Atributos de la clase

	private String usuario;
	private String contraseña;

	// Constructor de la clase

	/**
	 * Este es el constructor de la clase usuarios
	 * @param usuario sera el nombre de la cuenta
	 * @param contraseña sera la clave de la cuenta
	 */
	
	public Usuarios(String usuario, String contraseña) {

		this.usuario = usuario;
		this.contraseña = contraseña;

	}

	// Gets y Sets de la clase

	/**
	 * @return Este metodo devuelve el atributo usuario de esta clase
	 */
	
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario Este metodo establece un nuevo atributo usuario
	 */
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return Este metodo devuelve el atributo usuario de esta clase
	 */
	
	public String getContraseña() {
		return contraseña;
	}

	/**
	 * @param contraseña Este metodo establece un nuevo atributo contraseña
	 */
	
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
}
