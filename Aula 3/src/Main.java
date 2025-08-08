import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Mostrar na tela
        //Código = System.out.println();

        //Ler informações no código
        Scanner ler = new Scanner(System.in);

        //Perguntar o nome e idade

        System.out.println("Olá ! Que bom ter voce por aqui.");

        //Perguntando nome
        System.out.println("Por favor, digite o seu nome: ");
        String nome = ler.nextLine();

        //Perguntando idade
        System.out.println("Por favor, agora digite a sua idade: ");
        int idade = ler.nextInt();

        System.out.println("Obrigado ! Agora o CPF e número do cartao de crédito  kkkk");


        //ESTRUTURAS CONDICIONAIS - é para tomada de decisoes (Se .. Se nao)

        int idadeVini = 26;
        // if (o que estou perguntando) {o que fazer}
        if (idadeVini > 18) {
            System.out.println("Pode passar!");
        }
        else {
            System.out.println("Nao pode passar!");
        }

        // Crianca, Adulto ou Idoso
        if (idadeVini > 60) {
            System.out.println("Voce é idoso!");
        }
        else if(idadeVini > 16) {
            System.out.println("Voce é adulto!");
        }
        else  {
            System.out.println("Voce é crianca!");
        }
        }
    }