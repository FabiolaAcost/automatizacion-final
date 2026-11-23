
package cl.iplacex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InventarioServiceIT {

    @Test
    void debeRegistrarEntradaYSalidaDeInventario() {
        Producto producto = new Producto("Monitor", 10);
        InventarioService servicio = new InventarioService();

        servicio.registrarEntrada(producto, 5);
        servicio.registrarSalida(producto, 3);

        assertEquals(12, producto.getStock());
    }

    @Test
    void debeRechazarSalidaSinStockSuficiente() {
        Producto producto = new Producto("Monitor", 5);
        InventarioService servicio = new InventarioService();

        assertThrows(IllegalArgumentException.class,
                () -> servicio.registrarSalida(producto, 8));

        assertEquals(5, producto.getStock());
    }
}