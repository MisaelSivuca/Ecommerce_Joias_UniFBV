package com.jewelryStore.marketplace.model.entity;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_estado")
    private Estado estado;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_categoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;


}
