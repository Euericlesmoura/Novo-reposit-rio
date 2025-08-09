import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //VETORES (ARRAY)

        //ARRAY - guarda uma lista* de coisas
        //Variavel que guarda uma lista de idades
        //Todo Array tem um limite fixo de coisas

        //estrutura da linha de código de ARRAY
        int[] idade = new int [5];
        String[] nome = new String [5];

        //Endereços iniciam do zero
        idade [0] = 7;
        idade [1] = 18;
        idade [2] = 27;
        idade [3] = 35;
        idade [4] = 43;

        nome [0] = "Natalia";
        nome [1] = "Fabiana";
        nome [2] = "Leticia";
        nome [3] = "Thalita";
        nome [4] = "Bruna";

        for (int i = 0; i < idade.length ; i++) {
            System.out.println(idade[i]);

        }

        for (int i = 0; i < nome.length ; i++) {
            System.out.println(nome[i]);

        }


        //Exercicio 2 - Fundamentais

        int [] idade1 = new int [10];
        Scanner ler = new Scanner(System.in);

        System.out.println("Olá ! Por favor, digite 10 idades ");

        for (int cont = 0 ; cont < idade1.length ; cont++) {
            idade1[cont] = ler.nextInt();

        }


    }
}