/*
Escreva um programa em Java para ler o número de votos brancos, nulos e válidos. Calcular e
 escrever o percentual que cada um representa em relação ao total de eleitores.
*/


import java.util.Scanner;

public class Exercicio17 {
	public exercicio17() {
		Scanner input = new Scanner(System.in);

		Float votosBranco, votosNulos, votosValidos;
		Float total, prcBranco, prcNulos, prcValidos;
		
		System.out.print("Informe a quantidade de votos em Branco: ");
		votosBranco = input.nextFloat();
		System.out.print("Informe a quantidade de votos Nulos: ");
		votosNulos = input.nextFloat();
		System.out.print("Informe a quantidade de votos Válidos: ");
		votosValidos = input.nextFloat();
		
		total = votosBranco + votosNulos + votosValidos;
		prcBranco = (votosBranco / total) * 100;
		prcNulos = (votosNulos / total) * 100;
		prcValidos = (votosValidos / total) * 100;
		
		System.out.print("O percentual de votos Branco foi de " + prcBranco + "%\n");
		System.out.print("O percentual de votos Nulos foi de " + prcNulos + "%\n");
		System.out.print("O percentual de votos Válidos foi de " + prcValidos + "%\n");
		
	}
}
