package com.mytimeline.rest.repository;

import com.mytimeline.rest.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    List<Usuario> findByNombre (String nombre);

    public Usuario findByNombreAndContrasena(String nombre, String contrasena);

}
