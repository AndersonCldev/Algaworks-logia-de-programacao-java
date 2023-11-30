import java.util.Scanner;
public class Exercico5_3_01 {
	public static void main(String[] args) {
//		Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova.
//		Serão dois parâmetros para receber um para receber a nota de português e outro para receber as de matemática.
//		A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150. 
//		Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja, se tirar 59 em português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150) ele não conseguirá a vaga.
//    	No final mostre para o candidato se ele conseguiu ou não.
		
		
		Integer materia = null;
		Integer materia2 = null;
		Scanner ler = new Scanner(System.in);
		
		
		while(true) {
		
		System.out.println("Primeiro vamos explicar como funciona a exigencia do concurso.");
		System.out.println("As notas das duas materias devem se igual ou maior que 60pts.");
		System.out.println("");
		
		System.out.println("Entretanto você não será aprovado caso suas notas somadas sejam inferior a 150pts.");
		System.out.print("Você entendeu como funciona? Se sim digite 1 e iremos proceguir se não digite qualquer número para repedir esta mensagem.");
		System.out.println("");
		Integer VerificaEntendimento = ler.nextInt();
		 if(VerificaEntendimento == 1) {
			 break;
			 
		 }else if(VerificaEntendimento == 1) {
			 limparConsole();
		 }
		
		}
		
		
		
		while( true ) {
				
			
			
			System.out.print("Escreva a nota da materia de português: ");
			materia = ler.nextInt();
			System.out.print("Escreva a nota da materia de matemática: ");
			materia2 = ler.nextInt();
			System.out.println("");
			
			int TotalProva = materia + materia2;
			
			if(materia <= 59 && materia2 <= 59) {
				
				System.err.println("  	Você não atingil anota minima necessaria em uma das materias que deve ser igual ou maior que 60pts. ( REINICIE O PROGRAMA! )");
				System.out.print("");
			}
			if (materia >= 60  ) {
				System.out.println("  	Você atingil a nota minima necessaria na materia de de português que deve ser igual ou maior que 60pts. ");
				System.out.print(" ");
			}else {
				System.err.println("Você não atingil a quantidade de pontos necessaria que é de 60pts");
			}
				
				if(materia2 >=60){
					System.out.println(" 	Você atingil a nota minima necessaria na materia de de matemática que deve ser igual ou maior que 60pts. ");
					System.out.print(" ");

				}else {
					System.err.println("Entretanto você não atingil notal igual ou maior que 60pts na materia de matemática.");
					
				}
				
				
			if( TotalProva >= 150   ) {
				System.out.println(" ");
				System.out.println(" 	Você atingil a nota Final necessaria. "+ "  Notal final : "+ TotalProva+ "pts"  );
			} else {
				System.err.println("Entretanto você não atingiu nota Final necessaria, somando as duas notas que devem ser maior ou igula a 150pts. :( ");
				System.err.println("Sua nota foi de: " + TotalProva);
			}
			
					System.out.println("Deseja reiniciar o codigo por favor digite 1, caso contrario digite qualquer outro número.");
					Integer sairCode = ler.nextInt();
					
						switch (sairCode ){	
						case 1:
							break;
						}
			
		
				}
		
		
		}
			// Função para limpar console após a mensagem de explicação
				private static void limparConsole() {
				    System.out.print("\033[H\033[2J");
				    System.out.flush();
				}
}


