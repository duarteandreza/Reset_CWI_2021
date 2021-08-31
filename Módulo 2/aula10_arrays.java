// Crie um programa que receba 5 valores e armazene em um vetor. Crie um segundo vetor de mesmo tipo e tamanho, contendo os valores do primeiro vetor multiplicados por 2. Ou seja: segundoVetor[i] = primeiroVetor[i] * 2. No final, imprima o conteúdo dos dois vetores.

import java.util.Scanner;

public class Exercicio1Aula10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] primeiroVetor = new int[5];
        for (int i = 0; i < primeiroVetor.length; i++){
            System.out.println("Digite um número: ");
            primeiroVetor[i] = scan.nextInt();
        }

        int[] segundoVetor = new int[5];
        for (int i = 0; i < segundoVetor.length; i++){
            segundoVetor[i] = primeiroVetor[i] * 2;
        }

        System.out.println("O primeiro vetor é: ");
        for(int primeiro : primeiroVetor){
            System.out.println(primeiro);
        }

        System.out.println("O segundo vetor é: ");
        for(int segundo : segundoVetor){
            System.out.println(segundo);
        }

    }
}



// Crie um programa que leia 10 valores inteiros correspondentes as idades de um grupo de pessoas e armazene em um vetor. Escreva uma lógica para determinar a quantidade de pessoas que possuem idade igual ou superior a 18 anos. Ao final, imprima o vetor de idades e a quantidade de pessoas maiores de idade.

import java.util.Scanner;

public class Exercicio2Aula10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scan.nextInt();
        }

        int qtdPessoasMaiorIdade = 0;

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] >= 18) {
                qtdPessoasMaiorIdade++;
            }
        }
      
        System.out.println("As idades digitadas foram: ");
        {
            for (int idade : idades) {
                System.out.println(idade);
            }
          
            System.out.println(qtdPessoasMaiorIdade + " pessoas são maiores de idade.");
        }
    }
}
