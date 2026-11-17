package pe.edu.upeu.examenfinal.Test;

import pe.edu.upeu.examenfinal.Modelo.Ventas;
import pe.edu.upeu.examenfinal.implementaciones.IVentasDaoImpl;
import pe.edu.upeu.examenfinal.interfaces.IVentasDao;

import java.time.LocalDate;
import java.util.List;

public class testVentas {
    static IVentasDao vl = new IVentasDaoImpl();
    public static void incertar(){
        Ventas v = new Ventas();
        v.setCliente("Enzo Yair");
        v.setProducto("Coca-cola");
        v.setCantidad(10);
        v.setPrecio(10.0);
        v.setSubtotal(10.0);
        v.setTotal(10.0);
        v.setFechaVenta((LocalDate.now()));
        v.setEstado("Comprado");
        boolean result = vl.insert(v);
        if (result) {
            System.out.println("incert correcto");
        } else {
            System.out.println("incert incorrecto");
        }
    }
    public static void eliminar() {
        Ventas v = new Ventas();
        v.setIdventa(1);
        boolean result = vl.delete(v);
        if (result) {
            System.out.println("delete succes");
        } else {
            System.out.println("delete error");
        }
    }
    public static void listar() {
        List<Ventas> lista = vl.vlistAll();
        if (lista != null && !lista.isEmpty()) {
            for (Ventas ventas : lista) {
                System.out.println("Id_Venta: " + ventas.getIdventa());
                System.out.println("Cliente: " + ventas.getCliente());
                System.out.println("Producto: " + ventas.getProducto());
                System.out.println("Precio: " + ventas.getPrecio());
                System.out.println("Subtotal: " + ventas.getSubtotal());
                System.out.println("Total: " + ventas.getTotal());
                System.out.println("Fecha_Veta: " + ventas.getFechaVenta());
                System.out.println("Estado: " + ventas.getEstado());

            }
        } else {
            System.out.println("No hay registros");

        }
    }

    public static void main(String[] args) {
        incertar();
        System.out.println("**********************");
        listar();

    }
//profe sorry intente de lo que estaba a mi alcance pero no se quiso incertar ni na, y eso que la db segun el test funciona :(
}
