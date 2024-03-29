package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double cateto1 = 0;
		double cateto2 = 0;
		System.out.println("Digite o valor do cateto 1: ");
	    cateto1 = sc.nextDouble();
	     
	    System.out.println("Digite o valor do cateto 2: ");
	    cateto2 = sc.nextDouble();
	    double calculoHipotenusa = (Math.pow(cateto1, 2)) + (Math.pow(cateto2, 2));
	    System.out.println(calculoHipotenusa);
	    double hipotenusa = Math.sqrt(calculoHipotenusa);
	     
	    System.out.println("O valor da hipotenusa é: " + hipotenusa);
	}

}
