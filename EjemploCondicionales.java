import java.util.Scanner;

public class EjemploCondicionales {

    public static void main(String args[]) {
        /**
         * Las estructuras condicionales se usan en los lenguajes de programacion para
         * controlar el flujo de los programas. En base a una condiciones impuestas por
         * el programador, se puede elegir que se ejecuta o que no. Veremos ejemplos a
         * continuación.
         */

        /**
         * La primera de todas y la mas sencilla, el if-else. Se pueden encandenar
         * tantos como queramos, aunque en este caso, solo vamos a usar 2.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero positivo:");
        int numero = teclado.nextInt();
        String mensajeBien = "¡Bien, me has hecho caso!";
        String mensajeMal = "¿No te he dicho que necesitaba un positivo?";

        if (numero > 0) {
            System.out.println(mensajeBien);
        } else {
            System.out.println(mensajeMal);
        }

        /**
         * Ahora vamos a ver el operador ternario. Es equivalente al if-else, mas
         * elegante, aunque menos legible. El anterior if-else con el operador
         * ternario seria algo asi...
         */
        String mensaje = numero > 0 ? mensajeBien : mensajeMal;
        System.out.println(mensaje);

        /**
         * Por ultimo, vamos a ver el switch-case. Hay que tener en cuenta que la condicion logica va entre los parentesis del switch,
         * y los case evaluan el resultado de estos, con lo que para hacer el equivalente del primer if-else, tendriamos que hacer algo
         * parecido a esto...
         */
        //Comprobamos el tipo de la entrada con un operador ternario, y checkeamos su valor con el switch-case.
        int resultado = numero > 0 ? 0 : -1;
        /**
         * ¿Recordais los metodos y las funciones? Probad a hacer lo mismo, pero con una funcion que evalue esto, y comprobad el resultado
         * en el switch-case.
         */
        switch (resultado) {
        case 0:
            System.out.println(mensajeBien);
            break;
        default:
            System.out.println(mensajeMal);
        }

        teclado.close();

    }
}