import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora trabalhada: ");
        double  valorHora = sc.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int horaTrabalhada = sc.nextInt();

        double totalValor = valorHora * horaTrabalhada;
        System.out.println("A remuneração total, por hora trabalhada é de:" + totalValor);


    }
}
