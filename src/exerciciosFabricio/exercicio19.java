package exerciciosFabricio;
import java.util.Scanner;
public class exercicio19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
/*
Crie um programa para exibir o menu de um caixa eletrônico. Ele deve possuir as opções: Exibir
saldo, Exibir extrato, Realizar depósito, Realizar saque, e Sair. Se alguma opção inválida for
fornecida, exiba uma mensagem de erro e saia do programa. Observação: Utilize a estrutura
de seleção Switch/Case para implementar seu produto. Utilize números inteiros para indicar
cada opção.
*/
		

	    Integer funcao;
		String opcao;
			
			System.out.print("1 - Exibir Saldo:\n2 - Exibir Extrato:\n3 - Realizar Depósito:\n4 - Realizar Saque:\n5 - Sair:\nSelecione uma opção: ");
			funcao = input.nextInt();
			
			switch(funcao) {
			case 1:opcao="Saldo";break;
			case 2:opcao="Extrato";break;
			case 3:opcao="Depósito";break;
			case 4:opcao="Saque";break;
			case 5:opcao="Sair";break;
			default:opcao="Opção inválida";break;
			}
			System.out.println(opcao);
		
	}

}
