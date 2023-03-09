package com.mytimeline.rest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Categoria")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombreCategoria")
    private String nombreCategoria;
    @Column(name = "idUsuario")
    private Integer idUsuario;

    /*@ManyToOne
    @JoinColumn(name = "idUsuario", insertable = false, updatable = false)
    private Usuario usuario;*/


    public Categoria(String nombreCategoria, Integer idUsuario) {
        this.nombreCategoria = nombreCategoria;
        this.idUsuario = idUsuario;
    }
}
