package com.mytimeline.rest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Resenas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Resena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "nota")
    private float nota;
    @Column(name = "sinopsis")
    private String sinopsis;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "favorito")
    private boolean favorito;
    @Column(name = "estado")
    private int estado;
    @Column(name = "id_categoria")
    private int id_categoria;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;


    public Resena(String titulo, float nota, String sinopsis, String descripcion, boolean favorito, int estado, int id_categoria) {
        this.titulo = titulo;
        this.nota = nota;
        this.sinopsis = sinopsis;
        this.descripcion = descripcion;
        this.favorito = favorito;
        this.estado = estado;
        this.id_categoria = id_categoria;
    }
}
