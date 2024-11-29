package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int[] num = new int[8];
        int[] pos = new int[8];
        int[] neg = new int[8];
        int cont, cont_n, cont_p;
        cont_n = 1;
        cont_p = 1;
        
    
        for(int i = 1; i < 8; i++) {
        	System.out.println("Digite o número da posição " + (i) + ":");
            num[i] = sc.nextInt();
        	if (num[i] >= 0) {
        		pos[cont_p] = num[i];
        		cont_p = cont_p + 1;
        	}
        	else {
        		neg[cont_n] = num[i];
        		cont_n = cont_n + 1;
        	}
        }
        if (cont_n == 1) {
        	System.out.println("Vetor de negativos vazio");
        }
        else {
        	for(int i = 0; i < cont_n - 1; i++) {
        		System.out.println("Número negativo: " + neg[i]);
        	}
        }
        if (cont_p == 1) {
        	System.out.println("Vetor de positivos vazio");
        }
        else {
        	for(int i = 0; i < cont_p - 1; i++) {
        		System.out.println("Número positivo: " + pos[i]);
        	}
        }
		

	}

}
