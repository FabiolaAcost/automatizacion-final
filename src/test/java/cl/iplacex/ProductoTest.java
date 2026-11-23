package cl.iplacex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    void debeAgregarStock() {
        Producto producto = new Producto("Teclado", 10);

        producto.agregarStock(5);

        assertEquals(15, producto.getStock());
    }

    @Test
    void debeRetirarStock() {
        Producto producto = new Producto("Teclado", 10);

        producto.retirarStock(4);

        assertEquals(6, producto.getStock());
    }

    @Test
    void noDebePermitirRetirarMasDelStockDisponible() {
        Producto producto = new Producto("Teclado", 10);

        assertThrows(IllegalArgumentException.class,
                () -> producto.retirarStock(15));
    }

    @Test
    void noDebePermitirAgregarCantidadNegativa() {
        Producto producto = new Producto("Teclado", 10);

        assertThrows(IllegalArgumentException.class,
                () -> producto.agregarStock(-5));
    }
}