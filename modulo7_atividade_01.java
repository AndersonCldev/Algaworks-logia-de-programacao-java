import java.util.Scanner;
public class modulo7_atividade_01 {
	public static void main(String[] args) {
		
		String [] saboresCardapio = {"Calabresa", "Atum ", "portuguesa"};
		Integer [] escolherSabor  = {null, null, null,};
		Scanner ler = new Scanner(System.in);
		String refazerPedido = "";
		
		
		System.out.println("Escolha 3 sabores sabor: ");

		for(int i = 0; i< saboresCardapio.length; i++) {
			System.out.println("["+ i+ "]" + saboresCardapio[i]);
		}
		
		for(int e = 0; e < escolherSabor.length; e++) {
			
			System.out.println("Digite um número referente ao sabor: ");
			escolherSabor [e] = ler.nextInt();
		}
		
		
			System.out.println("Os sabores escolhidos foram: " + saboresCardapio[0] + ", " + saboresCardapio[1] + " e " + saboresCardapio[2] +".");
			
			ler.close();
		
	}
	
}
