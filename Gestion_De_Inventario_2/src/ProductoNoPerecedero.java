public class ProductoNoPerecedero extends Producto{

    public ProductoNoPerecedero(String nombre, int cantidad, double costo, String fechaReabastecimiento) {
        super(nombre, cantidad, costo, fechaReabastecimiento);
    }

    @Override
    public void mostrarProducto() {
        super.mostrarProducto();
        System.out.println("Producto sin fecha de vencimiento");
    }

}
