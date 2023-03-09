package com.mytimeline.rest.controller;

import com.mytimeline.rest.model.Resena;
import com.mytimeline.rest.model.Usuario;
import com.mytimeline.rest.service.CategoriaService;
import com.mytimeline.rest.service.ResenaService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resena")
public class ResenaController {

    @Autowired
    private ResenaService serviceR;

    @PostMapping
    @Operation(summary = "Registro de usuario")
    public Resena registroUsuario(@RequestBody Resena resena) {
        return serviceR.guardar(resena);
    }

    @GetMapping
    @Operation(summary = "Login de datos")
    public List<Resena> consultarUser(@RequestBody Resena resena) {
        return serviceR.buscarTodo();
    }
}
