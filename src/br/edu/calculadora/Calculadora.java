package br.edu.calculadora;

import java.util.Scanner; //importando a classe Scanner

public class Calculadora {
    public static void main(String[] args) throws Exception {
        // instanciando e criando um objeto
        Scanner keyboard = new Scanner(System.in);

        float num1;
        float num2;
        char sinal;
        char mult = '*';
        char div = '/';
        char soma = '+';
        char subt = '-';
        char escolha;

        while (true) { // loop

            System.out.println("Digite abaixo:");
            num1 = keyboard.nextInt();

            System.out.println("Escolha o sinal:");
            sinal = keyboard.next().charAt(0);

            System.out.println("Digite outro número:");
            num2 = keyboard.nextInt();

            if (sinal == mult) {
                System.out.println(num1 * num2);
            }
            if (sinal == div) {
                System.out.println(num1 / num2);
            }
            if (sinal == soma) {
                System.out.println(num1 + num2);
            }
            if (sinal == subt) {
                System.out.println(num1 - num2);
            }
            System.out.println("Digite X para sair ou C para continuar");
            escolha = keyboard.next().charAt(0);
            if (escolha == 'X' || escolha == 'x') {
                break;
            } else if (escolha == 'C' || escolha == 'c') {

            } else {
                System.out.println("Invalido");
            }
        }
    }
}

