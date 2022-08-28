package tp.matrices;

import java.util.Scanner;

public class Matriz {

    // Realizado para Ejercicio1
    public static void imprimirInt(int[][] mat) {
        int fil, col;
        int cantFil, cantCol;
        cantFil = mat.length;
        cantCol = mat[0].length;
        for (fil = 0; fil < cantFil; fil++) {
            for (col = 0; col < cantCol; col++) {
                System.out.print(mat[fil][col] + " ");
            }
            System.out.println("");
        }
    }

    // Realizado para Ejercicio1
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
// Realizado para Ejercicio2    

    public static void cargarChar(char[][] mat) {
        Scanner sc = new Scanner(System.in);
        int fil, col;
        int cantFil, cantCol;
        char valorLeido;
        cantFil = mat.length;
        cantCol = mat[0].length;
        for (fil = 0; fil < cantFil; fil++) {
            for (col = 0; col < cantCol; col++) {
                System.out.println("Ingrese el valor en la fila " + (fil + 1) + " y la columna " + (col + 1));
                valorLeido = sc.next().charAt(0);
                mat[fil][col] = valorLeido;
            }
        }
    }
// Realizado para Ejercicio2 

    public static void imprimirDiagChar(char[][] mat) {
        int fil, col;
        int cantFil, cantCol;
        cantFil = mat.length;
        cantCol = mat[0].length;
        for (fil = 0; fil < cantFil; fil++) {
            for (col = 0; col < cantCol; col++) {
                if (fil == col) {
                    System.out.print(mat[fil][col]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    // Realizado para Ejercicio3 

    public static void cargarString(String[][] mat) {
        Scanner sc = new Scanner(System.in);
        int fil, col;
        int cantFil, cantCol;
        String valorLeido;
        cantFil = mat.length;
        cantCol = mat[0].length;
        for (fil = 0; fil < cantFil; fil++) {
            for (col = 0; col < cantCol; col++) {
                System.out.println("Ingrese el valor en la fila " + (fil + 1) + " y la columna " + (col + 1));
                valorLeido = sc.nextLine();
                mat[fil][col] = valorLeido;
            }
        }
    }


}
