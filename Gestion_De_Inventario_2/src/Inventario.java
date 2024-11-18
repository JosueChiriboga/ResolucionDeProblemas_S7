import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> productos;
    private double presupuesto;
    private int espacioAlmacenamiento;
    private int tiempoEntrega;  // Tiempo de entrega en días

    // Constructor
    public Inventario(double presupuesto, int espacioAlmacenamiento, int tiempoEntrega) {
        this.productos = new ArrayList<Producto>();
        this.presupuesto = presupuesto;
        this.espacioAlmacenamiento = espacioAlmacenamiento;
        this.tiempoEntrega = tiempoEntrega;
    }

    // Getters
    public List<Producto> getProductos() {
        return productos;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public int getEspacioAlmacenamiento() {
        return espacioAlmacenamiento;
    }

    public int getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void agregarProducto(Producto producto) {
        if (presupuesto >= producto.getCosto() * producto.getCantidad() && espacioAlmacenamiento >= producto.getCantidad()) {
            productos.add(producto);
            presupuesto -= producto.getCosto() * producto.getCantidad();
            espacioAlmacenamiento -= producto.getCantidad();
            System.out.println("Producto Agregado:" + producto.getNombre());
        } else {
            System.out.println("Producto No Agregado:" + producto.getNombre());
        }
    }

    public boolean eliminarProducto(Producto producto) {
        System.out.println("\n---------Productos Eliminados---------");
        if (productos.contains(producto)) {
            productos.remove(producto);
            presupuesto += producto.getCosto() * producto.getCantidad();
            espacioAlmacenamiento += producto.getCantidad();
            System.out.println("Producto Eliminado:" + producto.getNombre());
            return true;
        } else {
            System.out.println("Producto No Eliminado" + producto.getNombre());
            return false;
        }
    }

    public void mostrarRestricciones() {
        System.out.println("\n---------Restricciones de Inventario---------");
        System.out.println("Presupuesto restante:$" + presupuesto);
        System.out.println("Espacio de almacenamiento restante:" + espacioAlmacenamiento + " unidades");
        System.out.println("Tiempo de Entrega:" + tiempoEntrega + " dias");
    }

    public void verificarReabastecimiento() {
        System.out.println("\n-----------Verificar Reabastecimiento-----------");
        for (Producto producto : productos) {
            if (producto.getCantidad() < 5) {
                System.out.println("Producto Necesita Reabastecimiento:" + producto.getNombre());
            } else {
                System.out.println("Productos No Necesitan Reabastecimiento:" + producto.getNombre());
            }
        }
    }

    public void mostrarInformacionProductos() {
        if (productos.isEmpty()) {
            System.out.println("Inventario Vacio");
        } else {
            System.out.println("\nProductos Registrados");
            for (Producto producto : productos) {
                producto.mostrarProducto();
            }
        }
    }

}
