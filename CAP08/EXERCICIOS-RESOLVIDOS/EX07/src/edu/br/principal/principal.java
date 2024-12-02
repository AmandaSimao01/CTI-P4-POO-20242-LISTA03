package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int linhas = 5, colunas = 7;
        double[][] mat = new double[linhas][colunas];
        int cont = 0;

        System.out.println("Digite os elementos da matriz (5x7):");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                mat[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < linhas; i++) {
            double menor = mat[i][0];
            int colunaMenor = 0;
            for (int j = 1; j < colunas; j++) {
                if (mat[i][j] < menor) {
                    menor = mat[i][j];
                    colunaMenor = j;
                }
            }

            double maior = mat[0][colunaMenor];
            for (int k = 1; k < linhas; k++) {
                if (mat[k][colunaMenor] > maior) {
                    maior = mat[k][colunaMenor];
                }
            }

            if (menor == maior) {
                System.out.println("Ponto de sela = " + maior + " na posição (" + (i + 1) + ", " + (colunaMenor + 1) + ")");
                cont++;
            }
        }

        if (cont == 0) {
            System.out.println("Não existe ponto de sela nesta matriz.");
        }

        sc.close();
    }

	}


