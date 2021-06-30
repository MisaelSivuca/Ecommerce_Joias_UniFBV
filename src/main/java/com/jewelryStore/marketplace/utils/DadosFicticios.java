package com.jewelryStore.marketplace.utils;

import com.jewelryStore.marketplace.model.entity.Categoria;
import com.jewelryStore.marketplace.model.entity.Estado;
import com.jewelryStore.marketplace.model.entity.Usuario;
import com.jewelryStore.marketplace.repository.CategoriaRepository;
import com.jewelryStore.marketplace.repository.EstadoRepository;
import com.jewelryStore.marketplace.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Component;
@Component
public class DadosFicticios {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    EstadoRepository estadoRepository;

   /*  Esta annotation responsavel por invocar esse método na inicialização */
   //@PostConstruct
   public void salvandoCategoriaFicticia(){

        List<Categoria> categorias = new ArrayList<>();

        Categoria categoria1 = new Categoria();
        categoria1.setDescricao("Brinco");
        Categoria categoria2 = new Categoria();
        categoria2.setDescricao("Anel");
        Categoria categoria3 = new Categoria();
        categoria3.setDescricao("Gargantilha");
        Categoria categoria4 = new Categoria();
        categoria4.setDescricao("Pulseira");
        Categoria categoria5 = new Categoria();
        categoria5.setDescricao("Tornozeleira");
        Categoria categoria6 = new Categoria();
        categoria6.setDescricao("Colar");

        categorias.add(categoria1);
        categorias.add(categoria2);
        categorias.add(categoria3);
        categorias.add(categoria4);
        categorias.add(categoria5);
        categorias.add(categoria6);

        for (Categoria categoria: categorias) {
            Categoria salvarCategoria = categoriaRepository.save(categoria);
            System.out.println(salvarCategoria.getId());
        }
    }

    // @PostConstruct
    public void salvandoUsuarioFicticio(){

        Usuario us = new Usuario();
        us.setNome("José da Silva");
        us.setEmail("Jose@gmail.com");
        us.setCpf("78663756299");
        us.setTelefone("81 9 97112222");
        us.setLogradouro("Rua Qualquer");
        us.setNumero("526");
        us.setComplemento("Casa");
        us.setBairro("Várzea");
        us.setCep("55125-000");
        us.setEstado("PE");
        us.setCidade("Recife");
        us.setLogin("J@ze12356");
        us.setSenha("278@gd#gh7a");
        //usuarioRepository.save(us);

        Usuario us1 = new Usuario();
        us1.setNome("Magda Costa");
        us1.setEmail("MdaGCosta@gmail.com");
        us1.setCpf("45678985477");
        us1.setTelefone("81 9 98446655");
        us1.setLogradouro("Rua das Flores");
        us1.setNumero("345");
        us1.setComplemento("Casa");
        us1.setBairro("Imbiribeira");
        us1.setCep("58425-000");
        us1.setEstado("PE");
        us1.setCidade("Recife");
        us1.setLogin("Mda4514@4");
        us1.setSenha("Mhjs456787");

      //  usuarioRepository.save(us1);
    }


    //@PostConstruct
    public void salvandoEstadoProdutos(){
        Estado estado01 = new Estado();
        estado01.setDescricao("Novo");
        Estado estado02 = new Estado();
        estado02.setDescricao("Usado");
        estadoRepository.save(estado01);
        estadoRepository.save(estado02);

    }

}
