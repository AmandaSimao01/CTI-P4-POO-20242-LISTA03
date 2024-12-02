package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b, c, result;
		while (a <= 0) {
			System.out.println("Digite a:");
			a = sc.nextInt();
		}
		System.out.println("Digite b:");
		b = sc.nextInt();
		System.out.println("Digite c:");
		c = sc.nextInt();
		result = divisores.divisores(a, b, c);
		System.out.println("Somas dos inteiros: " + result);
		 

	}

}
