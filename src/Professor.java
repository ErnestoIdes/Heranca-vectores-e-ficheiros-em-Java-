
public class Professor extends Pessoa {
	private String categoria;

	public Professor(String nome, int contacto, byte idade, String categoria) {
		super(nome, contacto, idade);
		this.categoria = categoria;
	}

	public Professor() {
		this("", 0, (byte) 0, "");
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String toString() {
		return "Professor\n" + super.toString() + "Categoria:" + categoria;
	}

}
