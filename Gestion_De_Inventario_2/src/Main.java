/*UNIVERSIDAD DE LAS AMÉRICAS
 * Estudiante: Josué Chiriboga
 * Asignatura: Programación II
 * Fecha: 18/11/2024
 * Actividad: Resolucion de Problemas
 * Solución: 2*/

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------Gestor de Inventario 2: Productos Odontologicos-----------");

        // Crear productos
        ProductoPerecedero producto1 = new ProductoPerecedero("Resinas Dentales", 10, 18.00, "22/11/2024", "22/12/2025");
        ProductoPerecedero producto2 = new ProductoPerecedero("Anestesicos", 4, 9.00, "20/11/2024", "22/12/2025");
        ProductoNoPerecedero producto3 = new ProductoNoPerecedero("Sellador Dental", 50, 12.00, "15/11/2024");
        ProductoNoPerecedero producto4 = new ProductoNoPerecedero("Adhesivo Dental", 20, 8.00, "18/11/2024");
        ProductoNoPerecedero producto5 = new ProductoNoPerecedero("Enjuague Bucal", 10, 3.00, "20/11/2024");

        Inventario inventario = new Inventario(5000, 200, 7);

        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);
        inventario.agregarProducto(producto4);
        inventario.agregarProducto(producto5);

        inventario.mostrarInformacionProductos();

        inventario.mostrarRestricciones();

        inventario.verificarReabastecimiento();

        inventario.eliminarProducto(producto3);

        inventario.mostrarInformacionProductos();

        inventario.mostrarRestricciones();
    }
}
