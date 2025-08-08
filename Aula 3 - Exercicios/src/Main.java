import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//1- Verificador de Maioridade

System.out.println("Por favor, digite sua idade: ");

//Criando o código para ler a informaçao digitada
Scanner ver = new Scanner(System.in);
int idade = ver.nextInt();

//Criando a condiçao para verificar se é maior ou menor de idade
if (idade >= 18) {
    System.out.println("Voce é maior de idade");
}

else {
    System.out.println("Voce é menor de idade");
}


//2- Verificador de número (Positivo, Negativo ou Zero)

System.out.println("Por favor, digite um número: ");

//Criando o código para ler a informaçao digitada
Scanner sc = new Scanner(System.in);
int numero = sc.nextInt();

if (numero > 0) {
    System.out.println("O número é positivo");
}

else if (numero < 0) {
    System.out.println("O número é negativo");
}

else {
    System.out.println("O número é zero");
}


//3- Classificaçao de Aluno

//Criando o código para ler a informaçao digitada
Scanner ler = new Scanner(System.in);

System.out.println("Olá aluno, seja bem vindo !");

//Criando variável para armazenar o nome
System.out.println("Por favor, digite seu nome: ");
ler.nextLine();
String nome = ler.nextLine();

//Criando a variável para armazenar a nota digitada
System.out.println("Agora informe sua nota: ");
double nota = ler.nextDouble();

//Criando a condiçao para verificar se o aluno está Aprovado ou Reprovado
if (nota >= 7) {
    System.out.println(nome + " voce está aprovado");
}

else {
    System.out.println("Reprovado");
}

    }
}