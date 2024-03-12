import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Este programa ler a lista de tarefas da atividade do capitulo 10 atividade 04
public class CAP_10_Exercicio_05 {

	public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\AlgaworksAUlas\\teste2.txt");
		List<String> linhas = Files.readAllLines(arquivo);	
		
		for(int i = 0; i < linhas.size(); i ++) {
			String nome = linhas.get(i);
			System.out.println(nome);
		}
		
	}

}
