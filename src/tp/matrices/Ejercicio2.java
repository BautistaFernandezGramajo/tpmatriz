package tp.matrices;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cantF, cantC;
        System.out.println("Ingrese una cantidad de filas");
        cantF = sc.nextInt();
        System.out.println("Ingrese una cantidad de columnas");
        cantC = sc.nextInt();
        char[][] matriz = new char[cantF][cantC];
        Matriz.cargarChar(matriz);
        Matriz.imprimirDiagChar(matriz);
    }
}
