public class Retangulo{
   private double base;
   private double altura;

   public void setBase(double novaBase){
        this.base = novaBase;
   }
   public double getBase(){
    return this.base;
   }
   public void setAltura(double novaAlgura){
    
        this.altura = novaAlgura;
    
   }
   public double getAltura(){
    return this.altura;
   }
   public double calcularArea(){
    return this.base*this.altura;
   }
   public double calcularPerimetro(){
    return 2*(this.base + this.altura);
}
public double calcularDiagonal(){
    return Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura, 2));
     
}
}
