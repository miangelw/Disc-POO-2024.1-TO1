package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o salário atual do funcionário: ");
		double sal = sc.nextDouble();
		double novosal = sal + sal*25/100;
		System.out.println("O novo salário com o aumento de 25% é " + novosal);
	}

}
