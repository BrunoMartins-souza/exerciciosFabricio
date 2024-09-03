package exerciciosFabricio;
import java.util.Scanner;
public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
/*
 Crie um algoritmo que leia um valor de hora (HH:MM) e informe (calcule) quantos minutos se
 passaram desde o início do dia (00:00).
*/
		
		Integer hora, minuto, total;
		
		System.out.print("Informe as horas e os minutos (utilizando um espaço entre os dois): ");
		hora = input.nextInt();
		minuto = input.nextInt();
		
		total = (hora * 60) + minuto;
		
		System.out.print("Já se passaram " + total + " minutos des do inicio do dia!");
		
		
	}

}
