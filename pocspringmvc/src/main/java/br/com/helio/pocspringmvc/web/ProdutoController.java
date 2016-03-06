/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.helio.pocspringmvc.web;

import br.com.helio.pocspringmvc.entity.Produto;
import br.com.helio.pocspringmvc.service.ProdutService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Helio
 */
@Controller
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutService produtService;
    
    @RequestMapping(value = "/lista", method = RequestMethod.GET)
    public ModelAndView showPersons() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("produtos",produtService.findAll());
        modelAndView.setViewName("produto/lista");
        return modelAndView;
    }
}
