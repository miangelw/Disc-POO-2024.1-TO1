package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a medida altura do triângulo?");
		double altura = sc.nextDouble();

		System.out.println("Qual a medida da base do triângulo?");
		double base = sc.nextDouble();
		
		double area = (altura * base)/2;
		
		System.out.println("A área do triângulo é: " + area + ".");
		
	}

}
