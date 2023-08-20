public class TesteSegundoGrau {
    public static void main(String[] args) {
        SegundoGrau s =new SegundoGrau();
        s.setA(1.0); 
        s.setB(-3.0);
        s.setC(2.0);

        double discriminante = s.calcularDiscriminante();
        double raiz1 = s.calcularRaiz1();
        double raiz2 = s.calcularRaiz2();

        System.out.println("D : " + discriminante);
        System.out.println("X1 : " + raiz1);
        System.out.println("X2 : " + raiz2);

    }
}
