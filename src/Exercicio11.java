/*
Uma dúvida que sempre paira na cabeça dos motoristas é: Abastecer com etanol ou gasolina?
Especialistas indicam que o consumo do carro aumenta em torno de trinta por cento, quando
abastecido com etanol, logo, só vale a pena abastecer com ele se o valor estiver abaixo de
setenta por cento do valor da gasolina. Para auxiliar motoristas a realizar este cálculo, crie
um algoritmo que receba o preço dos dois combustíveis, e informe qual deve ser a escolha, com base no custo.
*/

import java.util.Scanner;

public class Exercicio11 {
	public void exercicio11() {
		Scanner input = new Scanner(System.in);

		Float etanol, gasolina, diferenca;
		
		System.out.print("Informe o valor da gasolina na sua cidade: ");
		gasolina = input.nextFloat();
		System.out.print("Informe o valor do etanol na sua cidade:");
		etanol = input.nextFloat();
		
		diferenca = etanol / gasolina;
		
		if (diferenca < 0.7) {
			System.out.println("É mais vantajoso abastecer com Etanol!");
		}else {
			System.out.println("É mais vantajoso abastecer com Gasolina!");
		}
	}
}
