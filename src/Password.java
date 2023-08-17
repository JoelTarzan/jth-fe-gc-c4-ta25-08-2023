public class Password {

	// Atributos
	private int longitud = 8;
	private String contrasena;

	// Constructores
	public Password(String contrasena) {
		this.contrasena = contrasena;
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena = generarContrasenaAleatoria(longitud);
	}

	// Métodos
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String generarContrasenaAleatoria(int longitud) {
		String caracteres = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789#!@.";
		StringBuilder contrasena = new StringBuilder();

		for (int i = 0; i < longitud; i++) {
			int numAleatorio = (int) (Math.floor(Math.random() * caracteres.length() + 1));
			contrasena.append(caracteres.charAt(numAleatorio));
		}

		return contrasena.toString();
	}
}