package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double peso1 = 0;
		double peso2 = 0;
		double peso3 = 0;
		double media = 0;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite o peso da primeira nota: ");
		peso1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.println("Digite o peso da segunda nota: ");
		peso2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = sc.nextDouble();
		System.out.println("Digite o peso da terceira nota: ");
		peso3 = sc.nextDouble();
		
		media = ((nota1*peso1+nota2*peso2+nota3+peso3)/(peso1+peso2+peso3));
		
		System.out.println("A média das três notas é: "+media);
	}

}
