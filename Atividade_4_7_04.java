import java.util.Scanner;
public class Atividade_4_7_04 {
	public static void main(String[] args) {
		
//		Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu com a previdência, 
//		depois verifique se ela pode aposentar ou não.
//		Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter contribuído com, pelo menos, 25 anos.
//		Se ela passar nessas duas condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.
				
		Scanner ler = new Scanner(System.in);
		int IdadeParaAposentar = 55;
		int TempoContribuido = 25;
		Integer Idade= null; 
		
		
		System.out.println("Qual a sua idade: ");
		Idade = ler.nextInt();
		
		System.out.println("Quanto tempo de contribuição você tem? ");
		TempoContribuido = ler.nextInt();
		
		if( Idade >= IdadeParaAposentar && TempoContribuido >= 25){
			
			System.out.println("Você pode se aposentar estar  cumpriu todos os requisitos");
		}else {
			System.out.println("Você mão pode se aposentar idade menor que 55");
		}
		
		
		
	}
	
}
