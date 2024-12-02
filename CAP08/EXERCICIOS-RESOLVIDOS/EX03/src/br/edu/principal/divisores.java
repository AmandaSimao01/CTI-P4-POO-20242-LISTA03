package br.edu.principal;

public class divisores {
	
	public static int divisores(int a, int b, int c) {
		int  i = 0, s = 0, r;
		
		for(i = b; i <= c; i++) {
			r = i % a;
			if (r == 0 ) {
				s = s + i;
			}
		}
		return s;
	}
}


