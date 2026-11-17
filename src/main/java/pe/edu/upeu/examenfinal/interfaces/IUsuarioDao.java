package pe.edu.upeu.examenfinal.interfaces;

import pe.edu.upeu.examenfinal.Modelo.Usuarios;

public interface IUsuarioDao {
    public Usuarios login(String usuario, String clave);
    public boolean insert_new_user(Usuarios u);
}
