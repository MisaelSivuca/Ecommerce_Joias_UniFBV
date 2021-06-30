package com.jewelryStore.marketplace.controller;

import com.jewelryStore.marketplace.model.entity.Usuario;
import com.jewelryStore.marketplace.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.validation.Valid;


@Controller
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(value = "/cadastroUsuario", method = RequestMethod.GET)
    public String getUsuarioForm(){
        return "/cadastroUsuario";
    }

    @RequestMapping(value = "/usuarioCadSucesso", method = RequestMethod.GET)
    public String userSucess(){
        return "/usuarioCadSucesso";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getUsuarioEntrar(){
        return "/login";
    }

    @RequestMapping(value = "/cadastroUsuario", method = RequestMethod.POST)
    public String novoUsuario(@Valid Usuario usuario, BindingResult result, RedirectAttributes attributes){
        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique se os campos foram preenchidos corretamente");
            return "redirect:/cadastroUsuario";
        }
        usuarioService.save(usuario);
        return "redirect:/usuarioCadSucesso";
    }

    @RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET)
    public ModelAndView getUsuario(@PathVariable("id") long id){
        ModelAndView modelAndView = new ModelAndView("/usuario");
        Usuario usuario =  usuarioService.findById(id);
        modelAndView.addObject("usuario",usuario);
        return modelAndView;
    }

    @RequestMapping(value = "/mensasgemValidacao", method = RequestMethod.GET)
    public String msgValidacao(){
        return "/mensasgemValidacao";
    }



}
