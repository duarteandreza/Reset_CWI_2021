/*Faça um programa que tenha como entradas 4 notas e calcule a média. Ao final o programa deve apresentar:
A mensagem Aluno aprovado, se a média alcançada for igual ou superior a sete;
A mensagem Aluno reprovado, se a média for inferior a sete;
A mensagem Aluno aprovado com louvores, se a média for igual a dez.*/


import java.util.Scanner;

public class Exercicio1Aula8 {
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

        if (media == 10){
            System.out.println("Aluno aprovado com louvores!");
        } else if (media >= 7){
            System.out.println("Aluno aprovado!");
        } else if (media < 7){
            System.out.println("Aluno reprovado!");
        }

    }
}


/*Faça um Programa que leia um número e exiba o dia correspondente da semana. (1=Domingo, 2=Segunda, etc.), caso seja informado um valor que não corresponda à um dia da semana, então deve imprimir a mensagem Valor inválido!.*/

import java.util.Scanner;

public class Exercicio2Aula8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número correspondente a um dia da semana (1-7): ");

        int diaDaSemana = scan.nextInt();

        switch (diaDaSemana){

            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Valor inválido!");
        }
    }
}

