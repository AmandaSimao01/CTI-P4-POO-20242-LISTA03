package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while(num < 1 || num > 9) {
			System.out.println("Digite um número entre 1 e 9:");
			num = sc.nextInt();
		}
		multiplicacao.multiplicacao(num);
	}

}
