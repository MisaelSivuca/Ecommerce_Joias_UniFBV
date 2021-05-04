package com.jewelryStore.marketplace.model.entity;

import com.jewelryStore.marketplace.model.Enums.Estado;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "tb_produto")
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final byte NOME_LENGTH = 100;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = NOME_LENGTH, nullable = false)
    @NotNull
    private String nome;

    @Column(name = "preco", nullable = false, precision = 30, scale = 2)
    @NotNull
    private Double preco;

    @Column(name = "descricao", nullable = false)
    @NotNull
    @Lob
    private String descricao;

    @Column(name = "quantidade")
    @NotNull
    private int quantidade;

    @Enumerated(EnumType.STRING)
    @Column(name="estado")
    private Estado estado;

    @ManyToOne
    private Categoria categoria;

    @ManyToOne
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
