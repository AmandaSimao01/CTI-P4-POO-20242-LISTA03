package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, salariofinal, imposto;
		System.out.println("Digite o salário base: ");
		salario = sc.nextDouble();
		imposto = salario * 10/100;
		salariofinal = salario + 50 - imposto;
		System.out.println("O salário final será de " + salariofinal);

	}

}
