package br.edu.principal;

public class multiplicacao {
	
	public static void multiplicacao(int num) {
		int i, j;
		for(i = 1; i <= num; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
		
	}
	

}
