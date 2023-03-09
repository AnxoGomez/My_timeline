package com.mytimeline.rest.controller;

import com.mytimeline.rest.model.Usuario;
import com.mytimeline.rest.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    private UsuarioService serviceU;

    @PostMapping
    @Operation(summary = "Registro de usuario")
    public Usuario registroUsuario(@RequestBody Usuario user) {
        return serviceU.guardar(user);
    }

    @GetMapping
    @Operation(summary = "Login de datos")
    public Usuario consultarUser(@RequestBody Usuario user) {
        return serviceU.login(user.getNombre(), user.getContrasena());
    }

    @DeleteMapping
    @Operation(summary = "Borre un usuario")
    public void borrarUser(Integer id) {
        serviceU.borrar(id);
    }
}
