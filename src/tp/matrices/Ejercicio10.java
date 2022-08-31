
package tp.matrices;

import java.util.Scanner;

/**
 *
 * @author ITProactive
 */
public class Ejercicio10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cantF, cantC, columnaS;
        System.out.print("Ingrese cant F. :");
        cantF = sc.nextInt();
        System.out.print("Ingrese cant C. :");
        cantC = sc.nextInt();
        int[][] matriz = new int[cantF][cantC];
        Matriz.cargarInt(matriz);
        System.out.print("Ingrese la columna que desea :");
        columnaS = sc.nextInt();
        int[] arregloCol;
        arregloCol = guardarColumna(matriz, columnaS); // falta modularizar
        System.out.println("El nuevo arreglo es: ");
        imprimirArreglo(arregloCol);
    }
    
    public static void imprimirArreglo(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " ");
        }
    }
    
    public static int[] guardarColumna(int[][] mat, int columnaS) {
        int[] arr;
        int fil;
        int cantFil;
        cantFil = mat.length;
        arr = new int[cantFil]; // Ya que la cantidad de elementos que tiene una columna esta det. por las filas...
        for (fil = 0; fil < cantFil; fil++) {
            // Las filas van cambiando pero las columnas no.
            arr[fil] = mat[fil][columnaS-1]; 
        }
        return arr;
    }
    
    
}
