package org.example;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parameterOne = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parameterTwo = terminal.nextInt();

        try {
            count(parameterOne, parameterTwo);

        }catch (InvalidParametersException exception) {
            System.out.println("Exceção capturada: " + exception.getMessage());
        }


    }

    static void count(int parameterOne, int parameterTwo) throws InvalidParametersException{
        if (parameterOne >= parameterTwo){
            throw new InvalidParametersException("O valor do Parâmetro 1 DEVE ser MENOR que o valor do Parâmetro 2.");
        }
        int countLimit = parameterTwo - parameterOne;
        for (int i = 1; i < countLimit; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}