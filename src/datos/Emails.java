//Asociamos la clase con el paquete

package datos;

//Importamos los paquetes necesarios para enviar el correo

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

//Declaramos la clase publica

/**
 * Esta clase será nuestra plantilla para crear y enviar emails
 * 
 * @author Leonardo Machado Guazzelli
 * @version 1.0
 */

public class Emails {

	// Atributos de la clase

	private String dniAlumno;
	private String nombreAlumno;
	private String apellidosAlumno;

	private int idCurso;
	private String nombreCurso;

	// Atributos para enviar email

	String email;
	String asunto = "Rechazo de matrícula.";
	String cuerpo;

	// Constructor de la clase

	/**
	 * Este es el constructor de la clase emails
	 * 
	 * @param dniAlumno
	 * @param nombreAlumno
	 * @param apellidosAlumno
	 * @param idCurso
	 * @param nombreCurso
	 */

	public Emails(String dniAlumno, String nombreAlumno, String apellidosAlumno, int idCurso, String nombreCurso,
			String email) {

		this.dniAlumno = dniAlumno;
		this.nombreAlumno = nombreAlumno;
		this.apellidosAlumno = apellidosAlumno;
		this.idCurso = idCurso;
		this.nombreCurso = nombreCurso;

		this.email = email;

		this.cuerpo = "Le informamos que el alumno " + this.nombreAlumno + " " + this.apellidosAlumno + " con el DNI "
				+ this.dniAlumno + " con el ID de curso " + this.idCurso + ", con el nombre " + this.nombreCurso
				+ ", no ha sido admitido, debido a que se ha llegado al límite de alumnos inscritos.";

		Emails.enviarConGMail(email, asunto, cuerpo);
		
	}

	/**
	 * @return Este metodo devuelve el atributo cadenaTexto de esta clase donde se
	 *         encuentra la informacion del correo
	 */

	public String getCadenaTexto() {
		return cuerpo;
	}

	public static void enviarConGMail(String destinatario, String asunto, String cuerpo) {

		// Esto es lo que va delante de @gmail.com en tu cuenta de correo. Es el
		// remitente también.
		
		final String remitente = "leonardomachadoguazzelli@gmail.com"; // "nomcuenta" Para la dirección nomcuenta@gmail.com
		final String claves = "49908454H";

		Properties props = System.getProperties();
		
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		props.put("mail.smtp.host", "smtp.gmail.com"); // El servidor SMTP de Google
		props.put("mail.smtp.user", remitente);
		props.put("mail.smtp.clave", claves); // La clave de la cuenta
		props.put("mail.smtp.auth", "true"); // Usar autenticación mediante usuario y clave
		props.put("mail.smtp.starttls.enable", "true"); // Para conectar de manera segura al servidor SMTP
		props.put("mail.smtp.port", "587"); // El puerto SMTP seguro de Google

		Session session = Session.getDefaultInstance(props);
		MimeMessage message = new MimeMessage(session);
		
		try {
			
			message.setFrom(new InternetAddress(remitente));
			message.addRecipients(Message.RecipientType.TO, destinatario); // Se indica el destinatario

			message.setSubject(asunto);
			message.setText(cuerpo);

			Transport transport = session.getTransport("smtp");

			transport.connect("smtp.gmail.com", remitente, claves);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
			System.out.println("Email enviado");

		} catch (MessagingException me) {

			me.printStackTrace();

		}

	}

}
