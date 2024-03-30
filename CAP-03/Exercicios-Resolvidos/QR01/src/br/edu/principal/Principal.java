package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o primeiro número?");
		double num1 = sc.nextDouble();
		
		System.out.println("Qual o segundo número?");
		double num2 = sc.nextDouble();
		
		System.out.println("Qual o terceiro número?");
		double num3 = sc.nextDouble();
		
		System.out.println("Qual o quarto número?");
		double num4 = sc.nextDouble();
		
		double soma = num1 + num2 + num3 + num4;
		
		System.out.println("A soma dos números é: "+ soma + "."  );
		
		

	}

}
