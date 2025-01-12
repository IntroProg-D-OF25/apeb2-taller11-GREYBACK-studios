/***
 * Generar una solución que implemente 3 procedimientos. 
 * Que permitan calcular el área de un cuadrado, área de un triángulo y área de un rectángulo.
 * Cada procedimiento/función debe recibir los datos necesarios y generar el valor correspondiente.
 * Se debe invocar a los procedimientos desde un método principal; Si el usuario ingresa 1 se llama 
 * al procedimiento obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo; 3 se llama 
 * al procedimiento obtenerAreaCuadrado.
 * El área del cuadrado es igual a lado x lado x lado x lado
 * El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 */
import java.util.Scanner;
public class Calcular_Area_Ejercicio_2 {
   public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Seleccione una opción para calcular el área:");
        System.out.println("1. Área de un cuadrado");
        System.out.println("2. Área de un triángulo");
        System.out.println("3. Área de un rectángulo");
        int opcion = tcl.nextInt();
        switch (opcion) {
            case 1:
                obtenerAreaCuadrado(tcl);
                break;
            case 2:
                obtenerAreaTriangulo(tcl);
                break;
            case 3:
                obtenerAreaRectangulo(tcl);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
    public static void obtenerAreaCuadrado(Scanner scanner) {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado * lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }
    public static void obtenerAreaTriangulo(Scanner scanner) {
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }
    public static void obtenerAreaRectangulo(Scanner scanner) {
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
}
/***
 * Seleccione una opción para calcular el área:
 * 1. Área de un cuadrado
 * 2. Área de un triángulo
 * 3. Área de un rectángulo
 * 1
 * Ingrese el lado del cuadrado: 4
 * El área del cuadrado es: 256.0
 */