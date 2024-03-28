package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem-vindo, esse programa calcula quantos degraus subir em uma escada para chegar em determinada altura.");
		
		double a_degrau = 0;
		double a_usuario = 0;
		double qtd_degraus = 0;
		
		System.out.println("Digite o valor da altura do degrau");
		a_degrau = sc.nextDouble();
		System.out.println("Digite a altura do usuário");
		a_usuario = sc.nextDouble();
		
		qtd_degraus = a_usuario / a_degrau;
		int parteInteira = (int) qtd_degraus;
		System.out.println(parteInteira);
		
	}

}
