package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		int voo[] = new int[12];
		int lugares[] = new int[12];
		char origem[] = new char[12];
		char destino[] = new char[12];
		int i, op,op2, num_voo;
		char local;
		for (i=1; i < 12; i++) {
			System.out.println("Me dê o número do voo: ");
			voo[i] = ia.nextInt();
			System.out.println("Me dê a origem: ");
			origem[i] = ia.next().charAt(i);
			System.out.println("Me dê o números dos lugares: ");
			lugares[i] = ia.nextInt();
		}
		System.out.println("1-Consultar.");
		System.out.println("2-Reservar.");
		System.out.println("3- Finalizar.");
		System.out.println("Digite sua opção: ");
		op = ia.nextInt();
		if (op == 1) {
			System.out.println("1-Consultar por voo.");
			System.out.print("2-Consultar por origem.");
			System.out.println("3-Consultar por destino. ");
			op2 = ia.nextInt();
			
			
			if (op2 == 1) {
				System.out.println("Digite o número do voo: ");
				num_voo = ia.nextInt();
				i = 1;
				while ( i<= 12 && voo[i] != num_voo) {
					i = i + 1;
				}
				if (i>12) {
					System.out.println("Voo inexistente!");
				}
				else {
					System.out.println("Número do voo: " + voo[i]);
					System.out.println("Local de origem:" + origem[i]);
					System.out.println("Local de destino: " + destino[i]);
					System.out.println("Lugarem disponíveis: " + lugares[i]);
				}
			}
			
			
			if (op2 == 2) {
				System.out.println("Digite o local de origem: ");
				local = ia.next().charAt(i);
				i = 1;
				for ( i=1;i<12;i++ ) {
					if (local==origem[i]) {
						System.out.println("Número do voo: " + voo[i]);
						System.out.println("Local de origem:" + origem[i]);
						System.out.println("Local de destino: " + destino[i]);
						System.out.println("Lugarem disponíveis: " + lugares[i]);
					}
				}
			}
			if (op2 == 3) {
				System.out.println("Digite o local de destino: ");
				local = ia.next().charAt(i);
				for (i=1; i<12;i++) {
					if(local==destino[i]) {
						System.out.println("Número do voo: " + voo[i]);
						System.out.println("Local de origem:" + origem[i]);
						System.out.println("Local de destino: " + destino[i]);
						System.out.println("Lugarem disponíveis: " + lugares[i]);
					}
				}
			}
			
		}
		if (op ==2) {
			System.out.println("Digite o número do voo desejado: ");
			num_voo = ia.nextInt();
			i = 1;
			while (i<12 && voo[i] != num_voo) {
				i = i++;
			}
			if (i>12) {
				System.out.println("Número de voo não encontrado!");
			}
			else {
				if (lugares[i] ==0) {
					System.out.println("Voo lotado.");
				}
				else {
					lugares[i] = lugares[i] - 1;
					System.out.println("Reserva Confirmada!");
				}
				
		}
		
		}
		if (op==3) {
			System.out.println("Fim!");
		}
		
	}

	}

