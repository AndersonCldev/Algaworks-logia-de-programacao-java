import java.util.Scanner;
public class Exercicio01Capitulo04CalculadoraSimples {
	public static void main(String[] args) {
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
		
			if (operacao == 1 ) {
				
				System.out.println("Resultado: " + PrimeiroNumero * segundoNumero);	
				
			}else if (operacao == 2) {
				
				System.out.println("Resultado: "+ PrimeiroNumero / segundoNumero);
				
			}else if(operacao == 3){
				
				System.out.println("Resultado: "+ (PrimeiroNumero + segundoNumero));
				
			}else if(operacao == 4 ) {
				
				System.out.println("Resultado: " + (PrimeiroNumero - segundoNumero));
			}else {
				System.out.println("Seu vagabundo não existe operação na opção número " + operacao + ""+" Reinicie o sistema.");
			}
			
				ler.close();
			
			
				
	
		}
	
	}

