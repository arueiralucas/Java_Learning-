public class Imc {
    private String nome;
    private double massa;
    private double altura;

    public void setNome(String nome){
        this.nome =nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setMassa(double massa){
        this.massa = massa;
    }
    public float getMassa(){
        return this.massa;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public float getAltura(){
        return this.altura;
    } 
    public float calcularIMC(){
        return (float) (massa / (altura * altura));
    }
    public String mostraNome(){
        return nome;
    }

}
