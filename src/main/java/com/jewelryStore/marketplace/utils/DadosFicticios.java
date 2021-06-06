package com.jewelryStore.marketplace.utils;


import com.jewelryStore.marketplace.model.entity.Categoria;
import com.jewelryStore.marketplace.model.entity.Produto;
import com.jewelryStore.marketplace.model.entity.Usuario;
import com.jewelryStore.marketplace.repository.CategoriaRepository;
import com.jewelryStore.marketplace.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Component;
@Component
public class DadosFicticios {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

   /*  Esta annotation responsavel por invocar esse método na inicialização */
   //@PostConstruct
   public void salvandoCategoriaFicticia(){

        List<Categoria> categorias = new ArrayList<>();

        Categoria categoria1 = new Categoria("Brinco");
        Categoria categoria2 = new Categoria("Anel");
        Categoria categoria3 = new Categoria("Gargantilha");
        Categoria categoria4 = new Categoria("Pulseira");
        Categoria categoria5 = new Categoria("Tornozeleira");
        Categoria categoria6 = new Categoria("Colar");

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

    //@PostConstruct
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

        usuarioRepository.save(us);
    }



}
