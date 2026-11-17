package pe.edu.upeu.examenfinal.interfaces;

import pe.edu.upeu.examenfinal.Modelo.Ventas;

import java.util.List;

public interface IVentasDao {
    public boolean insert(Ventas v);
    public boolean delete (Ventas v);
    public List<Ventas> vlistAll();
    public boolean update (Ventas v);
}
