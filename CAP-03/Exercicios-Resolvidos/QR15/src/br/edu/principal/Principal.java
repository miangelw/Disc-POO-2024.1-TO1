package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem-vindo, esse programa calcula o preço final de um carro.");
		
		double p_fab = 0;
		double perc_d = 0;
		double perc_i = 0;
		double vlr_d = 0;
		double vlr_i = 0;
		double p_final = 0;
		
		System.out.println("Digite o valor do preço de fábrica: ");
		p_fab = sc.nextDouble();
		System.out.println("Digite o percentual de lucro do distribuidor: ");
		perc_d = sc.nextDouble();
		System.out.println("Digite o percentual de impostos: ");
		perc_i = sc.nextDouble();
		
		vlr_d = p_fab*perc_d/100;
		vlr_i = p_fab*perc_i/100;
		p_final = p_fab+vlr_d+vlr_i;
		
		System.out.println("O valor correspondente ao lucro do distribuidor é de: "+vlr_d);
		System.out.println("O valor correspondente aos impostos é de: "+vlr_i);
		System.out.println("O valor correspondente ao preço final do carro é: "+p_final);
	}

}
