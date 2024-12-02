package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		int vet1[] = new int[10];
		int vet2[] = new int[10];
		int vet3[] = new int[20];
		int j;
		j = 1;
		for (int i = 1; i<=10; i++) {
			System.out.println("Me dê o primeiro vetor: ");
			vet1[i] = ia.nextInt();
			vet3[j] = vet1[i];
			j = j + 1;
			System.out.println("Me dê o segundo vetor: ");
			vet2[i] = ia.nextInt();
			vet3[j] = vet2[i];
			j = j+1;
		}
		for (int i = 1; i <= 20; i++) {
			System.out.print("(" + vet3[i] + ") ");
			
		}
		
		
	}

}
