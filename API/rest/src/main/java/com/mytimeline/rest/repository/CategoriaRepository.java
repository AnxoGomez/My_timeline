package com.mytimeline.rest.repository;

import com.mytimeline.rest.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    List<Categoria> findBynombreCategoria (String nombreCategoria);
}
