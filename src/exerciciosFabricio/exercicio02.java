package exerciciosFabricio;
import java.util.Scanner;
public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
/*
Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. Considere que
a cotação é US$ 1 = R$ 4,95. 
*/
		
		Float dolar; 
		Float real = (float) 4.95;
		Float conversao;
		
		System.out.print("Digite o vlor em dolar: ");
		dolar = input.nextFloat();
		
		conversao = dolar * real;
		
		System.out.print("O valor do real é: R$" + conversao);
		
		
	}

}
