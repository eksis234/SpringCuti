/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.controller;

import com.agung.springhibernatemaven.exception.NotFoundException;
import com.agung.springhibernatemaven.model.Departemen;
import com.agung.springhibernatemaven.service.DepartemenService;
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
public class DepartemenController {
    @Autowired
    DepartemenService departemenService;

    public void setDepartemenService(DepartemenService departemenService) {
        this.departemenService = departemenService;
    }
    
    @RequestMapping(value = "dept",method = RequestMethod.GET)
    public String departemen(Model model){
        model.addAttribute("departemens", departemenService.getAll());
        return "departemen";
    }
    
    @RequestMapping(value = "tambah1",method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("departemen", new Departemen());
        return "tambah1";
    }
    
    @RequestMapping(value = "tambah1",method = RequestMethod.POST)
    public String adding(@ModelAttribute("departemen") Departemen departemen){
        departemenService.saveData(departemen);
        return "redirect:/dept";
    }
    
    @RequestMapping(value = "edit1/{id}",method = RequestMethod.GET)
    public String edit(Model model,@PathVariable("id") Integer id){
        Departemen departemen = departemenService.getById(id);
        if(departemen==null){
            throw new NotFoundException();
        }
        model.addAttribute("departemen", departemen);
        return "edit1";
    }
    
    @RequestMapping(value = "edit1",method = RequestMethod.POST)
    public String editing(@ModelAttribute("departemen") Departemen departemen){
        departemenService.updateData(departemen);
        return "redirect:/dept";
    }
    
    @RequestMapping(value = "delete1/{id}",method = RequestMethod.GET)
    public String deleting(@PathVariable("id") Integer id){
        Departemen departemen = departemenService.getById(id);
        if(departemen==null){
            throw new NotFoundException();
        }
        departemenService.deleteData(departemen);
        return "redirect:/dept";
    }
    
//    @RequestMapping(value = "pdf",method = RequestMethod.GET)
//    public String getPdfReport(Model model, HttpServletResponse response){        
//        List<Departemen> departemens = departemenService.getAll();
//        JRDataSource dataSource=new JRBeanCollectionDataSource(departemens);
//        
//        model.addAttribute("dataSource", dataSource);
//        return "pdfReport";
//    }
//    
//    @RequestMapping(value = "xls",method = RequestMethod.GET)
//    public String getXlsReport(Model model, HttpServletResponse response){
//        List<Departemen> departemens = departemenService.getAll();
//        JRDataSource dataSource=new JRBeanCollectionDataSource(departemens);
//        
//        model.addAttribute("dataSource", dataSource);
//        return "xlsReport";
//    }
    
}
