package tp.matrices;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantF, cantC;
        System.out.println("Ingrese una cantidad de filas");
        cantF = sc.nextInt();
        System.out.println("Ingrese una cantidad de columnas");
        cantC = sc.nextInt();
        int[][] matriz = new int[cantF][cantC];
        Matriz.cargarInt(matriz);
        Matriz.imprimirInt(matriz);
    }
}
