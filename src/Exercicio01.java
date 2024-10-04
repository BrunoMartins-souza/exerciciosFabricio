/* 
  Crie um algoritmo que lê dois números, X e Y, e mostra o resto da divisão entre eles.
 Tabela 1: Exemplo de entrada de dados
 DIGITE O VALOR DO PRIMEIRO NÚMERO (X): 10
 DIGITE O VALOR DO SEGUNDO NÚMERO (Y): 2
 Tabela 2: Exemplo de saída de dados
 O RESTO DA DIVISÃO ENTRE ELES É: 0
 */

import java.util.Scanner;

public class Exercicio01 {

	public void exercicio01() {
		
		Scanner input = new Scanner(System.in);
		
		Float numX, numY, resto;
		
		System.out.print("Digite o número X: ");
		numX = input.nextFloat();
		System.out.print("Digite o número Y: ");
		numY = input.nextFloat();
		
		resto = numX % numY;
		
		System.out.print("O resto da divisão é: " + resto);
		
		

	}

}
