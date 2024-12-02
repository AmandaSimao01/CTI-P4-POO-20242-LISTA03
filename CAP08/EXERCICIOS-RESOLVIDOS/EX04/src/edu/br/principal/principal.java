package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		 int[][] mat = new int[10][20];
	        int[] soma = new int[10];
	        int i, j;

	        Scanner sc = new Scanner(System.in);

	        for (i = 0; i < 10; i++) {
	            for (j = 0; j < 20; j++) {
	                mat[i][j] = sc.nextInt();
	            }
	        }

	        for (i = 0; i < 10; i++) {
	            soma[i] = 0;
	            for (j = 0; j < 20; j++) {
	                soma[i] += mat[i][j];
	            }
	        }

	        for (i = 0; i < 10; i++) {
	            for (j = 0; j < 20; j++) {
	                mat[i][j] *= soma[i];
	            }
	        }

	        for (i = 0; i < 10; i++) {
	            for (j = 0; j < 20; j++) {
	                System.out.print(mat[i][j] + " ");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	
	}


