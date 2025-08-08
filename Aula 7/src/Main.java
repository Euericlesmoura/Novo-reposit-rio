import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //WHILE - ENQUANTO

        Scanner ler = new Scanner(System.in);

//        int contador = 1;
//
//        System.out.println("Salve !  Dë enter para contar: ");
//        ler.nextLine();
//
//        while (contador <= 10) {
//            System.out.println("Contador: " + contador);
//            contador++;
//        }
//
//
//        //DO WHILE - FACA ENQUANTO
//
//        int contador1 = 1;
//
//        do {
//            System.out.println("Contador: " + contador1);
//            contador1++;
//        } while (contador1 <= 10);
//
//
//        //FOR - PARA
//
//        for (int i = 10; i >= 0 ; i--) {
//            System.out.println(i);
//            if (i == 0) {
//                System.out.println("Tempo !");
//            }
//
//

        //Exercicio Tabuada

        int resultado;
        System.out.println("Olá ! Bem vindo ao calculador de tabuada.");
        System.out.println("Por favor, digite o número da tabuada desejada: ");
        int Num = ler.nextInt();

        for (int contador = 1; contador <= 10; contador++) {
            resultado = contador * Num;
            System.out.println(Num + " x " + contador + " = " + resultado);

        }


    }
}