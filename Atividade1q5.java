import java.util.Scanner;

public class Atividade1q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo inicial: ");
        double tempoInicial = scanner.nextDouble();

        System.out.print("Digite o tempo final: ");
        double tempoFinal = scanner.nextDouble();

        double[] matrizT = new double[100];
        double[] matrizS = new double[100];

        double intervaloTempo = (tempoFinal - tempoInicial) / 100;

        for (int i = 0; i < 100; i++) {
            double tempo = tempoInicial + (i * intervaloTempo);
            matrizT[i] = tempo;
            matrizS[i] = calcularS(tempo);
        }

        System.out.println("Matriz T:");
        for (double valor : matrizT) {
            System.out.print(valor + " ");
        }

        System.out.println("\nMatriz S:");
        for (double valor : matrizS) {
            System.out.print(valor + " ");
        }
    }

    public static double calcularS(double tempo) {
        return 0.75 * Math.pow(tempo, 2) + 2.5 * tempo + 12;
    }
}
