package exerciciosFabricio;
import java.util.Scanner;
public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
/*
Escreva um programa que calcula o salário líquido de um funcionário. O programa deve solicitar
o valor da hora de trabalho, o número de horas trabalhadas no mês e o percentual de desconto do INSS.
*/
		
		Float hora, valorH, liquido;
		Float percentual,desconto, bruto;
		
		System.out.print("Informe o valor da sua hora de trabalho; ");
		valorH = input.nextFloat();
		System.out.print("Informe quantas horas você trabalha no mês: ");
		hora = input.nextFloat();
		System.out.print("Informe o percentual de desconto do INSS: ");
		percentual = input.nextFloat();
		
		bruto = valorH * hora;
		desconto = bruto * (percentual / 100);
		liquido = bruto - desconto;
		
		System.out.print("O seu salario líquido é: R$" + liquido);
		
		

	}

}
