import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Lista 4 - While 1

        Scanner ler = new Scanner(System.in);

//        System.out.println("Olá ! Por favor, digite sua senha numérica: ");
//
//        int senha = ler.nextInt();
//
//        int senhaCorreta = senha;
//
//        while (senha != 123) {
//            System.out.println("Senha incorreta !");
//            System.out.println("Digite novamente: ");
//            senha = ler.nextInt();
//        }
//
//        if (senhaCorreta == senha) {
//            System.out.println("Acesso liberado !");
//        }
//
//        else {
//        }


        //Lista 4 - While 2


        int contador = 1;

        System.out.println("Salve !  Dë enter para contar: ");
        ler.nextLine();

        while (contador <= 10) {
            System.out.println("Contador: " + contador);
            contador++;
        }





    }
}