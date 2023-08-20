public class TesteImc {
    public static void main(String[] args) {
        Imc i = new Imc();
        i.setNome("Lucas");
        i.setMassa(70.0);
        i.setAltura(1.70);
        float imc = i.calcularIMC();
        String nome = i.mostraNome();

        System.out.println(nome);
        System.out.println(imc);
    }
}
