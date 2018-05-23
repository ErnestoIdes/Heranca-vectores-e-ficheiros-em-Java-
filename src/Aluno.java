
public class Aluno extends Pessoa {
	private float media;

	public Aluno(String nome, int contacto, byte idade, float media) {
		super(nome, contacto, idade);
		this.media = media;
	}
	public Aluno(){
		this("",0,(byte)0,0f);
	}
	public void setMedia(float media) {
		this.media = media;
	}
	public float getMedia(){
		return media;
			
	}
	public String toString(){
	 return "Aluno\n"+super.toString()+"\nMedia:"+media;
	
	
	}
	}
    