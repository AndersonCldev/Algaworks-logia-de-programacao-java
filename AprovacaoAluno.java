package exercício03PgAprovaçãoDoAluno;
import java.util.Scanner; 
public class AprovacaoAluno {
	public static void main(String[] args) {
		
		String NameAluno = "";
		double[] NotasAluno = new double [3]; 
		Scanner ler = new Scanner(System.in);
		
			System.out.print("Olá seja Bem-vindo, qual o nome do aluno? ");
			NameAluno = ler.nextLine();
			
			System.out.println("Proto para amarzenar notas do aluno " + NameAluno);
			
			System.out.print("Agora nos diga qual a nota do aluno na 1° Unidade: ");
			NotasAluno[0] = ler.nextDouble(); 
			
			System.out.print("Digite a  nota da 2° Unidade: ");
			NotasAluno[1] = ler.nextDouble();
			
			System.out.print("Digite a  nota da 3° Unidade: ");
			NotasAluno[2] = ler.nextDouble();
			
			// Abaixo fazemos soma de todas as posições do vetor "NotasAluno" e dividimos por 2.
		
			double NotaFinal = (NotasAluno[0] + NotasAluno[1] + NotasAluno [2] ) /2 ;
			boolean  aprovado =  NotaFinal >=7; 
				if(aprovado) {
					System.out.println("Aluno esta aprovado, média final:  " + NotaFinal);
				}else {
					System.out.println("Aluno reprovado média final: " + NotaFinal);
				 }
							
		
	}
}
