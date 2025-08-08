import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variaveis
        int idade;
        idade = 27;


        //Scanner - para ler dados
        Scanner sc = new Scanner(System.in);

        //Ler textos - next.line()
        String nome = sc.nextLine();

        //Ler double - next.Double()
        double preco = sc.nextDouble();

        int idade1 = sc.nextInt();


        //Condicionais - Tomas Decisoes

        //Simples
        //if () {}
        if (idade1 > 18) {
            System.out.println("Voce é maior de idade !");
        }


        //Composta
        //if () {}
        if (idade1 > 18) {
            System.out.println("Voce é maior de idade !");
        }

        //else = senão
        else {
            System.out.println("Voce é menor de idade !");
        }


        //Encadeada
        //Aprovado, Recuperacao ou Reprovado
        int nota = 6;

        if (nota > 6 ) {
            System.out.println("Parabéns, voce foi aprovado !");
        }

        else if (nota > 4 ){
            System.out.println("Moio, ficou de recuperacao");
        }

        else {
            System.out.println("Reprovado !");
        }




    }
}