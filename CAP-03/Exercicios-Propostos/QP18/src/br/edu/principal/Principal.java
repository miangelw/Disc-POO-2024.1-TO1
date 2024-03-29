package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();
        
        double fahrenheit = (celsius * 9 / 5) + 32;
        
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        
	}

}
