import java.util.Scanner;

public class Ejer_Arreglos {

    // Arreglo bidimensional
    // Filas = meses
    // Columnas = departamentos
    static int[][] ventas = new int[12][3];

    static String[] meses = {
        "Enero", "Febrero", "Marzo", "Abril",
        "Mayo", "Junio", "Julio", "Agosto",
        "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    static String[] departamentos = {
        "Ropa", "Deportes", "Jugueteria"
    };

    // Método para insertar una venta
    public static void insertarVenta(int mes, int departamento, int cantidad) {
        ventas[mes][departamento] = cantidad;
    }

    // Método para buscar una venta
    public static void buscarVenta(int mes, int departamento) {
        System.out.println("\nVenta encontrada:");
        System.out.println("Mes: " + meses[mes]);
        System.out.println("Departamento: " + departamentos[departamento]);
        System.out.println("Venta: $" + ventas[mes][departamento]);
    }

    // Método para eliminar una venta
    public static void eliminarVenta(int mes, int departamento) {
        ventas[mes][departamento] = 0;
        System.out.println("\nLa venta fue eliminada correctamente.");
    }

    // Método para mostrar todas las ventas
    public static void mostrarVentas() {

        System.out.println("\n========== VENTAS MENSUALES ==========");

        System.out.printf("%-15s %-15s %-15s %-15s%n",
                "Mes", "Ropa", "Deportes", "Jugueteria");

        for (int i = 0; i < 12; i++) {

            System.out.printf("%-15s %-15d %-15d %-15d%n",
                    meses[i],
                    ventas[i][0],
                    ventas[i][1],
                    ventas[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // ==========================================
        // INGRESAR LAS VENTAS
        // ==========================================

        System.out.println("===== INGRESO DE VENTAS =====");

        for (int i = 0; i < 12; i++) {

            System.out.println("\n--- " + meses[i] + " ---");

            for (int j = 0; j < 3; j++) {

                System.out.print("Ingrese las ventas de " 
                        + departamentos[j] + ": $");

                int cantidad = entrada.nextInt();

                insertarVenta(i, j, cantidad);
            }
        }

        // Mostrar todas las ventas
        mostrarVentas();

        // ==========================================
        // BUSCAR UNA VENTA
        // ==========================================

        System.out.println("\n===== BUSCAR UNA VENTA =====");

        System.out.println("Ingrese el número del mes (1-12): ");
        int mesBuscar = entrada.nextInt() - 1;

        System.out.println("Seleccione el departamento:");
        System.out.println("0 - Ropa");
        System.out.println("1 - Deportes");
        System.out.println("2 - Jugueteria");

        int departamentoBuscar = entrada.nextInt();

        buscarVenta(mesBuscar, departamentoBuscar);

        // ==========================================
        // ELIMINAR UNA VENTA
        // ==========================================

        System.out.println("\n===== ELIMINAR UNA VENTA =====");

        System.out.println("Ingrese el número del mes (1-12): ");
        int mesEliminar = entrada.nextInt() - 1;

        System.out.println("Seleccione el departamento:");
        System.out.println("0 - Ropa");
        System.out.println("1 - Deportes");
        System.out.println("2 - Jugueteria");

        int departamentoEliminar = entrada.nextInt();

        eliminarVenta(mesEliminar, departamentoEliminar);

        // Mostrar el arreglo después de eliminar
        mostrarVentas();

        entrada.close();
    }
}