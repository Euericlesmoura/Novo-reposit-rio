import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        //Exercicio Vetores 1
//
//        //vetores com 5 numeros
//        int[] valores = new int[5];
//
//        valores[0] = 10;
//        valores[1] = 20;
//        valores[2] = 30;
//        valores[3] = 40;
//        valores[4] = 50;
//
//        //exibir os 5 numeros
//        for (int i = 0; i < valores.length; i++) {
//            System.out.println(valores[i]);
//        }
//
//
//        //Exercicio Vetores 2
//
//        //vetores com 10 numeros
//        int[] Num = new int[10];
//        Scanner sc = new Scanner(System.in);
//
//        //solicitando os números ao usuário
//        System.out.println("Olá ! Por favor, digite 10 números: ");
//
//        //informando os números digitados
//        for (int i = 0; i < Num.length; i++) {
//            Num[i] = sc.nextInt();
//        }
//
//        System.out.println("Os números digitados foram: ");
//
//        for (int i = 0; i < Num.length; i++) {
//            System.out.println(Num[i]);
//        }
//
//
//        //Exercicio Vetores 3
//
//        //vetores com 4 numeros
//        int[] Num1 = new int[4];
//        int resultado = 0;
//        Scanner sc = new Scanner(System.in);
//
//
//        //solicitando os números ao usuário
//        System.out.println("Olá ! Por favor, digite 4 números para somar: ");
//
//        for (int i = 0; i < Num1.length; i++) {
//            Num1[i] = sc.nextInt();
//            resultado = resultado + Num1[i];
//        }
//
//        System.out.println("A soma é : " + resultado);


        //Exercicio Vetores 4

        //vetores com 6 numeros
        int[] Num2 = new int[6];
        int maior = 0;
        Scanner sc = new Scanner(System.in);

        //solicitando os números ao usuário
        System.out.println("Olá ! Por favor, digite 6 números: ");

        for (int i = 0; i < Num2.length; i++) {
            Num2[i] = sc.nextInt();

            if (Num2[i] > maior){
                maior = Num2[i];
            }
        }
        System.out.println("O número maior é: " + maior);



    }
}