import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opc;

        do {
            System.out.println("Escolha uma opção para mostrar o resultado: ");
            System.out.println(" 1 - Exercício 01.");
            System.out.println(" 2 - Exercício 02.");
            System.out.println(" 3 - Exercício 03.");
            System.out.println(" 4 - Exercício 04.");
            System.out.println(" 5 - Exercício 05.");
            System.out.println(" 6 - Exercício 06.");
            System.out.println(" 7 - Exercício 07.");
            System.out.println(" 8 - Exercício 08.");
            System.out.println(" 9 - Exercício 09.");
            System.out.println(" 10 - Exercício 10.");
            System.out.println(" 11 - Exercício 11.");
            System.out.println(" 12 - Exercício 12 e 13.");
            System.out.println(" 13 - Exercício 14.");
            System.out.println(" 14 - Exercício 15.");
            System.out.println(" 15 - Exercício 16.");
            System.out.println(" 16 - Exercício 17.");
            System.out.println(" 17 - Exercício 18.");
            System.out.println(" 18 - Exercício 19.");
            System.out.println(" 19 - Exercício 20.");
            System.out.println(" 21 - Sair.");
            System.out.print("Opção: ");
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    Exercicio01 ex1 = new Exercicio01();
                    ex1.exercicio01();
                    break;
                case 2:
                    Exercicio02 ex2 = new Exercicio02();
                    ex2.exercicio02();
                    break;
                case 3:
                    Exercicio03 ex3 = new Exercicio03();
                    ex3.exercicio03();
                    break;
                case 4:
                    Exercicio04 ex4 = new Exercicio04();
                    ex4.exercicio04();
                    break;
                case 5:
                    Exercicio05 ex5 = new Exercicio05();
                    ex5.exercicio05();
                    break;
                case 6:
                    Exercicio06 ex6 = new Exercicio06();
                    ex6.exercicio06();
                    break;
                case 7:
                    Exercicio07 ex7 = new Exercicio07();
                    ex7.exercicio07();
                    break;
                case 8:
                    Exercicio08 ex8 = new Exercicio08();
                    ex8.exercicio08();
                    break;
                case 9:
                    Exercicio09 ex9 = new Exercicio09();
                    ex9.exercicio09();
                    break;
                case 10:
                    Exercicio10 ex10 = new Exercicio10();
                    ex10.exercicio10();
                    break;
                case 11:
                    Exercicio11 ex11 = new Exercicio11();
                    ex11.exercicio11();
                    break;
                case 12:
                    Exercicio12e13 ex12e13 = new Exercicio12e13();
                    ex12e13.exercicio12e13();
                    break;
                case 13:
                    Exercicio14 ex14 = new Exercicio14();
                    ex14.exercicio14();
                    break;
                case 14:
                    Exercicio15 ex15 = new Exercicio15();
                    ex15.exercicio15();
                    break;
                case 15:
                    Exercicio16 ex16 = new Exercicio16();
                    ex16.exercicio16();
                    break;
                case 16:
                    Exercicio17 ex17 = new Exercicio17();
                    ex17.exercicio17();
                    break;
                case 17:
                    Exercicio18 ex18 = new Exercicio18();
                    ex18.exercicio18();
                    break;
                case 18:
                    Exercicio19 ex19 = new Exercicio19();
                    ex19.exercicio19();
                    break;
                case 19:
                    Exercicio20 ex20 = new Exercicio20();
                    ex20.exercicio20();
                    break;
                default:
                    System.out.println("Essa opção não é válida!");
                    break;
            }
        } while (opc != 21);
    }
}
