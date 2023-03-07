package com.mytimeline.rest.service;

import com.mytimeline.rest.model.Categoria;
import com.mytimeline.rest.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    List<Categoria> buscarTodo();

    public Optional<Categoria> consultar(Integer id);
    public Optional<Categoria> consultarPorNombre(String nombreCategoria);
    public Categoria guardar(Categoria categoria);
    public void borrar(Integer id);
}
