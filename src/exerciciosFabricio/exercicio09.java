package exerciciosFabricio;
import java.util.Scanner;
public class exercicio09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
/*
 Faça um programa para o seguinte problema: Compraram-se N canetas iguais, que foram pagas
 com uma nota de Z reais, obtendo-se Y reais como troco. Quanto custou cada caneta?
*/
		
		Float canetas, dinheiro, troco, custoCaneta;
		
		System.out.print("Informe a quantidade de canetas comprada: ");
		canetas = input.nextFloat();
		System.out.print("Iforme o valor pago: ");
		dinheiro = input.nextFloat();
		System.out.print("Informe o valor do troco recebido: ");
		troco = input.nextFloat();
		
		custoCaneta = (dinheiro - troco) / canetas;
		
		System.out.println("O custo da unidade de caneta é: R$" + custoCaneta);
		

	}

}
