
import java.util.Scanner;
import tp.matrices.Matriz;

public class Ejercicio10 {

    /*
10. A partir de una matriz numérica se desea generar un arreglo que contenga todos los elementos de una
columna dada.
Diseñe un algoritmo que solicite al usuario las dimensiones de la matriz, la cargue, luego le solicite la
columna con la cual desea cargar el arreglo, y una vez que lo cargue lo muestre por pantalla.
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cantF, cantC, columnaS;
        System.out.println("Ingrese cant F. ");
        cantF = sc.nextInt();
        System.out.println("Ingrese cant C. ");
        cantC = sc.nextInt();
        int[][] matriz = new int[cantF][cantC];
        Matriz.cargarInt(matriz);
        System.out.println("Ingrese la columna que desea ");
        columnaS = sc.nextInt();
        int[] arregloCol;
        arregloCol = guardarColumna(matriz, columnaS);
        System.out.println("El nuevo arreglo es: ");
        for (int i = 0; i < arregloCol.length; i++) {
            System.out.println(arregloCol[i]);
        }
    }

    public static int[] guardarColumna(int[][] mat, int columnaS) {
        int[] arr;
        int fil;
        int cantFil;
        cantFil = mat.length;
        arr = new int[cantFil];
        for (fil = 0; fil < cantFil; fil++) {
            arr[fil] = mat[fil][columnaS];
        }
        return arr;
    }
}
