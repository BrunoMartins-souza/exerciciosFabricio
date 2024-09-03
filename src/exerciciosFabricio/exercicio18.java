package exerciciosFabricio;
import java.util.Scanner;
public class exercicio18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
/*
(Decom/UFOP- Adaptado) A permissão para uma pessoa votar ou não é determinado pela idade dela, conforme a tabela 4.
Crie um programa capaz de ler a idade de uma pessoa e imprimir sua classificação eleitoral.
Entrada: QUAL A IDADE DA PESSOA?: 17
Saída: ELEITOR FACULTATIVO

Tabela 4: Classificação de pessoas eleitoras
 Idade (anos) Classificação
 menor que 16 Não é eleitor
 de 16 a 17
 Eleitor facultativo
 de 18 a 65
 Eleitor obrigatório
 acima de 65
 Eleitor facultativo
*/

		Integer idade;
		
		System.out.print("Informe sua idade: ");
		idade = input.nextInt();
		
		if(idade < 16) {
			System.out.print("Não Eleitor!");
		}else if((idade >= 16 && idade < 18) || idade >= 65)  {
			System.out.print("Eleitor Facultativo!");
		}else {
			System.out.print("Eleitor Obrigatório!");
		}
		
	}

}
