import java.util.Scanner;
public class Atividade1q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        int[] fibonacci = new int[n+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        System.out.print("A série de Fibonacci até o número " + n + " é: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
