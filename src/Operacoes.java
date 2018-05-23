import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;

public class Operacoes {
Vector v =new Vector();
	
	
void lerFicheiro(String nf){
	
	StringTokenizer str;
	String umaLinha = "";
	String nome; int contacto; byte idade; float media; String categoria;
	char c;
	
	try {
		FileReader fr = new FileReader(nf);
		BufferedReader fichIn = new BufferedReader(fr);
		umaLinha = fichIn.readLine();
		while (umaLinha != null) { // enquanto não atingir o fim de ficheiro
			str = new StringTokenizer(umaLinha, ";");
			nome = str.nextToken();
			contacto = Integer.parseInt(str.nextToken());
			idade = Byte.parseByte(str.nextToken());
			c = str.nextToken().charAt(0);
			if(c=='P'||c=='p'){
				categoria=str.nextToken();	
				criaObjectoProfessor(nome,contacto,idade,categoria);
			}
			else if (c=='E'||c=='e'){
				media=Float.parseFloat(str.nextToken());
				criarObjectoEstudante(nome,contacto,idade,media);
				
			}
			umaLinha = fichIn.readLine();
			
		}
		fichIn.close();
	} catch (FileNotFoundException a) {
		System.out.println("Ficheiro " + nf + "nao encontrado!");
	} catch (NumberFormatException nn) {
		System.out.println(nn.getMessage());
	} catch (IOException b) {
		System.out.println(b);
	}
	
	
	
}

public void criarObjectoEstudante(String nome, int contacto, byte idade, float media) {
	Aluno a=new Aluno();
	a.setNome(nome);
	a.setContacto(contacto);
	a.setIdade(idade);
	a.setMedia(media);
	v.add(a);
	
}

public void criaObjectoProfessor(String nome, int contacto, byte idade, String categoria) {
	Professor p=new Professor();
	p.setNome(nome);
	p.setContacto(contacto);
	p.setIdade(idade);
	p.setCategoria(categoria);
	v.add(p);
	
}

public String listarAlunos(){
	String ver=""; Aluno a;Pessoa p;
	
	for (int i = 0; i < v.size(); i++) {
		p=(Pessoa)v.elementAt(i);
		if(p instanceof Aluno){
			a=(Aluno)p;
			ver+=p.toString();
		}		
	}
	return ver;
	
	
}
	
public String listarProfessor(){
String ver=""; Professor pr;Pessoa p;
	
	for (int i = 0; i < v.size(); i++) {
		p=(Pessoa)v.elementAt(i);
		if(p instanceof Professor){
			pr=(Professor)p;
			ver+=p.toString();
		}
	}
	return ver;
	
}
	
	
	
	
}
