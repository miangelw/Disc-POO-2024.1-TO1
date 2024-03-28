package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double horasTrab = 0;
		double vlrSalMin  = 0;
		double vlrHoraTrab = 0;
		double vlrSalBru = 0;
		double imp = 0;
		double vlrSalLiq = 0;
			
		System.out.println("Digite o valor de horas trabalhadas: ");
		horasTrab = sc.nextDouble();
		System.out.println("Digite o valor do salário mínimo: ");
		vlrSalMin = sc.nextDouble();
		
		vlrHoraTrab = vlrSalMin/2;
		vlrSalBru = vlrHoraTrab * horasTrab;
		imp = vlrSalBru*3/100;
		vlrSalLiq = vlrSalBru - imp;
		
		System.out.println("O salário a receber é de R$"+vlrSalBru);
		
	}

}
