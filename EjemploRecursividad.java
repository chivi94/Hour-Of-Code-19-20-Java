import java.util.Scanner;

public class EjemploRecursividad {

    /**
     * Con este metodo recursivo, calcularemos la potencia de un numero.
     * 
     * @param base      Numero del que calcularemos la potencia
     * @param exponente Potencia a la que se elevara el numero
     * @return base elevada al exponente
     */
    public static int potencia(int base, int exponente) {

        if (exponente == 0)
            return 1;
        else if (base == 1)
            return base;
        else if (base == 0)
            return 0;

        return base * potencia(base, exponente - 1);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else if (n == 2)
            return 2;
        return n * factorial(n - 1);
    }

    public static String reverseString(String stringToReverse) {
        if (stringToReverse.isEmpty())
            return stringToReverse;
        return reverseString(stringToReverse.substring(1)) + stringToReverse.charAt(0);
    }

    public static void main(String args[]) {
        /**
         * Como sabeis, en la recursividad se necesitan minimo dos casos dentro de la
         * funcion: El caso base y el caso recursivo. - El caso base es el que nos
         * indica cuando parar de hacer recursion dentro del metodo. - El caso
         * recursivo, por el contrario, es el que indica la operacion recursiva a
         * realizar. Para explicar la recursividad y hacer que sea un poco mas visual,
         * nos apoyaremos en el uso de bucles analogos a las funciones recursivas.
         */

        // El primero, una potencia.
        Scanner teclado = new Scanner(System.in);
        int base, exponente;
        int resultado = 1;
        System.out.print("Introduzca una base:");
        base = teclado.nextInt();
        System.out.print("Introduzca un exponente:");
        exponente = teclado.nextInt();
        while(exponente > 0){
            resultado *= base;
            exponente--;
        }
        System.out.println("Resultado de la potencia de elevar "+base+" a "+exponente+" es: "+resultado);
        System.out.println("Potencia recursiva: "+potencia(base, exponente));
        System.out.println(factorial(4));
        System.out.println(reverseString("Hola Mundo"));

    }
}