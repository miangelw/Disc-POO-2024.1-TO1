package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a medida do ângulo formado entre a escada e o chão?");
		double angulo = sc.nextDouble();
		
		System.out.println("Qual a distância entre a escada e o parede?");
		double distancia = sc.nextDouble();
		
		double anguloRadianos = Math.toRadians(angulo);
		
		double cosAngulo = Math.cos(anguloRadianos);
		
		double hipotenusa = distancia/cosAngulo;
		
		System.out.printf("O tamanho da escada é: %.2f %n",  hipotenusa); 
		
		
	}

}
