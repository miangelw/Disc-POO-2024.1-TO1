package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o peso do saco de ração em kg?");
		double peso_saco = sc.nextDouble();
		
		System.out.println("Qual a quantidade de ração que o gato 1 come por dia, em gramas?");
		double racao_gato1g = sc.nextDouble();
		
		System.out.println("Qual a quantidade de ração que o gato 2 come por dia, em gramas?");
		double racao_gato2g = sc.nextDouble();
		
		double racao_gato1kg = racao_gato1g/1000;
		double racao_gato2kg = racao_gato2g/1000;
		double total_final = peso_saco - 5*(racao_gato1kg + racao_gato2kg);
		
		System.out.println("A quantidade de ração que restará no saco após 5 dias será de "+ total_final + "kg.");
		
		

	}

}
