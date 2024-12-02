package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 double[] qtd = new double[10];
	        double[] preco = new double[10];
	        double tot_geral = 0, tot_vend, comissao, maior;
	        int i, ind;

	
	        for (i = 0; i < 10; i++) {
	            System.out.print("Digite a quantidade de item " + (i + 1) + ": ");
	            qtd[i] = sc.nextDouble();
	            System.out.print("Digite o preço do item " + (i + 1) + ": ");
	            preco[i] = sc.nextDouble();
	        }

	        for (i = 0; i < 10; i++) {
	            tot_vend = qtd[i] * preco[i];
	            System.out.println("Quantidade: " + qtd[i] + ", Preço: " + preco[i] + ", Total de Vendas: " + tot_vend);
	            tot_geral += tot_vend;
	        }

	        comissao = tot_geral * 5 / 100;
	        System.out.println("Total Geral: " + tot_geral + ", Comissão: " + comissao);

	        maior = qtd[0];
	        ind = 0;

	        for (i = 1; i < 10; i++) {
	            if (qtd[i] > maior) {
	                maior = qtd[i];
	                ind = i;
	            }
	        }

	        System.out.println("Preço do item com maior quantidade vendida: " + preco[ind] + ", Índice: " + (ind + 1));

	        sc.close();
	    }
	
		
	}


