/*
 Escreva um programa em Java para ler:
 • a descrição do produto (nome)
 • a quantidade adquirida
 • o preço unitário.
 Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto
 e total a pagar (total a pagar = total- desconto), sabendo-se que:
 • Se quantidade <= 5, o desconto será de 2%
 • Se quantidade > 5 e quantidade <=10, o desconto será de 3%
 • Se quantidade > 10 e quantidade <30, o desconto será de 5%
 • Se quantidade >= 30 o desconto será de 10%
*/

import java.util.Scanner;

public class Exercicio20 {
	public void exercicio20() {
		Scanner input = new Scanner(System.in);

		String produto;
		Float quantidade, precoUni, total;
		
		System.out.print("Informe o nome do produto: ");
		produto = input.nextLine();
		System.out.print("Informe a quantidade de " + produto + " comprada: ");
		quantidade = input.nextFloat();
		System.out.print("Informe o valor unitario do produto: ");
		precoUni = input.nextFloat();
		
		total = precoUni * quantidade;
		
		System.out.print("O total da sua compra é; R$" + total + "\n");
		
		if(quantidade <= 5) {
			System.out.print("Com o desconto o valor total a pagar é: R$" + (total - (total * 0.02)));
		}else if(quantidade > 5 && quantidade <= 10) {
			System.out.print("Com o desconto o valor total a pagar é: R$" + (total - (total * 0.03)));
		}else if(quantidade > 10 && quantidade < 30) {
			System.out.print("Com o desconto o valor total a pagar é: R$" + (total - (total * 0.05)));
		}else {
			System.out.print("Com o desconto o valor total a pagar é: R$" + (total - (total * 0.10)));
		}

	}

}
