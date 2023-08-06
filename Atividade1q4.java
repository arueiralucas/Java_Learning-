public class Atividade1q4{
    public static void main(String[] args) {
       double chico =1.50;
       double ze = 1.30;
       int anos = 0;

       while(ze <=chico){
        chico += 0.02;
        ze += 0.03;
        anos++;
       }
       System.out.println(anos);
        
    }
}
