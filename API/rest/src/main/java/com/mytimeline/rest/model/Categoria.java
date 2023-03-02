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
    @Column(name = "nombre_categoria")
    private String nombre_categoria;
    @Column(name = "id_usuario")
    private Integer id_usuario;

    @ManyToOne
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private Usuario usuario;


    public Categoria(String nombre_categoria, Integer id_usuario) {
        this.nombre_categoria = nombre_categoria;
        this.id_usuario = id_usuario;
    }
}
