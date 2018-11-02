/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.controller;
import com.agung.springhibernatemaven.exception.NotFoundException;
import com.agung.springhibernatemaven.model.JenisCuti;
import com.agung.springhibernatemaven.service.JenisCutiService;
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
public class JenisCutiController {
    @Autowired
    JenisCutiService jenisCutiService;

    public void setJenisCutiService(JenisCutiService jenisCutiService) {
        this.jenisCutiService = jenisCutiService;
    }
    
    @RequestMapping(value = "jcuti",method = RequestMethod.GET)
    public String jeniscuti(Model model){
        model.addAttribute("jeniscutis", jenisCutiService.getJenisCutis());
        return "jeniscuti";
    }
    
    @RequestMapping(value = "tambah2",method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("jeniscuti", new JenisCuti());
        return "tambah2";
    }
    
    @RequestMapping(value = "tambah2",method = RequestMethod.POST)
    public String adding(@ModelAttribute("jeniscuti") JenisCuti jenisCuti){
        jenisCutiService.saveJenisCuti(jenisCuti);
        return "redirect:/jcuti";
    }
    
    @RequestMapping(value = "edit2/{id}",method = RequestMethod.GET)
    public String edit(Model model,@PathVariable("id") Integer id){
        JenisCuti jenisCuti = jenisCutiService.getJenisCuti(id);
        if(jenisCuti==null){
            throw new NotFoundException();
        }
        model.addAttribute("jeniscuti", jenisCuti);
        return "edit2";
    }
    
    @RequestMapping(value = "edit2",method = RequestMethod.POST)
    public String editing(@ModelAttribute("jeniscuti") JenisCuti jenisCuti){
        jenisCutiService.updateJenisCuti(jenisCuti);
        return "redirect:/jcuti";
    }
    
    @RequestMapping(value = "delete2/{id}",method = RequestMethod.GET)
    public String deleting(@PathVariable("id") Integer id){
        JenisCuti jenisCuti = jenisCutiService.getJenisCuti(id);
        if(jenisCuti==null){
            throw new NotFoundException();
        }
        jenisCutiService.deleteJenisCuti(jenisCuti);
        return "redirect:/jcuti";
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
