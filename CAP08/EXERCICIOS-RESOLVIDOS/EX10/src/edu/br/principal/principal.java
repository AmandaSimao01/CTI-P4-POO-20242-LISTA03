package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 double[][] mat = new double[10][10];
	        double aux;

	        System.out.println("Digite os elementos da matriz (10x10):");
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
	                mat[i][j] = sc.nextDouble();
	            }
	        }

	        for (int i = 0; i < 10; i++) {
	            aux = mat[1][i];
	            mat[1][i] = mat[7][i];
	            mat[7][i] = aux;
	        }

	        for (int i = 0; i < 10; i++) {
	            aux = mat[i][3];
	            mat[i][3] = mat[i][9];
	            mat[i][9] = aux;
	        }

	        int j = 9;
	        for (int i = 0; i < 10; i++) {
	            aux = mat[i][i];
	            mat[i][i] = mat[i][j];
	            mat[i][j] = aux;
	            j--;
	        }

	        for (int i = 0; i < 10; i++) {
	            aux = mat[4][i];
	            mat[4][i] = mat[i][9];
	            mat[i][9] = aux;
	        }

	        for (int i = 0; i < 10; i++) {
	            for (int j2 = 0; j2 < 10; j2++) {
	                System.out.print(mat[i][j2] + "\t");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	
	}


