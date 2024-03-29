package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pesoKg = 0;
		
		System.out.println("Digite o peso em Kg: ");
		pesoKg = sc.nextDouble();
		
		double pesog = (pesoKg * 1000);
		System.out.println("O peso em gramas é:  " +pesog);
	
	}

}
