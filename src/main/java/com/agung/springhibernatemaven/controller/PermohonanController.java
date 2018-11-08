/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.controller;

import com.agung.springhibernatemaven.exception.NotFoundException;
import com.agung.springhibernatemaven.model.Permohonan;
import com.agung.springhibernatemaven.service.PermohonanService;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
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
public class PermohonanController {
    @Autowired
    PermohonanService permohonanService;

    public void setPermohonanService(PermohonanService permohonanService) {
        this.permohonanService = permohonanService;
    }
    
    @RequestMapping(value = "permohonan",method = RequestMethod.GET)
    public String permohonan(Model model){
        model.addAttribute("permohonans", permohonanService.getPermohonans());
        return "mohon";
    }
    
    @RequestMapping(value = "tambah6",method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("permohonan", new Permohonan());
        return "tambah6";
    }
    
    @RequestMapping(value = "tambah6",method = RequestMethod.POST)
    public String adding(@ModelAttribute("permohonan") Permohonan permohonan){
        permohonanService.savePermohonan(permohonan);
        return "redirect:/permohonan";
    }
    
    @RequestMapping(value = "edit6/{id}",method = RequestMethod.GET)
    public String edit(Model model,@PathVariable("id") Integer id){
        Permohonan permohonan = permohonanService.getPermohonan(id);
        if(permohonan==null){
            throw new NotFoundException();
        }
        model.addAttribute("permohonan", permohonan);
        return "edit6";
    }
    
    @RequestMapping(value = "edit6",method = RequestMethod.POST)
    public String editing(@ModelAttribute("permohonan") Permohonan permohonan){
        permohonanService.updatePermohonan(permohonan);
        return "redirect:/permohonan";
    }
    
    @RequestMapping(value = "delete6/{id}",method = RequestMethod.GET)
    public String deleting(@PathVariable("id") Integer id){
        Permohonan permohonan = permohonanService.getPermohonan(id);
        if(permohonan==null){
            throw new NotFoundException();
        }
        permohonanService.deletePermohonan(permohonan);
        return "redirect:/permohonan";
    }
    
//    @RequestMapping(value = "pdf",method = RequestMethod.GET)
//    public String getPdfReport(Model model, HttpServletResponse response){        
//        List<Permohonan> permohonans = permohonanService.getPermohonans();
//        JRDataSource dataSource=new JRBeanCollectionDataSource(permohonans);
//        
//        model.addAttribute("dataSource", dataSource);
//        return "pdfReport";
//    }
//    
//    @RequestMapping(value = "xls",method = RequestMethod.GET)
//    public String getXlsReport(Model model, HttpServletResponse response){
//        List<Permohonan> permohonans = permohonanService.getPermohonans();
//        JRDataSource dataSource=new JRBeanCollectionDataSource(permohonans);
//        
//        model.addAttribute("dataSource", dataSource);
//        return "xlsReport";
//    }
}
