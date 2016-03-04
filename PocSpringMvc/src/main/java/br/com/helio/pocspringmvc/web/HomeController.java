/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.helio.pocspringmvc.web;

import br.com.helio.pocspringmvc.entity.Produto;
import br.com.helio.pocspringmvc.repository.ProdutoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author helio
 */
@Controller
public class HomeController {
    
    @Autowired
    ProdutoFactory produtoFactory;
    
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("hello", "Hello World");
        
        Produto produto = new Produto();
        produto.setNome("Nome 1");
        produto.setPreco(10.0F);
        
        produtoFactory.save(produto);
        
        return modelAndView;
    }
}
