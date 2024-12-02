package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      double[] X = new double[5];
	        double[] Y = new double[5];
	        double[] R = new double[10];
	        int i, j, z, aux;
	        

	        for (i = 0; i < 5; i++) {
	            System.out.print("Digite o valor de X[" + (i + 1) + "]: ");
	            X[i] = sc.nextDouble();
	        }

	        for (i = 0; i < 5; i++) {
	            for (j = 0; j < 4; j++) {
	                if (X[j] > X[j + 1]) {
	                    aux = (int) X[j];
	                    X[j] = X[j + 1];
	                    X[j + 1] = aux;
	                }
	            }
	        }

	        for (i = 0; i < 5; i++) {
	            System.out.print("Digite o valor de Y[" + (i + 1) + "]: ");
	            Y[i] = sc.nextDouble();
	        }

	        for (i = 0; i < 5; i++) {
	            for (j = 0; j < 4; j++) {
	                if (Y[j] > Y[j + 1]) {
	                    aux = (int) Y[j];
	                    Y[j] = Y[j + 1];
	                    Y[j + 1] = aux;
	                }
	            }
	        }

	        j = 0;
	        for (i = 0; i < 5; i++) {
	            R[j] = X[i];
	            j++;
	            R[j] = Y[i];
	            j++;
	        }

	        for (i = 0; i < 10; i++) {
	            for (j = 0; j < 9; j++) {
	                if (R[j] > R[j + 1]) {
	                    aux = (int) R[j];
	                    R[j] = R[j + 1];
	                    R[j + 1] = aux;
	                }
	            }
	        }

	        for (i = 0; i < 5; i++) {
	            System.out.println("X[" + (i + 1) + "] = " + X[i]);
	        }

	        for (i = 0; i < 5; i++) {
	            System.out.println("Y[" + (i + 1) + "] = " + Y[i]);
	        }

	        for (i = 0; i < 10; i++) {
	            System.out.println("R[" + (i + 1) + "] = " + R[i]);
	        }

	        sc.close();
	    }
	
	}


