package org.example.teste;

import java.util.Scanner;

public class BoletimEstudantil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a média final:");
        int mediaFinal = scanner.nextInt();

        final String aprovado = "APROVADO";
        final String reprovado = "REPROVADO";
        final String provaMinerva = "PROVA MINERVA";

        if (mediaFinal < 6) {
            System.out.println(reprovado);
        } else if (mediaFinal == 6) {
            System.out.println(provaMinerva);
        } else {
            System.out.println(aprovado);
        }
    }
}
