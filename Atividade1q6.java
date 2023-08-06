import java.util.Scanner;

public class Atividade1q6 {
    public static void main(String[] args) {
        double[][] matriz = new double[6][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        double maiorElemento = matriz[0][0];
        double menorElemento = matriz[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;
        int linhaMenor = 0;
        int colunaMenor = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maiorElemento) {
                    maiorElemento = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
                if (matriz[i][j] < menorElemento) {
                    menorElemento = matriz[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
            }
        }
        System.out.println("Maior elemento: " + maiorElemento);
        System.out.println("Posição: [" + linhaMaior + "][" + colunaMaior + "]");
        System.out.println("Menor elemento: " + menorElemento);
        System.out.println("Posição: [" + linhaMenor + "][" + colunaMenor + "]");
        scanner.close();
    }
}
