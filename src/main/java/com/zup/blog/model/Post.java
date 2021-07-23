package com.zup.blog.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Column(name = "tit")
    private String titulo;

    @NotBlank
    @Column(name = "aut")
    private String autor;

    @NotBlank
    @Column(name = "tex")
    private String texto;

    @NotNull
    @Column(name = "dat")
    private LocalDate data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id.equals(post.id) && titulo.equals(post.titulo) && autor.equals(post.autor) && texto.equals(post.texto) && data.equals(post.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, autor, texto, data);
    }
}
