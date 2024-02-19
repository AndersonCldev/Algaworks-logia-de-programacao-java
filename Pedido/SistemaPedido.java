package Pedido;
import java.util.Scanner;

public class SistemaPedido {
	
	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		Scanner ler = new Scanner(System.in);
		
		setCliente(ler, pedido);
		
		setClienteCPF(pedido, ler);
		
		setPedido(pedido,ler, null );
		
		Confirmacao(pedido, ler);
		
		
	}

	
	public static void setCliente(Scanner ler, Pedido pedido) {
		
		System.out.print("Qual o nome do Cliente? ");
        String nomeCompleto = ler.nextLine();

        // Remove espaços adicionais após o primeiro nome
        String[] partesNome = nomeCompleto.split("\\s+");
        String primeiroNome = partesNome[0].substring(0, 1).toUpperCase() + partesNome[0].substring(1).toLowerCase();
        pedido.setNomeCliente(primeiroNome);

        // Verifica se há sobrenome e o define
        if (partesNome.length > 1) {
            String sobrenome = partesNome[1].substring(0, 1).toUpperCase() + partesNome[1].substring(1).toLowerCase();
            pedido.setSobrenomeCliente(sobrenome);
        } else {
            pedido.setSobrenomeCliente(""); // Define como vazio se não houver sobrenome
        }

        pedido.setNomeCompleto(pedido.getNomeCliente() + " " + pedido.getSobrenomeCliente());
        
	}
	
	public static void setClienteCPF(Pedido pedido, Scanner ler) {
		
	//CPF na nota
    System.out.println("Cliente deseja incluir CPF na nota? (Digite 1 para sim e 2 para não) ");
    byte escolha = ler.nextByte();
    ler.nextLine();
    
    if(escolha == 1) {
    	
    	System.out.println("");
    	System.out.println("Digite o CPF...");
    	String cpf = ler.nextLine();
    	pedido.setCpf(cpf);
    }else if(escolha ==2) {
    	
    }
}
		
	
	public  static void setPedido(Pedido pedido, Scanner ler, String [] Pedido) {
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
	
	public static void Confirmacao(Pedido pedido, Scanner ler ) {
		
		System.out.println("___________________________");
		System.err.println("Atenção!");
		System.out.println("Nome:"+pedido.getNomeCompleto());
		System.out.println("CPF:"+pedido.getCpf());
		System.out.println("Pedido:"+pedido.getNomePedido());
		System.out.println("Pedido Conferi? Digite 1 para (Sim) e 2 para (Não)");
		byte pedidoValidar1 = ler.nextByte();
		
		//Valida se pedido esta correto
		if(pedidoValidar1 == 1 ) {
			
			}else if(pedidoValidar1 == 2 ){
				
			System.err.println("Atenção!");
			System.out.println("Qual o erro? CPF[0], NOME[1] ou PEDIDO[2] ");
			byte validador = ler.nextByte();
			ler.nextLine();
			
				if(validador == 0) {
					setClienteCPF(pedido,ler);
					Confirmacao(pedido, ler);
					}else if(validador == 1) {
						setCliente(ler, pedido);
						Confirmacao(pedido, ler);
					}else if(validador == 2 ) {
						setPedido(pedido, ler, null);
						Confirmacao(pedido, ler);
					}else {
						System.err.println("Opção invalida, escolha uma opção valida!");
						Confirmacao(pedido, ler);
					}
			}
		}
	
}	
