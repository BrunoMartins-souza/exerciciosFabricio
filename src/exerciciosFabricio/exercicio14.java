package exerciciosFabricio;
import java.util.Scanner;
public class exercicio14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
/*
A organização mundial da saúde recomenda que sejam ingeridos 35 ml de água por dia, para
cada quilograma de peso. Crie um algoritmo que recebe o peso de uma pessoa e informe a
quantidade recomendada de água em litros.
*/
		
		Float peso;
		Float agua = (float) 0.035;
		Float consumo;
		
		System.out.print("Informe o seu peso: ");
		peso = input.nextFloat();
		
		consumo = peso * agua;
		
		System.out.print("Você tem que ingerir cerca de " + consumo + " litros de água por dia!");
	}

}
