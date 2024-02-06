import java.util.Scanner;
public class capitulo_08_atv_07 {
	public static void main(String[] args) {
		
//		Crie um programa que peça dois números do usuário e também qual a operação ele deseja fazer - adição ou subtração.
//		Para cada operação, você deve construir um método que realize a mesma, ou seja, teremos um método para adição,
//		que vai receber dois números como parâmetros e retornar o resultado da soma entre eles, e outro método para subtração.
		
		Scanner ler = new Scanner(System.in);
		int Escolha = opercaoEscolhida(null, ler, 0);
		cauculoOperacao(null, ler, Escolha, Escolha, Escolha);
		int operacaoEscolhida = 0;
		int primeiroNumero = ler.nextInt();
		
		
	}
//	Este metodo é responsavel por informar as opções disponiveis para operação e valida as opções esolhidas. 
	
	static Integer opercaoEscolhida(String texto, Scanner ler, int Escolha) {
		System.out.println("Bem vindo, veja as opeções realizaves abaixo.");
		String [] operacao = {"Soma", "Subtração"}; 
		
		for(int i = 0; i < operacao.length; i++) {
			
			System.out.println("["+ i + "] " + operacao[i]);
		}
		
		System.out.println("Qual será a operação desejada baseada pelo numero: ");
		int Escolha1 = ler.nextInt();
		
		if(Escolha1 == 1 ) {
			System.out.println("Opção escolhida: Subtração");
		} else if (Escolha1 == 0) {
			System.out.println("Opção escolhida: Soma");
		}else {
			System.err.println("Opção invalida");
			System.err.println("Reinicie o código!");
			System.exit(1);
		}
		
		return Escolha1;
	}
	

	
	// Este metodo é responsavel por comparar os valores escolhidos e fazer operação desejada.
	static Integer cauculoOperacao (String texto, Scanner ler , int Escolha, int primeiroNumero, int segundoNumero) {
		System.out.print("Qual será o primeiro número da operação: ");
		primeiroNumero = ler.nextInt();
		
		System.out.print("Qual será o segundo número da operação: ");
		segundoNumero = ler.nextInt();
		
		if(Escolha == 1 ) {
			System.out.println("O resultado da Opeção é: " + (primeiroNumero - segundoNumero) );
		} else if (Escolha == 0) {
			System.out.println("O resultado da Opeção é: " + (primeiroNumero + segundoNumero));
		}else {
			System.err.println("Opção invalida");
			System.err.println("Reinicie o código!");
			System.exit(1);
		}
		
		
		return Escolha;
	}
	
}
