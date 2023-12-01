
public class Exercicio_01_6_3 {
	public static void main(String[] args) {
		
//		Dada a lista de números abaixo:
//		1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20.
//		... Itere por essa lista e imprima todos os números que são divisíveis por 3.
		
		int [] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		for(int i = 1; i< vetor.length; i++) {
			if(i % 3 == 0 ) {
				System.out.println("Numeros multiplos de 3: " + i);
			}
		}

	}
}
