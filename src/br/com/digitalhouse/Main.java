package br.com.digitalhouse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();

        int opcaoOperacao;
        int numeroA;
        int numeroB;

        //Oferecer para o usuário um menu para a escolha entre as operações
        //matemáticas disponíveis:
        //Ex: 1 - Soma
        //2 - Subtração
        //3 - Divisão
        //4 - Multiplicação
        //5 - Sair

        //OBS: Para esse exercício utilize Scanner scanner = new Scanner(System.io)
        //para poder pegar dados dos usuários (revisar o conteúdo), além disso para
        //encerrar uma execução utilize o System.exit(0)
        Scanner scannerOperacao = new Scanner(System.in);

        System.out.println("Escolha uma das operações abaixo:");
        System.out.println("Digite 1 - Soma");
        System.out.println("Digite 2 - Subtração");
        System.out.println("Digite 3 - Divisão");
        System.out.println("Digite 4 - Multiplicação");

        opcaoOperacao = scannerOperacao.nextInt();


        Scanner scannerNumeroA = new Scanner(System.in);

        //Primeiro numero
        System.out.println("Digite o primeiro número:");
        numeroA = scannerNumeroA.nextInt();

        //Segundo numero
        System.out.println("Digite o segundo número:");
        numeroB = scannerNumeroA.nextInt();

        switch (opcaoOperacao) {

            //Soma
            case 1:
                System.out.println("Resultado: " + soma.calcula(numeroA, numeroB));
                System.exit(0);

            //Subtração
            case 2:
                System.out.println("Resultado: " + subtracao.calcula(numeroA, numeroB));
                System.exit(0);

            //Divisão
            case 3:
                System.out.println("Resultado: " + divisao.calcula(numeroA, numeroB));
                System.exit(0);

            //Multiplicação
            case 4:
                System.out.println("Resultado: " + multiplicacao.calcula(numeroA, numeroB));
                System.exit(0);


        }

    }

}
