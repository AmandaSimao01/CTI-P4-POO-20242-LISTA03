package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		int mat1[][] = new int[6][4];
		int mat2[][] = new int[6][4];
		int i, j, qtd;
		for (i=1;i<6;i++) {
			for (j=1;j<4;j++) {
				System.out.println("Me dê a primeira matriz: ");
				mat1[i][j] = ia.nextInt();
			}
		}
		qtd = 0;
		for ( i = 1; i < 6; i++) {
			for (j= 1; j <4; j++) {
				if (mat1[i][j] > 30) {
					qtd = qtd + 1;
					
				}
			}
		}
		for (i = 1; i<6; i++) {
			for (j=1;j<4;j++) {
				if (mat1[i][j] == 30) {
					mat2[i][j] = 0;
				}
				else {
					mat2[i][j] = mat1[i][j];
				}
			}
		}
		System.out.println("Quantidade de elementos: " + qtd);
		for (i=1;i<6;i++) {
			for (j=1;j<4;j++) {
				System.out.println(mat2[i][j]);
			}
		}

	}

}
