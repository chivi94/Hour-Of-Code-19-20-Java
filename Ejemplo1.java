public class Ejemplo1 {

    public static void imprimir(String mensaje, int numero) {
        System.out.println("Hola " + mensaje);
        System.out.println("Tengo el numero: " + numero);
    }

    public static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void main(String args[]) {

        String hola = "mensaje";
        int entero = 2;

        imprimir(hola, entero);

        int numero1 = 2;
        int numero2 = 3;

        int resultado = suma(numero1, numero2);
        System.out.println("La suma de " + numero1 + "+" + numero2 + " es =" + resultado);

    }

}