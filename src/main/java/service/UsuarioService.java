package service;


   
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.mycompany.microservusuario.Usuario;
import com.mycompany.microservusuario.Usuario;
import com.mycompany.microservusuario.UsuarioRepositorio;
import com.mycompany.microservusuario.UsuarioRepositorio;


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    public Usuario obtenerUsuario(Long id) {
        return usuarioRepositorio.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    public Page<Usuario> obtenerUsuarios(int page, int size) {
        return usuarioRepositorio.findAll(PageRequest.of(page, size));
    }

    public Usuario actualizarUsuario(Long id, Usuario usuario) {
        if (!usuarioRepositorio.existsById(id)) {
            throw new RuntimeException("Usuario no encontrado");
        }
        usuario.setId(id);
        return usuarioRepositorio.save(usuario);
    }

    public void eliminarUsuario(Long id) {
        if (!usuarioRepositorio.existsById(id)) {
            throw new RuntimeException("Usuario no encontrado");
        }
        usuarioRepositorio.deleteById(id);
    }
}

