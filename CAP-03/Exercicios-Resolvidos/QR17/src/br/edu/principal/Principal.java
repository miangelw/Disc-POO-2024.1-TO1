package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double saldo = 0;
		
		System.out.println("Digite o seu salário: ");
		double salario = sc.nextDouble();
		
		System.out.println("Digite o valor do primeiro cheque: ");
		double cheque1 = sc.nextDouble();
		
		System.out.println("Digite o valor do segundo cheque: ");
		double cheque2 = sc.nextDouble();
		
		double cpmf1 = cheque1 * 0.38;
		double cpmf2 = cheque1 * 0.38;
		
		saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;
		
		System.out.println("Seu saldo agora é de: " + saldo);
		
		

	}

}
