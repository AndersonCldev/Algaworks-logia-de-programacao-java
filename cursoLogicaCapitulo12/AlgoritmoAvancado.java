package cursoLogicaCapitulo12;

public class AlgoritmoAvancado {

	public static void main(String[] args) {
		ListaAlunos lista = new ListaAlunos();
		
		Aluno aluno = new Aluno();
		aluno.nome = "Anderson";
		lista.adicionar(aluno);
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Cleiton";
		lista.adicionar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Jesus";
		lista.adicionar(aluno2);

		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Silva";
		lista.adicionar(aluno3);
		
		
		for (int i = 0; i < lista.tamanho(); i ++) {
			Aluno a = lista.obter(i);
			System.out.println("Aluno: " + a.nome );
		}
	}

}
