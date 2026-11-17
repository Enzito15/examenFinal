package pe.edu.upeu.examenfinal.Modelo;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Usuarios {
    private final IntegerProperty idusuario = new SimpleIntegerProperty();
    private final StringProperty nombres = new SimpleStringProperty();
    private final StringProperty usuario = new SimpleStringProperty();
    private final StringProperty clave = new SimpleStringProperty();
    private final StringProperty rol = new SimpleStringProperty();
    private final StringProperty estado = new SimpleStringProperty();

    public final String getEstado() {
        return estado.get();
    }

    public final void setEstado(String value) {
        estado.set(value);
    }

    public final StringProperty estadoProperty() {
        return estado;
    }

    public final String getRol() {
        return rol.get();
    }

    public final void setRol(String value) {
        rol.set(value);
    }

    public final StringProperty rolProperty() {
        return rol;
    }

    public final String getClave() {
        return clave.get();
    }

    public final void setClave(String value) {
        clave.set(value);
    }

    public final StringProperty claveProperty() {
        return clave;
    }

    public final String getUsuario() {
        return usuario.get();
    }

    public final void setUsuario(String value) {
        usuario.set(value);
    }

    public final StringProperty usuarioProperty() {
        return usuario;
    }

    public final String getNombres() {
        return nombres.get();
    }

    public final void setNombres(String value) {
        nombres.set(value);
    }

    public final StringProperty nombresProperty() {
        return nombres;
    }

    public final int getIdusuario() {
        return idusuario.get();
    }

    public final void setIdusuario(int value) {
        idusuario.set(value);
    }

    public final IntegerProperty idusuarioProperty() {
        return idusuario;
    }

}
