package org.example;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parameterOne = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parameterTwo = terminal.nextInt();

        count(parameterOne, parameterTwo);

    }

    static void count(int parameterOne, int parameterTwo ){
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        int countLimit = parameterTwo - parameterOne;
        for (int i = 1; i < countLimit; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}