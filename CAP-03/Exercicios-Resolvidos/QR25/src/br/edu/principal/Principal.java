package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá. Esse programa calcula o mínimo de convites vendidos para bater o custo de um espetáculo.");
		double custo = 0;
		double convite = 0;
		double qtd = 0;
		
		System.out.println("Digite o custo do espetáculo: ");
		custo = sc.nextDouble();
		System.out.println("Digite o valor do convite: ");
		convite = sc.nextDouble();
		
		qtd = custo / convite;
		System.out.println("A quantidade mínima de convites vendidos para bater o preço de custo é de "+qtd);
	}

}
