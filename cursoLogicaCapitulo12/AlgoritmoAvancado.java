package cursoLogicaCapitulo12;

public class AlgoritmoAvancado {

	public static void main(String[] args) {
		ListaAlunos lista = new ListaAlunos();
		
		Aluno aluno0 = new Aluno();
		aluno0.nome = "Anderson";
		lista.adicionar(aluno0);
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Cleiton";
		lista.adicionar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Jesus";
		lista.adicionar(aluno2);

		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Silva";
		lista.adicionar(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.nome = "Telma";
		lista.adicionar(aluno4);
		
		
		for (int i = 0; i < lista.tamanho(); i ++) {
			
			Aluno a = lista.obter(i);
			if(a != null) {
				System.out.println("Aluno: " + a.nome );
			}else {
				System.out.println("Aluno sem nome");
			}
		
		
		System.out.println("______________________________");
		
				lista.remover(aluno2);
		
				for (int j = 0; j < lista.tamanho(); j ++) {
					
					Aluno a1 = lista.obter(j);
					if(a1 != null) {
					System.out.println("Aluno: " + a1.nome );
					}else {
						System.out.println("Aluno sem nome");
					}
				}
			}

	}
}
