package com.mytimeline.rest.service;

import com.mytimeline.rest.model.Usuario;
import com.mytimeline.rest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImp implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> buscarTodo() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> consultar(Integer id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Optional<Usuario> consultarPorNombre(String nombre) {
        return Optional.empty();
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void borrar(Integer id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario login(String user, String contra) {
        return usuarioRepository.findByNombreAndContrasena(user, contra);
    }
}
