
public class Pessoa {
	protected String nome;
	protected int contacto;
	protected byte idade;

	 public Pessoa(String nome, int contacto, byte idade) {
	 this.nome=nome;
	 this.contacto=contacto;
	 this.idade=idade;	
	 }
	 
	 public Pessoa(){
		 this("",0,(byte)0);
	 }

	public String getNome() {
		return nome;
	}

	public byte getidade() {
		return idade;
	}

	public int getContacto() {
		return contacto;
	}

	public void setContacto(int contacto) {
		this.contacto = contacto;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getcontacto() {
		return contacto;

	}

	public String toString() {
		return "===============================\nNome:" + nome + "\nidade:" + idade + "\ncontacto:" + contacto;
	}

}