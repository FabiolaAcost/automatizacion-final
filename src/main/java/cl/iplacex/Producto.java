package cl.iplacex;

public class Producto {

    private String nombre;
    private int stock;

    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public void agregarStock(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }
        stock += cantidad;
    }

    public void retirarStock(int cantidad) {
        if (cantidad <= 0 || cantidad > stock) {
            throw new IllegalArgumentException("Cantidad no válida");
        }
        stock -= cantidad;
    }
}
