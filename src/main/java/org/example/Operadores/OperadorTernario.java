package org.example.Operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        int numero = 5;
        // verifica se o numero é maior que 10
        String resultado = numero > 10 ? "maior que 10" : "menor ou igual a 10";
        System.out.println(resultado);
    }
}
