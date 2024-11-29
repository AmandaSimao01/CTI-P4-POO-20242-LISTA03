package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int[] vet = new int[8];
        int i, j, z = 0, aux;
        i = 1;
        
        while (i < 8) {
        	System.out.println("Digite um número:");
            aux = sc.nextInt();
            j = 1;
            while (j < i && vet[j] < aux) {
            	j = j + 1;
            }
            z = i;
            while (z >= j+1) {
            	vet[z] = vet[z - 1];
            	z = z - 1;
            }
        vet[j] = aux;
        i = i + 1;
        }
        for(int l = 1; l < 8; l++) {
        	System.out.println(vet[l]);
        }

	}

}
