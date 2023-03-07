package com.mytimeline.rest.controller;

import com.mytimeline.rest.model.Categoria;
import com.mytimeline.rest.model.Usuario;
import com.mytimeline.rest.service.CategoriaService;
import com.mytimeline.rest.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoriaController {
    @Autowired
    private CategoriaService serviceC;

    @PostMapping
    @Operation(summary = "Registro de categoria")
    public Categoria registroCategoria(@RequestBody Categoria categoria) {
        return serviceC.guardar(categoria);
    }

    /*@GetMapping
    @Operation(summary = "Login de datos")
    public Usuario consultarUser(@RequestBody Usuario user) {
        return serviceC.login(user.getNombre(), user.getContrasena());
    }*/
}
