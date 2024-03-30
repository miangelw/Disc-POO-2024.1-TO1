package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    
		    System.out.println("Digite o primeiro ângulo: ");
		    int angulo1 = sc.nextInt();
		    System.out.println("Digite o segundo ângulo: ");
		    int angulo2 = sc.nextInt();

		    int angulo3 = 180 - angulo1 - angulo2;

		    System.out.println("O terceiro ângulo é: " + angulo3);

	}

}
