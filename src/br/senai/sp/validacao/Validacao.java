package br.senai.sp.validacao;

import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {

        /** import Scanner */
        Scanner teclado = new Scanner(System.in);

        //System.out.println("Olá, digite seu nome ");
        //String nome = teclado.nextLine();

        //System.out.println("Bem Vindo(a) " + nome + " qual é sua idade? ");
        //int idade = teclado.nextInt();

        //if (idade >= 18){
        //    System.out.println("Entrada liberada");
        //} else {
        //    System.out.println("Entrada Negada");

        /** Classificação Numérica */
        System.out.println("Digite um número");

        boolean valida = false;

        while (!valida) {
            if (teclado.hasNextInt()) {
                int numero = teclado.nextInt();
                valida = true;
                if (numero % 2 == 0) {
                    System.out.println(numero + " É um número par");
                } else {
                    System.out.println(numero + " É um número ímpar");
                }
            } else {
                System.out.println("Digite um número inteiro");
                teclado.next();
            }
        }
    }
}