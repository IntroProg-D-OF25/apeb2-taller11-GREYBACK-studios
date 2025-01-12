/***
 * Generar los procedimientos y/o funciones que impriman los valor pares, 
 * impares y el promedio de un arreglo bidimensional. El (los) procedimiento(s) 
 * o método(s) deben ser invocados desde el método principal (quien 
 * es el único responsable de gestionar las entradas/salidas); además el método 
 * debe recibir como parámetro un arreglo bidimension
 */
import java.util.Scanner;
public class Promedio_matriz_Ejercicio_1 {
     public static void main(String[] args) {
        int LimFil = 0, LimCol = 0;
        Scanner tcl = new Scanner(System.in);
        System.out.println("DEME LIMITE DE FILAS Y LIMITE DE COLUMNAS: ");
        LimFil = tcl.nextInt();
        LimCol = tcl.nextInt();
        int matriz[][] = new int[LimFil][LimCol];
        genmatriz(matriz);
        presentarmatriz(matriz);
        System.out.println("Elementos pares de la matriz: ");
        presentarpares(matriz);
        System.out.println("Elementos impares de la matriz: ");
        presentarimpares(matriz);
        System.out.println("Promedio de la matriz: " + promedio(matriz));
    }
    public static void genmatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public static void presentarmatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void presentarpares(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void presentarimpares(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 != 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static double promedio(int matriz[][]) {
        int sumamatriz = 0;
        int totalElementos = matriz.length * matriz[0].length;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumamatriz += matriz[i][j];
            }
        }
        return (double) sumamatriz / totalElementos;
    }
}
/***
 * DEME LIMITE DE FILAS Y LIMITE DE COLUMNAS: 
 * 8 5
 * 4 1 0 9 7 
 * 7 2 5 8 4 
 * 9 5 7 5 3 
 * 4 3 6 5 2 
 * 7 6 0 0 2 
 * 4 3 3 3 5 
 * 2 3 9 0 8 
 * 0 9 6 8 6 
 * Elementos pares de la matriz: 
 * 4 0 
 * 2 8 4
 * 4 6 2 
 * 6 0 0 2 
 * 4 
 * 2 0 8 
 * 0 6 8 6 
 * Elementos impares de la matriz: 
 * 1 9 7 
 * 7 5 
 * 9 5 7 5 3 
 * 3 5 
 * 7 
 * 3 3 3 5 
 * 3 9 
 * 9 
 * Promedio de la matriz: 4.5
 */