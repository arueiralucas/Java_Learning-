import java.util.Scanner;

class Atividae1q1{

public static void main(String[] args) {
    Scanner entradaDados = new Scanner(System.in);
    int a = entradaDados.nextInt();
    int b = entradaDados.nextInt();
    int c = entradaDados.nextInt();

    int delta =b*b-4*a*c;
    System.out.println(delta);
    if(delta < 0){
        System.out.println("Não possui raizes rais ! ");
    }
    else if(delta == 0 ){
        double xUm = -b / (2 * a);
        System.out.println("Resposta X1 :" +xUm);
    }
    else{
        double xUm = (-b - Math.sqrt(delta)) / (2 * a);
        double xDois = (-b + Math.sqrt(delta)) / (2 * a);
        System.out.println("Resposta X1 :" +xUm);
        System.out.println("Resposta x2 :" +xDois);
        }
}
}
