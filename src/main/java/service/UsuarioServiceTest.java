package service;

import com.mycompany.microservusuario.Usuario;
import com.mycompany.microservusuario.UsuarioRepositorio;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

/*
 *
 * @author Aranza
 */
@SpringBootTest
public class UsuarioServiceTest {

    @Mock
    private UsuarioRepositorio usuarioRepositorio;

    @InjectMocks
    private UsuarioService usuarioService;

    @Test
    void testCrearUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setApellido("Perez");
        usuario.setCorreoElectronico("juan@example.com");

        Mockito.when(usuarioRepositorio.save(Mockito.any(Usuario.class))).thenReturn(usuario);

        Usuario resultado = usuarioService.crearUsuario(usuario);

        assertEquals("Juan", resultado.getNombre());
        assertEquals("Perez", resultado.getApellido());
    }

    private void assertEquals(String juan, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
