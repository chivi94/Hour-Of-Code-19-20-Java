
public class EjemploBucles {

    public static void main(String args[]) {
        /**
         * Vamos a ver 3 tipos de bucles: while, do-while y for. Las diferencias son las
         * siguientes: -> do-while: Se ejecuta al menos una vez, ya que la condicion se
         * evalua al final del bloque. -> while: Puede no llegar a ejecutarse si se
         * cumple la condicion de finalizacion del bucle al inicio del mismo. -> for: Se
         * ejecuta un numero determinado de veces, es decir, esta controlado por indice,
         * y conceptualmente, es igual que un bucle while.
         * 
         * Los anteriores pueden controlarse por indice o por bandera(ahora veremos lo
         * que es esto). Al fin y al cabo, son igualmente condiciones booleanas.
         */

        String cadena = "Me llego por el numero:";
        // Empecemos con do-while
        int indice = 1;
        System.out.println("---Voy a entrar al do-while---");
        do {
            System.out.println(cadena + indice);
            indice++;
        } while (indice < 1);

        // Seguimos con el bucle while
        System.out.println("---Voy a entrar en el while---");
        while (indice < 1) {
            System.out.println(cadena + indice);
        }

        //Terminamos con el for
        System.out.println("---Voy a entrar en el for---");
        for(indice = 0;indice<1;indice++){
            System.out.println(cadena + indice);
        }

    }

}