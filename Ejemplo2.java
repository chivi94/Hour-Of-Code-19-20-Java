import java.util.*;

public class Ejemplo2{

    public static void imprimir(String mensaje){
        System.out.print(mensaje);
    }

    public static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        String mensaje = "Introduce un entero positivo: ";

        imprimir(mensaje);
        int numero1 = teclado.nextInt();
        imprimir(mensaje);
        int numero2 = teclado.nextInt();

        if(numero1 > 0 && numero2 > 0){
            System.out.println("La suma de " + numero1 + "+" + numero2 
            + " es =" + suma(numero1, numero2));
        }else{
            if(numero1 < 0){
                System.out.println("El primer numero es negativo");
            }else if(numero2 < 0){
                System.out.println("El segundo numero es negativo");
            }else{
                System.out.println("Uno de los dos números no era positivo.");
            }
            
        }



    }

}