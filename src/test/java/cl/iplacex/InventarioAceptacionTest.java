
package cl.iplacex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InventarioAceptacionTest {

    @Test
    void debeCompletarFlujoDeInventario() {
        // Dado un producto con 10 unidades disponibles
        Producto producto = new Producto("Teclado", 10);
        InventarioService servicio = new InventarioService();

        // Cuando se reciben 5 unidades y se venden 3
        servicio.registrarEntrada(producto, 5);
        servicio.registrarSalida(producto, 3);

        // Entonces el inventario debe quedar con 12 unidades
        assertEquals(12, producto.getStock());
    }
}