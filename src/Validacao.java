
import java.io.*;

public class Validacao {
	private BufferedReader k;

	public Validacao() {
		k = new BufferedReader(new InputStreamReader(System.in));
	}

	public String validarString(String z, byte min, byte max) {
		String st = " ";
		do {
			System.out.println(z);
			try {
				st = k.readLine();
			} catch (IOException g) {
				System.err.println(g.getMessage());
			}

			if (st.isEmpty() || st.length() < min || st.length() > max) {
				System.err.println("Dado Invalido, Tente Novamente ");
			}
		} while (st.isEmpty() || st.length() < min || st.length() > max);
		return st;
	}

	public byte validarByte(String z, byte min, byte max) {
		byte st = 0;
		do {
			System.out.println(z);
			try {
				st = Byte.parseByte(k.readLine());
			} catch (NumberFormatException erro) {
				System.err.println("O valor introduzido nao eh um inteiro");
			} catch (IOException g) {
				g.printStackTrace();
			}
			if (st < min || st > max) {
				System.err.println("Dado Invalido, Tente Novamente ");
			}
		} while (st < min || st > max);

		return st;
	}

	public char validarChar(String z, char a, char b, char c, char d) {
		char str = '0';
		do {
			System.out.println(z);
			try {
				str = k.readLine().charAt(0);
			} catch (StringIndexOutOfBoundsException l) {
				System.err.print("Dado invalido");

			} catch (IOException erro) {
				erro.printStackTrace();
			}

			if (((str != a) && (str != b)) && ((str != c) && (str != d))) {
				System.err.println("Dado Invalido, Tente Novamente ");
			}
		} while (((str != a) && (str != b)) && ((str != c) && (str != d)));

		return str;
	}

	public int validarInt(String z, int min, int max) {
		int st = 0;
		do {
			System.out.println(z);
			try {
				st = Integer.parseInt(k.readLine());
			} catch (NumberFormatException erro) {
				System.err.println("O valor introduzido nao eh um inteiro");
			} catch (IOException f) {
				f.printStackTrace(); // procurara saber porque nao fuciona
										// f.printStrackTrakes
			}
			// vai permitir que o utilizador veja o dado que inseriou.
			if (st < min || st > max) {
				System.err.println("Dado Invalido, Tente Novamente ");
			}
		} while (st < min || st > max);
		return st;
	}

	public double validarDouble(String z, int min, int max) {
		double st = 0;
		do {
			System.out.println(z);
			try {
				st = Double.parseDouble(k.readLine());
			} catch (NumberFormatException erro) {
				System.err.println("O valor introduzido nao eh um Double");
			} catch (IOException f) {
				f.printStackTrace(); // procurara saber porque nao fuciona
										// f.printStrackTrakes
			}
			// vai permitir que o utilizador veja o dado que inseriou.
			if (st < min || st > max) {
				System.err.println("Dado Invalido, Tente Novamente ");
			}
		} while (st < min || st > max);
		return st;
	}

}
