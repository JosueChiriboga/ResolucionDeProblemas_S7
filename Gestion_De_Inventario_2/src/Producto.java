public class Producto {
    private String nombre;
    private int cantidad;
    private double costo;
    private String fechaReabastecimiento;

    // Constructor
    public Producto(String nombre, int cantidad, double costo, String fechaReabastecimiento) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costo = costo;
        this.fechaReabastecimiento = fechaReabastecimiento;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public String getFechaReabastecimiento() {
        return fechaReabastecimiento;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setFechaReabastecimiento(String fechaReabastecimiento) {
        this.fechaReabastecimiento = fechaReabastecimiento;
    }

    @Override
    public String toString() {
        return  "-----------------------------" + "\n" +
                "Nombre:" + nombre + "\n" +
                "Cantidad:" + cantidad + "\n" +
                "Costo:" + costo + "\n" +
                "Fecha de Reabastecimiento:" + fechaReabastecimiento;
    }

    public void mostrarProducto() {
        System.out.println(toString());
    }
}

