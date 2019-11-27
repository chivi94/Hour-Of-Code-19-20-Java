public class Ejemplo4 {

    public static int factorialIterativo(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }else{
            int resultado = 1;
            for(int i = n; i > 0; i--){
                resultado *= i;
                //resultado = resultado * i;
            }
            return resultado;
        }
    }

    public static int factorialRecursivo(int n){
        if(n < 0){
            return 0;
        }
        if(n == 1 || n == 0){
            return 1;
        }

        return n * factorialRecursivo(n-1);
    }

    public static void main(String args[]) {
        System.out.println("Factorial de 5 iterativo es = " + factorialIterativo(5));
        System.out.println("Factorial de 5 recursivo es = " + factorialRecursivo(5));
        
    }

}