package tp.matrices;

import java.util.Scanner;

/**
 *
 * @author ITProactive
 */
public class Ejercicio10 {

    public static void main(String args[]) {
        // Consigna
        /* A partir de una matriz numérica se desea generar un arreglo que contenga todos los elementos de una
         columna dada. Diseñe un algoritmo que solicite al usuario las dimensiones de la matriz, la cargue, luego 
         le solicite la columna con la cual desea cargar el arreglo, y una vez que lo cargue lo muestre por pantalla.*/

        Scanner sc = new Scanner(System.in);
        int cantF, cantC, columnaS;
        System.out.print("Ingrese cant F. :");
        cantF = sc.nextInt();
        System.out.print("Ingrese cant C. :");
        cantC = sc.nextInt();
        // Defino y creo la matriz inicial según los parametros
        int[][] matriz = new int[cantF][cantC];
        cargarInt(matriz);
        System.out.print("Ingrese la columna que desea :");
        columnaS = sc.nextInt();
        // Defino el arreglo donde se guardaran los elementos
        int[] arregloCol;
        arregloCol = guardarColumna(matriz, columnaS); // Le asigno el arreglo creado en el modulo
        System.out.println("El nuevo arreglo es: ");
        imprimirArreglo(arregloCol);
    }

    public static void imprimirArreglo(int[] arr) {
        // Dado un arreglo, imprime sus elementos
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static int[] guardarColumna(int[][] mat, int columnaS) {
        // Dada una matriz y un valor entero que represente el valor de una columna,
        // devuelve un arreglo que contiene los elementos de la misma.
        int[] arr;
        int fil;
        int cantFil;
        cantFil = mat.length;
        arr = new int[cantFil]; // Ya que la cantidad de elementos que tiene una columna esta det. por las filas...
        for (fil = 0; fil < cantFil; fil++) {
            // Las filas van cambiando pero las columnas no.
            arr[fil] = mat[fil][columnaS - 1];
        }
        return arr;
    }
    
        public static void cargarInt(int[][] mat) {
        Scanner sc = new Scanner(System.in);
        int fil, col;
        int cantFil, cantCol, valorLeido;
        cantFil = mat.length;
        cantCol = mat[0].length;
        for (fil = 0; fil < cantFil; fil++) {
            for (col = 0; col < cantCol; col++) {
                System.out.println("Ingrese el valor en la fila " + (fil + 1) + " y la columna " + (col + 1));
                valorLeido = sc.nextInt();
                mat[fil][col] = valorLeido;
            }
        }
    }

}
