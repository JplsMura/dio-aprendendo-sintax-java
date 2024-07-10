package org.example.Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // Operadores lógicos
        // && (AND) - Retorna verdadeiro se as duas condições forem verdadeiras
        // || (OR) - Retorna verdadeiro se uma das condições for verdadeira
        // ! (NOT) - Inverte o resultado da condição

        int idade = 18;
        float salario = 1000;

        if (idade >= 18 && salario >= 1000) {
            System.out.println("Você pode financiar um carro!");
        } else {
            System.out.println("Você não pode financiar um carro!");
        }

        if (idade >= 18 || salario >= 1000) {
            System.out.println("Você pode financiar um carro!");
        } else {
            System.out.println("Você não pode financiar um carro!");
        }

        if (!(idade >= 18 && salario >= 1000)) {
            System.out.println("Você pode financiar um carro!");
        } else {
            System.out.println("Você não pode financiar um carro!");
        }
    }
}
