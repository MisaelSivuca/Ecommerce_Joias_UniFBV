package com.jewelryStore.marketplace.controller;

import com.jewelryStore.marketplace.model.entity.Produto;
import com.jewelryStore.marketplace.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @RequestMapping(value = "/front/produtos", method = RequestMethod.GET)
    public ModelAndView getProdutos(){
        ModelAndView modelAndView = new ModelAndView("/front/produtos");
        List<Produto> produtos =  produtoService.findAll();
        modelAndView.addObject("produtos",produtos);
        return modelAndView;
    }

    @RequestMapping(value = "/produtos/{id}", method = RequestMethod.GET)
    public ModelAndView getDetalhesProduto(@PathVariable("id") long id){
        ModelAndView modelAndView = new ModelAndView("/front/detalhesProduto");
        Produto produto =  produtoService.findById(id);
        modelAndView.addObject("produto",produto);
        return modelAndView;
    }

    @RequestMapping(value ="/front/novoProduto", method = RequestMethod.GET)
    public String getPosForm(){
        return "/front/cadastroProdutos";
    }

}
