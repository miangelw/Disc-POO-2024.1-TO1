package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double ang = 0;
		double alt = 0;
		double escada = 0;
		double radiano = 0;
		
		System.out.println("Digite o valor do ângulo formado entre a escada e o chão: ");
		ang = sc.nextDouble();
		System.out.println("Digite o valor da altura da parede onde a ponta da escada encosta: ");
		alt = sc.nextDouble();
		
		radiano = ang*3.14/180;
		escada = alt/Math.sin(radiano);
		
		System.out.println("O comprimento da escada é "+new DecimalFormat(".##").format(escada)+"m");
		
	}

}
