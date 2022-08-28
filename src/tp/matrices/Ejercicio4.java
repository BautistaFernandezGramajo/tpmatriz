package tp.matrices;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String args[]) {
        // Ejercicio A
        int[][] matriz = new int[10][6];
        cargarNotaAlumnos(matriz);
        promedioAlumnos(matriz);
        // Ejercicio B
        System.out.println("Ingrese el numero de alumno para visualizar sus notas y su promedio.");

    }

    public static void cargarNotaAlumnos(int[][] mat) {
        Scanner sc = new Scanner(System.in);
        int fil, col;
        int cantFil, cantCol, valorLeido;
        cantFil = mat.length;
        cantCol = mat[0].length;
        for (fil = 0; fil < cantFil; fil++) {
            for (col = 0; col < cantCol; col++) {
                System.out.print("Ingrese la nota de alumno " + (fil + 1) + ", examen " + (col + 1) + " : ");
                valorLeido = sc.nextInt();
                mat[fil][col] = valorLeido;
                System.out.println("");
            }
        }
    }

    public static void promedioAlumnos(int[][] mat) {
        int fil, col;
        double promedio = 0;
        int cantFil, cantCol;
        cantFil = mat.length;
        cantCol = mat[0].length;
        for (fil = 0; fil < cantFil; fil++) {
            for (col = 0; col < cantCol; col++) {
                promedio = promedio + mat[fil][col];
            }
            promedio = promedio / 6;
            System.out.print("El promedio del alumno " + (fil + 1) + " es " + promedio);
            System.out.println("");
        }
    }
}
