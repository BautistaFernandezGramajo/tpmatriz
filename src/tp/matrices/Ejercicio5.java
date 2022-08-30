
package tp.matrices;

import java.util.Scanner;


public class Ejercicio5 {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cantF, cantC;
        boolean cuadMag;
        System.out.println("Ingrese cant F. ");
        cantF = sc.nextInt();
        System.out.println("Ingrese cant C. ");
        cantC = sc.nextInt();
        int[][]matriz = new int[cantF][cantC];
        Matriz.cargarInt(matriz);
        cuadMag = cuadradoMagico(matriz);
    }
    
    public static boolean cuadradoMagico(int[][]mat){
        boolean esMag = true;
        int i = 0;
        // int sumaFila1, sumaFila2, sumaFila3, sumaCol1, sumaCol2, sumaCol3, sumaDiag1, sumaDiag2;
        
        do {
           
            
        } while (esMag && i<=8);
        return esMag;
    }
    
    public static int sumarFila(int[][]mat, int i){
    int sumaFila;
        for (int i = 0; i < ; i++) {
            
        }
    return sumaFila;
    }
}
