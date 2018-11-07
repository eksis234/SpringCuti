/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.controller;

import com.agung.springhibernatemaven.exception.NotFoundException;
import com.agung.springhibernatemaven.model.BerkasCuti;
import com.agung.springhibernatemaven.service.BerkasCutiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Martin
 */
public class BerkasCutiController {
        @Autowired
    BerkasCutiService berkasCutiService;

    public BerkasCutiController(BerkasCutiService berkasCutiService) {
        this.berkasCutiService = berkasCutiService;
    }
    
    @RequestMapping(value = "berkascuti",method = RequestMethod.GET)
    public String berkasCuti(Model model){
        model.addAttribute("berkasCutis", berkasCutiService.getAll());
        return "berkasCuti";
    }
    
    @RequestMapping(value = "tambah1",method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("berkasCuti", new BerkasCuti());
        return "tambah1";
    }
    
    @RequestMapping(value = "tambah1",method = RequestMethod.POST)
    public String adding(@ModelAttribute("berkasCuti") BerkasCuti berkasCuti){
        berkasCutiService.saveData(berkasCuti);
        return "redirect:/berkascuti";
    }
    
    @RequestMapping(value = "edit1/{id}",method = RequestMethod.GET)
    public String edit(Model model,@PathVariable("id") Integer id){
        BerkasCuti berkasCuti = berkasCutiService.getById(id);
        if(berkasCuti == null){
            throw new NotFoundException();
        }
        model.addAttribute("berkasCuti", berkasCuti);
        return "edit1";
    }
    
    @RequestMapping(value = "edit1",method = RequestMethod.POST)
    public String editing(@ModelAttribute("berkasCuti") BerkasCuti berkasCuti){
        berkasCutiService.updateData(berkasCuti);
        return "redirect:/berkascuti";
    }
    
    @RequestMapping(value = "delete1/{id}",method = RequestMethod.GET)
    public String deleting(@PathVariable("id") Integer id){
        BerkasCuti berkasCuti = berkasCutiService.getById(id);
        if(berkasCuti == null){
            throw new NotFoundException();
        }
        berkasCutiService.deleteData(berkasCuti);
        return "redirect:/berkascuti";
    }
}
