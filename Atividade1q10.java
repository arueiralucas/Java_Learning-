public class Atividade1q10 {
    public static int multiply(int a, int b) {
        int result = 0;
        
        if (a == 0 || b == 0) {
            return 0;
        }
        
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                result += a;
            }
        } else {
            for (int i = 0; i > b; i--) {
                result -= a;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int product = multiply(a, b);
        System.out.println("Product: " + product);
    }
}
