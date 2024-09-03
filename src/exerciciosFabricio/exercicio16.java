package exerciciosFabricio;
import java.util.Scanner;
public class exercicio16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
/*
Escreva um programa em Java para ler as notas da primeira, segunda e terceira avaliações
de um aluno, todas valem dez pontos. Calcular a média aritmética simples e escrever uma
mensagem que diga se o aluno foi ou não aprovado (considerar que média igual ou maior que
7 o aluno é aprovado). Escrever também a média calculada.
*/
		
		Float nota01, nota02, nota03;
		Float media;
		
		System.out.print("Informe a nota da P1: ");
		nota01 = input.nextFloat();
		System.out.print("Informe a nota da P2: ");
		nota02 = input.nextFloat();
		System.out.print("Informe a noa da P3: ");
		nota03 = input.nextFloat();
		
		media = (nota01 + nota02 + nota03) / 3;
		
		System.out.print("A média foi: " + media);
		
		if (media >= 7) {
			System.out.print("\nAluno Aprovado!");
		}else {
			System.out.print("\nAluno Reprovado!");
		}

	}

}
