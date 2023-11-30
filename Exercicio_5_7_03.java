import java.util.Scanner;
public class Exercicio_5_7_03 {
	public static void main(String[] args) {
//		Crie um programa que vai receber um número que será referente ao dia da semana (de 1 até 7). 
//		Dependendo do número informado você deve imprimir o nome desse dia.
//		Se o número 1 for informado, então deverá ser impresso "domingo", se 2, então "segunda-feira" e por ai vai.

		Scanner ler = new Scanner(System.in);
		Integer semana = null;
		System.out.print("Escreva um número de 1 a 7: ");
		semana = ler.nextInt();
		
		switch(semana) {
		case 1:
			System.out.println("Segunda-Feira");
			break;
			
		case 2:
			System.out.println("Terça-Feira");
			break;
			
		case 3: 
			System.out.println("Quarta-Feira");
		
		case 4:
			System.out.println("Quinta-Feira");
			break;
			
		case 5:
			System.out.println("Sexta-Feira");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		} 
		ler.close();
	}
}
