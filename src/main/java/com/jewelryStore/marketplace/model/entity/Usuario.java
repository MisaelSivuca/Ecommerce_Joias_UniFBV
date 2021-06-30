package com.jewelryStore.marketplace.model.entity;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

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
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_users")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 7733776198250219608L;
    private static final byte NOME_LENGTH = 100;
    private static final byte CPF_LENGTH = 11;
    private static final byte LOGIN_MAX_LENGTH = 20;
    private static final byte LOGIN_MIN_LENGTH = 3;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", length = 2048, nullable = false)
    private String nome;

    @Column(name = "cpf", length = CPF_LENGTH, nullable = false, unique = true)
    @Size(min = CPF_LENGTH, max = CPF_LENGTH)
    private String cpf;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "telefone", nullable = false)
    private String telefone;

    @Column(name = "login", length = LOGIN_MAX_LENGTH, nullable = false, unique = true)
    @Size(min = LOGIN_MIN_LENGTH, max = LOGIN_MAX_LENGTH)
    private String login;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "logradouro", nullable = false)
    private String logradouro;

    @Column(name = "numero", nullable = false)
    private String numero;

    @Column(name = "complemento", nullable = false)
    private String complemento;

    @Column(name = "bairro", nullable = false)
    private String bairro;

    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "cep", nullable = false)
    private String cep;

    @Column(name = "cidade", nullable = false)
    private String cidade;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private List<Produto> produtos;

}
