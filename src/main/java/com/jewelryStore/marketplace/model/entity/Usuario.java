package com.jewelryStore.marketplace.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name="tb_users")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final byte NOME_LENGTH = 100;
    private static final byte CPF_LENGTH = 11;
    private static final byte LOGIN_MAX_LENGTH = 5;
    private static final byte LOGIN_MIN_LENGTH = 20;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = NOME_LENGTH, nullable = false)
    @NotNull
    private String nome;

    @Column(name = "cpf", length = CPF_LENGTH, nullable = false)
    @Size(min = CPF_LENGTH, max = CPF_LENGTH)
    @NotNull
    private String cpf;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "telefone", nullable = false)
    private String telefone;

    @Column(name = "login", length = LOGIN_MAX_LENGTH, nullable = false)
    @Size(min = LOGIN_MIN_LENGTH, max = LOGIN_MAX_LENGTH)
    @NotNull
    private String login;

    @JsonIgnore
    @Lob
    @Column(name = "senha", nullable = false)
    @NotNull
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
}
