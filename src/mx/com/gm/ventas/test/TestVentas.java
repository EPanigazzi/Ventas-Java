
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

public class TestVentas {
    public static void main(String[] args) {
        Producto producto01 = new Producto("Lavadora", 500.8);
        Producto producto02 = new Producto("Cama", 300.6);
        Producto producto03 = new Producto("Mesada", 90.87);
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        
        orden1.agregarProducto(producto01);
        orden1.agregarProducto(producto02);
        orden1.mostrarOrden();
        System.out.println("\n");
        orden2.agregarProducto(producto03);
        orden2.agregarProducto(producto01);
        orden2.agregarProducto(producto02);
        orden2.agregarProducto(producto01);
        orden2.mostrarOrden();
        
        
    }
}
