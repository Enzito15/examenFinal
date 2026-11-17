package pe.edu.upeu.examenfinal.interfaces;

import pe.edu.upeu.examenfinal.Modelo.Ventas;

import java.util.List;

public interface IVentasDao {
    public boolean insert(Ventas v);
    public boolean delete (Ventas v);
    public List<Ventas> vlistAll();
    //siempre utilizo esta forma de hacer el list, no entiendo por que esta ve no funciono :(
    public boolean update (Ventas v);
}
