package cl.iplacex;

public class InventarioService {

    public void registrarEntrada(Producto producto, int cantidad) {
        producto.agregarStock(cantidad);
    }

    public void registrarSalida(Producto producto, int cantidad) {
        producto.retirarStock(cantidad);
    }
}