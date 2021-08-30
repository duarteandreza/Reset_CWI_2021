//Faça um programa que tenha como entradas dois números e imprima a soma de ambos. Utilize a classe Scanner para obter as entradas.

import java.util.Scanner;

public class Exercicio1Aula7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = scan.nextInt();

        int resultado = primeiroNumero + segundoNumero;

        System.out.println("A soma de " + primeiroNumero + " com " + segundoNumero + " é igual a: " + resultado + ".");
    }
}


//Faça um programa que tenha como entradas 4 notas e imprima a média. Utilize a classe Scanner para obter as entradas.

import java.util.Scanner;

public class Exercicio2Aula7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double segundaNota = scan.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double terceiraNota = scan.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double quartaNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        System.out.println("Sua média é: " + media);

    }
}


//Faça um programa que solicite quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

public class Exercicio3Aula7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora trabalhada? ");
        double valorHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalha por mês? ");
        int qtdHoras = scan.nextInt();

        double salario = valorHora * qtdHoras;

        System.out.println("Seu salário é de R$" + salario + " por mês.");

    }
}
