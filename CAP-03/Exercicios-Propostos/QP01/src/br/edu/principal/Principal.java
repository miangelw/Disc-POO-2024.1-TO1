package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		
		System.out.println("Digite o valor do primeiro número: ");
		num1 = sc.nextDouble();
		System.out.println("Digite o valor do segundo número: ");
		num2 = sc.nextDouble();
		
		double subtracaoResult = (num1 - num2);
		System.out.println("A substração do primeiro pelo segundo número é: "+subtracaoResult); 
		
	}

}
