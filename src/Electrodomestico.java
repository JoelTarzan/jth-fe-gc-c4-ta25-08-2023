public class Electrodomestico {

	// Atributos
	protected final float PRECIO_BASE_DEF = 100;
	protected final String COLOR_DEF = "Blanco";
	protected final char CONSUMO_ENERGETICO_DEF = 'F';
	protected final float PESO_DEF = 5;

	protected float precioBase = PRECIO_BASE_DEF;
	protected String color = COLOR_DEF;
	protected char consumoEnergetico = CONSUMO_ENERGETICO_DEF;
	protected float peso = PESO_DEF;

	// Constructores
	public Electrodomestico() {
	}

	public Electrodomestico(float precioBase, float peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {
		this.precioBase = precioBase;
		this.color = validarColor(color) ? color : COLOR_DEF;
		this.consumoEnergetico = validarConsumoEnergetico(consumoEnergetico) ? consumoEnergetico : CONSUMO_ENERGETICO_DEF;
		this.peso = peso;
	}

	// Métodos
	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	private boolean validarConsumoEnergetico(char consumo) {
		char[] letras = {'A', 'B', 'C', 'D', 'E', 'F'};
		boolean esValido = false;

		for (char letra : letras) {
			if (letra == Character.toUpperCase(consumo)) {
				esValido = true;
			}
		}

		return esValido;
	}

	private boolean validarColor(String color) {
		String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
		boolean esValido = false;

		for (String colorEnArray : colores) {
			if (colorEnArray.equalsIgnoreCase(color)) {
				esValido = true;
			}
		}

		return esValido;
	}
}