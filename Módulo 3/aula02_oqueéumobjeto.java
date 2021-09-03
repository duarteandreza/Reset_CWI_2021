//Classe Mario

public class Mario {
    String nome;
    String corDaPele;
    String corDosOlhos;
    String corDoCabelo;
    int idade;
    double altura;
    double peso;

    public void caracteristicasFisicas(){
        System.out.println("Características do Mario: ");
        System.out.println("Nome: " + nome + "; Cor da pele: " + corDaPele +  "; Cor dos olhos: "  + corDosOlhos + "; Cor do cabelo: " + corDoCabelo + "; Idade: " + idade + " anos de idade" + "; Altura: " + altura + "m de altura" + "; Peso: " + peso + "kg. ");
    }
    public void superPoderes(){
        System.out.println("Alguns dos seus superpoderes são: força, salto e velocidade sobre-humanos. ");
    }

}

//Classe com método main

public class ExercicioMarioAula2 {
    public static void main(String[] args) {
        Mario supermario = new Mario();
        supermario.nome = "Mario Bros";
        supermario.idade = 25;
        supermario.altura = 1.50;
        supermario.peso = 65;
        supermario.corDaPele = "clara";
        supermario.corDoCabelo = "castanho";
        supermario.corDosOlhos = "azul brilhante";
        supermario.caracteristicasFisicas();
        supermario.superPoderes();
    }
}

