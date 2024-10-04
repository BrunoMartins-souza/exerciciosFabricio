/*
Faça um programa que converta a temperatura dada em Fahrenheit para Celsius. Você pode
 testar se a sua resposta está correta, saiba que 100C = 212F. Considere C/5 = (F − 32)/9.
*/

import java.util.Scanner;

public class Exercicio08 {
	public void exercicio08() {
		Scanner input = new Scanner(System.in);

		Float grauC;
		Float grauF;
		
		System.out.print("Informe a temperatura em Fahrenheit: ");
		grauF = input.nextFloat();
		
		grauC = (grauF - 32) * 5 / 9;
		
		System.out.print(grauF + "F. É equivalente a: " + grauC + "C.");
		
	}
}
