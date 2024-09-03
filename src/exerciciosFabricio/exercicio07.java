package exerciciosFabricio;

public class exercicio07 {

	public static void main(String[] args) {
		
/*
 Escreva um programa que calcule os quadrados e cubos dos números de 0 a 10 e imprima os
 valores resultantes formatados, conforme a tabela 3
 
 Tabela 3: Exemplo da saída do algoritmo
 
 Número: 0 Quadrado: 0 Cubo: 0
 Número: 1 Quadrado: 1 Cubo: 1
 Número: . Quadrado: . Cubo: .
 
*/
		
		Integer num = 0;	
		
		while (num < 11) {
			System.out.print("\nNúmero: " + num);
			System.out.print(" Quadrado: " + (num * num));
			System.out.print(" Cubo: " + (num * num * num));
						
			num++;
		}
		
		
		
	}

}
