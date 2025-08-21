import java.util.Scanner;

public class Triangulo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado:");
        int primeiro = scanner.nextInt();

        System.out.println("Digite o segundo lado:");
        int segundo = scanner.nextInt();

        System.out.println("Digite o terceiro lado:");
        int terceiro = scanner.nextInt();

        int soma = primeiro + segundo;

        if(soma > terceiro) {
            System.out.println("Os lados podem formar um triângulo.");

        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }
        scanner.close();
    }
}
