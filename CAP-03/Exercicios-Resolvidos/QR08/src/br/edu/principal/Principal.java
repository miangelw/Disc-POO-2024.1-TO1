package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double dep = 0;
		double taxa = 0; 
		double rend = 0;
		double total = 0;
		
		System.out.println("Digite o valor do depósito: ");
		dep = sc.nextDouble();
		
		System.out.println("Digite o valor da taxa de juros: ");
		taxa = sc.nextDouble();
		
		rend = dep*taxa/100;
		total = dep+rend;
		
		System.out.println("O valor do rendimento foi de R$" + rend);
		System.out.println("O valor total é de R$" + total);
	}

}
