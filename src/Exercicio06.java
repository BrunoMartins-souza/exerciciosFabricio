/*
 Desenvolva um programa que, dados dois valores A e B, troque os valores de forma que A passe
 a ter o valor de B e vice-versa. Exiba os valores após a troca.
*/

import java.util.Scanner;
public class Exercicio06 {
	public void exercicio06() {
		Scanner input = new Scanner(System.in);
		
		Integer a, b;
		Integer x, y;
		
		System.out.print("Informe o valor de A: ");
		a = input.nextInt();
		System.out.print("Informe o valor de B: ");
		b = input.nextInt();
		
		x = b;
		y = a;
		
		System.out.println("O valor de A agora é: " + x);
		System.out.println("O valor de B agora é: " + y);

	}
}
