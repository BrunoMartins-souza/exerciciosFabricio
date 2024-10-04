/*
 Escreva um programa que calcule os quadrados e cubos dos números de 0 a 10 e imprima os
 valores resultantes formatados, conforme a tabela 3
 
 Tabela 3: Exemplo da saída do algoritmo
 
 Número: 0 Quadrado: 0 Cubo: 0
 Número: 1 Quadrado: 1 Cubo: 1
 Número: . Quadrado: . Cubo: .
*/

public class Exercicio07 {
	public void exercicio07() {
		
		Integer num = 0;	
		
		while (num < 10) {
			System.out.print("\nNúmero: " + num);
			System.out.print(" Quadrado: " + (num * num));
			System.out.print(" Cubo: " + (num * num * num));
						
			num++;
		}	
	}
}
