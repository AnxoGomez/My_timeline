package com.mytimeline.rest.controller;

import com.mytimeline.rest.model.Categoria;
import com.mytimeline.rest.model.Usuario;
import com.mytimeline.rest.service.CategoriaService;
import com.mytimeline.rest.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoriaController {
    @Autowired
    private CategoriaService serviceC;

    @PostMapping
    @Operation(summary = "Inserto de datos")
    public Categoria registroCategoria(@RequestBody Categoria categoria) {
        return serviceC.guardar(categoria);
    }

    @GetMapping
    @Operation(summary = "Recopilar todos los datos")
    public List<Categoria> consultarUser(@RequestBody Categoria categoria) {
        return serviceC.buscarTodo();
    }


}
