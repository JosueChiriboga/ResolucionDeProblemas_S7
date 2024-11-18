public class ProductoPerecedero extends Producto {
    private String fechaVencimiento;

    public ProductoPerecedero(String nombre, int cantidad, double costo, String fechaReabastecimiento, String fechaVencimiento) {
        super(nombre, cantidad, costo, fechaReabastecimiento);
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public void mostrarProducto() {
        super.mostrarProducto();
        System.out.println("Fecha de Vencimiento:" + fechaVencimiento);
    }

}
