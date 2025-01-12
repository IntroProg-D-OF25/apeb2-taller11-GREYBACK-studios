/***
 * Generar las funciones/métodos que devuelvan las suma, resta y multiplicación
 * de un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 */
import java.util.Scanner;
public class Operaciones_Matriz_Ejercicio_5 {
    public static void main(String[] args) {
        int LimFil = 0, LimCol = 0;
        Scanner tcl = new Scanner(System.in);
        System.out.println("DEME LIMITE DE FILAS Y LIMITE DE COLUMNAS: ");
        LimFil = tcl.nextInt();
        LimCol = tcl.nextInt();
        int matriz[][] = new int[LimFil][LimCol];
        genmatriz(matriz);
        presentarmatriz(matriz);
        System.out.println("Suma de los elementos de la matriz: " + sumaMatriz(matriz));
        System.out.println("Resta de los elementos de la matriz: " + restaMatriz(matriz));
        System.out.println("Multiplicación de los elementos de la matriz: " + multiplicacionMatriz(matriz));
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

    public static int sumaMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
    public static int restaMatriz(int[][] matriz) {
        int resta = matriz[0][0]; // Inicia con el primer elemento
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (!(i == 0 && j == 0)) {
                    resta -= matriz[i][j];
                }
            }
        }
        return resta;
    }
    public static int multiplicacionMatriz(int[][] matriz) {
        int multiplicacion = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                multiplicacion *= matriz[i][j];
            }
        }
        return multiplicacion;
    }
}
/***
 * DEME LIMITE DE FILAS Y LIMITE DE COLUMNAS: 
 * 2
 * 3
 * 6 2 7 
 * 5 9 7 
 * Suma de los elementos de la matriz: 36
 * Resta de los elementos de la matriz: -24
 * Multiplicación de los elementos de la matriz: 26460
 */
