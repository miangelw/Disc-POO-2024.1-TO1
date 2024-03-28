package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Esse programa calcula o quadrado, o cubo, a raiz quadrada e a raiz cúbica de um número digitado.");
		
		double num = 0;
		double quad = 0;
		double cubo = 0; 
		double r2 = 0;
		double r3 = 0;
		
		while (num<=0) {
		System.out.println("Digite um número positivo e maior que zero");
		num = sc.nextDouble();
		}
		
		quad = Math.pow(num, 2);
		cubo = Math.pow(num, 3);
		r2 = Math.pow(num, 1/2);
		r3 = Math.pow(num, 1/3);
		
		System.out.println(num+"ao quadrado é: "+quad+", ao cubo é: "+cubo+", a raiz quadrada é: "+r2+", a raiz cúbica é: "+r3+".");
	}

}
