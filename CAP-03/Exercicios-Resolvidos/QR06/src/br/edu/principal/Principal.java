package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double sal = 0;
		
		System.out.println("Digite seu salário: ");
		sal = sc.nextDouble();
		
		double grat = sal * 5/100;
		double imp = sal * 7/100;
		double salfinal = sal + grat - imp;
		
		System.out.println("Seu salário líquido é: "+ salfinal);

	}

}