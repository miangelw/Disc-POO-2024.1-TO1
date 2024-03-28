package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1 = 0f;
		float num2 = 0f;
		
		System.out.println("Digite o valor do primeiro número maior do que zero: ");
		num1 = sc.nextFloat();
		while(num1<=0) {
			System.out.println("Digite um número maior do que zero: ");
			num1 = sc.nextFloat();
		}
		System.out.println("Digite o valor do segundo número maior do que zero: ");
		num2 = sc.nextFloat();
		while(num2<=0) {
			System.out.println("Digite um número maior do que zero: ");
			num2 = sc.nextFloat();
		}
		float r1 = (float) Math.pow(num1, num2);
		float r2 = (float) Math.pow(num2, num1);
		System.out.println(num1 + " elevado a " + num2 + " é igual a "+r1);
		System.out.println(num2 + " elevado a " + num1 + " é igual a "+r2);
	}

}
