import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class gravandoArquivos {

	public static void main(String[] args) throws IOException {
		ArrayList<String> linhas = new ArrayList<String>();
		linhas.add("Anderson");
		Path arquivo = Paths.get("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\AlgaworksAUlas\\teste.txt");
		Files.write(arquivo, linhas);

	}

}
