package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		
		System.out.println("Digite o valor do primeiro número: ");
		num1 = sc.nextDouble();
		System.out.println("Digite o valor do segundo número: ");
		num2 = sc.nextDouble();
		System.out.println("Digite o valor do terceiro número: ");
		num3 = sc.nextDouble();
		
		double multiplicacaoResult = (num1*num2*num3);
		System.out.println("A multiplicação dos números é: "+multiplicacaoResult);
		
	}

}
