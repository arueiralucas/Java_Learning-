import java.util.Scanner;

class Atividae1q3{

public static void main(String[] args) {
    Scanner entradaDados = new Scanner(System.in);
    int n = entradaDados.nextInt();
    int aux = 0;
    for(int i = 1;i<n;i++){
        if(n%i==0){
            aux +=i;
        }
    }
    if (aux == n){
        System.out.println("O número é Perfeito!");
    }
    else{
        System.out.println("O número NÃO é Perfeito!");
    }
}
}
