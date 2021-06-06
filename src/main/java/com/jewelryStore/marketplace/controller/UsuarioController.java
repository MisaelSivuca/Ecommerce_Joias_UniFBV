package com.jewelryStore.marketplace.controller;

import com.jewelryStore.marketplace.model.entity.Usuario;
import com.jewelryStore.marketplace.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    // Retorna a pag cdastro de usuário
    @RequestMapping(value = "/front/cadastroUsuario", method = RequestMethod.GET)
    public String getUsuarioForm(){
        return "/front/cadastroUsuario";
    }

    @RequestMapping(value = "/front/login", method = RequestMethod.GET)
    public String getUsuarioEntrar(){
        return "/front/login";
    }

    @RequestMapping(value = "/front/cadastroUsuario", method = RequestMethod.POST)
    public String novoUsuario(@Valid Usuario usuario, BindingResult result, RedirectAttributes attributes){
        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique se os campos foram preenchidos corretamente");
            return "redirect:/front/cadastroUsuario";
        }
        usuarioService.save(usuario);
        return "redirect:/front/usuarioCadSucesso";
    }



}
