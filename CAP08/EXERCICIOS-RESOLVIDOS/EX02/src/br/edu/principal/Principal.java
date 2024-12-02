package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner (System.in);
		int notas[][] = new int[10][3];
		int q1,q2,q3,menor,pmenor,i,j;
		for (i = 1; i < 10; i++) {
			for (j = 1; j < 3; j++) {
				System.out.println("Me dê as notas: ");
				notas[i][j] = ia.nextInt();
			}
		}
		q1 = 0;
		q2 = 0;
		q3 = 0;
		for (i=1;i< 11;i++) {
			System.out.println(i);
			menor = notas[i][1];
			pmenor = 1;
			for (j=1;j<4;j++) {
				if (notas[i][j] < menor) {
					menor = notas[i][j];
					pmenor = j;
				}
			}
			System.out.println(pmenor);
			if (pmenor == 1) {
				q1 = q1 +1;
			}
			if (pmenor == 2) {
				q2 = q2 +1;
			}
			if (pmenor == 3) {
				q3 = q3 + 1;
			}
		}
	System.out.println(q1 + q2 + q3);	
	}

}
