import java.util.Scanner;

class Atividae1q2{

public static void main(String[] args) {
    Scanner entradaDados = new Scanner(System.in);
    int a = entradaDados.nextInt();
    int b = entradaDados.nextInt();
    int c = entradaDados.nextInt();
    if (a==b && a==c ){
        System.out.println("Triângulo equilátero");
    }
    else if((a==b && a != c) || (b==c && b != a)){
        System.out.println("Triângulo isósceles");
        

    }
    else {
        System.out.println("Triângulo escaleno");
    }

}
}
