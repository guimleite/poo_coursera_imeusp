import java.io.FileReader;

public class LeitorDeArquivo {
	
	static char [] leArquivo (String nomeArq) {
		
		char[] conteudo = new char[1024];
		
		try {
			FileReader fr = new FileReader (nomeArq);
			fr.read(conteudo);
			fr.close();
		}
		
		catch (Exception e)
		{
			System.out.println("Não deu certo, mamãe: " + e);
		}
		return conteudo;
	}

	public static void main(String [] args) {
		try {
		System.out.println(leArquivo(args[0]));
		}
		catch (Exception e)
		{
			System.out.println("Não deu certo, papi: " + e);
		}
	}
}
