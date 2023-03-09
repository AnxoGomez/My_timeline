package com.mytimeline.rest.dto;

import com.mytimeline.rest.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private Integer id;
    private String nombre;
    private String contrasena;

    public Usuario convertirModel() {

        Usuario usuario = new Usuario();
        usuario.setId(this.id);
        usuario.setNombre(this.nombre);
        usuario.setContrasena(this.contrasena);
        return usuario;

    }

    public UsuarioDTO creatDTO(Usuario usuario) {
        this.setId(usuario.getId());
        this.setNombre(usuario.getNombre());
        this.setContrasena(usuario.getContrasena());
        return this;
    }
}
