package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("Digite o número inteiro para saber a tabuada");
		number = sc.nextInt();
		for (int x = 1; x < 11; x++) {
			System.out.println(number+"x"+x+"="+(number*x));
		}
	}

}
