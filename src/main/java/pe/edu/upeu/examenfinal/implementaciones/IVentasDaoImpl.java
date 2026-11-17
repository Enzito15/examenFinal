package pe.edu.upeu.examenfinal.implementaciones;

import pe.edu.upeu.examenfinal.Modelo.Ventas;
import pe.edu.upeu.examenfinal.Utils.ConexionDB;
import pe.edu.upeu.examenfinal.interfaces.IVentasDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class IVentasDaoImpl implements IVentasDao {
    @Override
    public boolean insert(Ventas v) {
        boolean flag = false;
        String query = "INSERT INTO Ventas(Cliente,Producto,Cantidad,Precio,Subtotal,Total,FechaVenta,Estado) VALUES(?,?,?,?,?,?,?,?);";
        try (Connection cn = ConexionDB.getConnection();
             PreparedStatement st = cn.prepareStatement(query);
        ) {
            st.setString(1, v.getCliente());
            st.setString(2, v.getCliente());
            st.setString(3, v.getCantidad());
            st.setDouble(4, v.getPrecio());
            st.setDouble(5, v.getSubtotal());
            st.setDouble(6, v.getTotal());
            st.setString(7, v.getFechaVenta().toString());
            st.setString(8, v.getEstado());
            st.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            System.out.println("Error al listar la venta" + e.getMessage());
        }
        return flag;

    }

    @Override
    public boolean delete(Ventas v) {
        return false;
    }

    @Override
    public List<Ventas> listAll() {
        return List.of();
    }

    @Override
    public boolean update(Ventas v) {
        return false;
    }
}
