package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salarioMinimo = 0;
		double salarioUser = 0;
		
		System.out.println("Digite o valor do salário mínimo: ");
		salarioMinimo = sc.nextDouble();
		System.out.println("Digite o valor do salário do funcionário: ");
		salarioUser = sc.nextDouble();
		
		double calculoSalarioMinimo = (salarioUser/salarioMinimo);
		System.out.println("A quantidade de salários mínimos que o funcionário recebe é: "+calculoSalarioMinimo);
		
	}

}
