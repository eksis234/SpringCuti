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
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @RequestMapping(value = "tambah5",method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("berkascuti", new BerkasCuti());
        return "tambah5";
    }
    
    @RequestMapping(value = "tambah5",method = RequestMethod.POST)
    public String adding(@ModelAttribute("berkascuti") BerkasCuti berkasCuti){
        System.out.println("<br>"+berkasCuti.getLokasiBerkas());
        berkasCutiService.saveBerkasCuti(berkasCuti);
   
        return "redirect:/bcuti";
    }
    
    @RequestMapping(value = "edit5/{id}",method = RequestMethod.GET)
    public String edit(Model model,@PathVariable("id") Integer id){
        BerkasCuti berkasCuti = berkasCutiService.getBerkasCuti(id);
        if(berkasCuti==null){
            throw new NotFoundException();
        }
        model.addAttribute("berkascuti", berkasCuti);
        return "edit5";
    }
    
    @RequestMapping(value = "edit5",method = RequestMethod.POST)
    public String editing(@ModelAttribute("berkascuti") BerkasCuti berkasCuti){
        berkasCutiService.updateBerkasCuti(berkasCuti);
        return "redirect:/bcuti";
    }
    
    @RequestMapping(value = "delete5/{id}",method = RequestMethod.GET)
    public String deleting(@PathVariable("id") Integer id){
        BerkasCuti berkasCuti = berkasCutiService.getBerkasCuti(id);
        if(berkasCuti==null){
            throw new NotFoundException();
        }
        berkasCutiService.deleteBerkasCuti(berkasCuti);
        return "redirect:/bcuti";
    }
    
//    @RequestMapping(value = "pdf",method = RequestMethod.GET)
//    public String getPdfReport(Model model, HttpServletResponse response){        
//        List<JenisCuti> cutis=jenisCutiService.getJenisCutis();
//        JRDataSource dataSource=new JRBeanCollectionDataSource(cutis);
//        
//        model.addAttribute("dataSource", dataSource);
//        return "pdfReport";
//    }
//    
//    @RequestMapping(value = "xls",method = RequestMethod.GET)
//    public String getXlsReport(Model model, HttpServletResponse response){
//        List<JenisCuti> cutis=jenisCutiService.getJenisCutis();
//        JRDataSource dataSource=new JRBeanCollectionDataSource(cutis);
//        
//        model.addAttribute("dataSource", dataSource);
//        return "xlsReport";
//    }
}
