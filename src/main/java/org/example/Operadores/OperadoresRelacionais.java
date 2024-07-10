package org.example.Operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 10;

        // verifica se o numero1 é maior que o numero2
        System.out.println(numero1 > numero2);

        // verifica se o numero1 é menor que o numero2
        System.out.println(numero1 < numero2);

        // verifica se o numero1 é maior ou igual ao numero2
        System.out.println(numero1 >= numero2);

        // verifica se o numero1 é menor ou igual ao numero2
        System.out.println(numero1 <= numero2);

        // verifica se o numero1 é igual ao numero2
        System.out.println(numero1 == numero2);

        // verifica se o numero1 é diferente do numero2
        System.out.println(numero1 != numero2);

        String nome = "João";
        String nome2 = new String("João");

        // verifica se o nome é igual ao nome2 (compara referências de memória)
        System.out.println();
        System.out.println(nome == nome2);
        System.out.println(nome.equals(nome2));
    }
}
