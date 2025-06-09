package service;

import model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}
