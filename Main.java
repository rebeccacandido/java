import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();


        System.out.println("Digite o nome:");
        pessoa1.setNome(sc.nextLine());

        System.out.println("Digite a idade:");
        pessoa1.setIdade(sc.nextInt());

        System.out.println("Digite a altura:");
        pessoa1.setAltura(sc.nextDouble());

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Altura: " + pessoa1.getAltura());
    }
}

