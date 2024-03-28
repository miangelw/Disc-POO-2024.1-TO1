package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int ano_atual = 2024;
	int ano_nascimento = 0;
	
	
	System.out.println("Digite seu ano de nascimento: ");
    ano_nascimento = sc.nextInt();
	
    int idade_atual = ano_atual - ano_nascimento;
    int idade_2050 = idade_atual + (2050 - ano_atual);
	
	System.out.println("Sua idade no fim de " + ano_atual + " será " + idade_atual + " anos, e sua idade em 2050 será " + idade_2050 + " anos.");
	
	}
}