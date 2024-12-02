package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		 double[][] mat = new double[2][2];
	        double[][] resultado = new double[2][2];
	        double maior;

	        Scanner sc = new Scanner(System.in);

	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print("Digite o valor para mat[" + (i + 1) + "][" + (j + 1) + "]: ");
	                mat[i][j] = sc.nextDouble();
	            }
	        }

	        maior = mat[0][0];
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                if (mat[i][j] > maior) {
	                    maior = mat[i][j];
	                }
	            }
	        }

	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                resultado[i][j] = maior * mat[i][j];
	            }
	        }

	        System.out.println("Matriz resultado:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(resultado[i][j] + " ");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	
	}


