/*UNIVERSIDAD DE LAS AMÉRICAS
* Estudiante: Josué Chiriboga
* Asignatura: Programación II
* Fecha: 18/11/2024
* Actividad: Resolucion de Problemas
* Solución: 1*/

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------Gestor de Inventario 1-----------");

        Producto producto1 = new Producto("Resinas Dentales", 10, 18.00, "22/11/2024");
        Producto producto2 = new Producto("Anestesicos", 4, 9.00, "20/11/2024");
        Producto producto3 = new Producto("Sellador Dental", 50, 12.00, "15/11/2024");
        Producto producto4 = new Producto("Adhesivo Dental", 20, 8.00, "18/11/2024");
        Producto producto5 = new Producto("Enjuague Bucal", 10, 3.00, "20/11/2024");

        Inventario inventario = new Inventario(5000, 200, 7);

        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);
        inventario.agregarProducto(producto4);
        inventario.agregarProducto(producto5);

        inventario.mostrarInformacionProductos();

        inventario.mostrarRestricciones();

        inventario.verificarReabastecimiento();

        inventario.eliminarProducto(producto2);

        inventario.mostrarInformacionProductos();

        inventario.mostrarRestricciones();
    }
}
