import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
	
	
public class CAP_10_Exercicio_04 {
	
	    public static void main(String[] args) throws IOException {
	        ArrayList<String> linhas = new ArrayList<>();
	        Scanner ler = new Scanner(System.in);
	        String nome = "";

	        System.out.println("Escreva a lista de tarefas:");

	        while (!nome.equals("x")) {
	            nome = ler.nextLine();
	            linhas.add(nome);
	        }
	        
	        System.out.println("Fim");

	        Path arquivo = Paths.get("C:\\Users\\ander\\OneDrive\\Área de Trabalho\\AlgaworksAUlas\\teste2.txt");
	        Files.write(arquivo, linhas);
	    }
	}


