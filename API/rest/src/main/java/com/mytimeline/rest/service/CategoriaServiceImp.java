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
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<Categoria> consultar(Integer id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public List<Categoria> consultarPorNombre(String nombreCategoria) {
        return categoriaRepository.findBynombreCategoria(nombreCategoria);
    }

    @Override
    @Transactional
    public Categoria guardar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public void borrar(Integer id) {
        categoriaRepository.deleteById(id);
    }
}
