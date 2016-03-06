/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.helio.pocspringmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author helio
 */
@Controller
public class HomeController {
       
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String home() {
        return "layout/main";
    }
}
