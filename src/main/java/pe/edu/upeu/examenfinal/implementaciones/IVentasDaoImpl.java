package pe.edu.upeu.examenfinal.implementaciones;

import pe.edu.upeu.examenfinal.Modelo.Ventas;
import pe.edu.upeu.examenfinal.Utils.ConexionDB;
import pe.edu.upeu.examenfinal.interfaces.IVentasDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
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
            st.setInt(3, v.getCantidad());
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
        boolean flag = false;
        String query = "DELETE FROM Ventas WHERE idventa=?";
        try (Connection cn = ConexionDB.getConnection();
             PreparedStatement st = cn.prepareStatement(query);
        ) {
            st.setInt(1, v.getIdventa());
            st.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            System.out.println("Error al eliminar las ventas" + e.getMessage());
        }
        return flag;

    }

    @Override
    public List<Ventas> vlistAll() {
        List<Ventas> Lista = new ArrayList<>();
        String query = "SELECT * FROM Ventas;";
        try(Connection cn = ConexionDB.getConnection();
            PreparedStatement st = cn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
        ){
            while (rs.next()){
                Ventas vl = new Ventas();
                vl.setIdventa(rs.getInt("idventa"));
                vl.setCliente(rs.getString("Cliente"));
                vl.setProducto(rs.getString("Producto"));
                vl.setCantidad(rs.getInt("Cantidad"));
                vl.setPrecio(rs.getDouble("Precio"));
                vl.setSubtotal(rs.getDouble("Subtotal"));
                vl.setTotal(rs.getDouble("Total"));
                vl.setFechaVenta(LocalDate.now());
                vl.setEstado(rs.getString("Estado"));
                Lista.add(vl);
            }
        }catch (SQLException e){
            System.out.println("Error al listar Las ventas"+e.getMessage());
        }
        return Lista;
    }

    @Override
    public boolean update(Ventas v) {
        boolean flag = false;
        String query = "UPDATE Ventas SET Cliente=?,Producto=?,Cantidad=?,Precio=?,Subtotal=?,Subtotal=?,Total=?,FechaVenta=?,Estado=?" + "WHERE idventa";
        try (Connection cn = ConexionDB.getConnection();
             PreparedStatement st = cn.prepareStatement(query);) {
            st.setString(1, v.getCliente());
            st.setString(2, v.getProducto());
            st.setInt(3,v.getCantidad());
            st.setDouble(4, v.getPrecio());
            st.setDouble(5, v.getSubtotal());
            st.setDouble(6, v.getTotal());
            st.setString(7,v.getFechaVenta().toString());
            st.setString(8, v.getEstado());
            st.setInt(9,v.getIdventa());
            st.executeUpdate();
            flag = true;

        } catch (SQLException e) {
            System.out.println("Error al incertar: " + e.getMessage());
        }
        return flag;

    }
}
