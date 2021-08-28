import java.util.Scanner;

public class AlunoResetLeituraTeclado {
    public static void main(String[] args) {
        System.out.println("Nome: ");
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        System.out.println("Sou aluna do Level 1 do CWI Reset! Me chamo " + nome + ".");
    }
}
