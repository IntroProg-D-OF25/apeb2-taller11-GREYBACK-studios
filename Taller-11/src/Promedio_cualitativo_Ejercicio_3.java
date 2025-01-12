/***
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio 
 * cualitativo de los parámetros. Si el promedio es: De 0 a 5 el promedio cualitativo 
 * es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio es Muy Bueno De 9.1 a 10 
 * el promedio es Sobresaliente. A la función se la debe llamar desde un método principal. 
 * Los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 */
import java.util.Scanner;
public class Promedio_cualitativo_Ejercicio_3 {
       public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el primer valor: ");
        double valor1 = tcl.nextDouble();
        System.out.print("Ingrese el segundo valor: ");
        double valor2 = tcl.nextDouble();
        System.out.print("Ingrese el tercer valor: ");
        double valor3 = tcl.nextDouble();
        System.out.print("Ingrese el cuarto valor: ");
        double valor4 = tcl.nextDouble();
        double promedio = obtenerPromedio(valor1, valor2, valor3, valor4);
        String resultadoCualitativo = obtenerPromedioCualitativo(promedio);
        System.out.printf("El promedio es: ", promedio);
        System.out.println("El promedio cualitativo es: " + resultadoCualitativo);
    }
    public static double obtenerPromedio(double val1, double val2, double val3, double val4) {
        return (val1 + val2 + val3 + val4) / 4;
    }
    public static String obtenerPromedioCualitativo(double promedio) {
        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio > 9 && promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "Fuera de rango";
        }
    }
}
/***
 * Ingrese el primer valor: 7
 * Ingrese el segundo valor: 8
 * Ingrese el tercer valor: 5
 * Ingrese el cuarto valor: 9
 * El promedio es: 7,25
 * El promedio cualitativo es: Bueno
 */