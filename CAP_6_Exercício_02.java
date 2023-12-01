
public class CAP_6_Exercício_02 {
	public static void main(String[] args) {
		
		int i = 1;
		int [] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		while(i < vetor.length) {
			if(i %3 == 0) {
				System.out.println(i);
				i++;
			}
			
			i++;
		}
		
		
	}
}
