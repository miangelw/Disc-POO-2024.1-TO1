package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem-vindo, este programa calcula o salário de um funcionário com uma gratificação de R$50 e com os impostos abatidos.");
		double sal = 0;
		double salReceber = 0;
		double imp = 0;
		
		System.out.println("Digite o valor do salário do funcionário");
		sal = sc.nextDouble();
		imp = ((sal/100)*10);
		salReceber = sal + 50 - imp;
		
		System.out.println("O salário que o funcionário deve receber é: R$"+salReceber);
	}

}
