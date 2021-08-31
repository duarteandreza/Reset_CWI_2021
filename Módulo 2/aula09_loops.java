// Faça um programa que peça uma nota, entre zero e dez. Caso o valor informado seja inválido, ou seja, não esteja entre zero e dez, mostre uma mensagem informando o problema, mas mantenha o programa em execução pedindo novamente a nota até que o usuário informe um valor válido. Quando o usuário informar uma nota válida, imprima o valor da nota.

import java.util.Scanner;

public class Exercicio1Aula9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota entre 0 e 10: ");

        double nota = scan.nextDouble();

        while (nota < 0 || nota >10){
            System.out.println("Nota inválida! Digite uma nota entre 0 e 10: ");
            nota = scan.nextDouble();
        }

        System.out.println("Sua nota é: " + nota);
    }
}

// Faça um programa que leia dois números e imprima todos os valores presentes no intervalo entre eles, um abaixo do outro. Caso o segundo número seja menor ou igual ao primeiro, solicite um novo número até que o segundo número seja maior que o primeiro.

import java.util.Scanner;

public class Exercicio2Aula9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int primeiroNumero = scan.nextInt();

        System.out.println("Digite outro número maior que o primeiro: ");
        int segundoNumero = scan.nextInt();

        while (segundoNumero <= primeiroNumero){
            System.out.println("O segundo número precisa ser maior que o primeiro. Digite outro número: ");
            segundoNumero = scan.nextInt();
        }
        for (int i = primeiroNumero; i < segundoNumero; i++){
            System.out.println(i);
        }
    }
}

// Faça um programa que leia 5 números e informe o maior número.

import java.util.Scanner;

class Exercicio3Aula9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int maiorNumero = 0;
        int i = 0;

        while (i < 5) {
            System.out.println("Digite um número: ");
            i++;

            numero = scan.nextInt();

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        System.out.println("O maior número digitado foi " + maiorNumero);
    }
}

// Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver a tabuada.

import java.util.Scanner;

public class Exercicio4Aula9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para ver a sua tabuada: ");
        int numero = scan.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(numero + " * " + i + " = " + numero*i);
        }
    }
}


