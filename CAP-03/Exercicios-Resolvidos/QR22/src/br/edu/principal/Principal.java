package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do salário mínimo?");
		double sal_min = sc.nextDouble();
		
		double vlr_kw = sal_min/5;
		
		System.out.println("Quantos quilowatts são consumidos em sua residência?");
		double qtd_kw = sc.nextDouble();
		
		double vlr_reais = vlr_kw * qtd_kw;
		
		double vlr_desc = vlr_reais * 85/100;
		
		System.out.println("O valor do quilowatt é de " + vlr_kw + " reais.");
		System.out.println("O valor a ser pago pela residência é de " + vlr_reais + " reais.");
		System.out.println("O valor a ser pago pela residência com o desconto é de " + vlr_desc + " reais.");
		
		

	}

}
