import java.util.Scanner;

public class Atividade1q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int decimal = scanner.nextInt();
        
        String binary = "";
        
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2;
        }
        
        System.out.println("O número binário é: " + binary);
    }
}
