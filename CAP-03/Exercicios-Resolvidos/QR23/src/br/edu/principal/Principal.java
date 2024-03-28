package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = 0;
		int i = 0;
		double f = 0;
		double a = 0;
		
		System.out.println("Digite o número desejado");
		num = sc.nextDouble();
		
		i = (int)num;
		f = num - i;
		a = Math.ceil(num);
		
		System.out.println("A parte inteira de "+num+" é: "+i);
		System.out.println("A parte fracionária de "+num+" é: "+f);
		System.out.println(num+" arredondado é: "+i);
	}

}
