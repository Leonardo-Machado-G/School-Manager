//Asociamos la clase con el paquete

package datos;

//Declaramos la clase publica

/**
 * Esta clase ser� nuestra plantilla para crear administradores
 * @author Leonardo Machado Guazzelli
 * @version 1.0
 * 
 * */

public class Administradores {

	// Atributos de la clase

	private String usuario;
	private String contrase�a;

	// Constructor de la clase

	/**
	 * Este es el constructor de la clase administradores
	 * @param usuario sera el nombre de la cuenta del usuario
	 * @param contrase�a sera la clave de la cuenta del usuario
	 */
	
	public Administradores(String usuario, String contrase�a) {

		this.usuario = usuario;
		this.contrase�a = contrase�a;

	}

	// Gets y Sets de la clase
	
	/**
	 * @return Este metodo devuelve el atributo usuario de esta clase
	 */
	
	public String getUsuario() {
		return usuario;
	}
	
	/**
	 * @param usuario Este metodo establece un nuevo usuario
	 */
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return Este metodo devuelve el atributo contrase�a de esta clase
	 */
	
	public String getContrase�a() {
		return contrase�a;
	}

	/**
	 * @param contrase�a Este metodo establece una nueva contrase�a
	 */
	
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

}
