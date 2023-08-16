public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        r.setBase(50);
        r.setAltura(4);
        double area = r.calcularArea();
        double perimetro = r.calcularPerimetro();
        double diagonal  = r.calcularDiagonal();
        System.out.println(area);
        System.out.println(perimetro);
        System.out.println(diagonal);
    }
}

