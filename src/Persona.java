public class Persona {

	// Atributos
	private final char SEXO_DEF = 'H';
	
	private String nombre = "";
	private int edad = 0;
	private String DNI;
	private char sexo = SEXO_DEF;
	private float peso = 0;
	private float altura = 0;
	
	
	// Constructores
	public Persona(String DNI) {
		this.DNI = DNI;
	}
	
	public Persona(String DNI, String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
	}
	
	public Persona(String DNI, String nombre, int edad, char sexo, float peso, float altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	// Métodos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public char getSEXO_DEF() {
		return SEXO_DEF;
	}
}