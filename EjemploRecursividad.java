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

    /**
     * Metodo para calcular la potencia de un numero
     * 
     * @param base      Numero del que calcularemos la potencia
     * @param exponente Potencia a la que se elevara el numero
     * @return base elevada al exponente
     */
    public static int potenciaIterativa(int base, int exponente) {
        int resultado = 1;
        while (exponente > 0) {
            resultado *= base;
            exponente--;
        }
        return resultado;
    }

    /**
     * Con este metodo recursivo calcularemos el factorial de un numero. El
     * factorial de n se define como: n! = n * (n-1)!
     * 
     * @param n Entero del que calcularemos el factorial
     * @return Factorial del argumento de entrada
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else if (n == 2)
            return 2;
        return n * factorial(n - 1);
    }

    /**
     * Con este metodo recursivo obtendremos el inverso de una cadena.
     * 
     * @param stringToReverse Cadena a invertir
     * @return Cadena invertida
     */
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

        Scanner teclado = new Scanner(System.in);

        // Empezamos con el inverso de una cadena
        System.out.print("Introduzca una cadena para obtener su inversa:");
        String cadena = teclado.nextLine();
        String cadenaResultado = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaResultado += cadena.charAt(i);
        }

        System.out.println("Resultado del inverso de la cadena " + cadena + " es: " + cadenaResultado);
        System.out.println("Resultado del inverso de la cadena recursivo " + cadena + " es: " + reverseString(cadena));

        // Seguimos con la potencia de un numero
        int base, exponente;
        System.out.print("Introduzca una base:");
        base = teclado.nextInt();
        System.out.print("Introduzca un exponente:");
        exponente = teclado.nextInt();

        System.out.println("Resultado de la potencia de elevar " + base + " a " + exponente + " es: "
                + potenciaIterativa(base, exponente));
        System.out.println("Potencia recursiva: " + potencia(base, exponente));

        // Terminamos con el factorial
        System.out.print("Introduzca un numero para calcular su factorial:");
        int n = teclado.nextInt();
        int resultado = 1;
        for (int i = n; i > 0; i--) {
            resultado *= i;
        }
        System.out.println("Resultado del factorial de " + n + " es: " + resultado);
        System.out.println("Resultado del factorial recursivo de " + n + " es: " + factorial(n));

        teclado.close();
    }
}