package exerciciosFabricio;
import java.util.Scanner;
public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
/*
Desenvolva um programa que calcula a área de um círculo, onde o raio é fornecido pelo usuário.
 */
		Float raio;
		Float pi = (float) 3.14;
		Float calculo;
		
		System.out.print("Informe o raio do círculo: ");
		raio = input.nextFloat();
		
		calculo = pi * (raio *raio);
		
		System.out.print("A área do Círculo é: " + calculo);
		
		
		

	}
	
}
