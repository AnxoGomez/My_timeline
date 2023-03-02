package com.mytimeline.rest.service;

import com.mytimeline.rest.model.Categoria;
import com.mytimeline.rest.repository.CategoriaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImp implements CategoriaService{

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> buscarTodo() {
        return null;
    }

    @Override
    public Optional<Categoria> consultar(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<Categoria> consultarPorNombre(String nombre) {
        return Optional.empty();
    }

    @Override
    @Transactional
    public Categoria guardar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public void borrar(Integer id) {

    }
}
