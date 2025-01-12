/***
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular
 * el valor del predio de un bien inmueble. Cada procedimiento debe tener 2 parámetros (tipo cadena para 
 * nombre del cliente, cédula del cliente).
 * En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio 
 * y el número de kilowatios del mes. Y se genera en pantalla el siguiente 
 * reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10
 *
 * En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener 
 * el valor del predio se saca el 2% del valor del inmueble. Y se genera el siguiente reporte:
 *
 * Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.
 *
 * En el método principal; si el usuario ingresa 1 se llama al procedimiento 
 * calcularValorLuz; 2 se llama al procedimiento calcularPredio. Los datos que se necesita 
 * en cada procedimiento se los debe ingresar por teclado.
 */
import java.util.Scanner;
public class Gestio_Pagos_Ejercicio_4 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = tcl.nextLine();
        System.out.print("Ingrese la cédula del cliente: ");
        String cedulaCliente = tcl.nextLine();
        System.out.println("Seleccione una opción:");
        System.out.println("1. Calcular valor de la planilla de luz");
        System.out.println("2. Calcular valor del predio de un bien inmueble");
        int opcion = tcl.nextInt();
        switch (opcion) {
            case 1:
                calcularValorLuz(nombreCliente, cedulaCliente, tcl);
                break;
            case 2:
                calcularPredio(nombreCliente, cedulaCliente, tcl);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
    public static void calcularValorLuz(String nombre, String cedula, Scanner scanner) {
        System.out.print("Ingrese el valor del kilovatio: ");
        double valorKilovatio = scanner.nextDouble();
        System.out.print("Ingrese el número de kilovatios consumidos: ");
        double numeroKilovatios = scanner.nextDouble();
        double total = valorKilovatio * numeroKilovatios;
        System.out.println("Cliente " + nombre + " con cédula " + cedula + " debe cancelar el valor de $" + total);
    }
    public static void calcularPredio(String nombre, String cedula, Scanner scanner) {
        System.out.print("Ingrese el valor del inmueble: ");
        double valorInmueble = scanner.nextDouble();
        double valorPredio = valorInmueble * 0.02;
        System.out.println("Cliente: " + nombre + " con cédula: " + cedula + " tiene un bien inmueble valorado en $" 
                            + valorInmueble + " y tiene que pagar de predio $" + valorPredio);
    }
}
/***
 * Ingrese el nombre del cliente: Ana Contreras
 * Ingrese la cédula del cliente: 1100112233
 * Seleccione una opción:
 * 1. Calcular valor de la planilla de luz
 * 2. Calcular valor del predio de un bien inmueble
 * 1
 * Ingrese el valor del kilovatio: 1,5
 * Ingrese el número de kilovatios consumidos: 6,75
 * Cliente: Ana Contreras con cédula: 1100112233 debe cancelar el valor de $10.125
 * ***************************************
 * Ingrese el nombre del cliente: Ana Contreras
 * Ingrese la cédula del cliente: 1100112233
 * Seleccione una opción:
 * 1. Calcular valor de la planilla de luz
 * 2. Calcular valor del predio de un bien inmueble
 * 2
 * Ingrese el valor del inmueble: 30000
 * Cliente: Ana Contreras con cédula: 1100112233 tiene un bien inmueble valorado en $30000.0 y tiene que pagar de predio $600.0
 */
