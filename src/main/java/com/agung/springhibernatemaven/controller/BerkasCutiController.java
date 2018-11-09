/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.controller;

import com.agung.springhibernatemaven.service.BerkasCutiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Lenovo
 */
@Controller
public class BerkasCutiController {
    @Autowired
    BerkasCutiService berkasCutiService;

    public void setBerkasCutiService(BerkasCutiService berkasCutiService) {
        this.berkasCutiService = berkasCutiService;
    }
    
    @RequestMapping(value = "bcuti",method = RequestMethod.GET)
    public String berkascuti(Model model){
        model.addAttribute("berkascutis", berkasCutiService.getBerkasCutis());
        return "berkascuti";
    }
}
