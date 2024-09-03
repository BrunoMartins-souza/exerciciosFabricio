package exerciciosFabricio;
import java.util.Scanner;
public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
/*
Crie um programa que calcula a média simples de três notas fornecidas pelo usuário.
*/
		Float nota01, nota02, nota03;
		Float media;
		
		System.out.print("Informe a primeiro nota: ");
		nota01 = input.nextFloat();
		System.out.print("Informe a segunda nota: ");
		nota02 = input.nextFloat();
		System.out.print("Informe a terceira nota: ");
		nota03 = input.nextFloat();
		
		media = (nota01 + nota02 + nota03) / 3;
		
		System.out.print("A média das notas é: " + media);
		

	}

}
