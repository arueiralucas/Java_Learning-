import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class jogoDaadivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        //Gera um numero randomico.
        int n = new Random().nextInt(100);


        System.out.printf(" ###  Jogo da adivinhação entre 0 e 100  ### \n ");
        System.out.println("Você tem 5 tentativas ! ");


        for (int i = 1; i <= 5; i++) {
            System.out.printf("Tentativa nº %d : ",i);
            int adv = leitura.nextInt();
            if(adv == n){
                System.out.println("\n!!! ACERTOU MIZERAVI !!!");
                break;
            }
            if (adv > n){
                System.out.println("Tente um número MENOR");
            }else{
                System.out.println("Tente um número MAIOR");
            }

        }

    }
}
