public class Serie {

	// Atributos
	private String titulo = "";
	private int numTemporadas = 3;
	private boolean entregado = false;
	private String creador = "";

	// Constructores
	public Serie() {	
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int numTemporadas, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.creador = creador;
	}

	// Métodos
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
}