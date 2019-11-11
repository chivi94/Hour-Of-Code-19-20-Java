/**
 * Vamos a aprender a usar y crear Arrays, unidimensionales y bidimensionales. Aprenderemos como recorrelos,
 * como rellenarlos, y como buscar en ellos.
 */
public class EjemploArrays {

	public static void main(String[] args) {
		//Lo primero que deberemos hacer es iniciar el Array. Para ello ponemos el tipo que tendrá el array y su nombre.
		//Después lo inicializaremos con un =new tipo y el tamaño que tendrá el array. Recordemos que los arrays empizan en 0
		int [] enteros= new int[5];
	
		// De esta forma hemos creado un Array de ints, llamado entero y con espacio 5. ¿Cómo podríamos rellenarlo?
		// Podemos hacerlo manualmente, accediendo a cada una de sus posiciones.
		
		enteros[0]=10;
		enteros[1]=20;
		enteros[2]=30;
		enteros[3]=40;
		enteros[4]=50;
		
		// ¿Y cómo podriamos imprimirlo? Para ello deberemos recorrer el array con un bucle for
		
		for(int i=0; i<enteros.length;i++) {
			System.out.println("El elementos que esta en la celda " + i + " del array es "+ enteros[i]);
		}
		
		// Pero también podemos rellenar los arrays directamente en su constructor.
		
		 char[] caracteres = new char[]{ 'a','b','c','d','e','f','g','h','i','j' };
		 
		 //Y lo podríamos imprimir de la misma manera
		 for(int i=0; i<caracteres.length;i++) {
				System.out.println("El elementos que esta en la celda " + i + " del array de caracteres es "+ caracteres[i]);
			}
		 
		 // Por último tendríamos los arrays multimensionales, que si son de dos dimensiones podemos encontrar
		 // similares a matrices bidimensionales.
		 
		 //Para declararlos, siguen la misma estructura que los arrays unidimensionales, pero deberemos decir
		 // El espacio que tendrán las celdas, y las columnas (no tienen por que ser las mismas)
		 
		 char[][] bidimensionalEnteros = new char[3][3]; 
		 
		 // Para rellenarlo, podremos hacerlo igual que en los arrays anteriores, accediendo a sus elementos individualmente, 
		 // o a través de dos bucles for anidados
		 
		 char caracter='a';
		 
		 //Este primer for va recorriendo las filas
		 for(int filas=0;filas<bidimensionalEnteros.length;filas++) {
			 	//Este segundo for recorre las columnas
			 for(int columnas=0;columnas<bidimensionalEnteros[filas].length;columnas++) {
				 //Vamos rellenando el array cambiando de columna, pero manteniendonos en la misma fila hasta que 
				 //se acaban las columnas
				 bidimensionalEnteros[filas][columnas]=caracter;
				 caracter++;
			 }
			
		 }
		 
		 //Para imprimirlo debemos recorrer también el array con 2 bucles anidados de tipo for, uno para las filas y otro para
		 //Las columnas. Así vamos accediendo a cada casilla.
		 
		 
		 for(int filas=0;filas<bidimensionalEnteros.length;filas++) {
			 	//Imprimimos lo que hay en la casilla
			 for(int columnas=0;columnas<bidimensionalEnteros[filas].length;columnas++) {
				System.out.print(bidimensionalEnteros[filas][columnas]);
			 }
			 //Imprimimos un salto de linea 
			System.out.println();
		 }
	}

}
