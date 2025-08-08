import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //LISTA 3 FUNDAMENTAIS
        //Exercicio 1
        Scanner ler = new Scanner(System.in);

        System.out.println("Olá ! Bem vindo ao programa de lógica.");

        System.out.println("Por favor, digite um número: ");
        int Num = ler.nextInt();

        int resto = Num % 2;

        if (resto == 0) {
            System.out.println("O número informado é Par.");
        }

        else {
            System.out.println("O número informado é Impar.");
        }


        ler.nextLine();


        //Exercicio 2
        System.out.println("Olá ! Seja bem vindo ao sistema Senai.");

        System.out.println("Por favor, digite sua senha: ");
        String senha = ler.nextLine();



        String senhaUsuario = "1234";

        if (senha.equals("1234")) {
            System.out.println("Acesso concedido.");
        }

        else {
            System.out.println("Acesso negado, senha incorreta.");
        }



        //Exercicio 3
        System.out.println("Olá ! Por favor, digite um número: ");
        int Num1 = ler.nextInt();

        if (Num1 >=10 && Num1 <=20) {
            System.out.println("O número digitado está entre os números 10 e 20. ");
        }

        else {
            System.out.println("O número digitado NAO está entre os números 10 e 20.");
        }



        //LISTA 3 INTERMEDIARIOS
        //EXERCICIO 1

        System.out.println("Olá ! Seja bem vindo ao sistema lógico.");

        System.out.println("Por favor, digite o primeiro número: ");
        int Num2 = ler.nextInt();

        System.out.println("Por favor, digite o segundo número: ");
        int Num3 = ler.nextInt();

        if (Num2 == Num3) {
            System.out.println("Os números sao iguais !");
        }

        else if (Num2 > Num3) {
                System.out.println("O primeiro número é maior que o segundo");
            }

        else {
            System.out.println("O segundo número é maior que o primeiro");
        }





    }
}