package exerciciosFabricio;
import java.util.Scanner;
public class exercicio12e13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
/*
Faça um programa para uma loja de cerâmica que ajuda no cálculo da quantidade de revestimento necessário para uma obra.
A pessoa utilizadora deve informar as medidas de largura e comprimento da área que será revestida e da cerâmica escolhida.
Sempre arredonde o valor para cima, e acrescente dez por cento para o acabamento.
*/
		
		Float comprimento, largura, quantidade, valorM2, total;
		String tipo;
		
		System.out.print("Informe o tipo de cerâmica: ");
		tipo = input.nextLine();
		System.out.print("Informe a largura: ");
		largura = input.nextFloat();
		System.out.print("Informe o comprimento: ");
		comprimento = input.nextFloat();
		
		quantidade = largura * comprimento;
		
		System.out.println("Você vai precisar de " + quantidade + " metros quadrado de cerâmica " + tipo);

/*
 Incremente o programa da questão 6, para informar o valor do metro quadrado da cerâmica
 escolhido e o valor total a ser pago.
*/
		
		System.out.print("Informe o valor do metro quadrado: ");
		valorM2 = input.nextFloat();
		
		total = quantidade * valorM2;
		
		System.out.print("O valor total é: R$" + total);
		
		
	}

}
