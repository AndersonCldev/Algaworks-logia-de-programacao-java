import java.util.Scanner;
public class Modulo7_atv_03 {
	public static void main(String[] args) {
		
	
	//	Crie um sistema onde o usuário vai cadastrar, utilizando o console, 
	//	as 5 tarefas mais importantes do dia dele. Armazene cada uma dessas tarefas em um vetor e, no final, imprima as tarefas novamente.
	Scanner ler = new Scanner(System.in);
	String [] atividadesImportantes = {null, null, null, null, null };

	
	System.out.println("Você ira escrever 5 atividades importante no seu dia.");
	
	for(int i = 0 ; i < atividadesImportantes.length; i++) {
		
	System.out.print("Qual a atividade: ");
	atividadesImportantes [i]= ler.nextLine();
	}
	System.out.println("As atividades do dia são: " + atividadesImportantes[0] + ", "+ atividadesImportantes[1]+atividadesImportantes[2]+ ","+ atividadesImportantes[3] +" e "+ atividadesImportantes[4]);
	
	
  }
}