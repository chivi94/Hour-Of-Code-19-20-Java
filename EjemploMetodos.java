
public class EjemploMetodos{

    /**
     * Metodo sencillo que imprime un mensaje por pantalla
     */
    private static void miMetodo(){
        System.out.println("Imprimo un mensaje desde un metodo");
    }

    /**
     * Metodo sencillo que imprime los datos pasados como argumentos.
     * @param palabra cadena para imprimir por pantalla.
     * @param numero entero para imprimir por pantalla.
     */
    private static void miMetodoConArgumentos(String palabra, int numero){
        System.out.println("Imprimo una palabra ("+palabra+") desde un metodo");
        System.out.println("Imprimo un numero ("+numero+") desde un metodo");
    }

    /**
     * Funcion que devuelve una cadena de texto.
     * @return Cadena de texto "Hola buenas"
     */
    private static String miFuncion(){
        return "Hola Buenas";
    }

    /**
     * Funcion que recibe 2 enteros como argumentos y devuelve su suma.
     * @param a Primer entero
     * @param b Segundo entero
     * @return La suma de los 2 argumentos
     */
    private static int miFuncionConArgumentos(int a, int b){
        return a+b;
    }

    public static void main(String args[]){
        miMetodo();
        miMetodoConArgumentos("Hola buenas", 3);
        String resultadoFuncion = miFuncion();
        System.out.println(resultadoFuncion);
        int resultadoFuncionConArgumentos = miFuncionConArgumentos(2, 3);
        System.out.println(resultadoFuncionConArgumentos);
    }

}
