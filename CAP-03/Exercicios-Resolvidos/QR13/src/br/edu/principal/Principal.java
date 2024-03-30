package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a medida em pés?");
		double pes = sc.nextDouble();
		
		double polegadas = pes * 12;
		double jardas = pes/3;
		double milhas = jardas/1760;
		
		System.out.printf(pes + " pés em polegadas equivalem a: %.2f %n", polegadas);
		System.out.printf(pes + " pés em jardas equivalem a: %.2f %n", jardas);
		System.out.printf(pes + " pés em milhas equivalem a: %.5f %n", milhas);

	}

}
