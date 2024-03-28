package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double hora = 0;
		double h = 0;
		double m = 0;
		int conversao = 0;
		
		System.out.println("Digite o horário no formato hh,mm.");
		hora = sc.nextDouble();
		h = (int) hora;
		System.out.println(h);
		m = hora - h;
		conversao = (int) ((h*60) + (m*100));
		System.out.println(hora+" horas em minutos são "+conversao+" minutos.");
	}

}
