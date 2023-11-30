import java.util.Scanner;
public class ExercicioDescontodefreteComprasAcima100 {
 public static void main(String[] args) {
	//Crie um programa que receba o valor de um produto e exiba o valor final da compra. 
	 //Esse valor final será o valor do produto mais o valor do frete - use o valor do frete como R$15,00. 
	 //Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00.
	 //Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.
	 
	 while(true) {
		 Double ValorProduto = null;
		 Double vlProdutoFinal =  null;
		 int QuandidadeProduto = 1;
		 Double frete = 15.00;
		 Scanner ler = new Scanner(System.in);
		 	
		 System.out.print("Olá, digite o valor do produto: ");
		 ValorProduto = ler.nextDouble();
		 System.out.print("Digite a quantidade do produto: ");
		 QuandidadeProduto  = ler.nextInt();
	 
	 
	 
		 vlProdutoFinal=  QuandidadeProduto * ValorProduto + 15;
		 if(vlProdutoFinal >=100) {
			 System.out.println("VAlOR DA COMPRA: R$" + vlProdutoFinal + 15.00 );
			 System.out.println("VALOR FINAL: R$"  + vlProdutoFinal + "  RECEBEU DESCONTO DE R$15,00 DO FRETE");
		 } else {
		
			 System.out.println("Valor Total: R$" +vlProdutoFinal + " NÃO ELEGIVEU  AO DESONTO, COMPRA NÃO ATINGIU R$100,00.");
		 }
	 
		 	System.out.print("Deseja sair? Digite 0 para sair ou qualquer outro número para continuar: ");
	
		 Integer Reininciar = ler.nextInt();
		 if(Reininciar == 0){
                        break; // Sair do loop se o usuário quiser sair.
	 
	 
			}
	 	}
 	}
}
