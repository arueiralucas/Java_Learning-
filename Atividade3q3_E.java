public class SegundoGrau {
    private double a;
    private double b;
    private double c;

    public void setA(double a){
        this.a = a;
    }
    public int getA(){
        return  this.a;
    }
    public void setB(double b){
        this.b = b;
    }
    public int getB(){
        return  this.b;
    }
    public void setC(double c){
        this.c = c;
    }
    public int getC(){
        return  this.c;
    }

    public double calcularDiscriminante(){
        return b * b - 4 * a * c;
    }
    public double calcularRaiz1() {
        double delta = calcularDiscriminante();
        return (-b + Math.sqrt(delta)) / (2 * a);
    }
     public double calcularRaiz2() {
        double delta = calcularDiscriminante();
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}
