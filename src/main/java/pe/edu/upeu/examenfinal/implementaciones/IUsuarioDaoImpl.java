package pe.edu.upeu.examenfinal.implementaciones;

import pe.edu.upeu.examenfinal.Modelo.Usuarios;
import pe.edu.upeu.examenfinal.interfaces.IUsuarioDao;

public class IUsuarioDaoImpl implements IUsuarioDao {
    @Override
    public Usuarios login(String usuario, String clave) {
        return null;
    }

    @Override
    public boolean insert_new_user(Usuarios u) {
        return false;
    }
}
