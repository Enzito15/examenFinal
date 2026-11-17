package pe.edu.upeu.examenfinal.Modelo;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Ventas {
    private final IntegerProperty idventa = new SimpleIntegerProperty();
    private final StringProperty idusuario = new SimpleStringProperty();
    private final StringProperty Cliente = new SimpleStringProperty();
    private final StringProperty producto = new SimpleStringProperty();
    private final IntegerProperty cantidad = new SimpleIntegerProperty();
    private final DoubleProperty precio = new SimpleDoubleProperty();
    private final DoubleProperty subtotal = new SimpleDoubleProperty();
    private final DoubleProperty total = new SimpleDoubleProperty();
    private final ObjectProperty<LocalDate> FechaVenta = new SimpleObjectProperty<>();
    private final StringProperty estado = new SimpleStringProperty();

    public final int getCantidad() {
        return cantidad.get();
    }

    public final void setCantidad(int value) {
        cantidad.set(value);
    }

    public final IntegerProperty cantidadProperty() {
        return cantidad;
    }
    public final String getEstado() {
        return estado.get();
    }

    public final void setEstado(String value) {
        estado.set(value);
    }

    public final StringProperty estadoProperty() {
        return estado;
    }

    public final LocalDate getFechaVenta() {
        return FechaVenta.get();
    }

    public final void setFechaVenta(LocalDate value) {
        FechaVenta.set(value);
    }

    public final ObjectProperty<LocalDate> FechaVentaProperty() {
        return FechaVenta;
    }

    public final double getTotal() {
        return total.get();
    }

    public final void setTotal(double value) {
        total.set(value);
    }

    public final DoubleProperty totalProperty() {
        return total;
    }

    public final double getSubtotal() {
        return subtotal.get();
    }

    public final void setSubtotal(double value) {
        subtotal.set(value);
    }

    public final DoubleProperty subtotalProperty() {
        return subtotal;
    }

    public final double getPrecio() {
        return precio.get();
    }

    public final void setPrecio(double value) {
        precio.set(value);
    }

    public final DoubleProperty precioProperty() {
        return precio;
    }

    public final String getProducto() {
        return producto.get();
    }

    public final void setProducto(String value) {
        producto.set(value);
    }

    public final StringProperty productoProperty() {
        return producto;
    }

    public Ventas() {
    }

    public final String getCliente() {
        return Cliente.get();
    }

    public final void setCliente(String value) {
        Cliente.set(value);
    }

    public final StringProperty ClienteProperty() {
        return Cliente;
    }

    public final String getIdusuario() {
        return idusuario.get();
    }

    public final void setIdusuario(String value) {
        idusuario.set(value);
    }

    public final StringProperty idusuarioProperty() {
        return idusuario;
    }

    public final int getIdventa() {
        return idventa.get();
    }

    public final void setIdventa(int value) {
        idventa.set(value);
    }

    public final IntegerProperty idventaProperty() {
        return idventa;
    }

}
