package tp.matrices;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String args[]) {
        int[][] matriz = new int[10][6];
        Matriz.cargarNotaAlumnos(matriz);
        Matriz.promedioAlumnos(matriz);
    }
}
