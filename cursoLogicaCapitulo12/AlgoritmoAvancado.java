package cursoLogicaCapitulo12;

public class AlgoritmoAvancado {

	public static void main(String[] args) {
		ListaAlunos listaAlunos = new ListaAlunos();
		
		Aluno aluno0 = new Aluno();
		aluno0.nome = "Anderson";
		listaAlunos.adicionar(aluno0);
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Cleiton";
		listaAlunos.adicionar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Jesus";
		listaAlunos.adicionar(aluno2);

		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Silva";
		listaAlunos.adicionar(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.nome = "Telma";
		listaAlunos.adicionar(aluno4);
		
			
				iterar(listaAlunos);
					
				listaAlunos.remover(aluno2);
		
				iterar(listaAlunos);
								
				listaAlunos.ordenar();
			}
		
		static void iterar(ListaAlunos listaAlunos) {
			
			for (int j = 0; j < listaAlunos.tamanho(); j ++) {
				
				Aluno a1 = listaAlunos.obter(j);
				if(a1 != null) {
				System.out.println("Aluno: " + a1.nome );
				}else {
					System.out.println("Aluno sem nome");
				}
				
		}
			System.out.println("______________________________");
	}
}
