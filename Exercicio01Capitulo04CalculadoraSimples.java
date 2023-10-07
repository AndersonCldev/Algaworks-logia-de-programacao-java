import java.util.Scanner;
public class Exercicio01Capitulo04CalculadoraSimples {
	public static void main(String[] args) {

		// Aquia abaixo coloquei nosso código em uma estrutura de repetição para que não fosse possivel a reinicializar nossa calculadora.
		while( true ){
		Integer PrimeiroNumero = null;
		Integer segundoNumero = null;
		Integer operacao = null; 
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Olá, digite por favor o primeiro número para primeira operação:");
		PrimeiroNumero = ler.nextInt();
		
		System.out.println("DIGITE O NÚMERO CORRESPONDENTE AO SIMBOLO DA OPERAÇÃO QUE SERÁ REALIZADA. (EX: : 1 Multiplicação , 2 Divisão, 3 Adição, 4 Subtração.) :  ");
		operacao = ler.nextInt();
		
		System.out.print("Pronto, agora digite o segundo número da operação: ");
		segundoNumero = ler.nextInt();

				//Nesta estrutura de repetição fazemos com que a calculadora valide a opção escolhida pelo usuário e faça a operação solicitado.
			if (operacao == 1 ) {
				
				System.out.println("Resultado: " + PrimeiroNumero * segundoNumero);	
				
			}else if (operacao == 2) {
				
				System.out.println("Resultado: "+ PrimeiroNumero / segundoNumero);
				
			}else if(operacao == 3){
				
				System.out.println("Resultado: "+ (PrimeiroNumero + segundoNumero));
				
			}else if(operacao == 4 ) {
				
				System.out.println("Resultado: " + (PrimeiroNumero - segundoNumero));
			}else {
				System.out.println("Usuário não existe operação na opção do número " + operacao);
				System.out.println("Reinicie o código");
			}

				//Usuário digitarar 0 caso queira reiniciar a calculadora se não a calculadora finalizara
				System.out.print("Deseja sair? Digite 0 para sair ou qualquer outro número para continuar: ");
				
				Integer Reininciar = ler.nextInt();
				if(Reininciar == 0){
                                    break; // Sair do loop se o usuário quiser sair.
				}
				
				
		}
				
			

				
	
		}
	
	}

