import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Estrutura de Repeticao
        //WHILE - ENQUANTO

        //Enquanto o nome for diferente de Ericles, perguntar novamente

        Scanner ler = new Scanner(System.in);

//        System.out.println("Olá ! Por favor, digite seu nome: ");
//        String nome = ler.nextLine();
//
//        //while () {}  ***Obs: NUNCA usar == ou != para textos***
//        //Enquanto o nome for diferente de Ericles
//        while (!nome.equals("Ericles")) {
//            System.out.println("Incorreto ! ");
//            System.out.println("Digite novamente: ");
//            nome = ler.nextLine();
//        }
//
//
//        //DO WHILE - FACA ENQUANTO
//        //FAZ PRIMEIRO, PERGUNTA DEPOIS
//
//        //Exercicio 1
//
//        String resp;
//
//        System.out.println("Executando o processo ...");
//
//        do {
//            System.out.println("Por favor, digite 'S' ou 's' se deseja executar o processo novamente: ");
//            resp = ler.nextLine();
//            System.out.println("Executando o processo ...");
//        } while (resp.equals("S") || resp.equals("s"));



        //Exercicio 2

        int Num1;
        int resultado = 0;

        System.out.println("Olá, bem vindo ao somador ! Informe até 3 números e digite 0 para calcular.");

        do {
            System.out.println("Por favor, digite um número: ");
            Num1 = ler.nextInt();
            resultado = resultado + Num1;
            System.out.println("A soma é : " + resultado);

        } while (Num1 != 0);












    }
}