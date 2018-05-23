import java.io.IOException;

public class Menu {
	Validacao v = new Validacao();
	Operacoes o = new Operacoes();

	public void menu()throws IOException {
	o.lerFicheiro("lista.txt");
		byte op;
		do {
			opcoes();
			op = v.validarByte("escolha uma opcao ", (byte) 0, (byte) 4);

			switch (op) {
			case 1:
//				String m=v.validarString("Introduza a Matricula:", (byte)2, (byte)10);
//				System.out.println(t.informacaoCA(m));
				break;
			case 2:
//				System.out.println(t.semAtrelado());
				break;
			case 3:
				System.out.println(o.listarAlunos());
				;
				break;
			case 4:
				System.out.println(o.listarProfessor());
				;
				break;
			case 5:
				//System.out.println(o.listarProfessor());
				;
				break;
			default:
				System.err.println("Opcao Invalida");

			}

		} while (op != 0);

	}

	public void opcoes() {
		System.out.println("_________NETO MENU_____________");
		System.out.println("1-Adicionar Estudante");
		System.out.println("2-Adicionar Professor");
		System.out.println("3-Visualizar Estudante");
		System.out.println("4-Visualizar Professor");
		System.out.println("5-Visualisar Todos");
		System.out.println("0-Sair");
		System.out.println("_______________________________");
	}
}
