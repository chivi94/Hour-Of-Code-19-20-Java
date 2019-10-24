
/**
 * En este ejemplo se vera la creacion, asignacion y uso de variables basicas en Java.
 */
public class EjemploVariables{

    public static void main(String args[]){
        //Los char son caracteres individuales, van entre comillas simples.
        char letra = 'a';
        System.out.println(letra);
        //Los int son numeros enteros. Si en ellos se almacena un numero decimal, la informacion a la derecha del punto se ignora.
        int numero = 2;
        System.out.println(numero);
        //Los double son numeros en punto flotante.
        double numeroDecimal = 2.5;
        System.out.println(numeroDecimal);
        //Los String se usan para cadenas de texto. Se considera cadena a partir de 2 caracteres en adelante.
        String frase = "Soy una frase";
        System.out.println(frase);
        //Los booleanos son condiciones logicas. Se usan para comprobar eventos o para estructuras de control, que veremos mas adelante
        //¿Que valor tiene este booleano?
        boolean comprobar = 1 < 2;
        System.out.println(comprobar);

    }
}