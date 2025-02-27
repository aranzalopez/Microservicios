
package com.mycompany.microservusuario;

/**
 *
 * @author Aranza
 */
import com.mycompany.microservusuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}