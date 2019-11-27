public class Ejemplo5{

    public static void main(String args[]){
        int numeros[] = new int[5];
        int numeros2[] = new int[]{1,2,3,4,5};
        numeros[0] = 1;
        numeros[1] = 2;

        for(int posicion = 0; posicion <= numeros.length - 1; posicion++){
            numeros[posicion] = 1;
        }

        int matriz[][] = new int[5][5];
        for(int fila = 0; fila < matriz.length; fila++){
            for(int columna = 0; columna < matriz[fila].length; columna++){
                matriz[fila][columna] = 1;
            }
        }
    }

}