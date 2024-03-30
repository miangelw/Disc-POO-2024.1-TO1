package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    
	    System.out.println("Digite o tamanho da escada: ");
	    double escada = sc.nextDouble();
	    
	    System.out.println("Digite a altura que o quadro ficará: ");
	    double altura = sc.nextDouble();
	    
	    double distanciaExP2 = Math.pow(escada, 2) - Math.pow(altura, 2);
	    double distanciaExP = Math.sqrt(distanciaExP2);
	    
	    System.out.println("A distância entre a base da escada e a parede é: " + distanciaExP);


	}

}
