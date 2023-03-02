package com.mytimeline.rest.service;

import com.mytimeline.rest.model.Resena;

import java.util.List;
import java.util.Optional;

public interface ResenaService {
    List<Resena> buscarTodo();

    public Optional<Resena> consultar(Integer id);
    public Optional<Resena> consultarPorNombre(String nombre);
    public Resena guardar(Resena resenas);
    public void borrar(Integer id);
}
