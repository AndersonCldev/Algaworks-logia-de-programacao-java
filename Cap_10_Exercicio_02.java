import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class gravandoArquivos {

	public static void main(String[] args) throws IOException {
		
		ArrayList<String> linhas = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva 4 nomes:" );
		
		for(int i = 0; i < 4 ; i ++) {
			
			String nome = ler.nextLine();
			linhas.add(nome);
		}
		
		System.out.println("Fim");

		
		
		Path arquivo = Paths.get("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\AlgaworksAUlas\\teste.txt");
		Files.write(arquivo, linhas);
	}
	

}
