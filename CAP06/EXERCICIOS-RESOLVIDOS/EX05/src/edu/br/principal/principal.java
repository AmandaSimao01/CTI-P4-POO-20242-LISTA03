package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 double[] X = new double[10];
	        double[] Y = new double[10];
	        double[] U = new double[20];
	        double[] D = new double[10];
	        double[] S = new double[10];
	        double[] P = new double[10];
	        double[] IT = new double[10];
	        
	        int i, j, cont_u, cont_d, cont_i;
	        
	        cont_u = 1;
	        cont_d = 1;
	        cont_i = 1;
	        

	        for (i = 0; i < 10; i++) {
	            System.out.print("Digite o valor de X[" + (i + 1) + "]: ");
	            X[i] = sc.nextDouble();
	            System.out.print("Digite o valor de Y[" + (i + 1) + "]: ");
	            Y[i] = sc.nextDouble();
	        }

	        for (i = 0; i < 10; i++) {
	            j = 0;
	            while (j < cont_u && X[i] != U[j]) {
	                j++;
	            }
	            if (j >= cont_u) {
	                U[cont_u] = X[i];
	                cont_u++;
	            }
	        }

	        for (i = 0; i < 10; i++) {
	            j = 0;
	            while (j < cont_u && Y[i] != U[j]) {
	                j++;
	            }
	            if (j >= cont_u) {
	                U[cont_u] = Y[i];
	                cont_u++;
	            }
	        }

	        System.out.println("Os valores únicos de U são:");
	        for (i = 1; i < cont_u; i++) {
	            System.out.println("U[" + i + "] = " + U[i]);
	        }

	        sc.close();
	    }
	}