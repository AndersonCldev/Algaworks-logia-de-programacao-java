package Pedido;
import java.util.Scanner;

public class SistemaPedido {
	
	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		Scanner ler = new Scanner(System.in);
		
		setCliente(ler, pedido);
		setPedido(pedido,ler, null, null );
	}

	public static void setCliente(Scanner ler, Pedido pedido) {
		System.out.print("Qual o nome do Cliente?");
		pedido.setNomeCliente(ler.nextLine()); 
		
		System.out.println("Qual o sobremone do cliente ?");
		pedido.setSobrenomeCliente(ler.nextLine());
		
		pedido.setNomeComleto(pedido.getNomeCliente() +" "+ pedido.getSobrenomeCliente());
	  //pedido.setNomeCompleto(pedido.getNomeCliente() +" "+ pedido.getSobrenomeCliente());
		
		
	}
	
	public  static void setPedido(Pedido pedido, Scanner ler, Integer Escolha, String [] Pedido) {
			String[] Pedidos  = {"Hamburguer", "Misto", "Sanduba"};
			System.out.println("___________________________");
			System.out.println("Digite o número referente ao produto que o cleinte deseja. ");
			
			for(int i = 0; i <3; i++) {
				
				System.out.println("["+ i +"]" +Pedidos[i]);
			}
			System.out.println(" ");
			Byte escolha = ler.nextByte();
			
			//Escolha do pedido e atribuição ao objeto pedido na variavel nomePedido
			if(escolha ==  0 ) {
				pedido.setNomePedido("Hamburguer");
			} else if(escolha ==  1) {
				pedido.setNomePedido("Misto");
			}else if(escolha ==  2) {
				pedido.setNomePedido("Sanduba");
			}else {
				System.err.println("Escolha invalida renicie o código.");
			}
			
			
	}
}	