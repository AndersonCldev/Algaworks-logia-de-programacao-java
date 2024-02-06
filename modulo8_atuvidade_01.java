import java.util.Scanner;
public class modulo8_atuvidade_01 {
	public static void main(String[] args) {
		
		
						criarTracos();
		String []cursos = {"Java EE ", " Spring Boot"," Java do 0 ao Avançado ",};
		Scanner ler = new Scanner(System.in);
		
			for(int i = 0; i < cursos.length; i ++) {
				System.out.println("[" + i+ "]" + cursos[i]);
			}
						criarTracos();
						
			
			System.out.print("Escolha o curso, baseado pela númeração:");
			System.out.println();		
			Integer cursoEscolhido = ler.nextInt();
			
			boolean escolhInvalida = true;
			
			
			
			for(int i = 0; i < cursos.length; i ++) {
				
				if (cursoEscolhido.equals(cursos[i])) {
					escolhInvalida = false;
					break;
				}
			}
			
			if(cursoEscolhido >3) {
				System.err.println("Escolha invalida");
				System.exit(1);
			}
			
						criarTracos();
						
			System.out.println("O curso escolhido foi " +cursos[cursoEscolhido] + ".");
			
					
			
	}
		
						static void criarTracos() {
						System.out.println("-----------------------------------");
						}	
}
