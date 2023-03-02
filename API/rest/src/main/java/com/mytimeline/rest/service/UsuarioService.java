package com.mytimeline.rest.service;

import com.mytimeline.rest.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<Usuario> buscarTodo();

    public Optional<Usuario> consultar(Integer id);
    public Optional<Usuario> consultarPorNombre(String nombre);
    public Usuario guardar(Usuario usuario);
    public void borrar(Integer id);
}
