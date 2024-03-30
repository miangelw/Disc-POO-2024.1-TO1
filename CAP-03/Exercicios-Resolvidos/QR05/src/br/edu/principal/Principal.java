package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o salário do funcionário?");
		double salario = sc.nextDouble();
		
		System.out.println("Qual o percentual de aumento do salário do funcionário?");
		double percentual = sc.nextDouble();
		
		double novoSalario = salario + (salario * percentual/100);
		
		System.out.println("O salário do funcionário passará a ser " + novoSalario + " após o reajuste.");
		
	}

}
