package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] gabarito = new char[8];
		char[] resposta = new char[8];
		int num, pontos, tot_ap, perc_ap;
		
		for(int i = 1; i < 10; i++) {
			System.out.println("Digite a resposta da questão " + i  + ":");
			gabarito[i] = sc.next().charAt(0);
		}
		tot_ap = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o número do: " + i + "° aluno");
			num = sc.nextInt();
			pontos = 0;
			for(int j = 1; j < 8; j++) {
				System.out.println("Digite a resposta dada pelo aluno: " + num + "á questão" + j );
				resposta[j] = sc.next().charAt(0);
				if (resposta[j] == gabarito[j]) {
					pontos = pontos + 1;
				}
			}
			System.out.println("A nota do aluno" + num  + "foi de" + pontos);
			if (pontos >= 6) {
				tot_ap = tot_ap + 1;
			}
		}
		perc_ap = tot_ap * 100 / 10;
		System.out.println("O percentual dos alunos aprovados é de: " + perc_ap);

	}

}
