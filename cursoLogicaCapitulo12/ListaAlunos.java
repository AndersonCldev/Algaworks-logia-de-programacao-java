package cursoLogicaCapitulo12;

	public class ListaAlunos {
		
		static final int QUANTIDADE_LISTA = 2;
		
		Aluno [] lista = new Aluno[QUANTIDADE_LISTA];
		
		int tamanhoLista = 0;
		
		Aluno obter(int indice) {
			return lista[indice];
		}
		 
		int tamanho() {
			return tamanhoLista;
		}
		
		
		void adicionar(Aluno aluno)  {
			
			//caso quantidade de alunos seja maior que o tamnho da lista criamos uma nova lista e iteramos os valores para a mesma.
			if( tamanhoLista == lista.length ) {
				Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA + lista.length];
				for (int i = 0 ; i < lista.length; i++) {
					novaLista[i] = lista[i];
				}
				
				lista = novaLista;
			}
			lista [tamanhoLista] = aluno;
			tamanhoLista ++;
		}
}
