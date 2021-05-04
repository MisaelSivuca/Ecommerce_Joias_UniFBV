package com.jewelryStore.marketplace.controller;

import com.jewelryStore.marketplace.model.entity.Usuario;
import com.jewelryStore.marketplace.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    
    @RequestMapping(value = "/front/cadastroCliente", method = RequestMethod.GET)
    public String getUsuarioForm(){
        return "/front/cadastroCliente";
    }

    @RequestMapping(value = "/front/login", method = RequestMethod.GET)
    public String getUsuarioEntrar(){
        return "/front/login";
    }

    @RequestMapping(value = "/front/login", method = RequestMethod.POST)
    public String novoUsuario(@Valid Usuario usuario, BindingResult result, RedirectAttributes attributes){
        if (result.hasErrors()) {
            return "redirect:/front/login";
        }
        usuarioService.save(usuario);
        return "redirect:usuCadSucesso";
    }

}
