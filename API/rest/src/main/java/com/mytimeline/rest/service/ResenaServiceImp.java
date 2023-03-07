package com.mytimeline.rest.service;

import com.mytimeline.rest.model.Resena;
import com.mytimeline.rest.repository.ResenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResenaServiceImp implements ResenaService{

    @Autowired
    private ResenaRepository resenaRepository;


    @Override
    public List<Resena> buscarTodo() {
        return resenaRepository.findAll();
    }

    @Override
    public Optional<Resena> consultar(Integer id) {
        return resenaRepository.findById(id);
    }

    @Override
    public Optional<Resena> consultarPorNombre(String nombre) {
        return Optional.empty();
    }

    @Override
    public Resena guardar(Resena resenas) {
        return resenaRepository.save(resenas);
    }

    @Override
    public void borrar(Integer id) {
        resenaRepository.deleteById(id);
    }
}
